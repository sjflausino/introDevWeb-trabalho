<%-- 
    Document   : tabelaDeProdutos
    Created on : 24 de jun. de 2024, 18:23:00
    Author     : vertigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabela de Produtos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

<body>

    <div class="container">
        <form action="" method="post">
            <div class="mb-3">
                <br>
                <label for="" class="form-label">Nome do Produto</label>
                <input type="text" class="form-control form-control-sm" name="nome_produto" id="nome_produto" aria-describedby="helpId"
                    placeholder="Nome do Produto" maxlength="100" minlength="3" required />
                <small id="helpId" class="form-text text-muted">Insira o nome do produto neste campo.</small>
                <br>

                <label for="" class="form-label">Descrição</label>
                <input type="text" class="form-control form-control-sm" name="descricao" id="descricao" aria-describedby="helpId"
                    placeholder="Descrição do Produto" maxlength="255" required />
                <small id="helpId" class="form-text text-muted">Insira a descricao do produto neste campo.</small>
                <br>

                <label for="" class="form-label">Preço da Compra</label>
                <input type="number" class="form-control form-control-sm" name="preco_compra" id="preco_compra" aria-describedby="helpId"
                    placeholder="000,00" maxlength="50" minlength="3" required />
                <small id="helpId" class="form-text text-muted">Insira o preço da compra do produto neste campo.</small>
                <br>

                <label for="" class="form-label">Preço da Venda</label>
                <input type="number" class="form-control form-control-sm" name="preco_venda" id="preco_venda" aria-describedby="helpId"
                    placeholder="000,00" maxlength="50" minlength="3" required />
                <small id="helpId" class="form-text text-muted">Insira o preço da venda do produto neste campo.</small>
                <br>

                <label for="" class="form-label">Quantidade Disponivel</label>
                <input type="number" class="form-control form-control-sm" name="quantidade_disponivel" id="quantidade_disponivel" aria-describedby="helpId"
                    placeholder="00" maxlength="5" minlength="1" required />
                <small id="helpId" class="form-text text-muted">Insira a quantidade disponivel do produto neste campo.</small>
                <br>
                <br>
                
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" name="liberado_venda" id="liberado_venda" required />
                    <label class="form-check-label" for="liberado_venda">Liberado Venda</label>
                </div>
                
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
