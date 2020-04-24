package web;

import java.time.LocalDateTime;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime localTime = LocalDateTime.now();
		int year = localTime.getYear();
		int month = localTime.getMonthValue();
		int day = localTime.getDayOfMonth();
		int hour = localTime.getHour();
		int min = localTime.getMinute();
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>today</title>");
		out.print("<h style='text-decoration: none; cursor: pointer;'><a href='./index.html'>메인화면</a><h>");
		out.print("</head>");
		out.print("<body>");
		out.print("<div style='position: absolute; top: 40%; left: 30%; font-size:3em; font-weight:bold;'>");
		out.print("현재시간 : " + year + "/" + month + "/" + day + " " + hour + ":" + min);
		out.print("</div>");
		out.print("</body>");
		out.print("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
