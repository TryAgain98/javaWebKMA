<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Trang chủ</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
              integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/bb5e62a986.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/css/pageCss.css">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
        <!--file bookstrap date-->
        <!--              <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/css/main.css">
                        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500" rel="stylesheet" />-->
        <!--file bookstrap date-->

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://jonthornton.github.io/jquery-timepicker/jquery.timepicker.js"></script>
        <link rel="stylesheet" type="text/css" href="https://jonthornton.github.io/jquery-timepicker/jquery.timepicker.css" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.standalone.css" />
        <link rel="stylesheet" type="text/css" href="/AdminKMA/css/jquery.ptTimeSelect.css" />
        <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/themes/ui-lightness/jquery-ui.css" type="text/css" media="all" />
       
       
          <!-- datepicker -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://jonthornton.github.io/jquery-timepicker/jquery.timepicker.js"></script>
        <link rel="stylesheet" type="text/css" href="https://jonthornton.github.io/jquery-timepicker/jquery.timepicker.css" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.standalone.css" />
        <link rel="stylesheet" type="text/css" href="/AdminKMA/css/jquery.ptTimeSelect.css" />
        <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/themes/ui-lightness/jquery-ui.css" type="text/css" media="all" />
         <script src="http://localhost:8080/AdminKMA/vendor/sweetalert2.min.js"></script>
        <link rel="stylesheet" href="http://localhost:8080/AdminKMA/vendor/sweetalert2.min.css">
        <style>
            .form input,.form{
                font-size: 15px;
            }

            .form button{ 
                padding: 10px;
                font-size:  15px;
            }
            
            .sao{
                color: red;
            }
       
        </style>

    </head>

    <body>

        <%@include file="hearderHomePage.jsp" %>

        <div class="breadcrumb-area">
            <div class="breadcrumb-area__flex d-flex ">
                <div class="breadcrumb-area__background"></div>
                <div class="container">
                    <div class="breadcrumb-area__contain text-center">
                        <h2 class="" style="text-transform: uppercase">Cập Nhật Thông Tin Cá Nhân</h2>
                        <div class="breadcrumb-area__contain--link">
                            <a href="/AdminKMA/HomePage">Trang chủ</a>
                            <a href="/AdminKMA/InfoPersonal?idRFID=${idRFID}&idFingerprint=${idFT}">Thông Tin Cá Nhân</a>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div  style="width: 100%; margin-top: 50px;margin-bottom: 100px;" class="container content" >

            <spring:form class="form" action="/AdminKMA/saveUpdatePersonalInfo" onsubmit="return validateForm()" method="post"  modelAttribute="e" >

                <div class="row">
                    <div class="form-group col-6">
                        <label for="exampleFormControlInput1" class="TittleChildren">id RFID<span class="sao">*</span></label>
                        <spring:input type="text" path="idRFID" value="${e.idRFID}" readonly="true" class="form-control" id="idRFID" />
                    </div>
                    <div class="form-group col-6">
                        <label for="exampleFormControlInput1" class="TittleChildren">id Finterprint<span class="sao">*</span></label>
                        <spring:input type="text" path="idFingerprint" readonly="true" class="form-control" id="idFingerprint" placeholder="Nhập mật khẩu"/>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-6">
                        <label for="exampleFormControlInput1" class="TittleChildren">Email<span class="sao">*</span></label>
                        <spring:input type="email" path="email" value="" class="form-control" id="email" placeholder="Nhập emali"/>
                    </div>
                    <div class="form-group col-6">
                        <label for="exampleFormControlInput1" class="TittleChildren">Mật Khẩu<span class="sao">*</span></label>
                        <spring:input type="password" path="pass" class="form-control" id="pass" placeholder="Nhập mật khẩu"/>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-6">
                        <label for="exampleFormControlInput1" class="TittleChildren">Họ Tên<span class="sao">*</span></label>
                        <spring:input type="text" path="fullName" class="form-control" id="fullName" placeholder="Họ tên đầy đủ"/>
                    </div>
                    <div class="form-group col-6">
                        <label for="exampleFormControlInput1" class="TittleChildren">Số Điện Thoại<span class="sao">*</span></label>
                        <spring:input type="text" path="phone" class="form-control" id="phone" placeholder="Nhập số điện thoại"/>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-6">
                        <label for="exampleFormControlInput1" class="TittleChildren">Địa Chỉ<span class="sao">*</span></label>
                        <spring:input type="text" path="address"  class="form-control" id="address" placeholder="Địa chỉ"/>
                    </div>



                  
                        <div class='col-6 form-group '>
                            <div id="filterDate2">
                                <label class="control-label TittleChildren" for="date" >Ngày Sinh<span class="sao">*</span></label>
                                <!-- Datepicker as text field -->         
                                <div class="demo">
                                    <div id="basicExample" class="input-group " data-date-format="dd.mm.yyyy">
                                        <spring:input  type="text" path="birthday" style="border-right:none;"  id="birthday" autocomplete="true" placeholder="dd-mm-yyyy"  class="form-control date start" />   
                                         <div class="input-group-addon" >
                                             <i class="fas fa-calendar-alt" style="font-size: 30px;"></i>
                                    </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                </div>
                
                <div class="row">
                    <div class="form-group col-6">
                        <label for="exampleFormControlInput1" class="TittleChildren">Giới Tính</label><br>
                        <input type="radio" name="gender" value="Nam" checked> Nam
                        <input type="radio" name="gender" value="Nữ" style="margin-left: 20%;"> Nữ<br>

                    </div>
                    <div class="form-group col-6">

                        <label for="exampleFormControlInput1" class="TittleChildren">Chọn ảnh</label>
                        <div class="custom-file">
                            <input type="hidden" value="${e.image}" name="oldImage" />
                            <spring:input type="file" path="image" class="custom-file-input" id="inputGroupFile01"/>
                            <label class="custom-file-label" for="inputGroupFile01" style="color:#495057;">Chọn ảnh </label>
                        </div>  
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-6">
                        <label for="exampleFormControlSelect1" class="TittleChildren">Phòng Ban -Khoa</label>
                        <select name="idRoom" style="font-size: 1.5rem" class="form-control" id="exampleFormControlSelect1">
                            <c:forEach var="item" items="${lr}">
                                <c:if test="${item.name ==e.name}">
                                    <option selected value="${item.idRoom}">${item.name}</option>
                                </c:if>
                                <c:if test="${item.name !=e.name}">
                                    <option  value="${item.idRoom}">${item.name}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                    </div>  


                </div>
                <div class="row">
                    <div class="form-group col-6">
                        <label for="exampleFormControlInput1" class="TittleChildren">Hệ Số Lương</label>
                        <spring:input type="text" path="cSalary"  class="form-control money" id="exampleFormControlInput1 " placeholder=""/>
                    </div>

                    <div class="form-group col-6">
                        <label for="exampleFormControlInput1" class="TittleChildren"> Chức Vụ</label>
                        <spring:input type="text" path="positionn" class="form-control" id="exampleFormControlInput1" placeholder="Nhập chức vụ"/>
                    </div>
                </div>

                       <button style="width: 100%;" type="submit" class="btn btn-primary">LƯU</button>
                              
    
               
            </spring:form>
        </div>




        <!--datePicker-->
        <script>
            $('#basicExample .time').timepicker({
                'showDuration': true,
                'timeFormat': 'g:ia'
            });

            $('#basicExample .date').datepicker({
                'format': 'd-m-yyyy',
                'autoclose': true
            });

            var basicExampleEl = document.getElementById('basicExample');
            var datepair = new Datepair(basicExampleEl);
        </script>
          <script>
            function validateForm() {

                var idRFID = document.getElementById('idRFID').value;
                if (idRFID == "") {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Bạn chưa quẹt thẻ : RFID',
                    })
                    return false;
                }
                

                var email = document.getElementById('email').value;
                if (email == "") {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Email Không được để trống ',
                    })
                    return false;
                }

                var pass = document.getElementById('pass').value;
                if (pass == '') {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Chưa nhập mật khẩu ',
                    })
                    return false;
                }

                else if (pass.length < 6)
                {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Mật khẩu ít nhất 6 ký tự ',
                    })
                    return false;
                }


                var fullName = document.getElementById('fullName').value;
                if (fullName == '') {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Họ Tên không được để trống ',
                    })
                    return false;
                }

                var phone = document.getElementById('phone').value;
                var vnf_regex = /((09|03|07|08|05)+([0-9]{8})\b)/g;
                if (phone == '') {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Số điện thoại không được để trống ',
                    })
                    return false;
                }
                else if (vnf_regex.test(phone) == false) {

                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Số điện thoại không đúng định dạng ',
                    })
                    return false;
                }

                var address = document.getElementById('address').value;

                if (address == '') {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Địa chỉ không được để trống ',
                    })
                    return false;
                }

                var birthday = document.getElementById('birthday').value;

                if (birthday == '') {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Ngày sinh không được để trống ',
                    })
                    return false;
                }

               var today = new Date();
                var dd = String(today.getDate()).padStart(2, '0');
                var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
                var yyyy = today.getFullYear();
                today = yyyy + '-' + mm + '-' + dd;

                var newdate = birthday.split("-").reverse().join("-");
                var xBirthDay = new Date(newdate);
                var yToday = new Date(today);
                if (xBirthDay > yToday) {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Ngày sinh không lớn hơn ngày hiện tại ',
                    })
                    return false;
                }
            }
        </script>           
        <!--datePicker-->


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