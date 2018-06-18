package test;
import javax.servlet.*;

import java.sql.*;
import java.io.*;
public class part1 extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String reg=req.getParameter("reg");
	String pwd=req.getParameter("pwd");
	String bn=req.getParameter("bn");
//	System.out.println(bn);
	/*for(int i=0;i<3;i++)
	{
		bn=bn+reg.charAt(i);
	}
	for( int i=3;i<13;i++)
		rn=rn+reg.charAt(i);*/
	try{
	Connection con=DbCon.getCon();
	/*Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select hint from cse where regd_no='"+reg+"' and password='"+pwd+"'");
	*/
	PreparedStatement ps=con.prepareStatement("select hint from "+bn+" where regd_no=? and password=?");
	//ps.setString(1,bn );
	ps.setString(1, reg);
	ps.setString(2, pwd);
	
	ResultSet rs=ps.executeQuery();
	
	if(rs.next()){
	RequestDispatcher rd=req.getRequestDispatcher("p2");
	rd.forward(req,res);
	}
	else{
		RequestDispatcher rd=req.getRequestDispatcher("Input.html");
		pw.println(" <br><b>your reg no & password won't match");
		
		rd.include(req, res);
		pw.println(" <br><b>your reg no & password won't match");
	}
	}catch(Exception e){
	e.printStackTrace();
	}
	}

}
