<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <!-- Bootstrap CSS -->
        <script type="text/javascript" nonce="470fc893cf1a412d94bf392ce3f" src="//local.adguard.org?ts=1577135833744&amp;type=content-script&amp;dmn=cdn.fbsbx.com&amp;css=1&amp;js=1&amp;gcss=1&amp;rel=1&amp;rji=1"></script>
        <script type="text/javascript" nonce="470fc893cf1a412d94bf392ce3f" src="//local.adguard.org?ts=1577135833744&amp;name=AdGuard%20Assistant%20Beta&amp;name=AdGuard%20Popup%20Blocker%20%28Beta%29&amp;name=AdGuard%20Extra%20Beta&amp;type=user-script"></script><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
                                                                                                                                                                                                        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
                integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
                integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
                integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/bb5e62a986.js" crossorigin="anonymous"></script>


        <title>Trang Chủ | Nội Quy</title>
        
        <style>
            .tittleRules, h2{
                text-transform: uppercase;
            }
            .contentRules{
                margin-left: 20px;
                text-indent: 10px;
            }
        </style>
    </head>

    <body>
        <!-- ==========LOGOUT============= -->
        <%@include file="hearderHomePage.jsp" %>
        <!-- ================END HEADER MENU AREA=================== -->
        <!-- ========================BRREADCRUMB-AREA===================== -->
        <div class="breadcrumb-area">
            <div class="breadcrumb-area__flex d-flex ">
                <div class="breadcrumb-area__background"></div>
                <div class="container">
                    <div class="breadcrumb-area__contain text-center">
                        <h2 class="">Giới Thiệu</h2>
                        <div class="breadcrumb-area__contain--link">

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ========================END BRREADCRUMB-AREA===================== -->

        <!-- ==============================SECTION CONTENT=========================== -->
        <div class="noiQuy-area">
            <div class="container">
                <div class="header-box text-center">
                    <h2 class="header-box__text-main">Nội Quy Của Học Viện</h2>
                </div>
                <div class="noiQuy-area__main">
                    <div class="row">
                        <div class="col-md-6">
                            <h3 class="tittleRules">1 .Những quy định chung</h3>
                            <p class="contentRules">${rule.introduce}</p>
                            <h3 class="tittleRules">2 .Thời gian làm việc - nghỉ ngơi</h3>
                            <p class="contentRules">+ Thời gian bắt đầu : ${rule.timeStart}</p>
                            <p class="contentRules">+ Thời gian kết thúc : ${rule.timeEnd}</p>
                            
                            <h3 class="tittleRules">3 .Các hành vi nghiêm cấm</h3>
                            <p class="contentRules">${rule.prohibit}</p>
                            
                            <h3 class="tittleRules">4 .Trang phục</h3>
                            <p class="contentRules">${rule.costume}</p>
                            
                            <h3 class="tittleRules">5 .Đối tượng hướng đến</h3>
                            <p class="contentRules">${rule.object}</p>
                            
                        </div>
                        <div class="col-md-6">
                            <div class="noiQuy-area__img text-center">
                                <div class="noiQuy-area__img--size">
                                    <img src="./img/bongda-3.jpg" alt="">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="noiQuy-area__main--download">
                        <!--                    <a href="" class="btn btn-primary btn-download">Tải Xuống Nội Quy</a>-->
                    </div>
                </div>
            </div>
        </div>

        <!-- ==============================END SECTION CONTENT=========================== -->

        <!-- ====================FOOTER============================== -->
        <%@include file="footerHomePage.jsp" %>
        <!-- ====================END FOOTER============================== -->
    </body>

</html>