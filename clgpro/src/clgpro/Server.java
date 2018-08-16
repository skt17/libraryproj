package clgpro;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Server extends Thread {

	public static void main(String[] args) {

		Server s = new Server();
		s.start();
	}

	public void run() {
		ServerSocket ss = null;

		try {
			ss = new ServerSocket(7777);
		} catch (Exception e) {
		}
		while (true) {
			Connection con = null, con1 = null;
			Statement st = null, st2 = null;
			ResultSet rs = null, rs1 = null;
			Socket s = null;
			DataInputStream dis = null;
			DataOutputStream dout = null;
			try {
				s = ss.accept();
				dis = new DataInputStream(s.getInputStream());
				dout = new DataOutputStream(s.getOutputStream());

				String no1 = dis.readUTF();

				int no = Integer.valueOf(no1);
				if (no == 0) {
					try {
						String n = dis.readUTF();
						String pa = dis.readUTF();
						String b1 = dis.readUTF();
						String cse = "cse", civ = "civ", mec = "mec", ele = "ele";
						// String s1[]=new String[5];
						// String s2[]=new String[5];
						// String s3[]=new String[5];
						// String s4="";
						Class.forName("com.mysql.jdbc.Driver");

						con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");

						st2 = con1.createStatement();

						if (b1.equals(cse))
							rs1 = st2.executeQuery("select Password from cse where Regd_no='" + n + "'");
						else if (b1.equals(civ))
							rs1 = st2.executeQuery("select Password from civ where Regd_no='" + n + "'");
						else if (b1.equals(mec))
							rs1 = st2.executeQuery("select Password from mec where Regd_no='" + n + "'");
						else if (b1.equals(ele))
							rs1 = st2.executeQuery("select Password from ele where Regd_no='" + n + "'");

						rs1.next();
						String p = rs1.getString("Password");
						System.out.println(p);
						if (p.equals(pa)) {
							dout.writeUTF("1");
							dout.flush();
						} else {
							dout.writeUTF("0");
							dout.flush();

						}
					} catch (Exception e) {
						System.out.print(e);
					} finally {
						try {
							dis.close();
							dout.close();
							con1.close();

							s.close();
						} catch (Exception e) {
						}
					}
				}

				else if (no == 1) {
					try {
						String n = dis.readUTF();
						// String pa=dis.readUTF();
						String b1 = dis.readUTF();
						String cse = "cse", civ = "civ", mec = "mec", ele = "ele";
						String s1[] = new String[5];
						String s2[] = new String[5];
						String s3[] = new String[5];
						String s4 = "";
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clg", "root", "");

						st = con.createStatement();

						if (b1.equals(cse))
							rs = st.executeQuery(
									"select NAME,BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from cse where REGD_NO='"
											+ n + "'");
						else if (b1.equals(civ))
							rs = st.executeQuery(
									"select NAME,BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from civ where REGD_NO='"
											+ n + "'");
						else if (b1.equals(ele))
							rs = st.executeQuery(
									"select NAME,BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from ele where REGD_NO='"
											+ n + "'");
						else if (b1.equals(mec))
							rs = st.executeQuery(
									"select NAME,BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from mec where REGD_NO='"
											+ n + "'");

						while (rs.next()) {
							s4 = rs.getString("NAME");
							s1[0] = rs.getString("BOOK_1NO");
							s1[1] = rs.getString("BOOK_1NAME");
							s1[2] = rs.getString("AUTHOR_1");
							s1[3] = rs.getString("Book_1Idate");
							s2[0] = rs.getString("BOOK_2NO");
							s2[1] = rs.getString("BOOK_2NAME");
							s2[2] = rs.getString("AUTHOR_2");
							s2[3] = rs.getString("Book_2Idate");

							s3[0] = rs.getString("BOOK_3NO");
							s3[1] = rs.getString("BOOK_3NAME");
							s3[2] = rs.getString("AUTHOR_3");
							s3[3] = rs.getString("Book_3Idate");

						}
						int h = 0;
						int a = Integer.valueOf(s1[0]);
						int b = Integer.valueOf(s2[0]);
						int c = Integer.valueOf(s3[0]);
						if (a != 0)
							h = h + 1;
						if (b != 0)
							h = h + 1;
						if (c != 0)
							h = h + 1;

						dout.writeUTF(String.valueOf(h));
						dout.writeUTF(s4);

						if (a != 0) {
							dout.writeUTF(s1[0]);
							dout.flush();
							dout.writeUTF(s1[1]);
							dout.flush();
							dout.writeUTF(s1[2]);
							dout.flush();
							dout.writeUTF(s1[3]);
							dout.flush();

						}
						if (b != 0) {
							dout.writeUTF(s2[0]);
							dout.flush();
							dout.writeUTF(s2[1]);
							dout.flush();
							dout.writeUTF(s2[2]);
							dout.flush();
							dout.writeUTF(s2[3]);
							dout.flush();

						}
						if (c != 0) {
							dout.writeUTF(s3[0]);
							dout.flush();
							dout.writeUTF(s3[1]);
							dout.flush();
							dout.writeUTF(s3[2]);
							dout.flush();
							dout.writeUTF(s3[3]);
							dout.flush();
						}
					} catch (Exception e) {
					} finally {
						try {
							rs.close();
							st.close();
							con.close();
							dis.close();
							dout.close();

							s.close();
							// ss.close();
						} catch (Exception e) {
						}
					}
				} else if (no == 2) {
					try {
						System.out.print("Siku");

						String q = dis.readUTF();
						String st1 = "C:\\Users\\SIKU\\Desktop\\" + q + ".txt";
						File transferFile = new File(st1);
						byte[] bytearray = new byte[(int) transferFile.length()];
						int a1 = (int) transferFile.length();
						System.out.println(a1);
						String sm = String.valueOf(a1);
						dout.writeUTF(sm);
						int b = Integer.valueOf(dis.readUTF());
						if (b == 1) {
							FileInputStream fin = new FileInputStream(transferFile);
							BufferedInputStream bin = new BufferedInputStream(fin);
							bin.read(bytearray, 0, bytearray.length);
							OutputStream os = s.getOutputStream();
							System.out.println("Sending Files...");
							os.write(bytearray, 0, bytearray.length);
							os.flush();
							bin.close();
							// s.close();
							// ss.close();
							System.out.println("File transfer complete");
						} else if (b == 0) {
							System.out.print("ok");
						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							s.close();
							// ss.close();
							dis.close();
							dout.close();

						} catch (Exception e) {
						}
					}

				} else if (no == 3) {
					// dis=new DataInputStream(s.getInputStream());
					// dout=new DataOutputStream(s.getOutputStream());
					String rn = dis.readUTF();
					String hn = dis.readUTF();
					String bn = dis.readUTF();

					String h, pa = "";

					Class.forName("com.mysql.jdbc.Driver");

					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");

					st = con.createStatement();
					if (bn.equals("cse"))
						rs = st.executeQuery("select Hint from cse where Regd_no='" + rn + "'");
					else if (bn.equals("civ"))
						rs = st.executeQuery("select Hint from civ where Regd_no='" + rn + "'");
					else if (bn.equals("mec"))
						rs = st.executeQuery("select Hint from mec where Regd_no='" + rn + "'");
					else if (bn.equals("ele"))
						rs = st.executeQuery("select Hint from ele where Regd_no='" + rn + "'");

					rs.next();
					h = rs.getString("Hint");
					if (h.equals(hn)) {
						dout.writeUTF("1");
						pa = dis.readUTF();
						if (bn.equals("cse"))

							st.executeUpdate("Update cse SET Password='" + pa + "' where Regd_no='" + rn + "'");
						else if (bn.equals("civ"))
							st.executeUpdate("Update civ SET Password='" + pa + "' where Regd_no='" + rn + "'");
						else if (bn.equals("ele"))
							st.executeUpdate("Update ele SET Password='" + pa + "' where Regd_no='" + rn + "'");
						else if (bn.equals("mec"))
							st.executeUpdate("Update mec SET Password='" + pa + "' where Regd_no='" + rn + "'");

					} else {
						dout.writeUTF("0");
					}

				} else if (no == 4) {
					// dis=new DataInputStream(s.getInputStream());
					// dout=new DataOutputStream(s.getOutputStream());
					String rn = dis.readUTF();
					String p = dis.readUTF();
					String hn = dis.readUTF();
					String bn = dis.readUTF();
					try {
						Class.forName("com.mysql.jdbc.Driver");

						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/client", "root", "");

						st = con.createStatement();
						if (bn.equals("cse"))
							st.executeUpdate("insert into cse(Regd_no,Password,Hint) values('" + rn + "','" + p + "','"
									+ hn + "')");
						else if (bn.equals("civ"))
							st.executeUpdate("insert into civ(Regd_no,Password,Hint) values('" + rn + "','" + p + "','"
									+ hn + "')");
						else if (bn.equals("mec"))
							st.executeUpdate("insert into mec(Regd_no,Password,Hint) values('" + rn + "','" + p + "','"
									+ hn + "')");
						else if (bn.equals("ele"))
							st.executeUpdate("insert into ele(Regd_no,Password,Hint) values('" + rn + "','" + p + "','"
									+ hn + "')");
						dout.writeUTF("1");

					} catch (Exception e) {
						dout.writeUTF("0");

					}

				}

			}

			catch (Exception e) {
				System.out.println("111" + e);
				// try{ss=new ServerSocket(7777);}catch(Exception e1){}

			}

		}

	}
}
