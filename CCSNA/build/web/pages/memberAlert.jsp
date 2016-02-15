<%-- 
    Document   : memberAlert
    Created on : Jan 23, 2016, 5:02:01 AM
    Author     : estelle
--%>
<%@page import="com.ccsna.safetynet.Validation"%>
<%@page import="com.ccsna.safetynet.model.NewsModel"%>
<%@page import="com.ccsna.safetynet.model.News"%>
<%@page import="com.ccsna.safetynet.Menu"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Safety Net Alliance </title>

        <%-- css --%>
        <link href="<%=request.getContextPath()%>/public/css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link href="<%=request.getContextPath()%>/public/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="<%=request.getContextPath()%>/public/css/jquery.dataTables.css" rel="stylesheet" type="text/css" media="all" />
        <link href="<%=request.getContextPath()%>/public/css/jquery-ui.css" rel="stylesheet" type="text/css" media="all" />
        <link href="<%=request.getContextPath()%>/public/css/datepicker.css" rel="stylesheet" type="text/css" media="all" />

        <%-- //css --%>

        <%-- fonts --%>
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <%-- //fonts --%>

        <%-- js --%>

        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/bootstrap-datepicker.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/move-top.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/easing.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/jquery-ui.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/jquery.validate.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/jquery.localScroll.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/jquery.serialScroll.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/jquery.dataTables.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/bootstrap.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/public/js/pairselect.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Dental Care Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
            <%-- //for-mobile-apps --%>

        <%-- start-smoth-scrolling --%>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });

            $(document).ready(function () {
                $("#alertList").DataTable({
                    "pagingType": "full_numbers",
                    "oLanguage": {
                        "sEmptyTable": "No Records",
                        "sZeroRecords": "No Records"
                    },
                    "bSort": false
                });

                $("#start_Date").datepicker({
                    dateFormat: "yy-m-dd"
                });
                $("#end_Date").datepicker({
                    dateFormat: "yy-m-dd"
                });
            });

        </script>
        <%-- start-smoth-scrolling --%>

    </head>
    <body>
        <!-- header -->	
        <div class="header">
            <div class="left-header">
                <div class="logo-banner">
                    <img src="<%=request.getContextPath()%>/public/images/CCSNABanner.jpg"  />
                </div>
            </div>
            <div class="right-header">
                <div class="right-header-menu">
                    <ul>
                        <li><a href="<%=request.getContextPath()%>/login/logout?option=1">Logout</a></li> |
                        <li><a href="<%=request.getContextPath()%>/pages/contactUs.jsp">Contact Us</a></li>
                    </ul>
                </div>
            </div>
            <div class="clear"></div>   
        </div>    

        <!-- //header -->
        <div class="header-banner">
            <div class="container">
                <div class="banner-navigation">
                    <div class="banner-nav">
                        <span class="menu"><img src="<%=request.getContextPath()%>/public/images/menu.png" alt=" "/></span>
                        <ul class="nav1">
                            <li class="hvr-sweep-to-top cap"><a href="<%=request.getContextPath()%>/pages/member.jsp">Member Home</a></li>
                            <li class="hvr-sweep-to-top"><a href="<%=request.getContextPath()%>/pages/aboutUs.jsp">About Us</a></li>
                            <li class="hvr-sweep-to-top"><a href="<%=request.getContextPath()%>/pages/agencyProfiles.jsp">Agency Profiles</a></li>
                            <li class="hvr-sweep-to-top"><a href="<%=request.getContextPath()%>/pages/alerts.jsp">Alerts</a></li>
                            <li class="hvr-sweep-to-top"><a href="<%=request.getContextPath()%>/pages/donations.jsp">Donations</a></li>
                            <li class="hvr-sweep-to-top"><a href="<%=request.getContextPath()%>/pages/successStory.jsp">Success Stories</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- script for menu -->
            <script>
                $("span.menu").click(function () {
                    $("ul.nav1").slideToggle(300, function () {
                    });
                });
                $(function () {
                    $("#tabs").tabs({
                        active: 0
                    });

                });
                $(document).ready(function () {
                    $("#agencyListTable").DataTable({
                        "pagingType": "full_numbers",
                        "oLanguage": {
                            "sEmptyTable": "No Records",
                            "sZeroRecords": "No Records"
                        },
                        "bSort": false
                    });
                });


            </script>
            <!-- //script for menu -->

            <!-- banner Slider starts Here -->
            <script src="<%=request.getContextPath()%>/public/js/responsiveslides.min.js"></script>
            <script>                 // You can also use "$(window).load(function() {"
                $(function () {
                    // Slideshow 4
                    $("#slider4").responsiveSlides({
                        auto: true,
                        pager: true,
                        nav: true,
                        speed: 500,
                        namespace: "callbacks",
                        before: function () {
                            $('.events').append("<li>before event fired.</li>");
                        },
                        after: function () {
                            $('.events').append("<li>after event fired.</li>");
                        }
                    });
                });</script>

        </div>
    <body>
        <div class="body_container">
            <%
                String id = request.getParameter("id");
                News news = new NewsModel().findById(Integer.parseInt(id));
                if (news != null) {

            %>
            <center>
                <% if (request.getSession().getAttribute(Validation.ERROR) != null) {%>
                <div class="alert alert-danger" style="text-align: center">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                    <%="ERROR: " + request.getSession().getAttribute(Validation.ERROR)%>
                </div>
                <% Validation.removeAttributes(request, Validation.ERROR);
                } else if (request.getSession().getAttribute(Validation.SUCCESS) != null) {%>
                <div class="alert alert-success" style="text-align: center">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                    <%="SUCCESS: " + request.getSession().getAttribute(Validation.SUCCESS)%>
                </div>
                <%   Validation.removeAttributes(request, Validation.SUCCESS);
                    }%>
                <div class="editHeader"><h3>Edit News Item</h3></div>
                <form class="editMemberForm" id="editMemberForm" method="post" action="<%=request.getContextPath()%>/admin/news/add" style="margin-top: 20px;" enctype="multipart/form-data">
                    <table>
                        <tbody>
                            <tr>
                                <td>Title </td>
                                <td class="input-padding"><input type="text"  name="newsTitle" id="title" value="<%=news.getTitle()%>"/> 
                                </td>
                                <td><div class="formError">${error.title}</div></td>
                            </tr>
                            <% if (news.getStartDate() != null) {%>
                            <tr>
                                <td class="input-padding">Start Date</td>
                                <td><input type="text"  name="start_Date" id="start_Date" value="<%if (news.getStartDate() != null) {%><%=news.getStartDate()%><% }%>"/>   
                                </td>
                                <td><div class="formError">${error.start_Date}</div></td>
                            </tr>
                            <% } %>
                            <% if (news.getStartDate() != null) {%>
                            <tr>

                                <td>End Date</td>
                                <td><input type="text"  name="end_Date" id="end_Date" value="<%if (news.getEndDate() != null) {%><%=news.getEndDate()%> <% } %>" /> 
                                </td>
                                <td><div class="formError">${error.end_Date}</div></td>
                            </tr>
                            <% } %>
                            <% if (news.getContent() != null && !news.getContent().isEmpty()) {%>
                            <tr>
                                <td>Content</td>
                                <td class="input-padding"><textarea name="content" style=" min-height:200px; width: 400px;"><%=news.getContent()%></textarea></td>
                                <td><div class="formError">${error.content}</div></td>
                            </tr>
                            <% }%>
                            <tr>
                                <td>Status</td>
                                <td class="input-padding">
                                    <select name="status" style="width: 211px; margin-bottom: 20px;">
                                        <%=Menu.selectedStatusMenu(news.getStatus())%>
                                    </select>

                                    <span class="astereks-required">*</span>
                                </td>
                                <td><div class="formError">${error.status}</div></td>
                            </tr>
                            <% if (news.getLarge_File_Name() != null && !news.getLarge_File_Name().isEmpty() && !news.getFile_Type().equals(Menu.PDF)) {%>
                            <tr><td>Image</td>
                                <td><embed src="<%=request.getContextPath()%>/<%=news.getLarge_File_Name()%> " style="margin-top:20px; margin-bottom: 20px; border-style: double;"></td>
                                <td></td>
                            </tr>
                            <% }%>
                            <% if (news.getLarge_File_Name() != null && !news.getLarge_File_Name().isEmpty() && news.getFile_Type().equals(Menu.PDF)) {%>
                            <tr style="margin-top:20px; margin-bottom: 20px;">
                                <td>File Name</td>
                                <td><%=news.getLarge_File_Name()%> </td>
                                <td></td>
                            </tr>
                            <% }%>
                            <tr>
                                <td> Replace Image/Pdf&nbsp;&nbsp;</td>
                                <td class="input-padding"><input type="file" name="attachment"  value="" style="margin-top:20px; margin-bottom: 20px;"/></td>
                                <td><div class="formError">${error.attachment}</div></td>
                            </tr>
                            <tr>
                                <td><input type="hidden" name="action" value="1"/><input type="hidden" name="newsId" value="<%=news.getNewsId()%>" /><input type="hidden" name="type" value="<%=Menu.ALERT%>"/></td>
                                <td> <input  type="submit" name="submit"  class="btn btn-info" value="Edit" style="margin-top: 10px; width: 200px;"/></td>
                                <td></td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </center>
            <% }%>
        </div>
        <!-- footer -->
        <div class="footer">
            <div class="container">
                <div class="footer-bottom-at">
                    <div class="col-md-6 footer-grid">
                    </div>
                    <div class="col-md-6 footer-grid-in">
                        <p class="footer-class"> � 2015 Safety Net Alliance. All rights reserved | <a href="<%=request.getContextPath()%>/public/privacy_policy.pdf" target="_blank">Privacy Policy </a></p>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>

        <!-- //footer -->

        <!-- here stars scrolling icon -->
        <script type="text/javascript">
            $(document).ready(function () {
                $().UItoTop({easingType: 'easeOutQuart'});
            });
        </script>
    </body>
</html>

