package it.uniroma3.servlet;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/processaDati")
public class LeggiParametri extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// gestione della RICHIESTA

		// leggo i parametri
		String nome = request.getParameter("nome").toUpperCase();
		String matricola = request.getParameter("matricola");
		String nextPage = "/MostraParametri.jsp";
		boolean tuttoOk= true;

		request.setAttribute("nome", nome);
		request.setAttribute("matricola", matricola);

		Studente stud = new Studente(matricola, nome);
		request.setAttribute("studente", stud);
		nextPage = "/MostraParametri.jsp";

		if(nome == null || nome.equals("")) {
			request.setAttribute("errName", "Campo Obbligatorio");
			tuttoOk = false;
		}
		if(matricola == null || matricola.equals("")){
			request.setAttribute("errMatricola", "Campo Obbligatorio");
			tuttoOk = false;
		}
		if(tuttoOk == false)
			nextPage= "/index.jsp";
	
	ServletContext application  = getServletContext();
	RequestDispatcher rd = application.getRequestDispatcher(nextPage);
	rd.forward(request, response);
	return; 

}
}