<%-- 
    Document   : footerHomePage
    Created on : Dec 22, 2019, 3:02:05 AM
    Author     : Huy Toan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <footer class="footer">
        <div class="container">
            <div class="footer-contain">
                <div class="row">
                    <div class="col-md-8">
                        <div class="footer__info">
                            <h5>Cơ quan chủ quản: ${rl.nameSchool}</h5>
                            <p>Giám đốc học viện : ${rl.manager}</p>
                            <p>Địa chỉ: ${rl.address}</p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="footer__location">
                            <h6>Mạng xã hội:</h6>
                            <div class="img_location">
                                <a href="https://www.facebook.com/groups/KmaPro/"><img src="/AdminKMA/images/facebook-icon.png" alt=""></a>
                                <a href="https://google.com"><img src="/AdminKMA/images/Google-plus-icon.png" alt=""></a>
                                <a href="https://mail.google.com"><img src="/AdminKMA/images/mail-icon.png" alt=""></a>
                                <a href="https://www.youtube.com/?gl=VN"><img src="/AdminKMA/images/youtube-icon.png" alt=""></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    </body>
</html>
