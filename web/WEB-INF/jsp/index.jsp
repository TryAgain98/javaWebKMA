<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Đăng Nhập</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="http://localhost:8080/AdminKMA/vendor/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/vendor/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/vendor/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/vendor/material-design-iconic-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/vendor/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/vendor/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/vendor/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/vendor/select2.min.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/vendor/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/vendor/util.css">
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/vendor/main.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
        <!--===============================================================================================-->
       

        <script src="http://localhost:8080/AdminKMA/vendor/sweetalert2.min.js"></script>
        <link rel="stylesheet" href="http://localhost:8080/AdminKMA/vendor/sweetalert2.min.css">
        <script src="jquery-3.4.1.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script>
    </head>
    <body>
        <c:if test="${not empty inform}">
            <script>
                $(document).ready(function () {
                    function check() {
                        Swal.fire({
                            icon: 'error',
                            title: '${inform}',
                            text: '${tittle}',
                            footer: '<a href=http://localhost:8080/AdminKMA/>Why do I have this issue?</a>'
                        })
                    }
                    ;

                    check();
                });
            </script>
        </c:if>
        <div class="limiter">
            <div class="container-login100" style="background-image: url('/AdminKMA/images/bg-01.jpg');">
                <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
                    <spring:form class="login100-form validate-form" action="/AdminKMA/login" method="post"  modelAttribute="e" >
                        <span class="login100-form-title p-b-49">
                            Đăng Nhập 
                        </span>
                        <div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
                            <span class="label-input100">Email</span>
                            <spring:input class="input100" type="text" id="email" path="email" placeholder="Nhập email "/>
                        </div>
                        <div class="wrap-input100 validate-input" data-validate="Password is required">
                            <span class="label-input100">Mật Khẩu</span></br>
                            <spring:input class="input100 input" id="pass" type="password" path="pass" placeholder="Nhập Mật Khẩu"/> 
                        </div>

                        <div class="text-right p-t-8 p-b-31">
                            <a href="#">
                                Quên Mật Khẩu?
                            </a>
                        </div>

                        <div class="container-login100-form-btn">
                            <div class="wrap-login100-form-btn">
                                <div class="login100-form-bgbtn"></div>
                                <button class="login100-form-btn" id="login">
                                    Đăng Nhập
                                </button>
                            </div>
                        </div>

                        <div class="txt1 text-center p-t-54 p-b-20">
                            <span>
                                Or Sign Up Using
                            </span>
                        </div>

                        <div class="flex-c-m">
                            <a href="#" class="login100-social-item bg1">
                                <i class="fa fa-facebook"></i>
                            </a>

                            <a href="#" class="login100-social-item bg2">
                                <i class="fa fa-twitter"></i>
                            </a>

                            <a href="#" class="login100-social-item bg3">
                                <i class="fa fa-google"></i>
                            </a>
                        </div>


                    </spring:form>
                </div>
            </div>
        </div>


        <div id="dropDownSelect1"></div>
        <!--        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
                <script>
                    $(document).ready(function () {
                        $("#login").click(function () {
                            var email = $("#email").val();
                            var pass = $("#pass").val();
                           
                            $.get("/AdminKMA/EmployeeSession?email=" +email + "&pass=" + pass, function (data) {
                                location.replace("https://fontawesome.com/icons/user?style=solid");
                            });
                        });
                    });
                </script>-->
        <!--===============================================================================================-->
        <script src="http://localhost:8080/AdminKMA/vendor/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="http://localhost:8080/AdminKMA/vendor/animsition.min.js"></script>
        <!--===============================================================================================-->
        <script src="http://localhost:8080/AdminKMA/vendor/popper.js"></script>
        <script src="http://localhost:8080/AdminKMA/vendor/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="http://localhost:8080/AdminKMA/vendor/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="http://localhost:8080/AdminKMA/vendor/moment.min.js"></script>
        <script src="http://localhost:8080/AdminKMA/vendor/daterangepicker.js"></script>
        <!--===============================================================================================-->
        <script src="http://localhost:8080/AdminKMA/vendor/countdowntime.js"></script>
        <!--===============================================================================================-->
        <script src="http://localhost:8080/AdminKMA/vendor/main.js"></script>

    </body>
</html>