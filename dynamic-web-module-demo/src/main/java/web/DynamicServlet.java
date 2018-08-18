package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DynamicServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6769741807995896233L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Redirecting...");
		req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);;
	}

	
}
