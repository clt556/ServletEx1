package sec04_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class choicePhoto
 */
@WebServlet("/choicePhoto")
public class choicePhoto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public choicePhoto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		String[] games = request.getParameterValues("from");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body bgcolor='green'>");
		writer.println("<table align='center' bgcolor='yellow'>");
		writer.println("<tr>");
		for(int i = 0; i<games.length; i++) {
			writer.println("<td>");
			writer.println("<img src='" + games[i] + "'>");
			writer.println("</td>");
		}
		writer.println("</tr>");
		writer.println("</table>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}

}
