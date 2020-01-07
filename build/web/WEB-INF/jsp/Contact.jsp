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
        
    <title>Trang Chủ | Tin Tức</title>
</head>

<body>
    <!-- ==========LOGOUT============= -->
   
    <!-- ==========END LOGOUT============= -->

    <!-- =========HEADER MENU AREA================= -->
    <%@include file="hearderHomePage.jsp" %>
    <!-- ================END HEADER MENU AREA=================== -->
    <!-- ========================BRREADCRUMB-AREA===================== -->
    <div class="breadcrumb-area">
        <div class="breadcrumb-area__flex d-flex ">
            <div class="breadcrumb-area__background"></div>
            <div class="container">
                <div class="breadcrumb-area__contain text-center">
                    <h2 class="">LIÊN HỆ</h2>
                    <div class="breadcrumb-area__contain--link">
                       
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ========================END BRREADCRUMB-AREA===================== -->

    <!-- ==============================SECTION CONTAIN========================= -->

    <section class="LienHe-main">
        <div class="container">
            <h2 class="LienHe-main--text">LIÊN HỆ</h2>
            <div class="row">
                <div class="col-md-6 LienHe-main__Phongban">
                    <div class="media">
                        <div class="img-area">
                            <img src="/AdminKMA/images/${rl.image}" class="align-self-center mr-3 img-size-fluid" alt="">
                        </div>
                        <div class="media-body info-PhongBan">
                            <h3 class="mt-0">${rl.nameSchool}</h3>
                            <div class="info-PhongBan__area d-flex">
                                <div class="info-PhongBan__icon">
                                    <i class="fas fa-home"></i>
                                </div>
                                <div class="info-PhongBan__text">
                                    <p class=""><span class="info-PhongBan__text--primary">Địa Chỉ</span></p>
                                    <p class=""><span class="info-PhongBan__text--main">${rl.address}
                                            </span></p>
                                </div>
                            </div>
                            <div class="info-PhongBan__area d-flex">
                                <div class="info-PhongBan__icon">
                                    <i class="fas fa-phone"></i>
                                </div>
                                <div class="info-PhongBan__text">
                                    <p class=""><span class="info-PhongBan__text--primary">Số điện thoại :</span></p>
                                    <p class=""><span class="info-PhongBan__text--main"> ${rl.phone}</span></p>
                                </div>
                            </div>
                            <div class="info-PhongBan__area d-flex">
                                <div class="info-PhongBan__icon">
                                    <i class="far fa-envelope"></i>
                                </div>
                                <div class="info-PhongBan__text">
                                    <p class="mb-0"><span class="info-PhongBan__text--primary">Email:</span>
                                        <span class="info-PhongBan__text--main">${rl.email}</span></p>
                                </div>
                            </div>
                        </div>

                    </div>
                    
                </div>
                <div class="col-md-6 LienHe-main__form-text">
                    <div>
                        <iframe
                            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3725.311833966536!2d105.79362415075703!3d20.980133585956118!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135acc508f938fd%3A0x883e474806a2d1f2!2sAcademy%20of%20Cryptography%20Techniques!5e0!3m2!1sen!2s!4v1577122768769!5m2!1sen!2s"
                            width="550" height="400" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
                    </div>
<!--                    <div class="form-thongtin">
                        <p><span class="text-form">Nếu bạn có thắc mắc có thể gửi thông tin vào biểu mẫu dưới đây.Chúng
                                tôi sẽ cố gắng phản hồi sớm
                                nhất !</span></p>
                        <form action="" method="">
                            <div class="form-gruop">
                                <input class="form-control form-thongtin__input form-thongtin__input--name" type="text"
                                    placeholder="Nhập Tên*" id="input-name">
                                <span class="thongbao-text thongbao-text-name">Không được bỏ trống phần này</span>
                                <input class="form-control form-thongtin__input form-thongtin__input--mail" type="text"
                                    placeholder="Nhập email*" id="input-emai">
                                    <span class="thongbao-text thongbao-text-mail">Không được bỏ trống phần này</span>

                                <textarea name="" id="" cols="20" rows="5"
                                    class="form-control form-thongtin__input form-thongtin__input--noidung"
                                    placeholder="Nhập nội dung*" id="input-conten"></textarea>
                                    <span class="thongbao-text thongbao-text-noidung">Không được bỏ trống phần này</span>

                            </div>
                            <button type="submit" class="btn btn-primary send-btn">Gửi đi</button>
                        </form>
                    </div>-->
                </div>
            </div>
        </div>
    </section>

    <!-- ==============================END SECTION CONTAIN========================= -->
    <!-- ====================FOOTER============================== -->
    <%@include file="footerHomePage.jsp" %>
    <!-- ====================END FOOTER============================== -->

    <script>
        $(document).ready(function () {
            $(".send-btn").on("click", function () {
                let name = $(".form-thongtin__input--name").val();
                let mail = $(".form-thongtin__input--mail").val();
                let noidung = $(".form-thongtin__input--noidung").val();
                if(name == ""){
                    $(".thongbao-text-name").show();
                }
                else{
                    $(".thongbao-text-name").hide();
                }
                if(mail == ""){
                    $(".thongbao-text-mail").show();
                }
                else{
                    $(".thongbao-text-mail").hide();
                }
                if(noidung == ""){
                    $(".thongbao-text-noidung").show();
                }
                else{
                    $(".thongbao-text-noidung").hide();
                }
                console.log(name);
            })
        });
    </script>
</body>

</html>