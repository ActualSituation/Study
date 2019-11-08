<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>To-do List</title>
    <link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/sematic-ui/2.2.10/semantic.min.css">
</head>
<body>
<div class="ui container">
    <h4>To-dos for ${pricipa.name}</h4>
    <table class="ui celled table">
        <thead>
            <tr>
                <td class="three wide">Owner</td>
                <td class="five wide">To-do</td>
                <td class="two wide">Completed</td>
                <td class="six wide">&nbsp;</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.owner}</td>
                    <td>${todo.description}</td>
                    <td>${todo.completed}</td>
                    <td>
                        <c:if test="${!todo.completed}">
                            <c:url value="/todos/${todo.id}/completed" var="completedUrl"/>
                            <form action="${completedUrl}" method="post" style="float: left;">
                                <input type="hidden" name="_method" value="PUT" />
                                <button class="ui mini green icon button"><i class="check circle icon"></i></button>
                            </form>
                        </c:if>
                        <c:url value="/todos/${todo.id}" var="deleteUrl" />
                        <form action="${deleteUrl}" method="post" style="float: left;">
                            <input type="hidden" name="_method" value="DELETE">
                            <button class="ui mini red icon button"><i class="remove circle icon"></i></button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="3">
                    <a class="ui mini icon button" href="<c:url value="/todos/new"/>">New To-do <i class="add circle icon"></i></a>
                </td>
            </tr>
        </tbody>
    </table>
</div>
</body>
</html>
