package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <title>My Website</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg sticky-top navbar-light bg-dark\">\n");
      out.write("                <a class=\"navbar-brand text-white\" href=\"#\">Navbar</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                  <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("              \n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                  <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                      <a class=\"nav-link text-white\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link text-white\" href=\"#\">Link</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                      <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        Dropdown\n");
      out.write("                      </a>\n");
      out.write("                      <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                      </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link disabled text-white\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Disabled</a>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                  <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                  <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                  <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                  <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                  <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"https://via.placeholder.com/728x300.png/2c3e50/ffffff?text=Learn+With+Hudya\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"https://via.placeholder.com/728x300.png/2c3e50/ffffff?text=Learn+With+Hudya\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"https://via.placeholder.com/728x300.png/2c3e50/ffffff?text=Learn+With+Hudya\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                  <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                  <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                  <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                  <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("      <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"jumbotron mt-3\">\n");
      out.write("                                <h1 class=\"display-4\">Hello, world!</h1>\n");
      out.write("                                <p class=\"lead\">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>\n");
      out.write("                                <hr class=\"my-4\">\n");
      out.write("                                <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>\n");
      out.write("                                <a class=\"btn btn-primary btn-lg\" href=\"#\" role=\"button\">Learn more</a>\n");
      out.write("                            </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8 p-5\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                        <div class=\"card-header text-uppercase text-center\">\n");
      out.write("                                            <h3>Kemana perginya Mantan?</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-body text-center\">\n");
      out.write("                                            <img src=\"assets/img/anya-geraldine.jpg\" width=\"180\" height=\"150\" class=\"img-responsive\"/>\n");
      out.write("                                            <p class=\"pt-3\">Mantan, adalah kata paling menyeramkan di dunia percintaan [...]</p>\n");
      out.write("                                            <a href=\"detail.html\" class=\"btn btn-sm btn-primary\">Selengkapnya</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                        <div class=\"card-header text-uppercase text-center\">\n");
      out.write("                                            <h3>Kemana perginya Mantan?</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-body text-center\">\n");
      out.write("                                                <img src=\"assets/img/chelsea-islan.jpg\" width=\"180\" height=\"150\" class=\"img-responsive\"/>\n");
      out.write("                                            <p class=\"pt-3\">Mantan, adalah kata paling menyeramkan di dunia percintaan [...]</p>\n");
      out.write("                                            <a href=\"detail.html\" class=\"btn btn-sm btn-primary\">Selengkapnya</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 p-5\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <p>My website is a website created by Hudya. This website using Bootstrap 4. Bootstrap is Amazing!</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                                <img src=\"https://via.placeholder.com/150.png/2c3e50/ffffff?text=Learn+With+Hudya\" class=\"img-responsive\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Footer -->\n");
      out.write("      <footer class=\"page-footer font-small blue bg-dark footer fixed-bottom\">\n");
      out.write("\n");
      out.write("        <!-- Copyright -->\n");
      out.write("        <div class=\"footer-copyright text-center py-3 text-white\">© 2018 Copyright:\n");
      out.write("          <a href=\"https://mdbootstrap.com/education/bootstrap/\"> MDBootstrap.com</a>\n");
      out.write("        </div>\n");
      out.write("        <!-- Copyright -->\n");
      out.write("      \n");
      out.write("      </footer>\n");
      out.write("      <!-- Footer -->\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
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
