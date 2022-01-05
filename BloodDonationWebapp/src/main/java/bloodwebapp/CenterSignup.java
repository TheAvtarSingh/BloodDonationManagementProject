package bloodwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CenterSignup
 */
public class CenterSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CenterSignup() {
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
			String url = "jdbc:mysql://localhost/centerdb";
			Connection con = DriverManager.getConnection(url,username,password);
			  Statement stmt = con.createStatement();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
	String name = request.getParameter("name");
			String uname= request.getParameter("uname");
			String pass = request.getParameter("password");
			System.out.println("You have Entered : ");
			System.out.println("Name : "+name);
			System.out.println("Username : "+uname);
			System.out.println("Password : "+pass);
		int min = 100;
		int max = 999;
			System.out.println("Random value of type int between "+min+" to "+max+ ":");  
			int id = (int)(Math.random()*(max-min+1)+min);  
			System.out.println("Id of User is : "+id);  
		
			String result = "Data entered Sucessfully";
			String sqlquery = "insert into centerlogin values(?,?,?,?)";
			try {
				PreparedStatement ps = con.prepareStatement(sqlquery);
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3,uname);
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
						
						"<div><h1 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">\"\"------- Data Saved Sucessfully -------- \"</h1><center>\r\n" + 
						"<h2 style=\\\"color:white ;text-align:center; border: 2px solid white; font-size:`100%;\\\"> </h2>"+
						"<h3 style=\"color:white ; border: 2px solid white; font-size:100%;\">Click on the Image To Go Back</h3><a href=\"admindashboard.jsp\">\r\n" + 
						"         <img alt=\"Back Button\" src=\"https://key0.cc/images/preview/61345_68efbf823f581ee5c8134a131f0e43d0.png" + 
						"          width=40\" height=\"40\"></a>\r\n" + 
						"<h4 style=\"color:white ; border: 2px solid white; font-size:100%;\">Click on the Image To Go To Home Page</h4><center><a href=\"index.jsp\">\r\n" + 
						"         <img alt=\"Back Button\" src=\"https://thumbs.dreamstime.com/z/home-sign-icon-main-page-button-navigation-home-sign-icon-main-page-button-navigation-symbol-blurred-gradient-design-element-vivid-118722668.jpg\"\r\n" + 
						"          width=40\" height=\"40\"></a></center></body></html>\r\n" + 
						"<h5 style=\"color:white ; border: 2px solid white; font-size:100%;\">Click on the Login as Center Head</h5><center><a href=\"CenterLogin.jsp\">\r\n" + 
						"         <img alt=\"Center Login\" src=\"https://png.pngtree.com/png-vector/20190425/ourlarge/pngtree-vector-home-icon-png-image_991177.jpg\"\r\n" + 
						"          width=40\" height=\"40\"></a></center></div></body></html>\r\n" + 
						"\r\n" + 
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
						"<h3 style=\"color:white ; border: 2px solid white; font-size:100%;\">Click on the Image To Go Back</h3><a href=\"admindashboard.jsp\">\r\n" + 
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
