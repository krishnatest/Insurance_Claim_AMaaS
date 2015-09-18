<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insurance_Claim_Form</title>
<link rel="stylesheet" media="all" type="text/css"
	href="css/jquery-time-ui.css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-time-ui.min.js"></script>
<link rel="stylesheet" media="all" type="text/css"
	href="css/jquery-ui-timepicker-addon.css" />
<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>
<style>
body{font-family:"Arial"}
</style>
</head>
<body>
	<link rel='stylesheet' href='css/Insurance claim.css' type='text/css' />
	<img src="images/farmersheader.png">
	<br />
	<font color="red"><center>
			<!----<b>"Please fill all the fields. Items marked with an asterisk(*) are required fields"</b>-->
		</center></font>
	</div>
	<div class="etab" style="color: #c80000" value="">${errorMessage }</div>
	<input type="text" style="display: none;" name="error" id="error"
		value="${errorMessage }" />

	<form name="IClaim" action="ServerValidation" method="POST" id="IClaim">
		<div class="policySearch ui-corner-all">
			<h4>Personal Information</h4>
			<table>
				<tr>
					<td><span style="color: #ff0000">*</span><label>I am
							submitting claim as a</label></td>
					<td><select class="resized-selectbox" id="ClaimSubmit"
						name="ClaimSubmit">
							<option></option>
							<option>Witness</option>
							<option>Claimant</option>
							<option>Agent-Former</option>
							<option>Afent-Non-Former</option>
							<option>Insured</option>
					</select></td>
				</tr>
				<tr>
					<td><label>&nbsp;&nbsp;Policy Number</label></td>
					<td><input type="text" class="resized-textbox"
						name="PolicyNumber" id="PolicyNumber" value="${PolicyNumber}" />
					</td>
			</table>
		</div>
		
		<div class="policySearch ui-corner-all">
			<h4>Contact Information</h4>
			<table>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td><span style="color: #ff0000">*</span><label>First
							Name<span class="tab"></span>
					</label></td>
					<td><input type="text" class="resized-ctextbox" name="Fname"
						id="Fname" value="${Fname}" /></td>
					<td><span style="color: #ff0000">*</span><label>Last
							Name<span class="tab"></span>
					</label></td>
					<td><input type="text" class="resized-ctextbox" name="Lname"
						id="Lname" value="${Lname}" /></td>
				</tr>
				<tr>
					<td><span style="color: #ff0000">*</span><label>Street/Apt.Number<span
							class="tab"></span></label></td>
					<td><input type="text" class="resized-ctextbox"
						name="Aptnumber" id="Aptnumber" value="${Aptnumber}" /></td>
					<td><span style="color: #ff0000">*</span><label>City<span
							class="tab"></span></label></td>
					<td><input type="text" class="resized-ctextbox" name="City"
						id="City" /></td>
				</tr>
				<tr>
					<td><span style="color: #ff0000">*</span><label>State</label></td>
					<td><select class="resized-cselectbox" id="State" name="State">
							<option></option>
							<option>California</option>
							<option>Indiana</option>
							<option>New Mexico</option>
							<option>New York</option>
							<option>Washington</option>
					</select></td>
					<td><span style="color: #ff0000">*</span><label>Zipcode<span
							class="tab"></span></label></td>
					<td><input type="text" class="resized-ctextbox" name="Zipcode"
						id="Zipcode" value="${Zipcode}" /></td>
				</tr>
				<tr>
					<td><label>&nbsp;&nbsp;EMail Address<span class="tab"></span></
					</label></td>
					<td><input type="text" class="resized-ctextbox" name="Email"
						id="Email" value="${Email}" /></td>
					<td><label>Confirm Email<br>Address
					</label><span class="tab"></span></td>
					<td><input type="text" class="resized-ctextbox" name="CEmail"
						id="CEmail" value="${CEmail}" /></td>
				<tr>
					<td><label>Do you prefer email<br>Correspondence<span
							class="tab"></span></label></td>
					<td><input type="radio" name="emailp" id="Y" value="Yes" />Yes&nbsp;<input
						type="radio" name="emailp" id="N" value="No" />No</td>
					<td><label>Preferred Language</label></td>
					<td><select class="resized-cselectbox"
						name="PreferredLanguage" id="PreferredLanguage">
							<option></option>
							<option>English</option>
							<option>Spanish</option>
							<option>French</option>
							<option>German</option>
							<option>Japanese</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td><label>Interpreter Needed</label></td>
					<td><input type="hidden" name="Ineed" value="No" /><input
						type="checkbox" name="Ineed" value="Yes" /></td>
				</tr>
				<tr>
					<td colspan="2" style="vertical-align: top">
						<fieldset class="fld">
							<legend>
								<span style="color: #ff0000">*</span>Phone Contacts
							</legend>
							<table style="width: 100px;">
								<tr>
									<td></td>
									<td></td>
									<td><label>&nbsp;Best&nbsp;Phone</label></td>
								</tr>
								<tr>
									<td><label><span class="pttab"></span>Home&nbsp;Phone</label></td>
									<span class="pttab"></span>
									<td><input type="text" class="resized-ptextbox"
										name="Hphone" id="Hp" value="${Hphone}" /></td>
									<td><span class="ptab"></span><input type="radio"
										name="phc" id="H" value="HomePhone" /></td>
								</tr>
								<tr>
									<td><label>Work&nbsp;Phone</label></td>
									<td><input type="text" class="resized-ptextbox"
										name="Wphone" id="Wp" value="${Wphone}" /></td>
									<td><span class="ptab"></span><input type="radio"
										name="phc" id="W" value="WorkPhone" /></td>
								</tr>
								<tr>
									<td><label>Cell&nbsp;Phone</label></td>
									<td><input type="text" class="resized-ptextbox"
										name="Cphone" id="Cp" value="${Cphone}" /></td>
									<td><span class="ptab"></span><input type="radio"
										name="phc" id="C" value="CellPhone" /></td>
								</tr>
								<tr>
									<td><label>Alternate&nbsp;Phone</label></td>
									<td><input type="text" class="resized-ptextbox"
										name="Alphone" id="Ap" value="${Alphone}" /></td>
									<td><span class="ptab"></span><input type="radio"
										name="phc" id="A" value="AlternatePhone" /></td>
								</tr>
							</table>
						</fieldset>
					</td>
				</tr>
			</table>
		</div>
		<div class="policySearch ui-corner-all">
			<h4>Loss Information</h4>
			<table>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td><span style="color: #ff0000">*</span><label>Loss&nbsp;Date<span
							class="dttab"></span></label></td>
					<td><input type="text" id="datepicker" name="datepicker" /></td>
					<td><span style="color: #ff0000">*</span><label>Loss&nbsp;Time<span
							class="ttab"></span></label></td>
					<td><select class="resized-selectbox" name="Ltime" id="Ltime">
							<option></option>
							<option>00:00</option>
							<option>00:30</option>
							<option>01:00</option>
							<option>01:30</option>
							<option>02:00</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
				</tr>
			  

	  <!--Loss Description Field AddDemo- Appworks Demo -----------------begin---->
		
		 		 <tr style="background-color:yellow">

					<td><span style="color: #ff0000">*</span><label>Loss&nbsp;Description<span
							class="dttab"></span></label></td>
					<td><textarea rows="4" cols="30" name="Ldesc" id="Ldesc">${Ldesc}</textarea></td>
				</tr>
							 
      <!--Loss Description Field Demo - Appworks Demo --- end -->
		
		
				<tr>
					<td><label>&nbsp;&nbsp;Loss&nbsp;Location&nbsp;Address<span
							class="tab"></span></label></td>
					<td><input type="text" class="resized-ctextbox"
						name="Laddress" value="${Laddress}" /></td>
					<td><label>&nbsp;&nbsp;City<span class="ttab"></span></label></td>
					<td><input type="text" class="resized-ctextbox" name="Lcity"
						value="${Lcity}" /></td>
				</tr>
				<tr>
					<td><span style="color: #ff0000">*</span><label>State</label></td>
					<td><select class="resized-cselectbox" name="LState"
						id="LState">
							<option></option>
							<option>California</option>
							<option>Indiana</option>
							<option>New Mexico</option>
							<option>New York</option>
							<option>Washington</option>
					</select></td>
					<td><label>&nbsp;&nbsp;Zipcode<span class="ttab"></span></label></td>
					<td><input type="text" class="resized-ctextbox"
						name="Lzipcode" value="${Lzipcode}" /></td>
				</tr>
				<tr>
					<td><span style="color: #ff0000">*</span><label>Country</label></td>
					<td><select class="resized-cselectbox" name="LCountry"
						id="LCountry">
							<option></option>
							<option>Canada</option>
							<option>USA</option>
					</select></td>
			</table>
		</div>
		<center>
			<input type="submit" title="submit" value="submit" id="submit">
		</center>
	</form>
</body>
</html>
