package controller;

import model.Prodotto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller")
public class ControllerDati extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Prodotto> listaProdotti = new ArrayList<>();
		Prodotto prodotto = new Prodotto();

		prodotto.setNome("Penne");
		prodotto.setPrezzo(3F);		
		listaProdotti.add(prodotto);

		prodotto = new Prodotto();

		prodotto.setNome("Gomma");
		prodotto.setPrezzo(2F);		
		listaProdotti.add(prodotto);

		request.setAttribute("prodotti", listaProdotti);

		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/prodotti.jsp");
		rd.forward(request, response);
		return;
	}
}