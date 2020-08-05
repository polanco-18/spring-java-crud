<%-- 
    Document   : Agregar
    Created on : 07-oct-2019, 20:25:14
    Author     : AUTONOMA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card header bg-info text-white">                    
                    <h3 class="mt-2 text-center">Agregar Nuevo Registro</h3>
                </div>
                <div class="card-body">              
                    <form method="POST">
                        <div class="form-row">
                            <div class="row">
                                <div class="col-md-3">
                                    <input type="text" name="Nom" class="form-control" placeholder="Nombre">
                                </div>
                                <div class="col-md-3">
                                    <input type="text" name="Correo" class="form-control" placeholder="Correo">
                                </div>
                                <div class="col-md-3">
                                    <input type="text" name="Contra" class="form-control" placeholder="Correo">
                                </div>
                                <div class="col-md-3">
                                    <input type="text" name="Naci" class="form-control" placeholder="Nacionalidad">
                                </div>
                            </div>
                            <br>
                            <br>
                            <div class="row">
                                <div class="col">
                                    <input type="submit" class="btn btn-success" value="Agregar">
                                </div>
                                <div class="col">
                                    <a href="index.htm" class="btn btn-primary">Atras </a>
                                </div>
                            </div>
                        </div>
                    </form>

                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
