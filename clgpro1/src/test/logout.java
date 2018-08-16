package test;
import java.io.*;
//import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class logout extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
HttpSession hs=req.getSession();
HttpSession hs1=req.getSession();

String reg=(String)hs.getAttribute("reg");
String pwd=(String)hs1.getAttribute("pwd");
if(reg.equals("") || pwd.equals(""))
		{
	pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no></head><body><p>YOU ARE ALREADY LOGGEDOUT</p></body></html>");
	RequestDispatcher rd=req.getRequestDispatcher("Input.html");
	rd.include(req,res);
		}
else{
hs.setAttribute("reg","");
	hs1.setAttribute(pwd,"");
	pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no></head><body><p>YOU ARE Sucessfully LOGGEDOUT</p></body></html>");
	pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no><body><a href=Input.html>Press here for Login again</a></body></html>");
	
}


}
}
