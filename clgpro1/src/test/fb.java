package test;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
public class fb extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException
{
	try{
		PrintWriter pw=res.getWriter();
	
	res.setContentType("text/html");
	HttpSession hs=req.getSession();
	String s=(String)hs.getAttribute("reg");
	File f=new File("E:\\project\\abc.doc");
	f.setWritable(true);
	BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
	bw.write("------"+s+"-----");
	bw.newLine();
	
	bw.write(req.getParameter("feedback"));
	bw.newLine();
	bw.write("--------------------");
	bw.newLine();
	f.setWritable(false);
	RequestDispatcher rd1=req.getRequestDispatcher("p2");
	rd1.include(req,res);
	bw.close();
	pw.close();
	
	
	}catch(IOException e){
		System.out.println(e);
	}
	}
}
