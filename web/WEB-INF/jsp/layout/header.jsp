<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header-wrapper">
    <div class="container">
        <div class="row">
            <div class="12u">
                <section id="header">
                    <h1><a href="#">Pieter Van Eeckhout</a></h1>
                    <nav id="nav">
                        <ul>
                            <li id="index"
                                <c:if test="${viewName == 'index'}" >
                                    class="current_page_item"
                                </c:if> >
                                <a href="index.htm">Home</a>
                            </li>
                            <li id="about"
                                <c:if test="${viewName == 'about'}" >
                                    class="current_page_item"
                                </c:if> >
                                <a href="about.htm">About me</a>
                            </li>
                            <li id="portfolio"
                                <c:if test="${viewName == 'portfolio'}" >
                                    class="current_page_item"
                                </c:if> >
                                <a href="portfolio.htm">Portfolio</a>
                            </li>
                            <li id="cv"
                                <c:if test="${viewName == 'cv'}" >
                                    class="current_page_item"
                                </c:if> >
                                <a href="cv.htm">Curriculum Vitae</a>
                            </li>
                        </ul>
                    </nav>
                </section>
            </div>
        </div>

    </div>
</div>