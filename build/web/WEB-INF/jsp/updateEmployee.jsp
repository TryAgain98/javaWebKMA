<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Ela Admin - HTML5 Admin Template</title>
        <meta name="description" content="Ela Admin - HTML5 Admin Template">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="apple-touch-icon" href="https://i.imgur.com/QRAUqs9.png">
        <link rel="shortcut icon" href="https://i.imgur.com/QRAUqs9.png">

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css">
        <link rel="stylesheet" href="http://localhost:8080/AdminKMA/css/cs-skin-elastic.css">
        <link rel="stylesheet" href="http://localhost:8080/AdminKMA/css/style.css">
        <!-- <script type="text/javascript" src="https://cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js"></script> -->
        <link href="https://cdn.jsdelivr.net/npm/chartist@0.11.0/dist/chartist.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/jqvmap@1.5.1/dist/jqvmap.min.css" rel="stylesheet">

        <link href="https://cdn.jsdelivr.net/npm/weathericons@2.1.0/css/weather-icons.css" rel="stylesheet" />
        <link href="https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.css" rel="stylesheet" />
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
        <style>
            .sao{
                color: red;
            }
        </style>
    </head>

    <body>

        <%@include file="ListFunction.jsp" %>

        <div id="right-panel" class="right-panel">

            <%@include file="header.jsp" %>

            <div class="content">
                <spring:form  action="/AdminKMA/saveUpdateEmployee" method="post" onsubmit="return validateForm()" modelAttribute="e" >

                    <h4 class="tittleForm">Cập Nhật Thông Tin Nhân Sự</h4>

                    


                    <div class="row">
                        <div class="form-group col-6">
                            <label for="exampleFormControlInput1" class="TittleChildren">id RFID<span class="sao">*</span></label>
                            <spring:input type="text" path="idRFID"  id="idRFID"  readonly="true" class="form-control"  placeholder=""/>
                        </div>
                        <div class="form-group col-6">
                            <label for="exampleFormControlInput1" class="TittleChildren">id Finterprint<span class="sao">*</span></label>
                            <spring:input type="text" path="idFingerprint" readonly="false"  class="form-control" id="idFingerprint" placeholder=""/>
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
                                        <spring:input  type="text" path="birthday"   id="birthday" autocomplete="true" placeholder="dd-mm-yyyy"  class="form-control date start" />   
                                        <div class="input-group-addon" >
                                            <i class="fas fa-calendar-alt"></i>
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
                            <select name="idRoom" class="form-control" id="exampleFormControlSelect1">
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
                        <div class="form-group col-6">
                            <label for="exampleFormControlSelect1" class="TittleChildren">Quyền</label>
                            <select name="quyen" class="form-control" id="exampleFormControlSelect1">
                                <c:if test="${e.powerful =='Quản Lý' }">
                                    <option selected>Quản Lý </option>
                                    <option  >Nhân Sự</option></c:if>
                                <c:if test="${e.powerful =='Nhân Sự'}"> 
                                    <option >Quản Lý </option>
                                    <option  selected>Nhân Sự</option></c:if>

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


                    <div style="text-align: center">
                        <button type="button"  class="btn btn-danger" id='buttonBack' >
                            <a href="/AdminKMA/Employee" id='aMySelf' style="color: white" data-id="test-{$sads}"><i class="fas fa-backward" style="margin-right:  10px;color: white"></i>TRỞ VỀ</a>
                        </button>
                        <button style="width: 30%; " id="btnMyself" type="submit" class="btn btn-primary">LƯU</button>
                        
                        <button type="button" style="width: 30%; "  class="btn btn-danger" id='btn_connect' >

                            KẾT NỐI VÂN TAY

                        </button>
                    </div>
                </spring:form>
            </div>

        </div>
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

        <script src="https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js"></script>
        <script src="http://localhost:8080/AdminKMA/js/main.js"></script>

        <!--  Chart js -->
        <script src="https://cdn.jsdelivr.net/npm/chart.js@2.7.3/dist/Chart.bundle.min.js"></script>

        <!--Chartist Chart-->
        <script src="https://cdn.jsdelivr.net/npm/chartist@0.11.0/dist/chartist.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/chartist-plugin-legend@0.6.2/chartist-plugin-legend.min.js"></script>

        <script src="https://cdn.jsdelivr.net/npm/jquery.flot@0.8.3/jquery.flot.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/flot-pie@1.0.0/src/jquery.flot.pie.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/flot-spline@0.0.1/js/jquery.flot.spline.min.js"></script>

        <script src="https://cdn.jsdelivr.net/npm/simpleweather@3.1.0/jquery.simpleWeather.min.js"></script>


        <script src="https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.js"></script>
        <script src="http://localhost:8080/AdminKMA/js/init/fullcalendar-init.js"></script>

        <!--Local Stuff-->

    </body>
</html>
