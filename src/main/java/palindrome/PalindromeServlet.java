package palindrome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkPalindrome")
public class PalindromeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputString = request.getParameter("inputString");
        String reversedString = new StringBuilder(inputString).reverse().toString();
        boolean isPalindrome = inputString.equalsIgnoreCase(reversedString);

        request.setAttribute("inputString", inputString);
        request.setAttribute("isPalindrome", isPalindrome);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}