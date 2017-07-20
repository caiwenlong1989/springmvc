<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
<h1>Hello World</h1>
<P>  The time on the server is ${serverTime}. </P>
<br>
<table>
    <tr><td><p>  <a id="1" class="textLink" href="<c:url value="simple"/>">GET  /simple</a> </p></td></tr>
    <tr><td><p>  <a id="2" class="textLink" href="<c:url value="simple"/>">POST /simple</a> </p></td></tr>
    <tr><td><p>  <a id="3" class="textLink" href="<c:url value="requestBody?msg=这是请求中文"/>">请求中文信息</a> </p></td></tr>
    <tr><td><p>  <a id="4" class="textLink" href="<c:url value="responseBody"/>">响应中文信息</a> </p></td></tr>
    <tr><td><p>  <a id="5" class="textLink" href="<c:url value="responseJson"/>">响应JSON信息</a> </p></td></tr>
</table>
<script type="text/javascript" src="resources/jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
MvcUtil = {};
MvcUtil.showSuccessResponse = function (text, element) {
    MvcUtil.showResponse("success", text, element);
};
MvcUtil.showErrorResponse = function showErrorResponse(text, element) {
    MvcUtil.showResponse("error", text, element);
};
MvcUtil.showResponse = function(type, text, element) {
    var responseElementId = element.attr("id") + "Response";
    var responseElement = $("#" + responseElementId);
    if (responseElement.length == 0) {
        responseElement = $('<span id="' + responseElementId + '" class="' + type + '" style="display:none"> ' + text + '</span>').insertAfter(element);
    } else {
        responseElement.replaceWith('<span id="' + responseElementId + '" class="' + type + '" style="display:none"> ' + text + '</span>');
        responseElement = $("#" + responseElementId);
    }
    responseElement.fadeIn("slow");
};
</script>
<script type="text/javascript">
$(document).ready(function() {
    $("a.textLink").click(function(){
        var link = $(this);
        $.ajax({ url: link.attr("href"), dataType: "text", success: function(text) { MvcUtil.showSuccessResponse(text, link); }, error: function(xhr) { MvcUtil.showErrorResponse(xhr.responseText, link); }});
        return false;
    });
});
</script>
</body>
</html>