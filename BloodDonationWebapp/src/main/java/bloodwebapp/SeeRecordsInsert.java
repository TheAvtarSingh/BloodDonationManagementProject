package bloodwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SeeRecordsInsert
 */
public class SeeRecordsInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeeRecordsInsert() {
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
		
String number = request.getParameter("phnumber");
		String name= request.getParameter("uname");
		String pass = request.getParameter("password");
		System.out.println("You have Entered : ");
		System.out.println("Number : "+number);
		System.out.println("Username : "+name);
		System.out.println("Password : "+pass);
	int min = 100;
	int max = 999;
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int id = (int)(Math.random()*(max-min+1)+min);  
		System.out.println("Id of User is : "+id);  
	
		String result = "Data entered Sucessfully";
		String sqlquery = "insert into seerecordsauth values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sqlquery);
			ps.setInt(1, id);
			ps.setString(2, number);
			ps.setString(3,name);
			ps.setString(4, pass);
			
			ps.executeUpdate();
			System.out.println(result);
			out.print("<html>\r\n" + 
					"<style>\r\n" + 
					"div {\r\n" + 
					"    height: 400px;\r\n" + 
					"    background: linear-gradient(to bottom, #3366ff 0%, #ff99cc 100%)\r\n" + 
					"}\r\n" + 
					"</style>\r\n" + 
					"<body>\r\n" + 
					"\r\n" +
					
					"<div><h1 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">------- Data Saved SuccessFully -------- </h1><center>\r\n" + 
					"<h2 style=\\\"color:white ;text-align:center; border: 2px solid white; font-size:500%;\\\"></h2><center> "+
					"<h3 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">Click on the Image To Login</h3><center><a href=\"SeeRecords.jsp\">\r\n" + 
					"         <img alt=\"Back Button\" src=\"https://png.pngtree.com/png-vector/20190120/ourmid/pngtree-forward-vector-icon-png-image_470299.jpg\"\r\n" + 
					"          width=40\" height=\"40\"></a></center></div></body>\r\n" + 
					"</html>\r\n" + 
					"");	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered Sucessfully";
			System.out.println(result);
			out.print("<html>\r\n" + 
					"<style>\r\n" + 
					"div {\r\n" + 
					"    height: 400px;\r\n" + 
					"    background: linear-gradient(to bottom, #3366ff 0%, #ff99cc 100%)\r\n" + 
					"}\r\n" + 
					"</style>\r\n" + 
					"<body>\r\n" + 
					"\r\n" +
					
					"<div><h1 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">\"\"------- Not Able To Save Data -------- \"</h1><center>\r\n" + 
					"<h2 style=\\\"color:white ;text-align:center; border: 2px solid white; font-size:`100%;\\\">Please Try Again </h2>"+
					"<h3 style=\"color:white ; border: 2px solid white; font-size:100%;\">Click on the Image To Go Back</h3><a href=\"SeeRecords.jsp\">\r\n" + 
					"         <img alt=\"Back Button\" src=\"https://key0.cc/images/preview/61345_68efbf823f581ee5c8134a131f0e43d0.png" + 
					"          width=40\" height=\"40\"></a>\r\n" + 
					"<h4 style=\"color:white ; border: 2px solid white; font-size:100%;\">Click on the Image To Go To Home Page</h4><center><a href=\"index.jsp\">\r\n" + 
					"         <img alt=\"Back Button\" src=\"https://thumbs.dreamstime.com/z/home-sign-icon-main-page-button-navigation-home-sign-icon-main-page-button-navigation-symbol-blurred-gradient-design-element-vivid-118722668.jpg\"\r\n" + 
					"          width=40\" height=\"40\"></a></center></div></body></html>\r\n" + 
					"\r\n" + 
					"");
		}
	} catch (Exception e) {
	// TODO: handle exception
}
	}

}
