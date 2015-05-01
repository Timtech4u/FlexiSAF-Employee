<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : allemployee
    Created on : Apr 29, 2015, 6:22:45 PM
    Author     : timtech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>All Employee</h1>
        <div>
            <sql:query var="employees" dataSource="jdbc/flexisaf">
                SELECT * FROM flexisaf_dep.Employee
            </sql:query>
    
            <table border="1">
                <!-- column headers -->
                <tr>
                <c:forEach var="columnName" items="${employees.columnNames}">
                    <th><c:out value="${columnName}"/></th>
                </c:forEach>
                </tr>
                <!-- column data -->
                <c:forEach var="row" items="${employees.rowsByIndex}">
                    <tr>
                    <c:forEach var="column" items="${row}">
                        <td><c:out value="${column}"/></td>
                    </c:forEach>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
