package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ccsna.safetynet.Validation;
import com.ccsna.safetynet.model.Services;
import com.ccsna.safetynet.model.County;
import java.util.Iterator;
import java.util.Set;
import com.ccsna.safetynet.model.AgencyModel;
import com.ccsna.safetynet.model.Agency;
import com.ccsna.safetynet.model.Member;
import com.ccsna.safetynet.model.MemberModel;
import com.ccsna.safetynet.Menu;

public final class agencyEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <title>SaftetyNet Alliance</title>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/public/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/public/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/public/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("        \n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/bootstrap-datepicker.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/move-top.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/easing.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery-ui.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery.validate.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery.localScroll.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery.serialScroll.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery.dataTables.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/bootstrap.js\"></script>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <meta name=\"keywords\" content=\"Dental Care Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("          Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("    <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("        function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        jQuery(document).ready(function ($) {\n");
      out.write("            $(\".scroll\").click(function (event) {\n");
      out.write("                event.preventDefault();\n");
      out.write("                $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- header -->\t\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <div class=\"left-header\">\n");
      out.write("            <div class=\"logo-banner\">\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/public/images/CCSNABanner.jpg\"  />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"right-header\">\n");
      out.write("            <div class=\"right-header-menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/contactUs.jsp\">Contact Us</a></li>| \n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clear\"></div>   \n");
      out.write("    </div>    \n");
      out.write("\n");
      out.write("    <!-- //header -->\n");
      out.write("    <div class=\"header-banner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"banner-navigation\">\n");
      out.write("                <div class=\"banner-nav\">\n");
      out.write("                    <span class=\"menu\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/public/images/menu.png\" alt=\" \"/></span>\n");
      out.write("                    <ul class=\"nav1\">\n");
      out.write("                        <li class=\"hvr-sweep-to-top cap\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/management.jsp\">Admin Home</a></li>\n");
      out.write("                        <li class=\"hvr-sweep-to-top\"><a href=\"#\">About Us</a></li>\n");
      out.write("                        <li class=\"hvr-sweep-to-top\"><a href=\"#\" class=\"scroll\">Agency Profiles</a></li>\n");
      out.write("                        <li class=\"hvr-sweep-to-top\"><a href=\"#\" class=\"scroll\">Alerts</a></li>\n");
      out.write("                        <li class=\"hvr-sweep-to-top\"><a href=\"#\">News</a></li>\n");
      out.write("                        <li class=\"hvr-sweep-to-top\"><a href=\"#\">Donations</a></li>\n");
      out.write("                        <li class=\"hvr-sweep-to-top\"><a href=\"#\">Success Stories</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- script for menu -->\n");
      out.write("        <script>\n");
      out.write("            $(\"span.menu\").click(function () {\n");
      out.write("                $(\"ul.nav1\").slideToggle(300, function () {\n");
      out.write("                    // Animation complete.\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- //script for menu -->\n");
      out.write("\n");
      out.write("        <!-- banner Slider starts Here -->\n");
      out.write("        <script>\n");
      out.write("            // You can also use \"$(window).load(function() {\"\n");
      out.write("            $(function () {\n");
      out.write("            // Slideshow 4\n");
      out.write("            $(\"#slider4\").responsiveSlides({\n");
      out.write("            auto: true,\n");
      out.write("                    pager: true,\n");
      out.write("                    nav: true,\n");
      out.write("                    speed: 500,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    before: function () {\n");
      out.write("                        $('.events').append(\"<li>before event fired.</li>\");\n");
      out.write("                    },\n");
      out.write("                    after: function () {\n");
      out.write("                        $('.events').append(\"<li>after event fired.</li>\");\n");
      out.write("                    }\n");
      out.write("            });\n");
      out.write("            });</script>\t\t\t\t\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"body_container\">\n");
      out.write("        ");

            String id = request.getParameter("id");
            Agency agency = new AgencyModel().findById(Integer.parseInt(id));
            if (agency != null) {

        
      out.write("\n");
      out.write("        <center>\n");
      out.write("            ");
 if (request.getSession().getAttribute(Validation.ERROR) != null) {
      out.write("\n");
      out.write("            <div class=\"alert alert-danger\" style=\"text-align: center\">\n");
      out.write("                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                ");
      out.print("ERROR: " + request.getSession().getAttribute(Validation.ERROR));
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
 Validation.removeAttributes(request, Validation.ERROR);
            } else if (request.getSession().getAttribute(Validation.SUCCESS) != null) {
      out.write("\n");
      out.write("            <div class=\"alert alert-success\" style=\"text-align: center\">\n");
      out.write("                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                ");
      out.print("SUCCESS: " + request.getSession().getAttribute(Validation.SUCCESS));
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
   Validation.removeAttributes(request, Validation.SUCCESS);
                }
      out.write("\n");
      out.write("            <div class=\"editHeader\" ><h3>Agency Profile</h3></div>\n");
      out.write("            <form class=\"editAgencyForm\" id=\"editAgencyForm\" method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/member/add\" style=\"margin-top: 20px;\">\n");
      out.write("                <table>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Name </td>\n");
      out.write("                            <td class=\"input-padding\">");
      out.print(agency.getFullname());
      out.write("</td>\n");
      out.write("                            <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 if (agency.getPrivateContactNumber() != null && agency.getPrivateContactNumber() != 0l) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Contact Number</td>\n");
      out.write("                            <td class=\"input-padding\">");
      out.print(agency.getPrivateContactNumber());
      out.write("</td>\n");
      out.write("                            <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.private_Contact_Number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td>Email Address</td>\n");
      out.write("                            <td  class=\"input-padding\">");
      out.print(agency.getEmailAddress());
      out.write("</td>\n");
      out.write("                            <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.emailAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 if (agency.getWebsiteAddress() != null && !agency.getWebsiteAddress().isEmpty()) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td>Web Site</td>\n");
      out.write("                            <td class=\"input-padding\">");
      out.print(agency.getWebsiteAddress());
      out.write("</td>\n");
      out.write("                            <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.website_Address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        ");
 if (!Menu.agencyAddress(agency).isEmpty()){ 
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Address</td>\n");
      out.write("                            <td class=\"input-padding\">");
      out.print(Menu.agencyAddress(agency));
      out.write(" </td>\n");
      out.write("                            <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        ");
if (agency.getMission() != null && !agency.getMission().isEmpty()) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Mission Statement&nbsp;&nbsp;</td>\n");
      out.write("                            <td class=\"input-padding\">");
      out.print(agency.getMission());
      out.write("</td>\n");
      out.write("                            <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.mission}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                    <td>Counties Served</td>\n");
      out.write("                    <td class=\"input-padding\">\n");
      out.write("                        ");
Set cList = agency.getCounties();
                            int i = 0;
                            for (Iterator itr = cList.iterator(); itr.hasNext();) {
                                County c = (County) itr.next();
                                i++;
                                if (agency.getCounties().size() > i) {
      out.write("\n");
      out.write("                        ");
      out.print(c.getCountyName());
      out.write(",  \n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                        ");
      out.print(c.getCountyName());
      out.write("\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.counties_Served}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                        ");
  Set sList = agency.getServiceses();
                            if (!sList.isEmpty() && sList != null) {
                                i = 0;
                        
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Services Provided</td>\n");
      out.write("                        <td class=\"input-padding\">\n");
      out.write("                            ");
for (Iterator itr = sList.iterator(); itr.hasNext();) {
                                    Services s = (Services) itr.next();
                                    i++;
                                    if (agency.getServiceses().size() > i) {
      out.write("\n");
      out.write("                            ");
      out.print(s.getServiceName());
      out.write(", &nbsp;  \n");
      out.write("                            ");
} else {
      out.write("\n");
      out.write("                            ");
      out.print(s.getServiceName());
      out.write("\n");
      out.write("                            ");
 }
      out.write("  </td>\n");
      out.write("                        <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.service_Provided}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
                        }
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        ");
if (agency.getHoursOfOperation() != null && !agency.getHoursOfOperation().isEmpty()) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Hours of Operations&nbsp;</td>\n");
      out.write("                        <td class=\"input-padding\">");
      out.print(agency.getHoursOfOperation());
      out.write("</td>\n");
      out.write("                        <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.hours_Of_Operation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    ");
if (agency.getBoardPositions() != null && !agency.getBoardPositions().isEmpty()) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Board Positions &nbsp;&nbsp;</td>\n");
      out.write("                        <td class=\"input-padding\">");
      out.print(agency.getBoardPositions());
      out.write("</td>\n");
      out.write("                        <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.board_Positions}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                            <td>Date Created</td>\n");
      out.write("                            <td class=\"input-padding\">");
      out.print(Menu.convertDateToString(agency.getDateCreated(), Menu.STRING_DATE_FORMAT));
      out.write(" </td>\n");
      out.write("                            <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.date_Created}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 if (agency.getDateUpdated() != null){ 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                            <td>Last Updated</td>\n");
      out.write("                            <td class=\"input-padding\">");
      out.print(Menu.convertDateToString(agency.getDateUpdated(), Menu.STRING_DATE_FORMAT));
      out.write(" </td>\n");
      out.write("                            <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.date_Updated}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                    <td>Status</td>\n");
      out.write("                    <td class=\"input-padding\">\n");
      out.write("                        <select name=\"status\" style=\"width: 211px; margin-top: 10px;\">\n");
      out.write("                            ");
      out.print(Menu.selectedStatusMenu(agency.getStatus()));
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                        <span class=\"astereks-required\">*</span>\n");
      out.write("                    </td>\n");
      out.write("                    <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"hidden\" name=\"action\" value=\"1\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"option\" value=\"1\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"id\" value=\"");
      out.print(agency.getAgencyId());
      out.write("\"/>\n");
      out.write("                            ");
 Set cList = agency.getCounties();
                            int i = 0;
                            for (Iterator itr = cList.iterator(); itr.hasNext();) {
                                County c = (County) itr.next();
                                i++;
      out.write("\n");
      out.write("                             <input type=\"checkbox\" name=\"counties_Served\" value=\"");
      out.print(c.getIdCounty());
      out.write("\" style=\"\">\n");
      out.write("                        </td>\n");
      out.write("                        <td> <input  type=\"submit\" name=\"submit\"  class=\"btn btn-info\" value=\"Edit Agency Status\" style=\"margin-top: 10px; width: 200px;\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </center>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- footer -->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"footer-bottom-at\">\n");
      out.write("                <div class=\"col-md-6 footer-grid\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 footer-grid-in\">\n");
      out.write("                    <p class=\"footer-class\"> © 2015 Safety Net Alliance. All rights reserved | <a href=\"");
      out.print(request.getContextPath());
      out.write("/public/privacy_policy.pdf\">Privacy Policy </a></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- //footer -->\n");
      out.write("\n");
      out.write("    <!-- here stars scrolling icon -->\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("                $(document).ready(function () {\n");
      out.write("            $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        //validating the agency edit form\n");
      out.write("        $(\"#editAgencyForm\").validate({\n");
      out.write("            rules: {\n");
      out.write("                status: \"required\"\n");
      out.write("            },\n");
      out.write("            messages: {\n");
      out.write("                status: \"Status is required\"\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <!-- //here ends scrolling icon -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
