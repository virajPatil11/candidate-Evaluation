/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-08-08 06:29:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class candidate_002dupdate_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1688529840000L));
    _jspx_dependants.put("jar:file:/C:/Users/a886844/eclipse-workspace/JavaFSDBootcampJuly2023/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/candidateEvaluationApplication/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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
    _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"ISO-8859-1\">\r\n");
      out.write("		<title>Candidate Evaluation Application - Candidate Update Form</title>\r\n");
      out.write("				<link href=\"");
      if (_jspx_meth_core_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"/>\r\n");
      out.write("		<link href=\"");
      if (_jspx_meth_core_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"/>\r\n");
      out.write("		\r\n");
      out.write("		<link href=\"");
      if (_jspx_meth_core_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"/>\r\n");
      out.write("		<script src=\"");
      if (_jspx_meth_core_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("		  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("		\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css\">\r\n");
      out.write("		\r\n");
      out.write("		<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("<!-- <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write(" -->	\r\n");
      out.write("	    <style>\r\n");
      out.write("	      .colors {\r\n");
      out.write("	        color: #002d3c !important;\r\n");
      out.write("	        background-color: #ffcd43 !important;\r\n");
      out.write("	      }\r\n");
      out.write("	      \r\n");
      out.write("	  \r\n");
      out.write("	      \r\n");
      out.write("	    </style>\r\n");
      out.write("    \r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("	\r\n");
      out.write("		<!-- Start of Navbar -->\r\n");
      out.write("		\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg navbar-color\" style=\"font-family: Aerial;\">\r\n");
      out.write("			<div class=\"container-fluid\">\r\n");
      out.write("			\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"/candidateEvaluationApplication/candEvalApp/candidate/candidate-list\">\r\n");
      out.write("					<img src=\"");
      if (_jspx_meth_core_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"  \r\n");
      out.write("						style=\"width: 150px; margin: 0px 60px\"/>\r\n");
      out.write("				</a>\r\n");
      out.write("				<button class=\"navbar-toggler\"\r\n");
      out.write("			          type=\"button\"\r\n");
      out.write("			          data-bs-toggle=\"collapse\"\r\n");
      out.write("			          data-bs-target=\"#navbarNav\"\r\n");
      out.write("			          aria-controls=\"navbarNav\"\r\n");
      out.write("			          aria-expanded=\"false\"\r\n");
      out.write("			          aria-label=\"Toggle navigation\">\r\n");
      out.write("			          	<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"collapse navbar-collapse\" id=\"navbarNav\" style=\"font-size: 16px; font-weight: bold;\">\r\n");
      out.write("					<ul class=\"navbar-nav\">\r\n");
      out.write("					\r\n");
      out.write("						<li class=\"nav-item\">\r\n");
      out.write("							<a class=\"nav-link active\" aria-current=\"page\" \r\n");
      out.write("								href=\"/candidateEvaluationApplication/candEvalApp/candidate/candidate-list\">\r\n");
      out.write("								Home\r\n");
      out.write("							</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						\r\n");
      out.write("						<li class=\"nav-item\">\r\n");
      out.write("							<a class=\"nav-link\" \r\n");
      out.write("								href=\"/candidateEvaluationApplication/candEvalApp/candidate/candidate-list\">\r\n");
      out.write("								Candidate\r\n");
      out.write("							</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						\r\n");
      out.write("						<li class=\"nav-item\">\r\n");
      out.write("							<a class=\"nav-link\" href=\"/candidateEvaluationApplication/candEvalApp/feedback/feedback-list\">\r\n");
      out.write("								Feedback\r\n");
      out.write("							</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						\r\n");
      out.write("						<!-- Reports start -->\r\n");
      out.write("					\r\n");
      out.write("						\r\n");
      out.write("											 <!-- Reports dropdown -->\r\n");
      out.write("					            <li class=\"nav-item dropdown\">\r\n");
      out.write("					                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownReports\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("					                    Reports\r\n");
      out.write("					                </a>\r\n");
      out.write("					                <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownReports\">\r\n");
      out.write("					                    <!-- Levels dropdown -->\r\n");
      out.write("					                    <li class=\"dropdown-submenu\">\r\n");
      out.write("					                        <a class=\"dropdown-item dropdown-toggle\" href=\"#\" id=\"navbarDropdownLevels\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("					                            Levels\r\n");
      out.write("					                        </a>\r\n");
      out.write("					                        <ul class=\"dropdown-menu dropdown-menu-start\" aria-labelledby=\"navbarDropdownLevels\">\r\n");
      out.write("												<li><a class=\"dropdown-item bi bi-download\" href=\"/candidateEvaluationApplication/candEvalApp/report/generateReortByLevel/L1\" download> Level 1 (L1)</a></li>\r\n");
      out.write("					                            <li><a class=\"dropdown-item bi bi-download\" href=\"/candidateEvaluationApplication/candEvalApp/report/generateReortByLevel/L2\" download> Level 2 (L2)</a></li>\r\n");
      out.write("					                            <li><a class=\"dropdown-item bi bi-download\" href=\"/candidateEvaluationApplication/candEvalApp/report/generateReortByLevel/L3\" download> Level 3 (L3)</a></li>\r\n");
      out.write("					                        </ul>\r\n");
      out.write("					                    </li>\r\n");
      out.write("					                    <!-- Levels report end -->\r\n");
      out.write("					                    \r\n");
      out.write("					                    <!-- Evaluators start -->\r\n");
      out.write("					                    <li class=\"dropdown-submenu\">\r\n");
      out.write("					                        <a class=\"dropdown-item dropdown-toggle\" href=\"#\" id=\"navbarDropdownLevels\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("					                         Evaluator(s)\r\n");
      out.write("					                        </a>\r\n");
      out.write("					                        <ul class=\"dropdown-menu dropdown-menu-start\" aria-labelledby=\"navbarDropdownLevels\">\r\n");
      out.write("												<li><a class=\"dropdown-item bi bi-download\" href=\"/candidateEvaluationApplication/candEvalApp/report/generateReportByEvaluator/Mohan Kumar\" download> Mohan Kumar</a></li>\r\n");
      out.write("					                            <li><a class=\"dropdown-item bi bi-download\" href=\"/candidateEvaluationApplication/candEvalApp/report/generateReportByEvaluator/Shalini Deshmukh\" download> Shalini Deshmukh</a></li>\r\n");
      out.write("												<li><a class=\"dropdown-item bi bi-download\" href=\"/candidateEvaluationApplication/candEvalApp/report/generateReportByEvaluator/Rahul Reddy\" download> Rahul Reddy</a></li>\r\n");
      out.write("					                            <li><a class=\"dropdown-item bi bi-download\" href=\"/candidateEvaluationApplication/candEvalApp/report/generateReportByEvaluator/Divya Sharma\" download> Divya Sharma</a></li>				                            \r\n");
      out.write("					                        </ul>\r\n");
      out.write("					                    </li>\r\n");
      out.write("					                    \r\n");
      out.write("					                    <!-- Evaluators end -->\r\n");
      out.write("					                    \r\n");
      out.write("					                    <!-- Selection Status start -->\r\n");
      out.write("					                    <li class=\"dropdown-submenu\">\r\n");
      out.write("					                        <a class=\"dropdown-item dropdown-toggle\" href=\"#\" id=\"navbarDropdownLevels\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("					                         Selection Status\r\n");
      out.write("					                        </a>\r\n");
      out.write("					                        <ul class=\"dropdown-menu dropdown-menu-start\" aria-labelledby=\"navbarDropdownLevels\">\r\n");
      out.write("												<li><a class=\"dropdown-item bi bi-download\" href=\"/candidateEvaluationApplication/candEvalApp/report/generateReportByStatus/Selected\" download> Selected</a></li>\r\n");
      out.write("					                            <li><a class=\"dropdown-item bi bi-download\" href=\"/candidateEvaluationApplication/candEvalApp/report/generateReportByStatus/Not Selected\" download> Not Selected</a></li>\r\n");
      out.write("					                        </ul>\r\n");
      out.write("					                    </li>\r\n");
      out.write("					                    \r\n");
      out.write("					                    <!-- Selection Status end -->\r\n");
      out.write("					                    \r\n");
      out.write("					                </ul>\r\n");
      out.write("					            </li>\r\n");
      out.write("						\r\n");
      out.write("				             			\r\n");
      out.write("				             <!-- Reports end -->\r\n");
      out.write("				             \r\n");
      out.write("				       </ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"d-flex\" style=\"font-size: 16px; font-weight: bold;\">\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"dropdown ft-color\">\r\n");
      out.write("					\r\n");
      out.write("					Welcome\r\n");
      out.write("					\r\n");
      out.write("						<button class=\"btn btn-eviden dropdown-toggle\"\r\n");
      out.write("					              type=\"button\"\r\n");
      out.write("					              data-bs-toggle=\"dropdown\"\r\n");
      out.write("					              aria-expanded=\"false\">\r\n");
      out.write("					              ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${current_employee.empName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("						</button>\r\n");
      out.write("						\r\n");
      out.write("						<ul class=\"dropdown-menu\">\r\n");
      out.write("						\r\n");
      out.write("							<li>\r\n");
      out.write("								<a class=\"dropdown-item\" href=\"/candidateEvaluationApplication/candEvalApp/logout\">\r\n");
      out.write("									Logout\r\n");
      out.write("								</a>\r\n");
      out.write("							</li>\r\n");
      out.write("						\r\n");
      out.write("						</ul>\r\n");
      out.write("						\r\n");
      out.write("						");
      if (_jspx_meth_core_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					</div>\r\n");
      out.write("				\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("		\r\n");
      out.write("		<!-- End of Navbar -->\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("		<!-- Start Candidate Registration Form -->\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"container my-2\" style=\"width:50%; \r\n");
      out.write("		    \r\n");
      out.write("		    width: 100vh;\r\n");
      out.write("		    height: 50vh; /* This will center the form vertically */\">\r\n");
      out.write("			\r\n");
      out.write("			<h3 style=\"FONT-FAMILY: Arial; text-align: left;\r\n");
      out.write("					    color: #FFFFFF;\r\n");
      out.write("					    font-weight: bold;\r\n");
      out.write("					    padding: 3px;\r\n");
      out.write("					    padding-left: 5px;\r\n");
      out.write("					    vertical-align: middle;\r\n");
      out.write("					    background-color: #002d3c;\r\n");
      out.write("					    border: solid 0px #FFFFFF;\">Candidate Update Form</h3>\r\n");
      out.write("			\r\n");
      out.write("			<div class = \"col\" style=\"border:2px; empty-cells: show;\r\n");
      out.write("					border-collapse: collapse;\r\n");
      out.write("				    FONT-SIZE: 14px;\r\n");
      out.write("				    FONT-STYLE: normal;\r\n");
      out.write("				    FONT-FAMILY: Arial;\r\n");
      out.write("				    line-height: 150%;\r\n");
      out.write("				    background-color: #F4F4F4;\r\n");
      out.write("				    padding: 10px 10px 10px 10px;\r\n");
      out.write("				    vertical-align: top;\">\r\n");
      out.write("			\r\n");
      out.write("			<form action=\"/candidateEvaluationApplication/candEvalApp/candidate/candidate-update-form/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidateId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/update-save\"\r\n");
      out.write("			        method=\"post\"\r\n");
      out.write("			        enctype=\"multipart/form-data\">\r\n");
      out.write("			        \r\n");
      out.write("			        <!-- Use JSTL to check if candidate is found and set hidden field for candidateId -->\r\n");
      out.write("					\r\n");
      out.write("			       \r\n");
      out.write("			        \r\n");
      out.write("			        \r\n");
      out.write("			        <div class=\"mb-3\">\r\n");
      out.write("			         <input type=\"hidden\" name=\"candidateId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidate.candidateId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("			        	<label for=\"candidateName\" class=\"form-label\">\r\n");
      out.write("			        		<b>Candidate Name</b>\r\n");
      out.write("			        	</label>\r\n");
      out.write("			        	<input type=\"text\"\r\n");
      out.write("					            id=\"candidateName\"\r\n");
      out.write("					            name=\"candidateName\"\r\n");
      out.write("					            class=\"form-control\"\r\n");
      out.write("					            value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidate.candidateName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("			        </div>\r\n");
      out.write("			        \r\n");
      out.write("			        <div class=\"mb-3\">\r\n");
      out.write("			        	<label for=\"candidatePhone\" class=\"form-label\">\r\n");
      out.write("			        		<b>Candidate Phone</b>\r\n");
      out.write("			        	</label>\r\n");
      out.write("			        	<input type=\"text\"\r\n");
      out.write("					            name=\"candidatePhone\"\r\n");
      out.write("					            id=\"candidatePhone\"\r\n");
      out.write("					            class=\"form-control\"\r\n");
      out.write("					            value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidate.candidatePhone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"[0-9]{10}\" maxlength=\"10\" required/>\r\n");
      out.write("			        </div>\r\n");
      out.write("			        \r\n");
      out.write("			        <div class=\"mb-3\">\r\n");
      out.write("			        	<label for=\"candidateEmail\" class=\"form-label\">\r\n");
      out.write("			        		<b>Candidate Email</b>\r\n");
      out.write("			        	</label>\r\n");
      out.write("			        	<input type=\"email\"\r\n");
      out.write("				            name=\"candidateEmail\"\r\n");
      out.write("				            id=\"candidateEmail\"\r\n");
      out.write("				            class=\"form-control\"\r\n");
      out.write("				            value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidate.candidateEmail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("				            pattern=\"[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+[a-zA-Z0-9._%+-]+.[a-zA-Z]{2,}\" required/>\r\n");
      out.write("			        </div>\r\n");
      out.write("			        \r\n");
      out.write("			        \r\n");
      out.write("			        			        \r\n");
      out.write("			        <div class=\"mb-3\">\r\n");
      out.write("			        	<label for=\"candResume\" class=\"form-label\">\r\n");
      out.write("			        		<b>Candidate Resume</b>\r\n");
      out.write("			        	</label> <br/>\r\n");
      out.write("			        	");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidate.candidateResume}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("			        	<input type=\"file\" \r\n");
      out.write("			        			name=\"candResume\" \r\n");
      out.write("			        			id=\"candResume\" \r\n");
      out.write("			        			class=\"form-control\"\r\n");
      out.write("			        			value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidate.candidateResume}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("			        </div>\r\n");
      out.write("			        \r\n");
      out.write("			        <div class=\"mb-3\">\r\n");
      out.write("			        	<label for=\"candidateComment\" class=\"form-label\">\r\n");
      out.write("			        		<b>Candidate Comment</b>\r\n");
      out.write("			        	</label>\r\n");
      out.write("			        	<textarea name=\"candidateComment\"\r\n");
      out.write("						            id=\"candidateComment\"\r\n");
      out.write("						            class=\"form-control\">\r\n");
      out.write("						           ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${candidate.candidateComment}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("			        	</textarea> \r\n");
      out.write("			        </div>\r\n");
      out.write("			        \r\n");
      out.write("			        <div style=\"display: flex; justify-content: center;\">\r\n");
      out.write("				       <input type=\"submit\" value=\"Update\" \r\n");
      out.write("				        		class=\"btn btn-outline-success\" style=\"margin-right: 20px; width: 200px; font-weight: bold;\"/>\r\n");
      out.write("				        <input type=\"reset\" value=\"Reset\" style=\"width: 200px; font-weight: bold;\"\r\n");
      out.write("			       			class=\"btn btn-outline-primary\"/>\r\n");
      out.write("					</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<!-- End Candidate Registration Form -->	\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		    // Initialize nested dropdowns\r\n");
      out.write("		    $(document).ready(function () {\r\n");
      out.write("		        $('.dropdown-submenu a.dropdown-toggle').on(\"click\", function (e) {\r\n");
      out.write("		            $(this).next('ul').toggle();\r\n");
      out.write("		            e.stopPropagation();\r\n");
      out.write("		            e.preventDefault();\r\n");
      out.write("		        });\r\n");
      out.write("		    });\r\n");
      out.write("		</script>\r\n");
      out.write("	</body>\r\n");
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

  private boolean _jspx_meth_core_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  core:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_core_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_core_005furl_005f0_reused = false;
    try {
      _jspx_th_core_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_core_005furl_005f0.setParent(null);
      // /WEB-INF/views/candidate-update-form.jsp(11,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_core_005furl_005f0.setValue("/candEvalApp/resources/css/bootstrap.min.css");
      int _jspx_eval_core_005furl_005f0 = _jspx_th_core_005furl_005f0.doStartTag();
      if (_jspx_th_core_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_core_005furl_005f0);
      _jspx_th_core_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_core_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_core_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_core_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  core:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_core_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_core_005furl_005f1_reused = false;
    try {
      _jspx_th_core_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_core_005furl_005f1.setParent(null);
      // /WEB-INF/views/candidate-update-form.jsp(12,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_core_005furl_005f1.setValue("/candEvalApp/resources/css/bootstrap-icons.css");
      int _jspx_eval_core_005furl_005f1 = _jspx_th_core_005furl_005f1.doStartTag();
      if (_jspx_th_core_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_core_005furl_005f1);
      _jspx_th_core_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_core_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_core_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_core_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  core:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_core_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_core_005furl_005f2_reused = false;
    try {
      _jspx_th_core_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_core_005furl_005f2.setParent(null);
      // /WEB-INF/views/candidate-update-form.jsp(14,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_core_005furl_005f2.setValue("/candEvalApp/resources/css/main.css");
      int _jspx_eval_core_005furl_005f2 = _jspx_th_core_005furl_005f2.doStartTag();
      if (_jspx_th_core_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_core_005furl_005f2);
      _jspx_th_core_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_core_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_core_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_core_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  core:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_core_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_core_005furl_005f3_reused = false;
    try {
      _jspx_th_core_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_core_005furl_005f3.setParent(null);
      // /WEB-INF/views/candidate-update-form.jsp(15,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_core_005furl_005f3.setValue("/candEvalApp/resources/js/bootstrap.bundle.min.js");
      int _jspx_eval_core_005furl_005f3 = _jspx_th_core_005furl_005f3.doStartTag();
      if (_jspx_th_core_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_core_005furl_005f3);
      _jspx_th_core_005furl_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_core_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_core_005furl_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_core_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  core:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_core_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_core_005furl_005f4_reused = false;
    try {
      _jspx_th_core_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_core_005furl_005f4.setParent(null);
      // /WEB-INF/views/candidate-update-form.jsp(45,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_core_005furl_005f4.setValue("/candEvalApp/resources/images/logo/eviden-logo-orange.png");
      int _jspx_eval_core_005furl_005f4 = _jspx_th_core_005furl_005f4.doStartTag();
      if (_jspx_th_core_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fcore_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_core_005furl_005f4);
      _jspx_th_core_005furl_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_core_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_core_005furl_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_core_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  core:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_core_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_core_005fif_005f0_reused = false;
    try {
      _jspx_th_core_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_core_005fif_005f0.setParent(null);
      // /WEB-INF/views/candidate-update-form.jsp(163,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_core_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${current_employee == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_core_005fif_005f0 = _jspx_th_core_005fif_005f0.doStartTag();
      if (_jspx_eval_core_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							");
          if (true) {
            _jspx_page_context.forward("index.jsp");
            return true;
          }
          out.write("\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_core_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_core_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f0);
      _jspx_th_core_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_core_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_core_005fif_005f0_reused);
    }
    return false;
  }
}
