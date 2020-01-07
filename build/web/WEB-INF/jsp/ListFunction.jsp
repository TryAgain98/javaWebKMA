<%-- 
    Document   : function
    Created on : Dec 8, 2019, 9:34:20 AM
    Author     : Huy Toan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
        <title>JSP Page</title>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
    </head>
    <body>
        <aside id="left-panel" class="left-panel" >
            <nav class="navbar navbar-expand-sm navbar-default">
                <div id="main-menu" class="main-menu collapse navbar-collapse">
                    <ul class="nav navbar-nav">

                        <li class="menu-title TittleChildren">Danh Mục Chức Năng</li><!-- /.menu-title -->
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle TittleChildren" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon far fa-newspaper "></i>Tin Tức</a>
                            <ul class="sub-menu children dropdown-menu">      
                               
                                 <li><i class="fas fa-plus"></i><a href="/AdminKMA/addNews">Thêm Tin Tức</a></li>
                                <li><i class="fas fa-user-edit"></i><a href="/AdminKMA/fixNews">Chỉnh Sửa </a></li>
                            </ul>
                        </li>

                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle TittleChildren" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class=" menu-icon fas fa-building"></i>Phòng Ban</a>
                            <ul class="sub-menu children dropdown-menu">                      
                              <c:if test="${quyen == 'Admin'}" >     <li><i class="fas fa-plus"></i><a href="/AdminKMA/addPhongBan">Thêm Phòng Ban</a></li></c:if>
                                <li><i class="fas fa-user-edit"></i><a href="/AdminKMA/PhongBan">Chỉnh Sửa </a></li>
                            </ul>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle TittleChildren" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class=" menu-icon fas fa-building"></i>Khoa</a>
                            <ul class="sub-menu children dropdown-menu">                      
                                <c:if test="${quyen == 'Admin'}" >   <li><i class="fas fa-plus"></i><a href="/AdminKMA/addKhoa">Thêm Khoa</a></li></c:if>
                                <li><i class="fas fa-user-edit"></i><a href="/AdminKMA/Khoa">Chỉnh Sửa </a></li> 
                            </ul>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle TittleChildren" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fas fa-people-carry"></i>Nhân Sự</a>
                            <ul class="sub-menu children dropdown-menu">                      
                             <c:if test="${quyen == 'Admin'}" >      
                                 <li><i class="fas fa-plus"></i><a href="/AdminKMA/addEmployee">Thêm Nhân Sự</a></li>
                             </c:if>
                                <li><i class="fas fa-user-edit"></i><a href="/AdminKMA/Employee">Chỉnh Sửa </a></li>
                            </ul>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle TittleChildren" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fas fa-user-times"></i>Liên Lạc</a>
                            <ul class="sub-menu children dropdown-menu">                      
                             
                                <li><i class="fas fa-user-edit"></i><a href="/AdminKMA/updateContact">Chỉnh Sửa </a></li>
                            </ul>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle TittleChildren" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fas fa-user-times"></i>Nội Quy</a>
                            <ul class="sub-menu children dropdown-menu">                      
                             
                                <li><i class="fas fa-user-edit"></i><a href="/AdminKMA/updateRule">Chỉnh Sửa </a></li>
                            </ul>
                        </li>
                        
                    </ul>
                </div><!-- /.navbar-collapse -->
            </nav>
        </aside>
    </body>
</html>
