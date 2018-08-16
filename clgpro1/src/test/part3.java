package test;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.util.regex.*;
public class part3 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
	String rn=info.rn;
	HttpSession hs=req.getSession();
HttpSession hs1=req.getSession();
String reg=(String)hs.getAttribute("reg");
String pwd=(String)hs1.getAttribute("pwd");

if(!reg.equals("")&& !pwd.equals(""))
{	
	pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no></head>"
			+ "<body><p>                <a href=out>LOGOUT</a></p></body></html>");

	String loc="G:\\New folder\\"+rn+".txt";
	File f=new File(loc);
	BufferedReader br=new BufferedReader(new FileReader(f));
	String s=br.readLine();
	pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no><style>table,th,td{border: 1px solid black;}</style></head><body><table><tr><th>Acc no</th><th>BOOK NAME</th><th>ISSUE DT</th><th>RETURN DT</th><th>FINE</th></tr>");
	
	while(s!=null)
	{
		Pattern p=Pattern.compile("[\\s]+");
		String m[]=p.split(s);
		int l=m.length;
		int n=l-5;
		int i=1;
		String str="";
		if(n==0){
			pw.println("<tr>");
		for(String s1:m)
			pw.println("<td>"+s1+"</td>");}
		else{
			pw.println("<tr><td>"+m[0]+"</td>");
			
			for(i=1;i<=n+1;i++)
			{
				str=str+m[i];
			}
			pw.println("<td>"+str+"</td>");
			for(int j=i;j<m.length;j++)
				pw.println("<td>"+m[j]+"</td>");
					
		}
		
		pw.println("</tr>");
		
		s=br.readLine();
	}
	pw.println("</body></html>");
	
	br.close();
	}
else{
	pw.println("<html><head><meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no></head><body<br>YOU FIRST LOGIN..<br></body></html>");
	RequestDispatcher rd=req.getRequestDispatcher("Input.html");
	rd.include(req,res);
	}
	}

}
