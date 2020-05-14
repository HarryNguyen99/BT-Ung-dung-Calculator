import sun.rmi.server.Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
            float first = Float.parseFloat(request.getParameter("first"));
            String operator = request.getParameter("operator");
            float second = Float.parseFloat(request.getParameter("second"));

            Calculator calculator = new Calculator();
            float result = calculator.calculate(first, operator, second);
            request.setAttribute("result", result);
        try {
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Result:</h1>");
//        writer.println("<h1>" + first + operator + second +" = "+ result + "</h1>");
//        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
