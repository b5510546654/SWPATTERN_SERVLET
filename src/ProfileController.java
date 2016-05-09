import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileController implements Controller {

	@Override
	public void execute(HttpServletRequest request,HttpServletResponse resp) {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		if((id.equals("id") && password.equals("password"))||(id.equals("username") && password.equals("123456"))){
			RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
			try {
				request.getSession().setAttribute("id", id);
				rd.forward(request,resp);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
			}
		}					

	}
}
