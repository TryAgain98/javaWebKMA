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
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
                integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
                integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
                integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>

        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.js"></script>

        <script type="text/javascript" charset="utf8"
        src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.js"></script>
        <script src="https://code.highcharts.com/highcharts.src.js"></script>
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/css/pageCss.css">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://jonthornton.github.io/jquery-timepicker/jquery.timepicker.js"></script>
        <link rel="stylesheet" type="text/css" href="https://jonthornton.github.io/jquery-timepicker/jquery.timepicker.css" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.standalone.css" />
        <link rel="stylesheet" type="text/css" href="/AdminKMA/css/jquery.ptTimeSelect.css" />
        <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/themes/ui-lightness/jquery-ui.css" type="text/css" media="all" />
 <script src="http://localhost:8080/AdminKMA/vendor/sweetalert2.min.js"></script>
        <link rel="stylesheet" href="http://localhost:8080/AdminKMA/vendor/sweetalert2.min.css">
        <title>Trang chủ</title>
        <style>
            .tillteSearchDate{
                font-size:1.5rem;
                padding: 10px;
                color: tomato;
            }
            form{
               
                padding-top: 50px;
            }
            .start{
                padding: 20px 20px 20px 20px;
                font-size: 17px;
                border-radius: 20px;
                text-align: center;
                box-shadow: 1.5px 1.5px 6px rgba(0,0,0,0.2);
            }
            .searchDate{
                padding-left: 30px;
                padding-right: 30px;
                border-radius: 30px;
                padding-top: 7px;
                padding-bottom: 7px;
                border: 1px solid #dee2e6;
                box-shadow: 1.5px 1.5px 6px rgba(0,0,0,0.2);

            }
            .searchDate:hover {
                background: tomato;
                color: white;
                border: none;
            }
            .searchDate:hover .iconSearch{

                color: white;

            }
            .iconSearch{
                font-size: 27px;
                color: tomato;
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
                        <h2 class="">THỐNG KÊ PHÒNG BAN</h2>
                        <div class="breadcrumb-area__contain--link">
                            <a href="/AdminKMA/HomePage">Trang chủ</a>
                            <a href="/AdminKMA/ShowStatisticalPhong">Thống Kê Phòng Ban</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container" style="margin-top: 20px;">

            <form name="myForm" action="/AdminKMA/searchMonthYearStatisticalR" method="post" onsubmit="return checkDate()">
                <input type="hidden" value="${idRoom}" name="idRoom" />
                <div class="row form-looking">

                    <div class="col-md-3 TittleChildren text-right tillteSearchDate">Chọn Ngày Bắt Đầu (*) : </div>
                    <div class="col-md-2"> 
                        <div id="filterDate2">       
                            <div class="demo">
                                <p id="basicExample">
                                    <input  type="text" autocomplete="off" name="dateStart"   id="" class="form-control date start " />   
                                    <!--<i class="fas fa-calendar-alt"></i>-->
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 TittleChildren text-right tillteSearchDate">Chọn Ngày Kết Thúc (*) :</div>
                    <div class="col-md-2"> 
                        <div id="filterDate2">    
                            <div class="demo">
                                <p id="basicExample">
                                    <input  type="text" autocomplete="off" name="dateEnd"  id="" class="form-control date start" />   
                                    <!--<i class="fas fa-calendar-alt"></i>-->
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-2">  <button class="btn btn-outline-secondary searchDate" type="submit" id="button-addon1"><i class="fas fa-search iconSearch"></i></button></div>
                </div>
            </form> 
        </div>
        <div class="List-phongBan">
            <div class="container">
                <div class="infor-all">
                    <div class="bieuDoTK-contain">
                        <div class="bieuDoTK-contain__title-text text-center">
                            <h2>Biểu Đồ</h2>
                            <div class="input-area">

                            </div>
                        </div>
                        <div class="bieuDoTK__main">
                            <div id="Test" class="TestChartjs">
                            </div>
                            <div class="bieuDoTK__Sub d-flex">
                                <div class="bieuDoTK__Sub--ontime">
                                    <div class="d-flex">
                                        <div class="color-d">
                                        </div>
                                        <span>Đi làm đúng giờ : ${dayOnTime} Ngày</span>
                                    </div>
                                </div>
                                <div class=" bieuDoTK__Sub--relative bieuDoTK__Sub--late">
                                    <div class="d-flex">
                                        <div class="color-d">
                                        </div>
                                        <span> Đi làm muộn : ${dayLate} Ngày</span>
                                    </div>
                                </div>
                                <div class="bieuDoTK__Sub--relative  bieuDoTK__Sub--off">
                                    <div class="d-flex">
                                        <div class="color-d">
                                        </div>
                                        <span> Nghỉ làm : ${dayOff} Ngày </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="list-staff-thongke d-flex">
                            <div class="list-staff-thongke__ontime text-center">
                                <h4>Nhân viên đi làm đúng giờ nhất</h4>
                                <c:forEach var="s" items="${lsOnTime}"> 
                                    <h3><span>${s.fullName} : ${s.countDayOnTime} Ngày</span></h3>
                                </c:forEach>
                            </div>
                            <div class="list-staff-thongke__late text-center">
                                <h4>Nhân viên đi làm Muộn Nhiều Nhất</h4>
                                <c:forEach var="s" items="${lsLate}"> 
                                    <h3><span>${s.fullName} : ${s.countDayOnTime} Ngày</span></h3>
                                </c:forEach>
                            </div>
                            <div class="list-staff-thongke__off text-center">
                                <h4>Nhân viên Nghỉ Nhiều Nhất</h4>
                                <c:forEach var="s" items="${lsOff}"> 
                                    <h3><span>${s.fullName} : ${s.countDayOnTime} Ngày</span></h3>
                                </c:forEach>
                            </div>
                        </div>
                        <div class="list-table">
                            <div class="container">
                                <div class="text-primary text-center">
                                    <h2>Bảng Thống Kê</h2>
                                </div>

                                <table class="table table-contain">
                                    <thead>
                                        <tr>
                                            <th class="name">Họ Và Tên</th>
                                            <th>Số ngày đúng giờ</th>
                                            <th>Số ngày muộn</th>
                                            <th>Số ngày nghỉ</th>
                                            <th>Tổng cộng</th>
                                            <th>Chi Tiết</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="s" items="${ls}">
                                            <tr>
                                                <th scope="row">${s.fullName}</th>
                                                <td>${s.countDayOnTime}</td>
                                                <td>${s.countDayLate}</td>
                                                <td>${s.countDayOff}</td>
                                                <td>${totalDay}</td>
                                                <td><a  class="btn btn-primary" href="/AdminKMA/searchDateStatisticalE?idRFID=${s.idRFID}&dateStart=${dateStart}&dateEnd=${dateEnd}">Chi Tiết</a></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

      <script>
            function checkDate() {
                var dateStart = document.forms["myForm"]["dateStart"].value;
                var dateEnd = document.forms["myForm"]["dateEnd"].value;
                if (dateStart == "" || dateEnd == "") {

                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Bạn chưa nhập ngày',
                    })
                    return false;
                }
                var dateStartFormart = dateStart.split("-").reverse().join("-");
                var dateEndFormart = dateEnd.split("-").reverse().join("-");
                var xStart = new Date(dateStartFormart);
                var yEnd = new Date(dateEndFormart);
                if (xStart > yEnd) {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Ngày Kết Thúc Phải Lớn Hơn Ngày Bắt Đầu',
                    })
                    return false;
                }
                var today = new Date();
                var dd = String(today.getDate()).padStart(2, '0');
                var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
                var yyyy = today.getFullYear();
                today = yyyy + '-' + mm + '-' + dd;

             
                
                var yToday = new Date(today);
                if (xStart > yToday || yEnd > yToday) {
                    Swal.fire({
                        icon: 'error',
                        title: 'CẢNH BÁO',
                        text: 'Ngày Không lớn hơn ngày hiện tại ',
                    })
                    return false;
                }
            }
        </script>
        <script>
            $('#basicExample .time').timepicker({
                'showDuration': true,
                'timeFormat': 'g:ia'
            });

            $('#basicExample .date').datepicker({'format': 'd-m-yyyy',
                'autoclose': true
            });

            var basicExampleEl = document.getElementById('basicExample');
            var datepair = new Datepair(basicExampleEl);
        </script>
        <script>

            $(document).ready(function () {
                $('#mytable').DataTable();
            });
            // Radialize the colors
            Highcharts.setOptions({
                colors: Highcharts.map(Highcharts.getOptions().colors, function (color) {
                    return {
                        radialGradient: {
                            cx: 0.5,
                            cy: 0.3,
                            r: 0.7
                        },
                        stops: [
                            [0, color],
                            [1, Highcharts.Color(color).brighten(-0.3).get('rgb')] // darken
                        ]
                    };
                })
            });
            // Build the chart
            Highcharts.chart('Test', {
                chart: {
                    plotBackgroundColor: null,
                    plotBorderWidth: null,
                    plotShadow: false,
                    type: 'pie'
                },
                title: {
                    text: 'Biểu đồ thống kê đi làm từ ${dateStart} đến ${dateEnd}'
                },
                tooltip: {
                    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
                },
                accessibility: {
                    point: {
                        valueSuffix: '%'
                    }
                },
                plotOptions: {
                    pie: {
                        allowPointSelect: true,
                        cursor: 'pointer',
                        dataLabels: {
                            enabled: true,
                            format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                            connectorColor: 'silver'
                        }
                    }
                },
                series: [{
                        name: 'Share',
                        data: [
                            {name: 'Đi làm đúng h', y: ${percentDayOn}},
                            {name: 'Đi làm muộn', y:${percentDayLate}},
                            {name: 'Nghỉ làm', y: ${percentDayOff}},
                        ]
                    }]
            });
            Highcharts.chart('Test2', {
                chart: {plotBackgroundColor: null,
                    plotBorderWidth: null,
                    plotShadow: false,
                    type: 'pie'
                },
                title: {
                    text: 'Biểu đồ thống kê đi làm in Tháng, Năm'
                },
                tooltip: {
                    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
                },
                accessibility: {
                    point: {
                        valueSuffix: '%'
                    }
                },
                plotOptions: {
                    pie: {
                        allowPointSelect: true,
                        cursor: 'pointer',
                        dataLabels: {
                            enabled: true,
                            format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                            connectorColor: 'silver'
                        }
                    }
                },
                series: [{
                        name: 'Share',
                        data: [
                            {name: 'Đi làm đúng h', y: 50},
                            {name: 'Đi làm muộn', y: 25},
                            {name: 'Nghỉ làm', y: 25},
                        ]
                    }]
            });
            function bieudo(idbang, thang, nam, ontime, late, off) {
                Highcharts.chart(idbang, {
                    chart: {
                        plotBackgroundColor: null,
                        plotBorderWidth: null,
                        plotShadow: false,
                        type: 'pie'
                    },
                    title: {
                        text: 'Biểu đồ thống kê đi làm in' + thang + ' ,' + nam
                    },
                    tooltip: {
                        pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
                    },
                    accessibility: {
                        point: {
                            valueSuffix: '%'
                        }
                    },
                    plotOptions: {
                        pie: {
                            allowPointSelect: true,
                            cursor: 'pointer',
                            dataLabels: {
                                enabled: true,
                                format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                                connectorColor: 'silver'
                            }
                        }
                    },
                    series: [{
                            name: 'Share',
                            data: [
                                {name: 'Đi làm đúng h', y: ontime},
                                {name: 'Đi làm muộn', y: late},
                                {name: 'Nghỉ làm', y: off},
                            ]
                        }]
                });
            }
            bieudo(Test3, 12, 2019, 20, 30, 70);

        </script>
        <!-- ==================End heading news====================== -->

        <!-- =====================SECTION NEWS============================ -->

        <!-- =====================END SECTION NEWS============================ -->

        <!-- ====================FOOTER============================== -->
        <%@include file="footerHomePage.jsp" %>
        <!-- ====================END FOOTER============================== -->


    </body>

</html>