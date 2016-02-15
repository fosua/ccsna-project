package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ccsna.safetynet.model.SuccessStory;
import java.util.ArrayList;
import com.ccsna.safetynet.model.SuccessStoryModel;
import com.ccsna.safetynet.Validation;

public final class successStory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Safety Net Alliance</title>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/public/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/public/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/public/css/jquery.dataTables.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/public/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery-ui.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery.validate.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery.localScroll.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery.serialScroll.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/jquery.dataTables.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/bootstrap.js\"></script>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Dental Care Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/public/js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $(\"#success_Story_div\").hide();\n");
      out.write("\n");
      out.write("                $(\"#myStory\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $(\"#success_Story_div\").show();\n");
      out.write("                });\n");
      out.write("            });</script>\n");
      out.write("        <!-- script for menu -->\n");
      out.write("        <script>\n");
      out.write("            $(\"span.menu\").click(function () {\n");
      out.write("                $(\"ul.nav1\").slideToggle(300, function () {\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <!-- //script for menu -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\t\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"left-header\">\n");
      out.write("                <div class=\"logo-banner\">\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/public/images/CCSNABanner.jpg\"  />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right-header\">\n");
      out.write("                <div class=\"right-header-menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/login.jsp\">Member Login</a></li>|\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/contactUs.jsp\">Contact Us</a></li> \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>   \n");
      out.write("        </div>    \n");
      out.write("\n");
      out.write("        <!-- //header -->\n");
      out.write("        <div class=\"header-banner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"banner-navigation\">\n");
      out.write("                    <div class=\"banner-nav\">\n");
      out.write("                        <span class=\"menu\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/public/images/menu.png\" alt=\" \"/></span>\n");
      out.write("                        <ul class=\"nav1\">\n");
      out.write("                            <li class=\"hvr-sweep-to-top cap\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\">Home</a></li>\n");
      out.write("                            <li class=\"hvr-sweep-to-top\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/aboutUs.jsp\">About Us</a></li>\n");
      out.write("                            <li class=\"hvr-sweep-to-top\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/news.jsp\">News</a></li>\n");
      out.write("                            <li class=\"hvr-sweep-to-top\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/donations.jsp\">Donations</a></li>\n");
      out.write("                            <li class=\"hvr-sweep-to-top\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/successStory.jsp\">Success Stories</a></li>\n");
      out.write("                            <li class=\"hvr-sweep-to-top\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/contactUs.jsp\">Contact Us</a></li>  \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    <center>\n");
      out.write("\n");
      out.write("        <div class=\"body_container\" id=\"body_container\">\n");
      out.write("            <div class=\"sslink\"> <p><u><a href=\"#\" id=\"myStory\">Submit My Success Story</a></u></p></div><br>\n");
      out.write("\n");
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
      out.print( request.getSession().getAttribute(Validation.SUCCESS));
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
   Validation.removeAttributes(request, Validation.SUCCESS);
                }
      out.write("\n");
      out.write("            <div id=\"success_Story_div\">\n");
      out.write("                <form  method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/add/successStory\" id=\"success_Story_form\">\n");
      out.write("                    <table>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Full Name</td>\n");
      out.write("                                <td class=\"input-padding\"><input type=\"text\"  name=\"fullName\" id=\"fullName\"/>\n");
      out.write("                                    <span class=\"astereks-required\">*</span> \n");
      out.write("                                </td>\n");
      out.write("                                <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Email Address</td>\n");
      out.write("                                <td class=\"input-padding\"><input type=\"text\"  name=\"emailAddress\" id=\"emailAddress\"/>\n");
      out.write("                                    <span class=\"astereks-required\">*</span> \n");
      out.write("                                </td>\n");
      out.write("                                <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.emailAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Agency&AMP;Position &nbsp;&nbsp;</td>\n");
      out.write("                                <td class=\"input-padding\"><input type=\"text\"  name=\"agency\" id=\"agency\"/>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.agency}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr> \n");
      out.write("                                <td>Story Content</td>\n");
      out.write("                                <td class=\"input-padding\">\n");
      out.write("                                    <textarea name=\"content\" id=\"content\"></textarea> \n");
      out.write("                                    <span class=\"astereks-required\">*</span>\n");
      out.write("                                </td>\n");
      out.write("                                <td><div class=\"formError\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div></td> \n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"hidden\" name=\"action\" value=\"0\"/></td>\n");
      out.write("                                <td><input  type=\"submit\" name=\"submit\"  class=\"btn btn-info\" value=\"submit\"  style=\"margin-top: 10px; width: 200px;\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </div><br>\n");
      out.write("            <div id=\"ssList\" >\n");
      out.write("                ");

                    int counter = 1;
                    ArrayList<SuccessStory> stories = new SuccessStoryModel().successStoryList(0, 7);
                    if (stories != null && !(stories.isEmpty())) {
                        for (SuccessStory story : stories) {
                            if (counter % 2 != 0) {

                
      out.write("\n");
      out.write("                <div class=\"ssStory\" style=\"background-color: #F9F9FF\">\n");
      out.write("                    <p>   ");
      out.print(story.getContent());
      out.write("</p>\n");
      out.write("                    <p>  <b> <i>-&Tab;");
      out.print(story.getFull_name());
if (story.getAgency() != null && !story.getAgency().isEmpty()) {
      out.print(", " + story.getAgency());
 } 
      out.write("</i></b></p>\n");
      out.write("                </div> <br>\n");
      out.write("\n");
      out.write("                ");
 } else {
      out.write("\n");
      out.write("                <div class=\"ssStory\" style=\"background-color: #d9edf7\">\n");
      out.write("                    <p>");
      out.print(story.getContent());
      out.write("</p>\n");
      out.write("                    <p> <b><i>-&Tab;");
      out.print(story.getFull_name());
if (story.getAgency() != null && !story.getAgency().isEmpty()) {
      out.print(", " + story.getAgency());
 } 
      out.write("</i></b></p>\n");
      out.write("                </div> <br>\n");
      out.write("\n");
      out.write("                ");
  }
                            counter++;
                        }
                    }
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                    <div id=\"edit\"><button  style=\"width:500px; height: 40px;\">No More Stories To Load</button></div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"footer-bottom-at\">\n");
      out.write("                <div class=\"col-md-6 footer-grid\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 footer-grid-in\">\n");
      out.write("                    <p class=\"footer-class\"> © 2015 Safety Net Alliance. All rights reserved | <a target=\"_blank\" href=\"");
      out.print(request.getContextPath());
      out.write("/public/privacy_policy.pdf\"  > Privacy Policy </a></p>\n");
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
      out.write("        $(document).ready(function () {\n");
      out.write("            $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        //validating the success story form\n");
      out.write("        $(\"#success_Story_form\").validate({\n");
      out.write("            rules: {\n");
      out.write("                fullName: \"required\",\n");
      out.write("                emailAddress: {\n");
      out.write("                    email: true,\n");
      out.write("                    required: true\n");
      out.write("                },\n");
      out.write("                content: \"required\"\n");
      out.write("            },\n");
      out.write("            messages: {\n");
      out.write("                fullName: \"Full Name is required\",\n");
      out.write("                emailAddress: {\n");
      out.write("                    email: \"Please enter a correct email address format\",\n");
      out.write("                    required: \"Email Address is required\"\n");
      out.write("                },\n");
      out.write("                content: \"Story Content  is required\"\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("         $(\"#edit\").hide();\n");
      out.write("        var i = 2;\n");
      out.write("        function yHandler() {\n");
      out.write("            var wrap = document.getElementById('ssList');\n");
      out.write("            var contentHeight = wrap.offsetHeight;\n");
      out.write("            var yOffset = window.pageYOffset;\n");
      out.write("            var y = yOffset + window.innerHeight;\n");
      out.write("            if (y >= contentHeight) {\n");
      out.write("                console.log(\"i is : \"+ i);\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    url: \"");
      out.print(request.getContextPath());
      out.write("/successStory/load\",\n");
      out.write("                    data: {\"row\": i\n");
      out.write("                          },\n");
      out.write("                    //contentType: \"application/json; charset=utf-8\",\n");
      out.write("                    //dataType: \"json\",\n");
      out.write("                    //async: true,\n");
      out.write("                    cache: false,\n");
      out.write("                    success: function (response)\n");
      out.write("                    {\n");
      out.write("                        $(\"#ssList\").append(response);\n");
      out.write("                    },\n");
      out.write("                    error: function (response)\n");
      out.write("                    {\n");
      out.write("                        $(\"#edit\").show();\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                i = i + 2;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("       // window.onscroll = yHandler;\n");
      out.write("    </script>\n");
      out.write("    <!-- //here ends scrolling icon -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
