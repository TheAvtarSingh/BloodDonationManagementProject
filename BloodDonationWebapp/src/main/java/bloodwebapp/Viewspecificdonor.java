package bloodwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Viewspecificdonor
 */
public class Viewspecificdonor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Viewspecificdonor() {
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
        String grp = request.getParameter("bloodgroup");
        String city = request.getParameter("city");
        out.println("<h1>Donor List that you can Use : </h1>");  
        try {
        		Class.forName("com.mysql.cj.jdbc.Driver");
	         
        		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maindatabases","root","a7834804427");
	         
        		Statement stmt = con.createStatement();
        		
        		String query = "SELECT * FROM donor where bgroup = '"+grp+"' and usedstatus = 'pending' and city = '"+city+"';";
        		ResultSet rs = stmt.executeQuery(query);
        		out.print("<html>\r\n" + 
        				"<style>\r\n" + 
        				"div {\r\n" + 
        				"    height: 400px;\r\n" + 
        				"    background: linear-gradient(to bottom, #ffffff 0%, #ffcccc 100%)\r\n" + 
        				"}\r\n" + 
        				"</style>"+
        				"<body>"+
        				"<div>");
        		out.print("<table border='1' width='100%'");  
    	        out.print("<tr><th>First Name</th>"
    	        			+ "<th>Last Name</th>"
    	        			+ "<th>Email</th>"
    	        			+ "<th>City</th>"
    	        			+ "<th>State</th>"
    	        			+ "<th>Phone Number</th>"
    	        			+ "<th>Username</th>"
    	        			+ "<th>Password</th>"
    	        			+ "<th>Blood Group</th>"
    	        			+ "<th>Disease</th>"
    	        			+ "<th>Gender</th>"
    	        			+ "<th>Age</th>"
    	        			+ "<th>Donation Status</th>"
    	        			+ "<th>Used Status</th>"
    	        			+ "<th>ID</th>"
        	        		
    	        		+ "</tr>");
        		while(rs.next()) {
        			 out.print("<tr>"
        			 				+"<td>"+rs.getString(1)+"</td>"
        			 				+"<td>"+rs.getString(2)+"</td>"
        			 				+"<td>"+rs.getString(3)+"</td>"
        			 				+"<td>"+rs.getString(4)+"</td>"
        			 				+"<td>"+rs.getString(5)+"</td>"
        			 				+"<td>"+rs.getInt(6)+"</td>"
                			 		+"<td>"+rs.getString(7)+"</td>"
                			 		+"<td>"+rs.getString(8)+"</td>"
                			 		+"<td>"+rs.getString(9)+"</td>"
                			 		+"<td>"+rs.getString(10)+"</td>"
                        			 		+"<td>"+rs.getString(11)+"</td>"
                        			 		+"<td>"+rs.getString(12)+"</td>"
                        			 				+"<td>"+rs.getString(13)+"</td>"
                        			 						+"<td>"+rs.getString(14)+"</td>"
                        			 								+"<td>"+rs.getString(15)+"</td>"
        			 				
        			 			+"</tr>"); 
        			 		  	        
        		}
        		out.print("<center>");
        		out.print("----------------------------------------------------------------------------");
        		out.print("<br>");
        		out.print("<a href=\"index.jsp\">Click Here To LogOut    </a></h1>");
        		out.print("<br>");
        		out.print("----------------------------------------------------------------------------");
        		out.print("<br>");
        		out.print("<a href=\"admindashboard.jsp\">Click Here To Go Back</a></h1>");
        		out.print("<br>");
        		out.print("----------------------------------------------------------------------------");
        		out.print("<br>");
        		out.print("<a href=\"updatelist.jsp\">Click Here To Update List </a></h1>");
        		out.print("<br>");
        		out.print("----------------------------------------------------------------------------");
        		out.print("<br>");
        		out.print("<a href=\"CenterDashboard.jsp\">Center Head ?? Click here </a></h1>");
        		out.print("<br>");
        		out.print("----------------------------------------------------------------------------");
        		out.print("<br>");
        		out.print("</center>");
        		out.print("<br>");
        		out.print("</div>\r\n" + 
        				"\r\n" + 
        				"</body>\r\n" + 
        				"</html>\r\n" + 
        				"");
        }catch(ClassNotFoundException e) {
        	e.printStackTrace();
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
