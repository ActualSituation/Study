<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>

<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>

<script type="text/javascript">

    $(document).ready(function () {

        $("#putBtn").on("click", function () {
            var boardNo = $("#boardNo");
            var title = $("#title");
            var content = $("#content");
            var writer = $("#writer");

            var boardNoVal = boardNo.val();
            var titleVal = title.val();
            var contentVal = content.val();
            var writerVal = writer.val();

            var boardObject = {
                boardNo: boardNoVal
                , title: titleVal
                , content: contentVal
                , writer: writerVal
            };

            $.ajax({
                type: "put"
                , url: "/board/" + boardNoVal
                , data: JSON.stringify(boardObject)
                , contentType: "application/json; charset=UTF-8"
                , success: function (result) {
                    console.log("result: " + result);
                    if (result === "SUCCESS") {
                        alert("SUCCESS");
                    }
                }
            });
        });

        $("#putHeaderBtn").on("click", function () {
            var boardNo = $("#boardNo");
            var title = $("#title");
            var content = $("#content");
            var writer = $("#writer");

            var boardNoVal = boardNo.val();
            var titleVal = title.val();
            var contentVal = content.val();
            var writerVal = writer.val();

            var boardObject = {
                boardNo: boardNoVal
                , title: titleVal
                , content: contentVal
                , writer: writerVal
            };

            $.ajax({
                type: "put"
                , url: "/board/" + boardNoVal
                , headers: {
                    "X-HTTP-Method-Override": "PUT"
                }
                , data: JSON.stringify(boardObject)
                , contentType: "application/json; charset=UTF-8"
                , success: function (result) {
                    console.log("result: " + result);
                    if (result === "SUCCESS") {
                        alert("SUCCESS");
                    }
                }
            });
        });

        $("#postBtn").on("click", function () {
            var boardNo = $("#boardNo");
            var title = $("#title");
            var content = $("#content");
            var writer = $("#writer");

            var boardNoVal = boardNo.val();
            var titleVal = title.val();
            var contentVal = content.val();
            var writerVal = writer.val();

            var boardObject = {
                boardNo: boardNoVal
                , title: titleVal
                , content: contentVal
                , writer: writerVal
            };

            $.ajax({
                type: "post"
                , url: "/board/" + boardNoVal
                , data: JSON.stringify(boardObject)
                , contentType: "application/json; charset=UTF-8"
                , success: function (result) {
                    console.log("result : " + result);
                    if (result === "SUCCESS") {
                        alert("SUCCESS");
                    }
                }
            });

        });

        $("#putJsonBtn").on("click", function () {
            var boardNo = $("#boardNo");
            var title = $("#title");
            var content = $("#content");
            var writer = $("#writer");

            var boardNoVal = boardNo.val();
            var titleVal = title.val();
            var contentVal = content.val();
            var writerVal = writer.val();

            var boardObject = {
                boardNo: boardNoVal
                , title: titleVal
                , content: contentVal
                , writer: writerVal
            };

            $.ajax({
                type: "put"
                , url: "/board/" + boardNoVal
                , data: JSON.stringify(boardObject)
                , contentType: "application/json; charset=UTF-8"
                , success: function (result) {
                    console.log("result: " + result);
                    if (result === "SUCCESS") {
                        alert("SUCCESS");
                    }
                }
            });
        });

        $("#putXmlBtn").on("click", function () {
            var boardNo = $("#boardNo");
            var title = $("#title");
            var content = $("#content");
            var writer = $("#writer");

            var boardNoVal = boardNo.val();
            var titleVal = title.val();
            var contentVal = content.val();
            var writerVal = writer.val();

            var xmlData = "<Board>";
            xmlData += "<boardNo>0</boardNo>";
            xmlData += "<title>title1</title>";
            xmlData += "<content>content1</content>";
            xmlData += "<writer>writer1</writer>";
            xmlData += "<regDate>2018-12-10</regDate>";
            xmlData += "</Board>";

            $.ajax({
                type: "put"
                , url: "/board/" + boardNoVal
                , data: xmlData
                , contentType: "application/xml; charset=UTF-8"
                , success: function (result) {
                    console.log("result: " + result);
                    if (result === "SUCCESS") {
                        alert("SUCCESS");
                    }
                }
            });
        });

        $("#getBtn").on("click", function () {
            var boardNo = $("#boardNo");
            var boardNoVal = boardNo.val();

            console.log(boardNoVal);

            $.get("/board/" + boardNoVal, function (data) {
                console.log(data);

                alert(JSON.stringify(data));
            });
        });

        $("#getJsonBtn").on("click", function () {
            var boardNo = $("#boardNo");
            var boardNoVal = boardNo.val();

            console.log(boardNoVal);

            $.ajax({
                type: "get"
                , url: "/board/" + boardNoVal
                , headers: {
                    "Accept": "application/json"
                }
                , success: function (result) {
                    console.log("result: " + result);

                    alert(JSON.stringify(result));
                }
            });
        });

        $("#getXmlBtn").on("click", function () {
            var boardNo = $("#boardNo");
            var boardNoVal = boardNo.val();

            console.log(boardNoVal);

            $.ajax({
                type: "get"
                , url: "/board/" + boardNoVal
                , headers: {
                    "Accept": "application/xml"
                }
                , success: function (result) {
                    console.log("result: " + result);

                    alert(xmlToString(result));
                }
            });
        });

        function xmlToString(xmlData) {
            var xmlString;

            if (window.ActiveXObject) {
                xmlString = xmData.xml;
            } else {
                xmlString = (new XMLSerializer()).serializeToString(xmlData);
            }

            return xmlString;
        }

    });

</script>

<body>
    <h1>Ajax Home</h1>

    <form>
        boardNo: <input type="text" name="boardNo" value="" id="boardNo"><br>
        title: <input type="text" name="title" value="" id="title"><br>
        content: <input type="text" name="content" value="" id="content"><br>
        writer: <input type="text" name="writer" value="" id="writer"><br>
    </form>

    <div>
        <button id="putBtn">MODIFY</button>
        <button id="putHeaderBtn">MODIFY(put with header)</button>

        <button id="postBtn">MODIFY(post)</button>
        <button id="putJsonBtn">MODIFY(put json)</button>
        <button id="putXmlBtn">MODIFY(put xml)</button>

        <button id="getBtn">READ</button>
        <button id="getJsonBtn">READ (JSON)</button>
        <button id="getXmlBtn">READ (XML)</button>
    </div>
</body>
</html>
