/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2025-02-10 17:40:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Login - Inventory Management</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background: linear-gradient(135deg, #1e3c72 0%, #2a5298 100%);\r\n");
      out.write("            min-height: 100vh;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .card {\r\n");
      out.write("            background: rgba(255, 255, 255, 0.9);\r\n");
      out.write("            backdrop-filter: blur(10px);\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            max-width: 400px;\r\n");
      out.write("        }\r\n");
      out.write("        .card-header {\r\n");
      out.write("            background: linear-gradient(45deg, #1a237e, #0d47a1);\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 2rem;\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("        .card-header::after {\r\n");
      out.write("            content: '';\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            bottom: -10px;\r\n");
      out.write("            left: 50%;\r\n");
      out.write("            transform: translateX(-50%);\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            height: 10px;\r\n");
      out.write("            background: white;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0,0,0,0.2);\r\n");
      out.write("        }\r\n");
      out.write("        .login-title {\r\n");
      out.write("            font-size: 2rem;\r\n");
      out.write("            font-weight: 700;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            text-shadow: 2px 2px 4px rgba(0,0,0,0.2);\r\n");
      out.write("        }\r\n");
      out.write("        .card-body {\r\n");
      out.write("            padding: 2rem;\r\n");
      out.write("        }\r\n");
      out.write("        .form-control {\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            padding: 12px 20px;\r\n");
      out.write("            border: 2px solid #e0e0e0;\r\n");
      out.write("            transition: all 0.3s;\r\n");
      out.write("            background: rgba(255, 255, 255, 0.9);\r\n");
      out.write("        }\r\n");
      out.write("        .form-control:focus {\r\n");
      out.write("            border-color: #1a237e;\r\n");
      out.write("            box-shadow: 0 0 15px rgba(26, 35, 126, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("        .form-group {\r\n");
      out.write("            position: relative;\r\n");
      out.write("            margin-bottom: 1.5rem;\r\n");
      out.write("        }\r\n");
      out.write("        .form-group i {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            right: 15px;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            transform: translateY(-50%);\r\n");
      out.write("            color: #1a237e;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-login {\r\n");
      out.write("            background: linear-gradient(45deg, #1a237e, #0d47a1);\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            padding: 12px;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("            letter-spacing: 1px;\r\n");
      out.write("            transition: all 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-login:hover {\r\n");
      out.write("            transform: translateY(-2px);\r\n");
      out.write("            box-shadow: 0 5px 15px rgba(26, 35, 126, 0.4);\r\n");
      out.write("        }\r\n");
      out.write("        .register-link {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-top: 1.5rem;\r\n");
      out.write("        }\r\n");
      out.write("        .register-link a {\r\n");
      out.write("            color: #1a237e;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            transition: all 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("        .register-link a:hover {\r\n");
      out.write("            color: #0d47a1;\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("        .alert {\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            margin-bottom: 1.5rem;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("        <div class=\"card-header\">\r\n");
      out.write("            <h2 class=\"login-title\">Welcome Back</h2>\r\n");
      out.write("            <p class=\"text-light mb-0\">Please login to continue</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            ");
 if(request.getAttribute("error") != null) { 
      out.write("\r\n");
      out.write("                <div class=\"alert alert-danger\">\r\n");
      out.write("                    <i class=\"fas fa-exclamation-circle me-2\"></i>\r\n");
      out.write("                    ");
      out.print( request.getAttribute("error") );
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("            <form action=\"login\" method=\"POST\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" \r\n");
      out.write("                           placeholder=\"Username\" required>\r\n");
      out.write("                    <i class=\"fas fa-user\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" \r\n");
      out.write("                           placeholder=\"Password\" required>\r\n");
      out.write("                    <i class=\"fas fa-lock\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-login\">\r\n");
      out.write("                    <i class=\"fas fa-sign-in-alt me-2\"></i> Sign In\r\n");
      out.write("                </button>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"register-link\">\r\n");
      out.write("                <p>Don't have an account? <a href=\"register\">Create Account</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html> ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
