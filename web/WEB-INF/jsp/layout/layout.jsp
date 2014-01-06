<%-- 
    Document   : layout
    Created on : Jan 6, 2014, 1:03:29 AM
    Author     : pveeckhout
--%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:getAsString name="title"/></title>
    </head>
    <body>
        <tiles:insertAttribute name="header" />
        <br CLEAR="ALL"/>

        <tiles:insertAttribute name="body"/>
        <br CLEAR="ALL"/>

        <tiles:insertAttribute name="footer"/>
    </body>
</html>
