<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title><tiles:getAsString name="title"/></title>
        <tiles:insertAttribute name="HTML-head" />
    </head>
    <body class="homepage">
        <div id="pageloader">
            <tiles:insertAttribute name="header" />
            <tiles:insertAttribute name="main" />
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>
