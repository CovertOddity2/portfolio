<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="main-wrapper">
    <div class="container">
        <div id="portfolioDiv" class="row">
            <div class="12u">
                <section>
                    <header class="major">
                        <h2>Portfolio</h2>
                    </header>
                    <div>
                        <c:set var="count" value="0" scope="page" />
                        <div class="row">
                            <c:forEach var="portfolioItem" items="${portfolioList}" >
                                <div id="${portfolioItem.title}" class="4u">
                                    <section class="box">
                                        <a href="#" class="image image-full">
                                            <img src="${portfolioItem.imageLocation}" alt="${portfolioItem.title}"/>
                                        </a>
                                        <header>
                                            <h3>${portfolioItem.title}</h3>
                                        </header>
                                        <p>
                                            ${portfolioItem.content}
                                        </p>
                                        <footer>
                                            <a href="${portfolioItem.link}"
                                               class="button button-alt" target="_blank">${portfolioItem.buttonText}</a>
                                        </footer>
                                    </section>
                                </div>
                                <c:set var="count" value="${count + 1}" scope="page"/>
                                <c:if test="${count % 3 == 0}" >
                                </div>
                                <div class="row">
                                </c:if>
                            </c:forEach>
                        </div>
                    </div>
                </section>
            </div>
        </div>
    </div>
</div>