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
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <title>Thông Tin Nhân Viên</title>

        <!-- sweetaler -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script>
        <script src="http://localhost:8080/AdminKMA/vendor/sweetalert2.min.js"></script>
        <link rel="stylesheet" href="http://localhost:8080/AdminKMA/vendor/sweetalert2.min.css">
    </head>

    <body>
        <%@include file="hearderHomePage.jsp" %>
        

        <div class="breadcrumb-area">
            <div class="breadcrumb-area__flex d-flex ">
                <div class="breadcrumb-area__background"></div>
                <div class="container">
                    <div class="breadcrumb-area__contain text-center">
                        <h2 class="" style="text-transform: uppercase">Thông tin cá nhân</h2>
                        <div class="breadcrumb-area__contain--link">



                        </div>
                    </div>
                </div>
            </div>
        </div>

        <section class="staff-info">
            <div class="container">
                <div class="staff-info--primary_text text-center">

                </div>
                <div class="row">
                    <div class="col-md-4">
                        <div class="staff-info--img text-center">
                            <img src="./images/${e.image}" alt="" height="auto">
                        </div>
                    </div>
                    <div class="col-md-8">
                        <div class="staff-info__impor">
                            <table class="info-table table">
                                <tr class="info-table__row">
                                    <th class="info-table__col-left">Họ Và tên</th>
                                    <th class="info-table__col-right">${e.fullName}</th>
                                </tr>
                                <tr>
                                    <th class="info-table__col-left">Giới Tính</th>
                                    <th class="info-table__col-right">${e.gender}</th class="info-table__col-right">
                                </tr>
                                <tr>
                                    <th class="info-table__col-left">Ngày Sinh</th>
                                    <th class="info-table__col-right">${e.birthday}</th>
                                </tr>
                                <tr>
                                    <th class="info-table__col-left">Địa chỉ</th>
                                    <th class="info-table__col-right">${e.address}</th>
                                </tr>
                                <tr>
                                    <th class="info-table__col-left">Email</th>
                                    <th class="info-table__col-right">${e.email}</th>
                                </tr>
                                <tr>
                                    <th class="info-table__col-left">Chức vụ</th>
                                    <th class="info-table__col-right">${e.positionn}</th>
                                </tr>
                                <tr>
                                    <th class="info-table__col-left">Hệ số lương</th>
                                    <th class="info-table__col-right">${e.cSalary}</th>
                                </tr>
                                <tr>
                                    <th class="info-table__col-left">Đơn vị</th>
                                    <th class="info-table__col-right">${e.name}</th>
                                </tr>

                            </table>
                            <a href="/AdminKMA/updatePersonalInfo?idRFID=${idRFID}&idFingerprint=${idFT}" style="text-align:center;font-size: 15px;" type="button" class="btn btn-primary">Cập Nhật Thông Tin</a>   

                        </div>
                    </div>
                </div>

            </div>
        </section>
        <!-- ==================End staff-info================================== -->

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