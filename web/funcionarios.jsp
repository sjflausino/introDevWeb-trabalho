<%-- 
    Document   : funcionarios
    Created on : 24 de jun. de 2024, 18:22:36
    Author     : vertigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Funcionários</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

<body>

    <div class="container">
        <form action="" method="post">
            <div class="mb-3">
                <br>
                <label for="" class="form-label">Nome</label>
                <input type="text" class="form-control form-control-sm" name="nome_funcionario" id="nome_funcionario" aria-describedby="helpId"
                    placeholder="Nome do Funcionário" maxlength="50" minlength="3" required />
                <small id="helpId" class="form-text text-muted">digite o nome do funcionário neste campo</small>
                <br>
                <label for="" class="form-label">CPF</label>
                <input type="text" class="form-control form-control-sm" name="cpf" id="cpf" aria-describedby="helpId"
                    placeholder="111.222.333-44" maxlength="14" minlength="14" required />
                <small id="helpId" class="form-text text-muted">digite o CPF do funcionário neste campo</small>
                <br>
                <label for="" class="form-label">Senha</label>
                <input type="password" class="form-control form-control-sm" name="senha" id="senha" aria-describedby="helpId"
                    placeholder="****" maxlength="10" minlength="4" required />
                <small id="helpId" class="form-text text-muted">digite o a senha do funcionario neste campo</small>
                <br>                
                <label for="" class="form-label">Email</label>
                <input type="email" class="form-control form-control-sm" name="email" id="email"
                    aria-describedby="helpId" placeholder="test@email.com" maxlength="50" required />
                <small id="helpId" class="form-text text-muted">digite o email do funcionario neste campo</small>
                <br>
                <label for="" class="form-label">Tipo</label>
                <input type="text" class="form-control form-control-sm" name="tipo" id="tipo" aria-describedby="helpId"
                    placeholder="A" maxlength="1" size="1" required />
                <small id="helpId" class="form-text text-muted">digite o tipo do funcionário neste campo</small>
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