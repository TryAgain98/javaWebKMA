<%-- 
    Document   : hearderHomePage
    Created on : Dec 22, 2019, 3:03:00 AM
    Author     : Huy Toan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <!-- Bootstrap CSS -->

        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/bb5e62a986.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/css/pageCss.css">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



        <title>Trang chủ</title>
        <style>
            .news:link{
                text-decoration: none;
            }
            .news p{
                color: black;
                font-size: 1.3em;
            }
            .page-link{
                padding: 15px;
                font-size: 15px;
            }
            .tittleForm{

                text-align: center;
                background-color: #ffcc80;
                padding-top: 10px;
                padding-bottom: 10px;
                color: white;
                text-transform: uppercase;
                margin-bottom: 10px;
                font-weight: bold;
                user-select:none;
            }
            .TittleChildren{
                text-transform: uppercase;
                font-weight: bold;
                user-select:none;
            }
            #buttonBack {
                color: white;

            }

            #aMySelf:link{
                color: white;
            }


        </style>
    </head>
    <body>
        <c:if test="${not empty inform}">
            <script>
                $(document).ready(function () {
                    function check() {
                        Swal.fire({
                            position: 'top',
                            icon: 'success',
                            title: '${inform} ',
                            timer: 1500
                        })
                    }
                    ;

                    check();
                });
            </script>
        </c:if>
     

<!--        <div class="navigation">
            <input type="checkbox" class="navigation__checkbox" id="navi-toggle">
            <label for="navi-toggle" class="navigation__button">
                <span class="navigation__icon">&nbsp;</span>
            </label>
            <div class="navigation__background">&nbsp;</div>
            <div class="navigation__nav">
                <ul class="navigation__list nav-color-black">
                    <li class="navigation__item"><a href="/AdminKMA/detailEmployee?idRFID=${idRFID}&idFingerprint=${idFT}"
                                                    class="navigation__link">Thông Tin Cá Nhân</a></li>
                    <li class="navigation__item"><a href="/AdminKMA/PersonalInfo?idRFID=${idRFID}&idFingerprint=${idFT}"
                                                    class="navigation__link">Cập Nhật Thông Tin </a></li>
                    <c:if test="${quyen != 'Nhân Sự'}">   <li class="navigation__item"><a href="/AdminKMA/admin"
                                                    class="navigation__link">Trang Admin</a></li></c:if>
                        <li class="navigation__item"><a href="/AdminKMA/logout"
                                                        class="navigation__link">Đăng Xuất</a></li>

                    </ul>
                </div>
            </div>-->
            <header class="header-area">
                <div class="header-area-top">
                    <div class="container">
                        <div class="header-area-top__left">
                            <ul class="header-area-top__left-list">
                                <!--                                <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                                                                <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                                                                <li><a href="#"><i class="fab fa-dribbble"></i></a></li>
                                                                <li><a href="#"><i class="far fa-envelope"></i></a></li>-->
                            </ul>
                        </div>
                        <div class="header-area-top__right">
                            <a class="header-area-top__right--textleft ">Xin chào</a>

                            <a href="/AdminKMA/InfoPersonal?idRFID=${idRFID}&idFingerprint=${idFT}" class="header-area-top__right--textright ">${name}</a>
                        <a href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">
                            <span><i class="fas fa-grip-lines"></i></span></a>
                        <div class="dropdown-menu header-area-top__right--dropdown" aria-labelledby="dropdownMenuLink">
                            <a class="dropdown-item" href="/AdminKMA/InfoPersonal?idRFID=${idRFID}&idFingerprint=${idFT}">Tài Khoản</a>
                            <c:if test="${quyen != 'Nhân Sự'}">  <a class="dropdown-item" href="/AdminKMA/admin">Trang quản lý</a></c:if>
                                <a class="dropdown-item" href="/AdminKMA/logout">Đăng xuất</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="header-area-bot">
                    <nav class="navbar navbar-expand-lg navbar-light">
                        <div class="container">
                            <!-- Brand and toggle get grouped for better mobile display -->
                            <a class="navbar-brand logo_h" href="/AdminKMA/HomePage"><img src="/AdminKMA/images/Logobar1.png" alt="" class="img-size"></a>
                            <button class="navbar-toggler" type="button" data-toggle="collapse"
                                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                                    aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <!-- Collect the nav links, forms, and other content for toggling -->
                            <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                                <ul class="nav navbar-nav menu_nav ml-auto nav-color-black">
                                    <li class="nav-item"><a class="nav-link" href="/AdminKMA/HomePage">Trang Chủ</a></li>
                                    <li class="nav-item submenu dropdown"><a class="nav-link dropdown-toggle" href="#"
                                                                             data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Giới
                                            Thiệu</a>
                                        <ul class="dropdown-menu">

                                            <li class="nav-item"><a class="nav-link" href="/AdminKMA/showRules">Nội Quy</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="nav-item submenu dropdown">
                                        <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button"
                                           aria-haspopup="true" aria-expanded="false">Phòng Ban</a>
                                        <ul class="dropdown-menu">
                                        <c:forEach var="item" items="${lp}">
                                            <li class="nav-item"><a class="nav-link" href="/AdminKMA/employeeRoom?id=${item.idRoom}">${item.name}</a></li>
                                            </c:forEach>
                                    </ul>
                                </li>
                                <li class="nav-item submenu dropdown">
                                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button"
                                       aria-haspopup="true" aria-expanded="false">Khoa</a>
                                    <ul class="dropdown-menu">
                                        <c:forEach var="item" items="${lk}">
                                            <li class="nav-item"><a class="nav-link" href="/AdminKMA/employeeRoom?id=${item.idRoom}">${item.name}</a></li>
                                            </c:forEach>
                                    </ul>
                                </li>
                                <li class="nav-item submenu dropdown">
                                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button"
                                       aria-haspopup="true" aria-expanded="false">Thống Kê</a>
                                    <ul class="dropdown-menu">
                                        <li class="nav-item"><a class="nav-link" href="/AdminKMA/searchStatistical?idRFID=${idRFID}">Cá Nhân</a></li>
                                        <c:if test="${quyen != 'Nhân Sự'}" >     <li class="nav-item"><a class="nav-link" href="/AdminKMA/statisticalEmployee">Nhân Sự</a></li>
                                            <li class="nav-item"><a class="nav-link" href="/AdminKMA/ShowStatisticalPhong" >Phòng Ban - KHoa</a></li>
                                            <li class="nav-item"><a class="nav-link"  href="/AdminKMA/StatisticalSchool">Trường</a></li></c:if>

                                    </ul>
                                </li>
                                <li class="nav-item"><a class="nav-link" href="/AdminKMA/contact">Liên Hệ</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </header>

    </body>
</html>
