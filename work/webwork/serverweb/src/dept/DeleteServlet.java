package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "delete", urlPatterns = { "/dept/delete.do" })
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		//1. ��û���� ����
		String deptNo = request.getParameter("deptno");
		//2. �����Ͻ��޼ҵ� ȣ��
		DeptDAO dao = new DeptDAO();
		int result = dao.delete(deptNo);
		//3. ��û������
		response.sendRedirect("/serverweb/dept/list.do");
		/*pw.print("<h1>��������</h1>");
		pw.print("<hr/>");
		pw.print(result+"�� ����");
		pw.print("<a href='/serverweb/dept/list.do'>��Ϻ���</a>");*/
	}

}
