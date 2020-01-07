<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <!-- Bootstrap CSS -->
        <script type="text/javascript" nonce="ff4a3d0e8fa547198af112e4a6a" src="//local.adguard.org?ts=1576670412573&amp;type=content-script&amp;dmn=cdn.fbsbx.com&amp;css=1&amp;js=1&amp;gcss=1&amp;rel=1&amp;rji=1"></script>
        <script type="text/javascript" nonce="ff4a3d0e8fa547198af112e4a6a" src="//local.adguard.org?ts=1576670412573&amp;name=AdGuard%20Assistant%20Beta&amp;name=AdGuard%20Popup%20Blocker%20%28Beta%29&amp;name=AdGuard%20Extra%20Beta&amp;type=user-script"></script><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
                                                                                                                                                                                                        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/bb5e62a986.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/css/pageCss.css">
        <title>Trang Chủ | Phòng Ban</title>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    </head>

    <body>
        <%@include file="hearderHomePage.jsp" %>

        <!-- ==========LOGOUT============= -->

        <!-- ================END HEADER MENU AREA=================== -->
        <!-- ========================BRREADCRUMB-AREA===================== -->
        <div class="breadcrumb-area">
            <div class="breadcrumb-area__flex d-flex ">
                <div class="breadcrumb-area__background"></div>
                <div class="container">
                    <div class="breadcrumb-area__contain text-center">
                        <h2 class="" style="text-transform: uppercase">${r.loai}</h2>
                        <div class="breadcrumb-area__contain--link">
                            <h3 style="text-transform: uppercase;color: white">tên ${r.loai} : ${r.name}</h3>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ========================END BRREADCRUMB-AREA===================== -->

        <!-- ==========================PHONG BAN INFO=============================== -->
        <section class="Phongban-info">
            <div class="container">
                <div class="Phongban-info--Gioithieu text-center">
                    <h2>Giới Thiệu</h2>
                </div>
                <div class="Phongban-info--text">
                    <p>${r.introduce}</p>
                </div>
            </div>
        </section>
        <!-- ==========================END PHONG BAN INFO=============================== -->

        <!-- =============================PHONG BAN CONTAIN========================= -->
        <section class="PhongBan-contain">
            <div class="container">
                <div class="PhongBan-contain__title text-center">
                    <h2 class="PhongBan-contain__title--primary">Nhân Viên</h2>
                </div>
                <div class="PhongBan-contain__team row">
                    <c:forEach var="item" items="${lep}">
                        <div class="col-md-3">
                            <div class="PhongBan-contain__team--img text-center">
                        <c:if test="${quyen != 'Nhân Sự' || item.idRFID==idRFID}" >   <a href="/AdminKMA/detailEmployee?idRFID=${item.idRFID}&idFingerprint=${item.idFingerprint}&idRoom=${r.idRoom}"><img src="./images/${item.image}" alt=""
                                                                               class="img-fluid PhongBan-contain__team--img--box"></a></c:if>
                        <c:if test="${quyen == 'Nhân Sự' && item.idRFID!=idRFID}" >  
                          <img src="./images/${item.image}" alt=""
                                   class="img-fluid PhongBan-contain__team--img--box"></c:if>
                        </div>
                        <div class="PhongBan-contain__team--name text-center" style="pointer-events: none; 
                             cursor: default; ">
                        <c:if test="${quyen != 'Nhân Sự' && item.idRFID!=idRFID }" >   <a href="/AdminKMA/detailEmployee?idRFID=${item.idRFID}&idFingerprint=${item.idFingerprint}&idRoom=${r.idRoom}">
                                <h4>${item.fullName}</h4>
                                <p>${item.positionn}</p>
                            </a></c:if>
                        <c:if test="${quyen == 'Nhân Sự' || item.idRFID==idRFID}" >    

                            <h4>${item.fullName}</h4>
                            <p>${item.positionn}</p>
                        </c:if>
                    </div>
                </div>
                    </c:forEach> 


                </div>
            </div>
        </section>
        <!-- =============================END PHONG BAN CONTAIN========================= -->


        <!-- ====================FOOTER============================== -->
        <%@include file="footerHomePage.jsp" %>
        <!-- ====================END FOOTER============================== -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
                integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
                integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
                integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
    </body>

</html>