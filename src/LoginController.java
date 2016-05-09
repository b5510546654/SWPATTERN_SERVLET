import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements Controller {

	@Override
	public void execute(HttpServletRequest request,HttpServletResponse resp) {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		try {
			rd.forward(request,resp);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
