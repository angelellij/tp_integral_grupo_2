/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.103
 * Generated at: 2021-06-24 22:15:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title> Registro </title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<h3> Registro </h3>\r\n");
      out.write("\t\t<form>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for='nombre'>Nombre</label>\r\n");
      out.write("\t\t\t\t<input name='nombre' type='text' placeholder='nombre'>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<label for='apellido'>Apellido</label>\r\n");
      out.write("\t\t\t\t<input name='apellido' type='text' placeholder='apellido'>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<select>\r\n");
      out.write("\t\t\t\t\t<option value='1'> Masculino </option>\r\n");
      out.write("\t\t\t\t\t<option value='2'> Femenino </option>\r\n");
      out.write("\t\t\t\t\t<option value='3'> Otro </option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for='edad'>Edad</label>\r\n");
      out.write("\t\t\t\t<input name='edad' type='number' placeholder='edad'>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for='dni'>DNI</label>\r\n");
      out.write("\t\t\t\t<input name='dni' type='number' placeholder='dni'>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<label for='cuil'>CUIL</label>\r\n");
      out.write("\t\t\t\t<input name='cuil' type='number' placeholder='cuil'>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<select>\r\n");
      out.write("\t\t\t\t\t<option value='1'>Almagro</option>\r\n");
      out.write("\t\t\t\t\t<option value='2'> Atacama </option>\r\n");
      out.write("\t\t\t\t\t<option value='3'> Boedo </option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<select>\r\n");
      out.write("\t\t\t\t\t<option value='1'> CABA </option>\r\n");
      out.write("\t\t\t\t\t<option value='2'> Buenos Aires </option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for='tel'>Teléfono</label>\r\n");
      out.write("\t\t\t\t<input name='tel' type='number' placeholder='Teléfono'>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<label for='tel2'>Segundo Teléfono</label>\r\n");
      out.write("\t\t\t\t<input name='tel2' type='number' placeholder='Teléfono'>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<label for='email'>Email</label>\r\n");
      out.write("\t\t\t\t<input name='email' type='number' placeholder='Email'>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<label for='usuario'>Usuario</label>\r\n");
      out.write("\t\t\t<input name='usuario' 'placeholder='usuario'>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<label for='pass'> Contraseña </label>\r\n");
      out.write("\t\t\t<input name='pass' type='password' placeholder='Contraseña'>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for='pass2'> Repetir Contraseña </label>\r\n");
      out.write("\t\t\t<input name='pass2' type='password' placeholder='Contraseña'>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<label for='Administrador'>¿Administrador?</label>\r\n");
      out.write("\t\t\t<input type='checkbox' name='Administrador'>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<input type='submit' value='Crear'>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
