package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_input_type_placeholder_path_id_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_form_modelAttribute_method_class_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_input_type_placeholder_path_id_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_form_modelAttribute_method_class_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_spring_input_type_placeholder_path_id_class_nobody.release();
    _jspx_tagPool_spring_form_modelAttribute_method_class_action.release();
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Đăng Nhập</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!--===============================================================================================-->\t\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"http://localhost:8080/AdminKMA/vendor/favicon.ico\"/>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/AdminKMA/vendor/bootstrap.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/AdminKMA/vendor/font-awesome.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/AdminKMA/vendor/material-design-iconic-font.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/AdminKMA/vendor/animate.css\">\r\n");
      out.write("        <!--===============================================================================================-->\t\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/AdminKMA/vendor/hamburgers.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/AdminKMA/vendor/animsition.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/AdminKMA/vendor/select2.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\t\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/AdminKMA/vendor/daterangepicker.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/AdminKMA/vendor/util.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/AdminKMA/vendor/main.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("        <script src=\"http://localhost:8080/AdminKMA/vendor/sweetalert2.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8080/AdminKMA/vendor/sweetalert2.min.css\">\r\n");
      out.write("        <script src=\"jquery-3.4.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <div class=\"limiter\">\r\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('/AdminKMA/images/bg-01.jpg');\">\r\n");
      out.write("                <div class=\"wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54\">\r\n");
      out.write("                    ");
      if (_jspx_meth_spring_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"dropDownSelect1\"></div>\r\n");
      out.write("        <!--        <script src=\"http://code.jquery.com/jquery-1.9.1.js\"></script>\r\n");
      out.write("                <script>\r\n");
      out.write("                    $(document).ready(function () {\r\n");
      out.write("                        $(\"#login\").click(function () {\r\n");
      out.write("                            var email = $(\"#email\").val();\r\n");
      out.write("                            var pass = $(\"#pass\").val();\r\n");
      out.write("                           \r\n");
      out.write("                            $.get(\"/AdminKMA/EmployeeSession?email=\" +email + \"&pass=\" + pass, function (data) {\r\n");
      out.write("                                location.replace(\"https://fontawesome.com/icons/user?style=solid\");\r\n");
      out.write("                            });\r\n");
      out.write("                        });\r\n");
      out.write("                    });\r\n");
      out.write("                </script>-->\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"http://localhost:8080/AdminKMA/vendor/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"http://localhost:8080/AdminKMA/vendor/animsition.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"http://localhost:8080/AdminKMA/vendor/popper.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/AdminKMA/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"http://localhost:8080/AdminKMA/vendor/select2.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"http://localhost:8080/AdminKMA/vendor/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/AdminKMA/vendor/daterangepicker.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"http://localhost:8080/AdminKMA/vendor/countdowntime.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"http://localhost:8080/AdminKMA/vendor/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty inform}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <script>\r\n");
        out.write("                $(document).ready(function () {\r\n");
        out.write("                    function check() {\r\n");
        out.write("                        Swal.fire({\r\n");
        out.write("                            icon: 'error',\r\n");
        out.write("                            title: '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inform}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("',\r\n");
        out.write("                            text: '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tittle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("',\r\n");
        out.write("                            footer: '<a href=http://localhost:8080/AdminKMA/>Why do I have this issue?</a>'\r\n");
        out.write("                        })\r\n");
        out.write("                    }\r\n");
        out.write("                    ;\r\n");
        out.write("\r\n");
        out.write("                    check();\r\n");
        out.write("                });\r\n");
        out.write("            </script>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_spring_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_spring_form_modelAttribute_method_class_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_spring_form_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_form_0.setParent(null);
    _jspx_th_spring_form_0.setDynamicAttribute(null, "class", new String("login100-form validate-form"));
    _jspx_th_spring_form_0.setAction("/AdminKMA/login");
    _jspx_th_spring_form_0.setMethod("post");
    _jspx_th_spring_form_0.setModelAttribute("e");
    int[] _jspx_push_body_count_spring_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_form_0 = _jspx_th_spring_form_0.doStartTag();
      if (_jspx_eval_spring_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <span class=\"login100-form-title p-b-49\">\r\n");
          out.write("                            Đăng Nhập \r\n");
          out.write("                        </span>\r\n");
          out.write("                        <div class=\"wrap-input100 validate-input m-b-23\" data-validate = \"Username is reauired\">\r\n");
          out.write("                            <span class=\"label-input100\">Email</span>\r\n");
          out.write("                            ");
          if (_jspx_meth_spring_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <div class=\"wrap-input100 validate-input\" data-validate=\"Password is required\">\r\n");
          out.write("                            <span class=\"label-input100\">Mật Khẩu</span></br>\r\n");
          out.write("                            ");
          if (_jspx_meth_spring_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write(" \r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"text-right p-t-8 p-b-31\">\r\n");
          out.write("                            <a href=\"#\">\r\n");
          out.write("                                Quên Mật Khẩu?\r\n");
          out.write("                            </a>\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"container-login100-form-btn\">\r\n");
          out.write("                            <div class=\"wrap-login100-form-btn\">\r\n");
          out.write("                                <div class=\"login100-form-bgbtn\"></div>\r\n");
          out.write("                                <button class=\"login100-form-btn\" id=\"login\">\r\n");
          out.write("                                    Đăng Nhập\r\n");
          out.write("                                </button>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"txt1 text-center p-t-54 p-b-20\">\r\n");
          out.write("                            <span>\r\n");
          out.write("                                Or Sign Up Using\r\n");
          out.write("                            </span>\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"flex-c-m\">\r\n");
          out.write("                            <a href=\"#\" class=\"login100-social-item bg1\">\r\n");
          out.write("                                <i class=\"fa fa-facebook\"></i>\r\n");
          out.write("                            </a>\r\n");
          out.write("\r\n");
          out.write("                            <a href=\"#\" class=\"login100-social-item bg2\">\r\n");
          out.write("                                <i class=\"fa fa-twitter\"></i>\r\n");
          out.write("                            </a>\r\n");
          out.write("\r\n");
          out.write("                            <a href=\"#\" class=\"login100-social-item bg3\">\r\n");
          out.write("                                <i class=\"fa fa-google\"></i>\r\n");
          out.write("                            </a>\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_spring_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_form_0.doFinally();
      _jspx_tagPool_spring_form_modelAttribute_method_class_action.reuse(_jspx_th_spring_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_spring_input_type_placeholder_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_input_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_input_0.setDynamicAttribute(null, "class", new String("input100"));
    _jspx_th_spring_input_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_spring_input_0.setId("email");
    _jspx_th_spring_input_0.setPath("email");
    _jspx_th_spring_input_0.setDynamicAttribute(null, "placeholder", new String("Nhập email "));
    int[] _jspx_push_body_count_spring_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_input_0 = _jspx_th_spring_input_0.doStartTag();
      if (_jspx_th_spring_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_input_0.doFinally();
      _jspx_tagPool_spring_input_type_placeholder_path_id_class_nobody.reuse(_jspx_th_spring_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_spring_input_type_placeholder_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_input_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_input_1.setDynamicAttribute(null, "class", new String("input100 input"));
    _jspx_th_spring_input_1.setId("pass");
    _jspx_th_spring_input_1.setDynamicAttribute(null, "type", new String("password"));
    _jspx_th_spring_input_1.setPath("pass");
    _jspx_th_spring_input_1.setDynamicAttribute(null, "placeholder", new String("Nhập Mật Khẩu"));
    int[] _jspx_push_body_count_spring_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_input_1 = _jspx_th_spring_input_1.doStartTag();
      if (_jspx_th_spring_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_input_1.doFinally();
      _jspx_tagPool_spring_input_type_placeholder_path_id_class_nobody.reuse(_jspx_th_spring_input_1);
    }
    return false;
  }
}
