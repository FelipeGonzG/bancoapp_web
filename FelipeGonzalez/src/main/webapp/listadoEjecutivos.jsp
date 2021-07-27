<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <title>Banco</title>
    </head>
    <body>
        <div class="container p-5">
        <h1 class="title is-1">Banco</h1>
        
        <form method="GET" action="">
        <div class="field has-addons py-5">
            <div class="control">
                <input class="input" name="filtro" type="text" placeholder="Buscar">
            </div>
            <div class="control">
                <button class="button is-info">
                    Search
                </button>
            </div>
        </div>
        </form>
        
        <table class="table is-triped is-bordered is-fullwidth is-hoverable">
            <tr>
                <td>Rut</td>
                <td>Nombre</td>
                <td>Apellido</td>
                <td>clave</td>
            </tr>
            
            <form method="POST" action="">
            <tr>
                <th><div class="control"><input class="input" name="rut" type="text"></div></th>
                <th><div class="control"><input class="input" name="nombre" type="text"></div></th>
                <th><div class="control"><input class="input" name="apellido" type="text"></div></th>
                <th><div class="control"><input class="input" name="clave" type="text"></div></th>
                <th>
                    <div class="control">
                <button class="button is-info">Agregar</button>
            </div></th>
            </tr>
            
            </form>
            
            <tbody>
        <c:forEach items="${ejecutivos}" var="ejecutivo">
            <tr>
              <td>${ejecutivo.rut}</td>
              <td>${ejecutivo.nombre}</td>
              <td>${ejecutivo.apellido}</td>
              <td>${ejecutivo.clave}</td>
            </<tr>
        </c:forEach>
            </tbody>
        </table>
    </body>
</html>
