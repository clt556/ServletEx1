package sec03_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetorPost
 */
@WebServlet("/GetorPost")
public class GetorPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetorPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출됨");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("안녕");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("doget방식");
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</head>");
		writer.println("</html>");
		
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출됨");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("안녕");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("dopost방식");
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</head>");
		writer.println("</html>");
		
		writer.close();
	}

}
