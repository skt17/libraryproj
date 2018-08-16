package test;
import java.io.*;





import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;

public class part2 extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	HttpSession hs=req.getSession();
	HttpSession hs1=req.getSession();
	HttpSession hs2=req.getSession();
	
	String rn=(String)hs.getAttribute("reg");
	String pwd=(String)hs1.getAttribute("pwd");
	
	String bn=(String)hs2.getAttribute("bn");

//	String rn=req.getParameter("reg");
	//String bn=req.getParameter("bn");
	//String pwd=req.getParameter("pwd");
//	pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no></head><body><a href=p3>HISTORY</a></body></html>");
//	pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no></head><body><a href=out>LOGOUT</a></body></html>");

	 pw.println("<html><head>"
		+"	 <meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no>	"		
	+"<style type=text/css>"
	
+".topnav { background-color: #333; overflow: hidden;}"
+".topnav a {float: left;display: block;color: #f2f2f2;text-align: center;padding: 14px 16px;text-decoration: none;font-size: 17px;}"
+".topnav a:hover {background-color: #ddd;color: black;}"
+".active {background-color: #4CAF50;color: white;}"
+".topnav .icon {display: none;}"
 +".topnav.responsive a {"
   +" float: none;"
   +" display: block;"
    +"text-align: left;"
    +"  }"
    +"}"
+"</style>"

	+"<link rel=stylesheet href=https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css>"
	+"<script>"
		+"function myFunction() {	var x = document.getElementById(myTopnav);if (x.className === topnav) {	x.className +=  responsive;"
    	+"} else {"
      +"	x.className = topnav;}}	</script></head>"
+"<body>"
	+"<div class=topnav id=myTopnav>"
 		+"<a href=# class=active>Home</a>"
  		+"<a href=p3>History</a>"
  		+"<a href=changep.html>Change Password</a>"
  		+"<a href=feedback.html>Feedback</a>"
  		+"<a href=out>Log Out</a>"
  		+"<a href=javascript:void(0); class=icon onclick=myFunction()>"
    	+"<i class=fa fa-bars></i>"
  		+"</a>"
	+"</div>"+
"<body></html>");
	 
Connection con=null;
String b1=null,b2=null,b3=null;

	try{
		
		Class.forName("com.mysql.jdbc.Driver");	
		 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
		//con=DbCon.getCon();
		PreparedStatement ps=null;
				ps=con.prepareStatement("select name,book_1no,book_2no,book_3no from "+bn+" where regd_no=?");
			ps.setString(1,rn);
			String n=null;
			ResultSet rs=null;
					rs=ps.executeQuery();
			while(rs.next())
			{
				n=rs.getString(1);
				b1=rs.getString(2);
				b2=rs.getString(3);
				b3=rs.getString(4);
				
			}	
			//System.out.println(b1+"..."+b2+"....."+"..."+b3+".......");
			pw.println("<br>regdno="+rn);
			pw.println("<br>name="+n);
			if((b1.equals("0")) && (b2.equals("0")) && (b3.equals("0")))
					{
				pw.println("<br><b>YOU NOT ISSUE ANY BOOK");
					}
			else{
				pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no>"

				+ "<style>table,th,td{border: 1px solid black;border-collapse: collapse;}</style></head><body><table><tr><th>BOOKNO</th><th>BOOKNAME</th></tr>");
			if(!b1.equals("0"))
			{
	 ps=con.prepareStatement("select book_1no,book_1name from "+bn+" where regd_no=?");
	 ps.setString(1,rn);
	 rs=ps.executeQuery();
		 rs.next();
		 
		 pw.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td></tr>");
			}
			if(!b2.equals("0"))
			{
	 ps=con.prepareStatement("select book_2no,book_2name from "+bn+" where regd_no=?");
	 ps.setString(1,rn);
	 rs=ps.executeQuery();
		
		 rs.next();
		 
		 pw.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td></tr>");
			}
			if(!b3.equals("0"))
			{
	 ps=con.prepareStatement("select book_3no,book_3name from "+bn+" where regd_no=?");
	 ps.setString(1,rn);
	 rs=ps.executeQuery();
		
		 rs.next();
		 
		 pw.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td></tr>");
			}	
			pw.println("</table></body></html>");
					}
			
	/*
	 * PreparedStatement ps=con.prepareStatement("select regd_no,name,book_1no,book_1name,book_2no,book_2name,book_3no,book_3name from "+bn+" where regd_no=?");
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
		
	}*/
	info.rn=rn;
	//pw.println("kkk"+rn);
	
	
	}
catch(Exception e){
	System.out.println("cc"+e);

	e.printStackTrace();

}
finally{
	try{con.close();}
	catch(Exception e)
	{}
}
	
	try{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\SIKU\\Desktop\\message.txt"));
		String s=br.readLine();
		if(s.equals("")){}
		else{
			pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no></head><body>"
					+"<marquee><h1><b style=color:red>'"+s+"'</b></marquee</body></html>");

		}
		br.close();
		
	}
	catch(Exception e)
	{
		System.out.println(e);
		
	}


}
}
