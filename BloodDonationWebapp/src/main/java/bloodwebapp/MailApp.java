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
 * Servlet implementation class MailApp
 */
public class MailApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MailApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String to = request.getParameter("toemail");
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mailstore","root","a7834804427");
		
	         
	    
		
			// TODO: handle exception
		
		
		if (to.equals("")) {
			out.print("<html>\r\n" + 
					"<style>\r\n" + 
					"div {\r\n" + 
					"    height: 400px;\r\n" + 
					"    background: linear-gradient(to bottom, #3366ff 0%, #ff99cc 100%)\r\n" + 
					"}\r\n" + 
					"</style>\r\n" + 
					"<body>\r\n" + 
					"\r\n" +
					
					"<div><h1 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">Email Address is Missing.. Please Try Again</h1><center>\r\n" + 
					"<h2 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">Click on the Image To Go To Home Page</h2><center><a href=\"index.jsp\">\r\n" + 
					"         <img alt=\"Back Button\" src=\"https://thumbs.dreamstime.com/z/home-sign-icon-main-page-button-navigation-home-sign-icon-main-page-button-navigation-symbol-blurred-gradient-design-element-vivid-118722668.jpg\"\r\n" + 
					"          width=40\" height=\"40\"></a></center></div></body>\r\n" + 
					"</html>\r\n" + 
					"");

			
		}else {
			out.print("<html>\r\n" + 
					"<style>\r\n" + 
					"div {\r\n" + 
					"    height: 400px;\r\n" + 
					"    background: linear-gradient(to bottom, #3366ff 0%, #ff99cc 100%)\r\n" + 
					"}\r\n" + 
					"</style>\r\n" + 
					"<body>\r\n" + 
					"\r\n" +
					
					"<div><h1 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">Thank You For Subscribing To Us &hearts;</h1><center>\r\n" + 
					"<h2 style=\"color:white ;text-align:center; border: 2px solid white; font-size:300%;\">Click on the Image To Go To Home Page</h2><center><a href=\"index.jsp\">\r\n" + 
					"         <img alt=\"Back Button\" src=\"https://thumbs.dreamstime.com/z/home-sign-icon-main-page-button-navigation-home-sign-icon-main-page-button-navigation-symbol-blurred-gradient-design-element-vivid-118722668.jpg\"\r\n" + 
					"          width=40\" height=\"40\"></a></center></div></body>\r\n" + 
					"</html>\r\n" + 
					"");		
		
			 Statement stmt = con.createStatement();
		     String insert_query =  "insert into emailaddresses values ('"+to+"')";
	        
	         int record = stmt.executeUpdate(insert_query);
	         
	         if(record == 1) {
	        	 System.out.print("Record Inserted Successfully");
	         }else {
	        	 System.out.print("Error in saving the record!!");
	         }
			
			
		
		 }
		 }
	    
         
		
		
		
		
		  catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
