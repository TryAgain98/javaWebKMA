<%-- 
    Document   : header
    Created on : Dec 8, 2019, 9:28:19 AM
    Author     : Huy Toan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
        <link rel="stylesheet" href="http://localhost:8080/AdminKMA/css/modalDelete.css"><%-- file modal delete --%>

      

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script>
        <script src="http://localhost:8080/AdminKMA/vendor/sweetalert2.min.js"></script>
        <link rel="stylesheet" href="http://localhost:8080/AdminKMA/vendor/sweetalert2.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/wow/1.1.2/wow.min.js"></script>
        <!--file bookstrap date-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://jonthornton.github.io/jquery-timepicker/jquery.timepicker.js"></script>
        <link rel="stylesheet" type="text/css" href="https://jonthornton.github.io/jquery-timepicker/jquery.timepicker.css" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.standalone.css" />
        <link rel="stylesheet" type="text/css" href="/AdminKMA/css/jquery.ptTimeSelect.css" />
        <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/themes/ui-lightness/jquery-ui.css" type="text/css" media="all" />
        
        <!--file bookstrap date-->
        <!-- Bootstrap CSS -->
   
        <style>

            .navbar-header {
                position: relative;
                height: 95px;;
            }
            .logo{
                position: absolute;
                height: 100%;
                top:2px;
            }
            .list{
                position: absolute;
                right:  30%;
                top: 45%;
            }
            .user-area{
                top:20px;
            }
            .content{
                margin-top: 15px;
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
        <script>new WOW().init();</script>
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

        <script>
            $(document).ready(function () {
                $('.input-group.date').datepicker({format: "dd-mm-yyyy"});
            })
        </script>
        <header id="header" class="header" style="height:100px; width: 100%; " background='/AdminKMA/images/banner.PNG' >
            <div class="top-left">
                <div class="navbar-header "  >
                    <a class="" href="/AdminKMA/admin"><img class="logo" src="http://localhost:8080/AdminKMA/images/log.png"  alt="Logo"></a>

                    <a id="menuToggle" class="menutoggle "><i class="fa fa-bars list"></i></a>

                </div>
            </div>
            <div class="top-right">
                <div class="header-menu">
                    <div class="header-left">
                        <!--                        <button class="search-trigger"><i class="fa fa-search"></i></button>
                                                <div class="form-inline">
                                                    <form class="search-form">
                                                        <input class="form-control mr-sm-2" type="text" placeholder="Search ..." aria-label="Search">
                                                        <button class="search-close" type="submit"><i class="fa fa-close"></i></button>
                                                    </form>
                                                </div>-->




                        <div class="user-area dropdown float-right">
                            <a href="#" class="dropdown-toggle active" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="TittleChildren" style="margin-right: 5px;"> ${name} </span><img class="user-avatar rounded-circle" src="http://localhost:8080/AdminKMA/images/${image}" style="width: auto;height: 50px" >
                            </a>

                            <div class="user-menu dropdown-menu" >
                                <a class="nav-link" href="/AdminKMA/updateAdmin?idRFID=${idRFID}&idFingerprint=${idFT}"><i class="fa fa- user"></i>Cập Nhật Thông Tin </a>

                                <!--                        <a class="nav-link" href="#"><i class="fa fa- user"></i>Notifications <span class="count">13</span></a>-->

                                <a class="nav-link" href="/AdminKMA/HomePage"><i class="fa fa -cog"></i>Trang Nhân Sự</a>

                                <a class="nav-link" href="/AdminKMA/logout"><i class="fa fa-power -off"></i>Đăng Xuất</a>
                            </div>
                        </div>

                    </div>
                </div>
        </header>

        <!-- Button trigger modal -->
        <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header" style="border-bottom: none">
                        <h5 class="modal-title " id="exampleModalLongTitle" ><i class="fas fa-exclamation-circle iconWarning"></i></h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body" id="tittleWarning">
                     Bạn có chắc chắn muốn xóa không ?
                    </div>
                    <div class="modal-footer" id="footerWarning">
                        <button type="button" class="btn btn-danger" data-dismiss="modal">KHÔNG </button>
                        <a class="btn btn-success" id="test"  style="padding-left: 30px;padding-right: 30px;">CÓ </a>
                    </div>
                </div>
            </div>
        </div>  
        <script>
            $(document).ready(function () {
                $(".btna").on("click", function () {
                    var url = $(this).attr("data-id");
                    $("#test").attr("href", url);

                });
            });
        </script>
    </body>
</html>
