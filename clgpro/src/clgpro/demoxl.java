package clgpro;
import java.awt.Desktop;


import java.io.*;
import java.sql.*;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.*;

public class demoxl {
	private static Workbook wb;
	private static Sheet sh;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static Row row;
	private static Cell cell;
	public static void main(String ...args){
		try{
			File f=new File("E:\\project\\Book2.xlsx");
			
			

			fis =new FileInputStream(f);
			wb=WorkbookFactory.create(fis);
			
	sh=wb.getSheet("Sheet1");
	int r=sh.getLastRowNum();
	String result="";
	while(true)
	{
	try{
	 result=sh.getRow(r).getCell(0).toString();
	 break;
	}catch(Exception e){r=r-1;}
	}
	System.out.println(r+"----"+result);
	BufferedReader br=new BufferedReader(new FileReader("E:\\project\\count.txt"));
	String ro=br.readLine();
	br.close();
	int i=Integer.parseInt(ro)+1;
//System.out.println(i+"--------"+r);
	if(i>r)
	{JOptionPane.showMessageDialog(null, " No NEW RECORD INSERTED");
	System.exit(0);

		}
	else{
Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");
	PreparedStatement ps=con.prepareStatement("insert into cse (Book_name,Author,Pub_name,Total_book,Avail_book) values (?,?,?,?,?)");
	String k=sh.getRow(1).getCell(16).toString();
	//float i=Float.valueOf(k);
//	int kk=(int)i;
//Object o=k;
String a="10";
	///System.out.println(i);
for (;i<=r;i++)
	{
			ps.setString(1,String.valueOf(sh.getRow(i).getCell(1)));
			ps.setString(2,String.valueOf(sh.getRow(i).getCell(2)));
			ps.setString(3,String.valueOf(sh.getRow(i).getCell(6)));
			ps.setInt(4,Integer.valueOf((int)Float.parseFloat(sh.getRow(i).getCell(16).toString())));
			ps.setInt(5,Integer.valueOf((int)Float.parseFloat(sh.getRow(i).getCell(16).toString())));
			
			
			ps.executeUpdate();
	//	System.out.print(sh.getRow(i).getCell(j)+"     ");
	}
	PrintWriter pw=new PrintWriter("E:\\project\\count.txt");
	pw.println(r);
	pw.close();
	JOptionPane.showMessageDialog(null, " UPDATED");
	
	}}
		catch(Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "NOT UPDATED");
			
			System.out.println("ss"+e);
		}
	}
}
