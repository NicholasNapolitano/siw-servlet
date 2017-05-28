import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studente")
public class StudenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// gestione della RICHIESTA
		// leggo i parametri
		String codiceFiscale = request.getParameter("codice_fiscale");
		String password = request.getParameter("password");
		String linguaggi[]=new String[3];
		linguaggi = request.getParameterValues("linguaggio");
		String corsoDiStudi = request.getParameter("corso");
		String corso="";
		if(corsoDiStudi.equals("270")) corso="270";
		else if(corsoDiStudi.equals("529")) corso="529";
		String esame = request.getParameter("esame");
		String commento = request.getParameter("message");

		// leggo (alcune) intestazioni http della richiesta
		String address = (String)request.getRemoteAddr();
		String host = (String)request.getRemoteHost();
		String userAgent = request.getHeader("User-Agent");

		// gestione della RISPOSTA
		// preparo il tipo (HTML)
		response.setContentType("text/html");
		// preparo un oggetto su cui scrivere la risposta
		PrintWriter out = response.getWriter();

		// scrivo il corpo
		out.println("<!DOCTYPE html>"); out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\" />");
		out.println("<title>Inserisci studente</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Dati inseriti nella form</h1>");
		out.println("<ul>");
		out.println("<li>Codice Fiscale: <b>"+codiceFiscale+"</b></li>");
		out.println("<li>Password: <b>"+password+"</b></li>");
		out.println("<li>Linguaggi di Programmazione: </li>");
		for(String temp:linguaggi){
			out.print("<b>"+temp+"; </b>");;
		}
		out.println("<li>Corso di Studi: <b>"+corso+"</b></li>");
		out.println("<li>Esame: <b>"+esame+"</b></li>");
		out.println("<li>Commento: <b>"+commento+"</b></li>");
		out.println("</ul>");
		out.println("<h1>Altri dati relativi alla richiesta</h1>");
		out.println("<br />IP: <b>"+address+"</b>");
		out.println("<br />Host: <b>"+host+"</b>");
		out.println("<br />User Agent: <b>"+userAgent+"</b>");
		out.println("</body>\n</html> ");
	
	}
}