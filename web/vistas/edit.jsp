<%@page import="modeloDAO.EmpleadoDAO"%>
<%@page import="modelo.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                    <%

                        EmpleadoDAO dao = new EmpleadoDAO();
                        int id = Integer.parseInt((String)request.getAttribute("idemp"));
                        Empleado e = (Empleado)dao.list(id);
                    %>
                <h1>Editar Empleado</h1>
                <form action="Controlador">
                    Nombre:<br>
                    <input class="form-control" type="text" name="txtName" value="<%=e.getName()%>"><br>
                    Area:<br>
                    <input class="form-control" type="text" name="txtArea" value="<%=e.getArea()%>"><br>
                    <input type="hidden" name="txtid" value="<%= id%>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"><br>
                    <a href="Controlador?accion=listar">Regresar</a>
            </form>
            </div>
        </div>
    </body>
</html>
