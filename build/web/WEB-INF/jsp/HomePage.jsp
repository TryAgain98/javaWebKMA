<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
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
        </style>
    </head>

    <body>
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

            <!-- =========HEADER MENU AREA================= -->
            <header class="header-area">
                <div class="header-area-top">
                    <div class="container">
                        <div class="header-area-top__left">
                            <ul class="header-area-top__left-list">
                               
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
                        <a class="navbar-brand logo_h" href="/AdminKMA/HomePage"><img src="./images/logoKMA.png" alt=""></a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse"
                                data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                                aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                            <ul class="nav navbar-nav menu_nav ml-auto ">
                                <li class="nav-item active"><a class="nav-link" href="/AdminKMA/HomePage">Trang Chủ</a></li>
                                <li class="nav-item submenu dropdown"><a class="nav-link dropdown-toggle" href="#"
                                                                         data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Giới
                                        Thiệu</a>
                                    <ul class="dropdown-menu">
                                        <li class="nav-item"><a class="nav-link" href="/AdminKMA/showRules">Nội quy</a></li>
                                        
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
                                        <li class="nav-item"><a class="nav-link" href="/AdminKMA/searchStatistical?idRFID=${idRFID}" >Cá Nhân</a></li>
                                         <c:if test="${quyen != 'Nhân Sự'}" > 
                                         <li class="nav-item"><a class="nav-link" href="/AdminKMA/statisticalEmployee">Nhân Sự</a></li>
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

        <section class="banner-area">
            <div class="banner-area__textbox">
                <h3 class="banner-area-primary">
                    <span class="banner-area-primary__main"></span>
                    <span class="banner-area-primary__sub"></span>
                </h3>
            </div>
        </section>

        <!-- ==================heading news====================== -->
        <div class="heading-news">
            <div class="heading-secondary" style="">
                <h2 class="heading-secondary--text">
                    Tin nổi bật
                </h2>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <h3 class="heading-tertiary u-margin-bottom-small">
                            Nội Quy
                        </h3>
                        <p class="paragraph">
                            ${rule.introduce}
                        </p>
                        <a href="/AdminKMA/showRules" class="btn-text">Learn more &rarr;</a>
                    </div>
                    <div class="col-md-6">
                        <div class="composition">
                            <a href="/AdminKMA/showContentNews?id=${tOne.idTN}">
                                <div class="composition__photoarea">
                                    <img src="/AdminKMA/images/${tOne.image}" alt="photo1"
                                         class="composition__photo composition__photo--p1">
                                    <span class="composition__news composition__news--p1">${tOne.tittle}</span>
                                </div></a>
                            <a href="/AdminKMA/showContentNews?id=${tTwo.idTN}">
                                <div class="composition__photoarea">
                                    <img src="/AdminKMA/images/${tTwo.image}" alt="photo1"
                                         class="composition__photo composition__photo--p2">
                                    <span class="composition__news composition__news--p2">${tTwo.tittle}</span>
                                </div></a>
                            <a href="/AdminKMA/showContentNews?id=${tThree.idTN}">
                                <div class="composition__photoarea">
                                    <img src="/AdminKMA/images/${tThree.image}" alt="photo1"
                                         class="composition__photo composition__photo--p3">
                                    <span class="composition__news composition__news--p3">${tThree.tittle}</span>
                                </div></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ==================End heading news====================== -->

    <!-- =====================SECTION NEWS============================ -->
    <section class="section-news">
        <div class="container">
            <div class="section-news--head">
                <h2>TIN TỨC & SỰ KIỆN</h2>
                <!-- <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni fugit voluptate omnis nihil quasi!
                    Minima perspiciatis, cum exercitationem illo aliquid officiis quas velit cupiditate aut vero magni
                    quam, iusto consectetur!</p> -->
            </div>
            <div class="row section-news--box">
                <c:forEach var="item" items="${ltn}">

                    <div class="col-lg-3 col-md-6">
                        <a href="/AdminKMA/showContentNews?id=${item.idTN}" class="news">
                            <div class="section-news--box--iteam">
                                <img class="img-fluid" style="height: 150px;" src="/AdminKMA/images/${item.image}" alt="">
                                <p class="date">${item.dateStart}</p>

                                <h4 style="height: 100px;overflow: hidden;"> ${item.tittle}</h4>


                            </div></a>
                    </div>
                </c:forEach>

            </div>

            <nav aria-label="Page navigation example" >
                <ul class="pagination">
                    <li class="page-item">
                        <a class="page-link" href="/AdminKMA/reductionPage?id=${id}" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                            <span class="sr-only">Previous</span>
                        </a>
                    </li>
                    <c:forEach var = "i" begin = "1" end = "${count}">
                        <li class="page-item"><a class="page-link" href="/AdminKMA/HomePageNews?id=${i}">${i}</a></li>
                        </c:forEach>
                    <li class="page-item">
                        <a class="page-link" href="/AdminKMA/increasePage?id=${id}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                            <span class="sr-only">Next</span>
                        </a>
                    </li>
                </ul>
            </nav>

        </div>
    </section>
    <!-- =====================END SECTION NEWS============================ -->

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