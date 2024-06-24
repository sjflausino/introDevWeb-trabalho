<%-- 
    Document   : compras
    Created on : 24 de jun. de 2024, 18:21:40
    Author     : vertigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Compras</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

<body>

    <div class="container">

        <form action="" method="post">

            <div class="mb-3">
                <label for="" class="form-label">Quantidade Compra</label>
                <input type="text" class="form-control" name="quantidade_compra" id="quantidade_compra" maxlength="5"
                    size="3" aria-describedby="helpId" placeholder="0 - 99999" required />
                <small id="helpId" class="form-text text-muted">Digite a quantidade da compra neste campo</small>
            </div>

            <div class="mb-3">
                <label for="" class="form-label">Data da Compra</label>
                <input type="date" class="form-control" name="data_compra" id="data_compra" maxlength="10"
                    size="10" aria-describedby="helpId" required />
                <small id="helpId" class="form-text text-muted">Insira a data da compra neste campo</small>
            </div>

            <div class="mb-3">
                <label for="" class="form-label">Valor da Compra</label>
                <input type="text" class="form-control" name="valor_compra" id="valor_compra" maxlength="50"
                    size="3" aria-describedby="helpId" placeholder="0,00 - 100,00" required />
                <small id="helpId" class="form-text text-muted">Digite a valor da compra neste campo</small>
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
