package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		ArrayList<DeptDTO> deptlist = new ArrayList<DeptDTO>();
		DeptDAO dao = new DeptDAO();
		
		deptlist = dao.getDeptList();
		/*pw.print("<h1>�μ����</h1>");
		pw.print("<hr/>");
		pw.print("<table border='1px'>");
		pw.print("<tr>");
		pw.print("<th>�μ��ڵ�</th><th>�μ���</th><th>�μ���ġ</th>"
				+ "<th>��ȭ��ȣ</th><th>������</th><th>����</th>");
		pw.print("</tr>");
		int size=deptlist.size();
		for (int i = 0; i < size; i++) {
			DeptDTO dept = deptlist.get(i);
			pw.print("<tr>");
			pw.print("<td>"+dept.getDeptNo()+"</td>"
					+"<td>"+dept.getDeptName()+"</td>"
					+"<td>"+dept.getLoc()+"</td>"
					+"<td>"+dept.getTel()+"</td>"
					+"<td>"+dept.getMgr()+"</td>"
					+"<td><a href='/serverweb/dept/delete.do?deptno="
					+dept.getDeptNo()+"&info=test'>����</a></td>");
			pw.print("</tr>");
		}*/
		/*for (DeptDTO deptDTO : deptlist) {
			pw.print("<tr>");
			pw.print("<td>"+deptDTO.getDeptNo()+"</td>"
					+"<td>"+deptDTO.getDeptName()+"</td>"
					+"<td>"+deptDTO.getLoc()+"</td>"
					+"<td>"+deptDTO.getTel()+"</td>"
					+"<td>"+deptDTO.getMgr()+"</td>");
			pw.print("</tr>");
		}*/
		//pw.print("</table>");
		//3. �����Ͱ���
		request.setAttribute("list", deptlist);
		//4. ��û������
		RequestDispatcher rd = request.getRequestDispatcher("/dept/list.jsp");
		rd.forward(request, response);
		
	}

}
