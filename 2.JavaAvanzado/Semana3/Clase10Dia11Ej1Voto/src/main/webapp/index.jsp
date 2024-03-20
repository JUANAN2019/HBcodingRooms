<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jagg.clase10dia11ej1voto.logica.Voto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta   charset="UTF-8">
        <title>Formulario de Votación</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <h1>Votación</h1>
            <form action="VotoSv" method="POST">
                <div class="form-group">
                    <label for="voto">Elija su voto:</label>

                    <br>
                    <input type="radio" id="votoA" name="voto" value="partidoA">
                    <label for="votoA">Partido A</label><br>
                    <input type="radio" id="votoB" name="voto" value="partidoB">
                    <label for="votoB">Partido B</label><br>
                    <input type="radio" id="votoC" name="voto" value="partidoC">
                    <label for="votoC">Partido C</label>

                </div>
                <button type="submit" class="btn btn-primary">Votar</button>
            </form>
            
            <br>
            <form action="VotoSv" method="GET" accept-charset="UTF-8">    
            <button class="btn btn-success" name="resultados">Mostrar resultados</button>
            </form>
             <br>
        <br>
        <!-- Resultados en tabla -->
        <div class="results-table">
            <% if (request.getAttribute("resultados") != null) { %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Partido </th>
                            <th>Numero de votos</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Voto voto : (List<Voto>) request.getAttribute("resultados")) { %>
                            <tr>
                                <td><tr>Partido A</tr></td>

                                <td><%= voto.getVotos() %></td>
                                
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% } %>
        </div>            
            
        </div>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>