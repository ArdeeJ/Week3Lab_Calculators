package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ardee
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // get the parameters from POST request
        String first = request.getParameter("first");
        String last = request.getParameter("last");

        // set attribute for JSP
        request.setAttribute("first", first);
        request.setAttribute("last", last);

        // Validation
        if (first == null || first.equals("") || last == null || last.equals("")) {
            request.setAttribute("result", "Invalid");

        } else if (request.getParameter("symbols").equals("+")) {
            int num1 = Integer.parseInt(first);
            int num2 = Integer.parseInt(last);
            int value = num1 + num2;

            request.setAttribute("result", + value);

        } else if (request.getParameter("symbols").equals("-")) {
            int num1 = Integer.parseInt(first);
            int num2 = Integer.parseInt(last);
            int value = num1 - num2;

            request.setAttribute("result", + value);
        } else if (request.getParameter("symbols").equals("*")) {
            int num1 = Integer.parseInt(first);
            int num2 = Integer.parseInt(last);
            int value = num1 * num2;

            request.setAttribute("result", + value);

        } else if (request.getParameter("symbols").equals("%")) {
            int num1 = Integer.parseInt(first);
            int num2 = Integer.parseInt(last);
            int value = num1 % num2;

            request.setAttribute("result", + value);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }
}
