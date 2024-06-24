<%-- 
    Document   : vendas
    Created on : 24 de jun. de 2024, 18:23:17
    Author     : vertigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vendas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

<body>

    <div class="container">
        <form action="" method="post">
            <div class="mb-3">
                <br>
                <label for="" class="form-label">Quantidade de Vendas</label>
                <input type="number" class="form-control form-control-sm" name="qtd_vendas" id="qtd_vendas"
                    aria-describedby="helpId" placeholder="" min="0" max="99999" maxlength="5" minlength="1" required />
                <small id="helpId" class="form-text text-muted">digite a quantidade de vendas neste campo</small>
                <br>
                <label for="" class="form-label">Data da compra</label>
                <input type="date" class="form-control form-control-sm" name="data_compra" id="data_compra"
                    aria-describedby="helpId" placeholder="2024-04-11" maxlength="10"
                    minlength="10" required />
                <small id="helpId" class="form-text text-muted">digite a data da compra neste campo</small>
                <br>
                <label for="" class="form-label">Valor da Vendas</label>
                <input type="text" class="form-control form-control-sm" name="valor_vendas" id="valor_vendas"
                    aria-describedby="helpId" placeholder="R$ 1.000,00" maxlength="50" minlength="3" required />
                <small id="helpId" class="form-text text-muted">digite o valor de vendas neste campo</small>
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