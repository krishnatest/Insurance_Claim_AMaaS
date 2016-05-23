import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServerValidation
 */
@WebServlet("/ServerValidation")
public class ServerValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServerValidation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String ClaimSubmit = request.getParameter("ClaimSubmit");
		String PolicyNumber = request.getParameter("PolicyNumber");
		String Fname = request.getParameter("Fname");
		String Lname = request.getParameter("Lname");
		String Aptnumber = request.getParameter("Aptnumber");
		String City = request.getParameter("City");
		String State = request.getParameter("State");
		String Zipcode = request.getParameter("Zipcode");
		String Email = request.getParameter("Email");
		String CEmail = request.getParameter("CEmail");
		String Hphone = request.getParameter("Hphone");
		String Wphone = request.getParameter("Wphone");
		String Cphone = request.getParameter("Cphone");
		String Alphone = request.getParameter("Alphone");
		String datepicker = request.getParameter("datepicker");
		String Ltime = request.getParameter("Ltime");
		String Ldesc = request.getParameter("Ldesc");
		String Laddress = request.getParameter("Laddress");
		String Lcity = request.getParameter("Lcity");
		String Lzipcode = request.getParameter("Lzipcode");
		String LState = request.getParameter("LState");
		String LCountry = request.getParameter("LCountry");

		String error = "";

		boolean result = true;

		//AppWorks Logical Error Introduce
		//if (ClaimSubmit == "") {
			if (ClaimSubmit.equals("")) {
			error += "Please Select the ClaimSubmit<br/>";
			result = false;

		}

		if (Fname.equals("")) {
			error += "Please enter Firstname<br/>";
			result = false;
		}

		if (Lname.equals("")) {
			error += "Please enter Lastname<br/>";
			result = false;
		}
		if (Aptnumber.equals("")) {
			error += "Please enter the Aptnumber<br/>";
			result = false;

		}
		if (City.equals("")) {
			error += "Please enter the City<br/>";
			result = false;
		}
		if (State.equals("")) {
			error += "Please select the State<br/>";
			result = false;
		}
		if (Zipcode.equals("")) {
			error += "Please enter the zipcode<br/>";
			result = false;
		}
		if (Aptnumber.equals("")) {
			error += "Please enter the Aptnumber<br/>";
			result = false;

		}

		if (Hphone.equals("")) {
			error += "Please enter the HomePhoneNumber<br/>";
			result = false;
		}
		if (Wphone.equals("")) {
			error += "Please enter the WorkPhoneNumber<br/>";
			result = false;
		}
		if (Cphone.equals("")) {
			error += "Please enter the CPhoneNumber<br/>";
			result = false;
		}
		if (Alphone.equals("")) {
			error += "Please enter the AlternatePhoneNumber<br/>";
			result = false;
		}
		if (datepicker.equals("")) {
			error += "Please enter the LossDate<br/>";
			result = false;
		}
		if (Ltime.equals("")) {
			error += "Please enter the LossTime<br/>";
			result = false;
		}
		if (Ldesc.equals("")) {
			error += "Please Describe the Loss Description<br/>";
			result = false;
		}

		if (LState.equals("")) {
			error += "Please select the LossState<br/>";
			result = false;
		}
		if (LCountry.equals("")) {
			error += "Please select the LossCountry<br/>";
			result = false;
		}
		if (result) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Submited Successfully');");
			out.println("location='Insurance_Claim.jsp';");
			out.println("</script>");
		} else {
			request.setAttribute("errorMessage", error);
			request.setAttribute("PolicyNumber", PolicyNumber);
			request.setAttribute("Fname", Fname);
			request.setAttribute("Lname", Lname);
			request.setAttribute("Aptnumber", Aptnumber);
			request.setAttribute("City", City);
			request.setAttribute("Zipcode", Zipcode);
			request.setAttribute("Email", Email);
			request.setAttribute("CEmail", CEmail);
			request.setAttribute("Hphone", Hphone);
			request.setAttribute("Wphone", Wphone);
			request.setAttribute("Cphone", Cphone);
			request.setAttribute("Alphone", Alphone);
			request.setAttribute("Ldesc", Ldesc);
			request.setAttribute("Laddress", Laddress);
			request.setAttribute("Lcity", Lcity);
			request.setAttribute("Lzipcode", Lzipcode);
			request.getRequestDispatcher("/Insurance_Claim.jsp").forward(
					request, response);
		}

	}

}
