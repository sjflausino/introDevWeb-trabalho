<%-- 
    Document   : fornecedores
    Created on : 24 de jun. de 2024, 18:22:07
    Author     : vertigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fornecedores</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

<body>

    <div class="container">

        <form action="" method="post">

            <div class="mb-3">
                <label for="" class="form-label">Razão Social</label>
                <input type="text" class="form-control" name="razao_social" id="razao_social" maxlength="50"
                    size="3" aria-describedby="helpId" placeholder="Exemplo LTDA" required />
                <small id="helpId" class="form-text text-muted">Digite a razão social do fornecedor.</small>
            </div>
            
            <div class="mb-3">
                <label for="" class="form-label">CNPJ</label>
                <input type="text" class="form-control" name="cnpj" id="cnpj" maxlength="18"
                    size="3" aria-describedby="helpId" placeholder="XX. XXX. XXX/0001-XX" required />
                <small id="helpId" class="form-text text-muted">Digite o CNPJ do fornecedor.</small>
            </div>
            
            <div class="mb-3">
                <label for="" class="form-label">Endereço</label>
                <input type="text" class="form-control" name="endereco" id="endereco" maxlength="50"
                    size="3" aria-describedby="helpId" placeholder="Ex: Rua A, 123" required />
                <small id="helpId" class="form-text text-muted">Digite o endereço do fornecedor.</small>
            </div>
            
            <div class="mb-3">
                <label for="" class="form-label">Bairro</label>
                <input type="text" class="form-control" name="bairro" id="bairro" maxlength="50"
                    size="3" aria-describedby="helpId" placeholder="Ex: Centro" required />
                <small id="helpId" class="form-text text-muted">Digite o bairro do fornecedor.</small>
            </div>

            <div class="mb-3">
                <label for="" class="form-label">Cidade</label>
                <input type="text" class="form-control" name="cidade" id="cidade" maxlength="50"
                    size="3" aria-describedby="helpId" placeholder="Ex: Curitiba" required />
                <small id="helpId" class="form-text text-muted">Digite o cidade do fornecedor.</small>
            </div>

            <div class="mb-3">
                <label for="" class="form-label">Estado</label>
                <input type="text" class="form-control" name="uf" id="uf" maxlength="2"
                    size="2" aria-describedby="helpId" placeholder="Ex: SP" required />
                <small id="helpId" class="form-text text-muted">Digite o estado do fornecedor.</small>
            </div>
            
            <div class="mb-3">
                <label for="" class="form-label">CEP</label>
                <input type="text" class="form-control" name="cep" id="cep" maxlength="9"
                    size="3" aria-describedby="helpId" placeholder="XXXXX-XXX" required />
                <small id="helpId" class="form-text text-muted">Digite o CEP do fornecedor.</small>
            </div>
            
            <div class="mb-3">
                <label for="" class="form-label">Telefone</label>
                <input type="tel" class="form-control" name="telefone" id="telefone" maxlength="20"
                    aria-describedby="helpId" placeholder="(XX)XXXXXXXXX" pattern="[0-9]{2}-[0-9]{9}" required />
                <small id="helpId" class="form-text text-muted">Digite o telefone do fornecedor.</small>
            </div>
            
            <div class="mb-3">
                <label for="" class="form-label">Email</label>
                <input type="text" class="form-control" name="email" id="email" maxlength="50"
                    aria-describedby="helpId" placeholder="Ex: exemplo@gmail.com" required />
                <small id="helpId" class="form-text text-muted">Digite o email do fornecedor.</small>
            </div>

            <button type="submit" class="btn btn-primary">
                Submit
            </button>

        </form>

    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>

</html>
