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
        
      
    </head>

    <body>

        <%@include file="ListFunction.jsp" %>

        <div id="right-panel" class="right-panel">

            <%@include file="header.jsp" %>

            <div class="content">
                <table class="table" style="background: white;">
                    <thead class="thead-light">
                        <tr>

                            <th scope="col">Tiêu Đề </th>
                            <th scope="col">Nội Dung </th>
                            <th scope="col">Ảnh </th>
                            <th scope="col">Ghi chú Ảnh </th>
                            <th scope="col">Xóa</th>
                            <th scope="col">Sửa</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="item" items="${lcn}">
                            <tr>

                                <td>${item.tittle}</td>
                                <td>${item.content}</td>
                                <td><img src="/AdminKMA/images/${item.image}" style="width: 50px;height: auto"></td>

                                <td>${item.noteImage}</td>

                                <td><button type="button" class="btn btn-danger btna" data-toggle="modal"  data-id="/AdminKMA/deleteCNews?id=${item.idCN}"  data-target="#exampleModalCenter">
                                        <i class="far fa-trash-alt"></i>
                                    </button></td>
              
                                <td> <a class="btn btn-primary" href="/AdminKMA/updateCNews?&id=${item.idCN}"><i class="fas fa-user-edit"></i></a></td>

                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <div >
                        <a href="/AdminKMA/fixNews"   class="btn btn-danger"  style="color: white"><i class="fas fa-backward" style="margin-right:  10px;color: white;"></i>TRỞ VỀ</a>
                  
                <a class="btn btn-success" style="width: 89% ;" href="/AdminKMA/addCNewsID?id=${idTN}">Thêm Nội Dung</a>
            </div>
            </div>
        </div>

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
        <script src="assets/js/init/weather-init.js"></script>

        <script src="https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.js"></script>
        <script src="http://localhost:8080/AdminKMA/js/init/fullcalendar-init.js"></script>

        <!--Local Stuff-->
        
    </body>
</html>
