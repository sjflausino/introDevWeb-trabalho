<%-- 
    Document   : clientes
    Created on : 24 de jun. de 2024, 18:21:16
    Author     : vertigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clientes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <form action="" method="post">
            <div class="mb-3">
                <br>
                <label for="" class="form-label">Nome</label>
                <input type="text" class="form-control form-control-sm" name="nome_cliente" id="nome_cliente" aria-describedby="helpId"
                    placeholder="Nome do Cliente" maxlength="50" minlength="3" required />
                <small id="helpId" class="form-text text-muted">digite o nome do cliente</small>
                <br>
                <label for="" class="form-label">CPF</label>
                <input type="text" class="form-control form-control-sm" name="cpf" id="cpf" aria-describedby="helpId"
                    placeholder="111.222.333-44" maxlength="14" minlength="14" required />
                <small id="helpId" class="form-text text-muted">digite o CPF do cliente neste campo</small>
                <br>
                <label for="" class="form-label">Endereço</label>
                <input type="text" class="form-control form-control-sm" name="endereco" id="endereco"
                    aria-describedby="helpId" placeholder="Rua/Av. tal " maxlength="50" minlength="3" required />
                <small id="helpId" class="form-text text-muted">digite o endereço do cliente neste campo</small>
                <br>
                <label for="" class="form-label">Bairro</label>
                <input type="text" class="form-control form-control-sm" name="bairro" id="bairro"
                    aria-describedby="helpId" placeholder="Centro" maxlength="50" minlength="3" required />
                <small id="helpId" class="form-text text-muted">digite o bairro do cliente neste campo</small>
                <br>
                <label for="" class="form-label">Cidade</label>
                <input type="text" class="form-control form-control-sm" name="cidade" id="cidade"
                    aria-describedby="helpId" placeholder="Niteroi" maxlength="50" minlength="3" required />
                <small id="helpId" class="form-text text-muted">digite o cidade do cliente neste campo</small>
                <br>
                <label for="" class="form-label">UF</label>
                <input type="text" class="form-control form-control-sm" name="uf" id="uf" aria-describedby="helpId"
                    placeholder="RJ" maxlength="2" minlength="2" required />
                <small id="helpId" class="form-text text-muted">digite a UF referente ao estado do cliente neste
                    campo</small>
                <br>
                <label for="" class="form-label">CEP</label>
                <input type="text" class="form-control form-control-sm" name="cep" id="cep" aria-describedby="helpId"
                    placeholder="20000-500" maxlength="9" minlength="3" required />
                <small id="helpId" class="form-text text-muted">digite o cep do cliente neste campo</small>
                <br>
                <label for="" class="form-label">Telefone</label>
                <input type="tel" class="form-control form-control-sm" name="telefone" id="telefone"
                    aria-describedby="helpId" placeholder="(21) 99999-8888" maxlength="20" required />
                <small id="helpId" class="form-text text-muted">digite o telefone do cliente neste campo</small>
                <br>
                <label for="" class="form-label">Email</label>
                <input type="email" class="form-control form-control-sm" name="email" id="email"
                    aria-describedby="helpId" placeholder="test@email.com" maxlength="50" required />
                <small id="helpId" class="form-text text-muted">digite o email do cliente neste campo</small>
                <br>
                <br>
                <button type="submit" class="btn btn-primary">
                    Submit
                </button>
            </div>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>

</html>
