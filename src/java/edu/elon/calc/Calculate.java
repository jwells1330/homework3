package edu.elon.calc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Copyright: Jasmine Jones & Jacob Wells
 *
 * @author jwells8
 * 
 * RHC LINK: http://appsbyjacobwells-jwells1330.rhcloud.com/homework2/
 *
 */
public class Calculate extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, 
          HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    String url = "/index.jsp";
    String action = request.getParameter("action");

    if (action == null) {
      action = "join";
    }

    if (action.equals("join")) {
      System.out.println("Going to Index");
      url = "/index.jsp";
        
//      getServletContext().getRequestDispatcher(url).forward(request, response);
    } else if (request.getParameter("action").equals("add")) {
      int investment = Integer.parseInt(request.getParameter("amount"));
      int interestRate = Integer.parseInt(request.getParameter("interest"));
      int years = Integer.parseInt(request.getParameter("years"));

      System.out.println("Investment: " + investment);
      System.out.println("Last Name: " + interestRate);
      System.out.println("Email: " + years);

      Calculation calculation = new Calculation(investment, interestRate, years);
      calculation.doInterestCalculation();

            HttpSession session = request.getSession();
        session.setAttribute("investment", (int)(calculation.getInvestment()));
        session.setAttribute("interest", (int) (calculation.getInterest()));
        
      request.setAttribute("calculation", calculation);
      url = "/calculate.jsp";
//      getServletContext().getRequestDispatcher(url).forward(request, response);
    }
    getServletContext().getRequestDispatcher(url).forward(request, response);
  }

  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }

}
