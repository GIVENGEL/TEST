/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-07-13 16:21:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class campaign_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"description\" content=\"Ogani Template\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Ogani, unica, creative, html\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>살아숨쉬는 기부의 즐거움, GivEngel</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Font -->\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Css Styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Page Preloder -->\r\n");
      out.write("    <div id=\"preloder\">\r\n");
      out.write("        <div class=\"loader\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!--  navbar &  side over wrap -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "module/navbar.jsp", out, false);
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  	<!-- 사이드바 + 서브 헤더 -->\r\n");
      out.write("    <section class=\"hero hero-normal\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3\">\r\n");
      out.write("                    <div class=\"hero__categories\">\r\n");
      out.write("                        <div class=\"hero__categories__all\">\r\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                            <span>All Categories</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">전체 상품</a></li>\r\n");
      out.write("                            <li><a href=\"#\">TOP</a></li>\r\n");
      out.write("                            <li><a href=\"#\">BOTTOM</a></li>\r\n");
      out.write("                            <li><a href=\"#\">BAG</a></li>\r\n");
      out.write("                            <li><a href=\"#\">ACC</a></li>\r\n");
      out.write("                            <li><a href=\"#\">SHOES</a></li>\r\n");
      out.write("                            <li><a href=\"#\">SALES</a></li>    \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-9\">\r\n");
      out.write("                    <div class=\"hero__search\">\r\n");
      out.write("                        <div class=\"hero__search__form\">\r\n");
      out.write("                            <form action=\"#\">\r\n");
      out.write("                                <div class=\"hero__search__categories\">\r\n");
      out.write("                                    All Categories\r\n");
      out.write("                                    <span class=\"arrow_carrot-down\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"text\" placeholder=\"어떤 상품을 원하세요?\">\r\n");
      out.write("                                <button type=\"submit\" class=\"site-btn\">검색</button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"hero__search__phone\">\r\n");
      out.write("                            <div class=\"hero__search__phone__icon\">\r\n");
      out.write("                                <i class=\"fa fa-phone\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"hero__search__phone__text\">\r\n");
      out.write("                                <h5>010-9159-5358</h5>\r\n");
      out.write("                                <span>24시간 상담 가능</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("   <!-- 사이드바 + 서브 헤더 end -->\r\n");
      out.write("	\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <!-- Blog Section Begin -->\r\n");
      out.write("    <section class=\"from-blog spad\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"section-title from-blog__title\">\r\n");
      out.write("                        <h2 class=\"display-3\">Campaign</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("            \r\n");
      out.write("            	<!--  각 캠패인 출력 단위 표시 ****************-->\r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("                    <div class=\"blog__item\">\r\n");
      out.write("                        <div class=\"blog__item__pic\">\r\n");
      out.write("                            <img src=\"img/blog/blog-1.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"blog__item__text\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><i class=\"fa fa-calendar-o\"></i> 각 캠페인 만료일 출력</li>\r\n");
      out.write("                                <li><i class=\"fa fa-comment-o\"></i> 댓글 수 출력</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <h5><a href=\"#\">캠페인 이름 출력</a></h5>\r\n");
      out.write("                            <p>캠페인 설명 출력(할 수 있으면 20글자만 출력하고 ... 붙이기) </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- ****************************** -->\r\n");
      out.write("                <!--  각 캠패인 출력 단위 표시 ****************-->\r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("                    <div class=\"blog__item\">\r\n");
      out.write("                        <div class=\"blog__item__pic\">\r\n");
      out.write("                            <img src=\"img/blog/blog-2.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"blog__item__text\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><i class=\"fa fa-calendar-o\"></i> May 4,2019</li>\r\n");
      out.write("                                <li><i class=\"fa fa-comment-o\"></i> 5</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <h5><a href=\"#\">고양이, 그리고 불편한 진실</a></h5>\r\n");
      out.write("                            <p>인간만이 신체적 결함에 부조리함을 느낀다고 생각하시나요? 고양이 로소의 이야기를 들어보세요. </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <!-- ****************************** -->\r\n");
      out.write("                <!--  각 캠패인 출력 단위 표시 ****************-->\r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("                    <div class=\"blog__item\">\r\n");
      out.write("                        <div class=\"blog__item__pic\">\r\n");
      out.write("                            <img src=\"img/blog/blog-3.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"blog__item__text\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><i class=\"fa fa-calendar-o\"></i> May 4,2019</li>\r\n");
      out.write("                                <li><i class=\"fa fa-comment-o\"></i> 5</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <h5><a href=\"#\">지구 한 바퀴를 돌고 와도 변치않는 우정</a></h5>\r\n");
      out.write("                            <p>영국에 사는 두 소녀의 드라마같은 우정이야기 </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <!-- ****************************** -->\r\n");
      out.write("                <!--  각 캠패인 출력 단위 표시 ****************-->\r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("                    <div class=\"blog__item\">\r\n");
      out.write("                        <div class=\"blog__item__pic\">\r\n");
      out.write("                            <img src=\"img/blog/blog-1.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"blog__item__text\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><i class=\"fa fa-calendar-o\"></i> ~2021.09.31</li>\r\n");
      out.write("                                <li><i class=\"fa fa-comment-o\"></i> 10</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <h5><a href=\"#\">도쿄올림픽, 패럴림픽 개최 중단..?</a></h5>\r\n");
      out.write("                            <p>올림픽의 마지막을 장식하는 패럴림픽, 그런데 다음 올릭픽에서는 개최가 안될지 모른다고..? </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <!-- ****************************** -->\r\n");
      out.write("                <!--  각 캠패인 출력 단위 표시 ****************-->\r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("                    <div class=\"blog__item\">\r\n");
      out.write("                        <div class=\"blog__item__pic\">\r\n");
      out.write("                            <img src=\"img/blog/blog-2.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"blog__item__text\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><i class=\"fa fa-calendar-o\"></i> May 4,2019</li>\r\n");
      out.write("                                <li><i class=\"fa fa-comment-o\"></i> 5</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <h5><a href=\"#\">고양이, 그리고 불편한 진실</a></h5>\r\n");
      out.write("                            <p>인간만이 신체적 결함에 부조리함을 느낀다고 생각하시나요? 고양이 로소의 이야기를 들어보세요. </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <!-- ****************************** -->\r\n");
      out.write("                <!--  각 캠패인 출력 단위 표시 ****************-->\r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
      out.write("                    <div class=\"blog__item\">\r\n");
      out.write("                        <div class=\"blog__item__pic\">\r\n");
      out.write("                            <img src=\"img/blog/blog-3.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"blog__item__text\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><i class=\"fa fa-calendar-o\"></i> May 4,2019</li>\r\n");
      out.write("                                <li><i class=\"fa fa-comment-o\"></i> 5</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <h5><a href=\"#\">지구 한 바퀴를 돌고 와도 변치않는 우정</a></h5>\r\n");
      out.write("                            <p>영국에 사는 두 소녀의 드라마같은 우정이야기 </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Blog Section End -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- Categories Section Begin -->\r\n");
      out.write("    <section class=\"categories mb-4\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"section-title from-blog__title\">\r\n");
      out.write("                        <h2>이런 후원 단체는 어떠세요?</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"categories__slider owl-carousel\">\r\n");
      out.write("                    <div class=\"col-lg-3\">\r\n");
      out.write("                        <div class=\"categories__item set-bg\" data-setbg=\"img/categories/cat-1.jpg\">\r\n");
      out.write("                            <h5><a href=\"#\">양키 캔들</a></h5>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3\">\r\n");
      out.write("                        <div class=\"categories__item set-bg\" data-setbg=\"img/categories/cat-2.jpg\">\r\n");
      out.write("                            <h5><a href=\"#\">도자기 공예</a></h5>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3\">\r\n");
      out.write("                        <div class=\"categories__item set-bg\" data-setbg=\"img/categories/cat-3.jpg\">\r\n");
      out.write("                            <h5><a href=\"#\">원예</a></h5>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3\">\r\n");
      out.write("                        <div class=\"categories__item set-bg\" data-setbg=\"img/categories/cat-4.jpg\">\r\n");
      out.write("                            <h5><a href=\"#\">수제 비누</a></h5>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3\">\r\n");
      out.write("                        <div class=\"categories__item set-bg\" data-setbg=\"img/categories/cat-5.jpg\">\r\n");
      out.write("                            <h5><a href=\"#\">악세사리</a></h5>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Categories Section End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "module/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Js Plugins -->\r\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.slicknav.js\"></script>\r\n");
      out.write("    <script src=\"js/mixitup.min.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
