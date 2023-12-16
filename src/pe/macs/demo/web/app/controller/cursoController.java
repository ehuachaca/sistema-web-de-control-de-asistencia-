package pe.macs.demo.web.app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cursoController
 */
@WebServlet({"/AddCurso","/ViewCursos"})
public class cursoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String alias=request.getServletPath();
		if(alias.equals("/AddCurso")) {
			addCurso(request,response);
		} else if(alias.equals("/ViewCursos")) {
			//viewCursos(request,response);
		}
	}

	private void addCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("dentro del servlet");
	}

}
