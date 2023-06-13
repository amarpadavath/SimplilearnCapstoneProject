package stepdefinition;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectivity.DBConnection;
import connectivity.DBConnectivityTransaction;
import connectivity.EmployeeInsertionFix;
import connectivity.GetDatainDataBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BatabaseStepDefinition {
	
	
	
	
	

@Given("User connected database")
public void user_connected_database() throws Exception, SQLException {

	DBConnectivityTransaction.getConnection();

	
	EmployeeInsertionFix.transactin();
}

@Given("User1 connected database")
public void user1_connected_database() throws Exception, SQLException {

	GetDatainDataBase d = new GetDatainDataBase();
	d.test();
	

	
	EmployeeInsertionFix.transactin();
}
@When("Adding new category")
public void adding_new_category() {
  
}
@When("Verification in front end")
public void verification_in_front_end() {
    
}

}
