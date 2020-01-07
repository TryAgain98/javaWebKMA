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
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/AdminKMA/css/pageCss.css">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <title>Trang chủ</title>
        <style>
            .news:link{
                text-decoration: none;
            }
            .news p{
                color: black;
                font-size: 1.3em;
            }
            .page-link{
                padding: 15px;
                font-size: 15px;
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
                        <h2 class="">THỐNG KÊ NHÂN SỰ</h2>
                        <div class="breadcrumb-area__contain--link">
                           
                        </div>
                    </div>
                </div>
            </div>
        </div>

      
        <!-- ================================ END LIST STAF========================== -->
          <div class="list-table">
        <div class="container">
            <div class="text-primary text-center">
                <h2> Danh sách nhân viên</h2>
            </div>
            <div class="list-table__contain">
                <table id="mytable" class="display">
                    <thead>
                        <tr>
                             <th>Mã RFID</th>
                                <th>Họ Và Tên</th>
                                <th>Giới Tính</th>
                                <th>Ngày Sinh</th>
                                <th>Chức Vụ</th>
                                <th>Đơn Vị</th>
                                <th>Lựa chọn</th>
                        </tr>
                    </thead>
                    <tbody>
                         <c:forEach var="e" items="${lep}">
                            <tr>
                               
                                <td class="text-center">${e.idRFID}</td>
                                <td>${e.fullName}</td>
                                <td class="text-center">${e.gender}</td>
                                <td class="text-center">${e.birthday}</td>
                                <td>${e.positionn}</td>
                                <td>${e.name}</td>
                               
                                <td><a class="btn btn-primary" href="/AdminKMA/searchStatistical?idRFID=${e.idRFID}">Thống kê</a></td>
                            </tr>
                             </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <!-- ================================ END LIST STAF========================== -->
    <script>
        $(document).ready(function () {
            $('#mytable').DataTable({
                "language": {
                    "lengthMenu": "Hiển Thị _MENU_ ",
                    "zeroRecords": "Không có dữ liệu - Hãy chắc chắn bạn điền đầy đủ dấu",
                    "infoEmpty": "Không có hồ sơ",
                    "infoFiltered": "(Được lọc trong  _MAX_ hồ sơ)",
                    "decimal": "",
                    "emptyTable": "Không có dữ liệu trong bảng",
                    "info": "Hiển thị từ _START_ đến _END_ trên tổng _TOTAL_ dữ liệu",
                    "infoPostFix": "",
                    "thousands": ",",
                    "loadingRecords": "Đang tải...",
                    "processing": "Processing...",
                    "search": "Tìm Kiếm:",
                    "paginate": {
                        "first": "Đầu tiên",
                        "last": "Cuối cùng",
                        "next": "Kế tiếp",
                        "previous": "Trước đó"
                    },
                    "aria": {
                        "sortAscending": ": activate to sort column ascending",
                        "sortDescending": ": activate to sort column descending"
                    }
                }
            });
        });
    </script>
        
        <script>
            $(document).ready(function () {
                $('#mytable').DataTable();
            });
        </script>
        <!-- ==================End heading news====================== -->

        <!-- =====================SECTION NEWS============================ -->

        <!-- =====================END SECTION NEWS============================ -->

        <!-- ====================FOOTER============================== -->
        <%@include file="footerHomePage.jsp" %>
        <!-- ====================END FOOTER============================== -->


    </body>

</html>