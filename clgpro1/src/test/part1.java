package test;
import javax.servlet.*;



import javax.servlet.http.*;


import java.sql.*;
import java.io.*;
public class part1 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String reg=req.getParameter("reg");
	String pwd=req.getParameter("pwd");

	String bn=req.getParameter("bn");
	Connection con=null;
	try{
	 con=DbCon.getCon();
//Class.forName("com.mysql.jdbc.Driver");	
	// con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client","root","");

	//pw.println("xxx"+con);
	PreparedStatement ps=con.prepareStatement("select hint from "+bn+" where regd_no=? and password=?");
	ps.setString(1, reg);
	ps.setString(2, pwd);
	
	ResultSet rs=ps.executeQuery();
	
	if(rs.next()){
		HttpSession hs=req.getSession();
		HttpSession hs1=req.getSession();
		hs.setAttribute("reg",reg);
		hs1.setAttribute("pwd",pwd);
		HttpSession hs2=req.getSession();
		
		hs2.setAttribute("bn",bn);
	RequestDispatcher rd=req.getRequestDispatcher("p2");
	rd.forward(req,res);
	}
	else{
		
		//pw.println("<script language='javascript'> alert('Hi there');</script>");
		
		RequestDispatcher rd=req.getRequestDispatcher("error.html");
		
		rd.include(req, res);
		RequestDispatcher rd1=req.getRequestDispatcher("Input.html");
		
		rd1.include(req, res);


/*pw.println("<html><head>");
int number=0;
//the value of number, you can get from resultset or any manipulation.
pw.println("<script language=javascript");
pw.println("<br> function say_hello() <br>{ <br>");
pw.println("alert \'you have got"+number+" messages\'");
pw.println("}");
pw.println("</head>");
pw.println("<body onload=say_hello()");
pw.println("</body>");
pw.println("</html>");*/

	}
	}catch(Exception e){
		pw.println("yyy"+con);
		
	e.printStackTrace();
	}
	}

}
