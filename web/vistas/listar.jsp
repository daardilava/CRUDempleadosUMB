<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Empleado"%>
<%@page import="modeloDAO.EmpleadoDAO"%>
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
            <h1>Empleados</h1>
            <a class="btn btn-success" href="Controlador?accion=add">Agregar Empleado</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">NAME</th>
                        <th class="text-center">AREA</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    EmpleadoDAO dao =new EmpleadoDAO();
                    List<Empleado>list=dao.listar();
                    Iterator<Empleado>iter=list.iterator();
                    Empleado emp=null;
                    while(iter.hasNext()){
                        emp = iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=emp.getId()%></td>
                        <td class="text-center"><%=emp.getName()%></td>
                        <td class="text-center"><%=emp.getArea()%></td>
                        
                        <td>
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%=emp.getId()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%=emp.getId()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
