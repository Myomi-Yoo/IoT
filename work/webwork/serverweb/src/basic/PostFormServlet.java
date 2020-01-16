package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		req.setCharacterEncoding("euc-kr");
		System.out.println("Customer");
		System.out.println("---------");
		
		String userId = req.getParameter("userId");
		String userName = req.getParameter("userName");
		String passwd = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] favorites = req.getParameterValues("item");
		
		System.out.println("���̵�: "+userId);
		System.out.println("�̸�: "+userName);
		System.out.println("�н�����: "+passwd);
		System.out.println("����: "+gender);
		System.out.println("����: "+job);
		System.out.print("Favorites: ");
		for (String data : favorites) {
			System.out.print(data+" ");
		}
		
	}
}
