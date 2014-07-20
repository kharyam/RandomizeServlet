package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RandomServlet extends HttpServlet {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public RandomServlet() {
    // TODO Auto-generated constructor stub
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    this.doPost(req, resp);

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    PrintWriter out = resp.getWriter();
    resp.setContentType("text/html");
    String numString = "89698076 7856056 8750850 850875";

    out.println("<head>");
    out.println("<title>");
    out.println("Your Random Numbers!");
    out.println("</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1> Your Random Numbers! </h1>");
    out.println("<h1> " + numString + " </h1>");
    out.println("</body>");

  }
}