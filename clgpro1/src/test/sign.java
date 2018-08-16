package test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
public class sign extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String reg=req.getParameter("reg");
	String pwd=req.getParameter("pwd");
	String bn=req.getParameter("bn");
	String hn=req.getParameter("hn");
	try{
	Connection con=DbCon.getCon();
	PreparedStatement ps=con.prepareStatement("insert into "+bn+" values(?,?,?)");
	//ps.setString(1,bn );
	ps.setString(1, reg);
	ps.setString(2, pwd);
	ps.setString(3, hn);
	
	 int rs=ps.executeUpdate();
	 if(rs==1)
		 pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no></head><body>SUCESSFULL<br> <a href=Input.html>PRESS HERE FOR LOGIN</a></body></html>");
	 else
		 pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no></head><body>TRY AGAIN</body></html>");
	
	}catch(Exception e){}
	}
}
