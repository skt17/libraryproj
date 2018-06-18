package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class part2 extends GenericServlet {
public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String rn=req.getParameter("reg");
	String bn=req.getParameter("bn");
	String pwd=req.getParameter("pwd");
	pw.println("<html><head></head><body><a href=p3>HISTORY</a></body></html>");
Connection con=null;
	try{
		
		Class.forName("com.mysql.jdbc.Driver");	
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
	PreparedStatement ps=con.prepareStatement("select regd_no,name,book_1no,book_1name,book_2no,book_2name,book_3no,book_3name from "+bn+" where regd_no=?");
	ps.setString(1,rn);
	//pw.println("<table>");
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		pw.println("<br>regdno="+rs.getString("regd_no"));
		pw.println("<br>name="+rs.getString("name"));
		pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no>"

				+ "<style>table, td{border: 1px solid black;}</style></head><body><table>"
				+ "<tr><td>'"+rs.getString("book_1no")+"'</td>"
						+ "<td>'"+rs.getString("book_1name")+"'</td>"
								+ "</tr><tr><td>'"+rs.getString("book_2no")+"'</td>"
										+ "<td>'"+rs.getString("book_2name")+"'</td></tr></table></body></html>");
		
	}
	info.rn=rn;
	pw.println("kkk"+rn);
	
	
	}
catch(Exception e){e.printStackTrace();}
finally{
	try{con.close();}
	catch(Exception e)
	{}
}
}
}
