package bloodwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SeeRecordsValidate
 */
public class SeeRecordsValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeeRecordsValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		try {
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String username = "root";
		String password = "a7834804427";
		String url = "jdbc:mysql://localhost/seerecords";
		Connection con = DriverManager.getConnection(url,username,password);
		  Statement stmt = con.createStatement();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		

		String name= request.getParameter("uname");
		String pass = request.getParameter("password");
		System.out.println("You have Entered : ");
		System.out.println("Username : "+name);
		System.out.println("Password : "+pass);
		
		System.out.println("------- Verifying Credentials -------- ");
		String readQuery = "select *from seerecordsauth";
		String countQuery = "select count(*) from seerecordsauth";
		ResultSet rs = stmt.executeQuery(countQuery);
		rs.next();
		int count = rs.getInt("count(*)");
		//Moving the cursor to the last row
		
ResultSet records1 = stmt.executeQuery(readQuery);
String result = "";
String feedback = "";
while(records1.next()) {
	String email = records1.getString(3);
	String pwd = records1.getString(4);
//	System.out.println(email+" "+password);
if(name.equals(email) && pass.equals(pwd)){
	result = "Verified !!";
		System.out.println(result);
		
		try {
			for(int i=0;i<10;i++) {
				System.out.print(" ^ ");
				Thread.sleep(500);
				System.out.print(" * ");
				if(i==5) {
					System.out.println();
				}
			}
			out.print("<html>\r\n" + 
					"<style>\r\n" + 
					"div {\r\n" + 
					"    height: 400px;\r\n" + 
					"    background: linear-gradient(to bottom, #3366ff 0%, #ff99cc 100%)\r\n" + 
					"}\r\n" + 
					"</style>\r\n" + 
					"<body>\r\n" + 
					"\r\n" +
					
					"<div><h1 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">------- Verifying Credentials -------- </h1><center>\r\n" + 
					"<h2 style=\\\"color:white ;text-align:center; border: 2px solid white; font-size:500%;\\\">User Found in Our DataBase . Now You can Proceed Further</h2><center> "+
					"<h3 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">Click on the Image To Proceed Furthur</h3><center><a href=\"SeeRecordsData\">\r\n" + 
					"         <img alt=\"Back Button\" src=\"https://png.pngtree.com/png-vector/20190120/ourmid/pngtree-forward-vector-icon-png-image_470299.jpg\"\r\n" + 
					"          width=40\" height=\"40\"></a></center></div></body>\r\n" + 
					"</html>\r\n" + 
					"");	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		feedback = "Redirecting To Dashboard";
		System.out.println(feedback);
		
//		response.sendRedirect("welcome.jsp");
		break;
		
		
	}else {count--;
	if (count==0) {
		System.out.println("Invalid Credentials !!");
		result = "Invalid Credentials !!";
		System.out.println("");
//		response.sendRedirect("index.jsp");
		
		out.print("<html>\r\n" + 
				"<style>\r\n" + 
				"div {\r\n" + 
				"    height: 400px;\r\n" + 
				"    background: linear-gradient(to bottom, #3366ff 0%, #ff99cc 100%)\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"<body>\r\n" + 
				"\r\n" +
				
				"<div><h1 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">\"\"------- Verifying Credentials -------- \"</h1><center>\r\n" + 
				"<h2 style=\\\"color:white ;text-align:center; border: 2px solid white; font-size:`100%;\\\">The Username or Password You have is Seems to be Wrong...Please Try Again </h2>"+
				"<h3 style=\"color:white ; border: 2px solid white; font-size:100%;\">Click on the Image To Go Back</h3><a href=\"SeeRecords.jsp\">\r\n" + 
				"         <img alt=\"Back Button\" src=\"https://key0.cc/images/preview/61345_68efbf823f581ee5c8134a131f0e43d0.png" + 
				"          width=40\" height=\"40\"></a>\r\n" + 
				"<h4 style=\"color:white ; border: 2px solid white; font-size:100%;\">Click on the Image To Go To Home Page</h4><center><a href=\"index.jsp\">\r\n" + 
				"         <img alt=\"Back Button\" src=\"https://thumbs.dreamstime.com/z/home-sign-icon-main-page-button-navigation-home-sign-icon-main-page-button-navigation-symbol-blurred-gradient-design-element-vivid-118722668.jpg\"\r\n" + 
				"          width=40\" height=\"40\"></a></center></div></body></html>\r\n" + 
				"\r\n" + 
				"");
		break;
	}}}} catch (Exception e) {
	// TODO: handle exception
}
	}

}
