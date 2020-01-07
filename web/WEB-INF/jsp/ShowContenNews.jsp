<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <!-- Bootstrap CSS -->
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
     
        <script type="text/javascript" nonce="ff4a3d0e8fa547198af112e4a6a" src="//local.adguard.org?ts=1576670412573&amp;type=content-script&amp;dmn=cdn.fbsbx.com&amp;css=1&amp;js=1&amp;gcss=1&amp;rel=1&amp;rji=1"></script>
        <script type="text/javascript" nonce="ff4a3d0e8fa547198af112e4a6a" src="//local.adguard.org?ts=1576670412573&amp;name=AdGuard%20Assistant%20Beta&amp;name=AdGuard%20Popup%20Blocker%20%28Beta%29&amp;name=AdGuard%20Extra%20Beta&amp;type=user-script"></script><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
                                                                                                                                                                                    integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/bb5e62a986.js" crossorigin="anonymous"></script>
          <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/css/pageCss.css">
        <title>Trang Chủ | Tin Tức</title>
       
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    </head>

    <body>
        <!-- ==========LOGOUT============= -->
        <%@include file="hearderHomePage.jsp" %>
        <!-- ==========LOGOUT============= -->
      
        <!-- ================END HEADER MENU AREA=================== -->
        <!-- ========================BRREADCRUMB-AREA===================== -->
        <div class="breadcrumb-area">
            <div class="breadcrumb-area__flex d-flex ">
                <div class="breadcrumb-area__background"></div>
                <div class="container">
                    <div class="breadcrumb-area__contain text-center">
                        <h2 class="">TIN TỨC</h2>
                        <div class="breadcrumb-area__contain--link">
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ========================END BRREADCRUMB-AREA===================== -->

        <!-- ==============================SECTION CONTAIN========================= -->
        <section class="section-contain">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 section-contain__box">
                        <h2>${t.tittle}</h2>
                        <p class="date"><span>Ngày đăng : ${t.dateStart}</span></p>
                        <div class="news-contrain">
                            <c:forEach var="item" items="${lcn}">
                            <h3 class="title-new">${item.tittle}</h3>
                            <p class="contain-news"> ${item.content}</p>
                            <p class="text-center">
                                <img src="./images/${item.image}" style="width: 80%;" alt="">

                            </p>
                            <p class="img-title text-center"><span class="img-title">${item.noteImage}</span></p>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="col-md-4 section-contain__news">
                        <div class="section-contain__news--heading">
                        <h3 class="main-text">~~~~ Chủ Đề Nổi Bật ~~~~</h3>
                    </div>
                        <div class="section-contain__news--contain">
                            <ul class="list-group list-group-flush">
                                <c:forEach var="item" items="${ltn}">
                                <li class="list-group-item"><a href="/AdminKMA/showContentNews?id=${item.idTN}">${item.tittle}</a></li>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- ==============================END SECTION CONTAIN========================= -->
        <!-- ====================FOOTER============================== -->
        <%@include file="footerHomePage.jsp" %>
        <!-- ====================END FOOTER============================== -->
    </body>

</html>