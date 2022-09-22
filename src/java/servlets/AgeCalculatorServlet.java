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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // get the parameter from the POST request
        String userAge = request.getParameter("age");
        
        // set the attribute for the JSP
        request.setAttribute("age", userAge);

        // Validation
        if (userAge == null || userAge.equals("")) {
            request.setAttribute("message","You must give your current age");
        } else {
            int age = Integer.parseInt(userAge);
            int nextAge = age + 1;
            request.setAttribute("message", "Your next birthday will be " + nextAge);
        }

        // display the second page
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }
}
