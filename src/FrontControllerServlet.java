import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FrontControllerServlet extends HttpServlet {

	Controller controller;
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      // Set response content type
//	      super.doGet(req, resp);
		
		  resp.setContentType("text/html");
		  
		  String URI = req.getRequestURI();
		  
		  if(URI.equals("/MVC_Rungroj/")){
			  controller = new LoginController();
			  controller.execute(req,resp);
		  }
		  else{
			  controller = new OtherController();
			  controller.execute(req,resp);
		  }			  
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      String URI = req.getRequestURI();
//    	  resp.getWriter().write(URI);
	      if(URI.equals("/MVC_Rungroj/login")){
//	    	  resp.getWriter().write("Login success");
	    	  controller = new ProfileController();
	    	  controller.execute(req, resp);
	      }     
	}

}
