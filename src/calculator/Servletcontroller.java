package calculator;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ServletController")



	public class Servletcontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	 double c;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
		// Create an object of BasicCalc class
		BasicCalc det=new BasicCalc();
		//get parameter with req.getparameter() method and 
		double a=Double.valueOf(req.getParameter("a"));
		double b=Double.valueOf(req.getParameter("b"));
		
		// set the values with set parameter into variable a, b
		det.setA(a);
		det.setB(b);
		// get parameter operation 
		String operation=req.getParameter("operation");
	
		switch (operation)		
		{
		//write switch cases for calling different method of operations
		case "add":
			c=det.add();
			System.out.println("c");
			break;
		
	case "subtract":
		c=det.subtract();
		System.out.println("c");
		break;
	
	 case "multiply":
		c=det.multiply();
		System.out.println("c");
		break;
	
 case "divide":
	c=det.divide();
	System.out.println("c");
	break;

default:System.out.println("wrong chpice");
        break;
}
       req.setAttribute("answer",c);
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp); 
		} 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	doGet(req, resp);
	}
}
	



	