package test;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Changepass extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
//pw.println("hi..........");
HttpSession h1=req.getSession();
HttpSession h2=req.getSession();
String reg=(String)h1.getAttribute("reg");
String pwd=(String)h2.getAttribute("pwd");
String pass=req.getParameter("pass");
HttpSession h3=req.getSession();
String bn=(String)h1.getAttribute("bn");
if((reg.equals(""))||(pwd.equals("")))
		{
	RequestDispatcher rd=req.getRequestDispatcher("Input.html");
	rd.include(req,res);
		}
else
{Connection con=null;
	try{
		con=DbCon.getCon();
		PreparedStatement ps=con.prepareStatement("update "+bn+" set Password=? where regd_no=?");
		ps.setString(1,pass);
	ps.setString(2,reg);
	int r=ps.executeUpdate();
	if(r==1)
	{
		h1.setAttribute("reg","");
		h2.setAttribute("pwd","");
		h3.setAttribute("bn","");
		RequestDispatcher rd=req.getRequestDispatcher("sucess.html");
		rd.include(req,res);
		RequestDispatcher rd1=req.getRequestDispatcher("Input.html");
		rd1.include(req,res);
		
	}
	else
		pw.println("<br>NOT SUCESSFULL");
	}
	catch(Exception e){}
}
}
}
