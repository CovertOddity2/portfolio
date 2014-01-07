<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<footer>
    <div id="footer-wrapper">
        <section id="footer" class="container">
            <div class="row">
                <div class="8u">
                    <div class="row">
                        <div class="8u">
                            <section>
                                <header>
                                    <h2>News and updates</h2>
                                </header>
                                <ul class="dates">
                                    <c:set var="count" value="0" scope="page" />
                                    <c:forEach var="newsItem" items="${newsList}">
                                        <c:if test="${count < 3}" >
                                        <li>
                                            <span class="date">${newsItem.monthAsText} <strong>${newsItem.day}</strong></span>
                                            <h3><a>${newsItem.title}</a></h3>
                                            <p>${newsItem.message}</p>
                                        </li>
                                        </c:if>
                                        <c:set var="count" value="${count + 1}" scope="page"/>
                                    </c:forEach>
                                </ul>
                            </section>
                        </div>
                    </div>
                    <div class="row">
                        <div class="8u">
                            <!--<section>
                                <header>
                                    <h2>Links</h2>
                                </header>
                                <ul class="dates">
                                    <li>
                                        <h3><a href="http://www.endQuircks.com" target="_blank">endQuirks</a></h3>
                                    </li>
                                    <li>
                                        <h3><a href="http://www.ganseki-software.com" target="_blank">Ganseki-Software</a>
                                        </h3>
                                    </li>
                                </ul>
                            </section>-->
                        </div>
                    </div>
                </div>
                <div class="4u">
                    <section>
                        <header>
                            <h2>be a socialite</h2>
                        </header>
                        <ul class="social">
                            <li class="facebook">
                                <a href="https://www.facebook.com/pieter.vaneeckhout" class="icon48 icon48-1">Facebook</a>
                            </li>
                            <li class="twitter">
                                <a href="https://twitter.com/pveeckhout" class="icon48 icon48-2">Twitter</a>
                            </li>
                            <li class="linkedin">
                                <a href="http://lnkd.in/_fduZE" class="icon48 icon48-3">LinkedIn</a>
                            </li>
                            <li class="bitbucket">
                                <a href="http://bitbucket.org/pveeckhout" class="icon48 icon48-4">BitBucket</a>
                            </li>
                            <li class="github">
                                <a href="https://github.com/pveeckhout" class="icon48 icon48-6">GitHub</a>
                            </li>
                            <li class="googleplus">
                                <a href="https://plus.google.com/+PieterVanEeckhout" class="icon48 icon48-5">Google+</a>
                            </li>
                        </ul>
                        <ul class="contact">
                            <li>
                                <h3>Address</h3>
                                <p>
                                    ${personalia.name} ${personalia.sirName}<br />
                                    ${personalia.streetAndNumber}<br/>
                                    ${personalia.zip} ${personalia.city}, ${personalia.country}<br/>
                                </p>
                            </li>
                            <li>
                                <h3>Mail</h3>
                                <p><a href="mailto:${personalia.email}">${personalia.email}</a>
                                </p>
                            </li>
                            <li>
                                <h3>Phone</h3>
                                <p>${personalia.phone}</p>
                            </li>
                            <li>
                                <h3>Mobile</h3>
                                <p>${personalia.mobile}</p>
                            </li>
                        </ul>
                    </section>
                </div>
            </div>
            <div class="row">
                <div class="12u">
                    <!-- Copyright -->
                    <div id="copyright">
                        <ul class="links">
                            <li>${personalia.name} ${personalia.sirName}; 2014</li>
                            <li></li>
                            <li>Based on a de design from: <a href="http://html5up.net">HTML5 UP</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
    </div>
</footer>