package bloodwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateUserOwn
 */
public class UpdateUserOwn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserOwn() {
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
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        String id = request.getParameter("id");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String phnum = request.getParameter("phnumber");
        String uname = request.getParameter("uname");
        String password = request.getParameter("password");
        String bgroup = request.getParameter("bgroup");
        String disease = request.getParameter("disease");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        
        try {
        		Class.forName("com.mysql.cj.jdbc.Driver");
	         
        		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maindatabases","root","a7834804427");
	         
        		Statement stmt = con.createStatement();
        		
        		String query = "update donor set firstname = '"+fname+"',lastname = '"+lname+"',email = '"+email+"',city = '"+city+"',state = '"+state+"',phnumber = '"+phnum+"',username = '"+uname+"',password = '"+password+"',bgroup = '"+bgroup+"',disease = '"+disease+"',gender = '"+gender+"',age = '"+age+"' where id = '"+id+"';";
        		 int status=stmt.executeUpdate(query);  
        		
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
     					"<h3 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">Click on the Image To Go Back</h3><center><a href=\"UserDashboard.jsp\">\r\n" + 
     					"         <img alt=\"Back Button\" src=\"https://png.pngtree.com/png-vector/20190120/ourmid/pngtree-forward-vector-icon-png-image_470299.jpg\"\r\n" + 
     					"          width=40\" height=\"40\"></a></center></div></body>\r\n" + 
     					"</html>\r\n" + 
     					"");	
        }catch(ClassNotFoundException e) {
        	e.printStackTrace();
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
					"<h3 style=\"color:white ; border: 2px solid white; font-size:100%;\">Click on the Image To Go Back</h3><a href=\"UserDashboard.jsp\">\r\n" + 
					"         <img alt=\"Back Button\" src=\"https://key0.cc/images/preview/61345_68efbf823f581ee5c8134a131f0e43d0.png" + 
					"          width=40\" height=\"40\"></a>\r\n" + 
					"<h4 style=\"color:white ; border: 2px solid white; font-size:100%;\">Click on the Image To Go To Home Page</h4><center><a href=\"index.jsp\">\r\n" + 
					"         <img alt=\"Back Button\" src=\"https://thumbs.dreamstime.com/z/home-sign-icon-main-page-button-navigation-home-sign-icon-main-page-button-navigation-symbol-blurred-gradient-design-element-vivid-118722668.jpg\"\r\n" + 
					"          width=40\" height=\"40\"></a></center></div></body></html>\r\n" + 
					"\r\n" + 
					"");
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	}

}
