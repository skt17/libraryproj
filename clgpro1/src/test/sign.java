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
		 pw.println("sucsssful");
	 else
		 pw.println("try again");
	
	}catch(Exception e){}
	}
}
