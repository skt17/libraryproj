package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
public class check extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String reg=req.getParameter("reg");
		String bn=req.getParameter("bn");
		String hn=req.getParameter("hn");
		try{
			Connection con=DbCon.getCon();
			PreparedStatement ps=con.prepareStatement("select password from "+bn+" where regd_no=? and hint=?");
			ps.setString(1,reg);
			ps.setString(2,hn);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				pw.println("PASSWORD="+rs.getString("password"));
			}
			else{
				pw.println("YOUR REGD NO AND HINT DIDN'T MATCH........");
				pw.println("CONTACT ADMINISTRATOR.......");
			}
		}catch(Exception e){}
 		
	}

}
