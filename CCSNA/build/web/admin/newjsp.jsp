<%-- 
    Document   : newjsp
    Created on : Jan 29, 2016, 2:09:54 AM
    Author     : estelle
--%>

<%@page import="org.apache.log4j.Logger"%>
<%@page import="org.apache.commons.io.FilenameUtils"%>
<%@page import="com.ccsna.safetynet.Menu"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  final Logger log = Logger.getRootLogger();
            String date = Menu.convertDateToString(new Date(), "yyyy");
            String ext = FilenameUtils.getExtension("manual.pdf");
            log.info(ext);
        %>
    <center >
        <div style="text-align: left; font-size: 13px; width: 500px;" >
            <h3 style="color: red; ">Alert!!!</h3>

            Hey call me when you get here
            <p style="margin-top: 50px;">  Regards,<br>
                CCSNA Team</p>
            <div style="width: 600px; height: 30px; background-color:#f6a828; color: #fff; padding: 10px;" > © <%=date%> Clermont County Safety Net Alliance |
                2645 Thomasville Ct, Cincinnati OH <br>
                Contact : 5138001762 | Email : estelle_7@ymail.com

            </div>
        </div>
    </center>
</body>
</html>
