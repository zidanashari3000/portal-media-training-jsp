package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2 p-5\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8 p-5\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <h3 class=\"text-uppercase font-weight-bold\">Kemana perginya mantan?</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <p class=\"text-muted\">Ditulis oleh: M Hudya Ramadhana</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 text-right\">\n");
      out.write("                                    <p class=\"text-muted\">Sabtu, 12 Juni 2019</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12 text-center\">\n");
      out.write("                            <img src=\"anya-geraldine-main-film.jpg\" width=\"100%\">\n");
      out.write("                            <p class=\"text-muted pt-2\">Anya Geraldine q ?</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12 text-justify mb-5\">\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate nisi et arcu elementum, vel pretium lacus porta. Nulla ac efficitur dui, quis dictum orci. Quisque metus orci, ullamcorper non interdum eget, molestie ac velit. Cras nec metus a urna molestie tincidunt. Integer vel sapien a mauris egestas suscipit ac ac ante. Nulla facilisi. Curabitur non tellus posuere, dictum urna scelerisque, tincidunt tellus. Sed nisl ante, porttitor in leo eget, volutpat molestie ligula. Praesent id nunc viverra, gravida sem at, dictum lectus. Sed laoreet, mi quis imperdiet euismod, lectus sem aliquam nibh, eu feugiat arcu lectus vel urna. Integer interdum mollis mauris id ornare. Integer ac justo in urna sollicitudin finibus. </p>\n");
      out.write("                            <p>Integer sagittis volutpat turpis id feugiat. Integer facilisis diam sit amet justo lobortis, et tempor elit ornare. Proin posuere faucibus odio. Donec elementum eros a turpis rhoncus fermentum. Mauris ac tellus felis. Duis fringilla lorem condimentum interdum aliquet. Mauris ut hendrerit tellus. In odio ipsum, pulvinar at suscipit quis, tincidunt rutrum arcu. Praesent et vestibulum dolor. Suspendisse ac magna scelerisque, aliquam tortor aliquam, porttitor tellus. </p>\n");
      out.write("                            <p>Aliquam sit amet turpis id nibh tincidunt faucibus laoreet a neque. Pellentesque vitae sapien vitae libero venenatis congue nec quis purus. Integer dignissim rhoncus erat, eu bibendum sem mattis et. Fusce vitae eros at nisi egestas auctor quis ac nisl. Nullam convallis elit non massa sollicitudin, eu ultrices arcu elementum. Vestibulum vel ipsum accumsan, varius nulla vitae, varius nibh. Sed tempor lorem non turpis molestie maximus. Sed interdum lorem a elit placerat, at elementum sapien interdum. Praesent vel augue velit. Etiam volutpat mauris quam, non maximus lorem congue sed. Integer ac ante vitae risus semper condimentum et at arcu. Sed condimentum arcu odio, a tincidunt turpis pellentesque eget. Vivamus sed consectetur lacus. In quis mollis leo. Morbi at eros nec arcu tincidunt lobortis at at diam. Proin dictum diam nulla, sit amet semper tellus ullamcorper nec. </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 p-5\"></div>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Footer -->\n");
      out.write("    <footer class=\"page-footer font-small blue bg-dark footer fixed-bottom\">\n");
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
