package fr.adaming.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="maPetiteServlet", urlPatterns={"/ser"})
public class MaServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String[] s = {"Nomane", "Nounou", "Noé", "Victor", "Vick", "Vincent", "Thomas", "Thibault", "Jean"};
		
		String sSaisie = req.getParameter("pSaisie");
		
		StringBuilder sb = new StringBuilder();
		if (!sSaisie.equals("")){
			for (int i = 0; i< s.length; i++){
				String firstLetter=String.valueOf(s[i].charAt(0)).toLowerCase();
				if (sSaisie.toLowerCase().equals(firstLetter)){
					sb.append(s[i]);
					sb.append(" ");
				}
			}
		}
		
		if (sb.length()>0){
			PrintWriter pw = resp.getWriter();
			pw.println(sb.toString());
		}
		else {
			PrintWriter pw = resp.getWriter();
			pw.println("Pas de correpondance");
		}
		

	}
}