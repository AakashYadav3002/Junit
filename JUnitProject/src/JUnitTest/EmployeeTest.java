package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void mySimpleEqualsTest() {
		String expectedName="raj";
		assertEquals(expectedName, Employee.getEmpNameWithHighSalary());
	}

	@Test
	public void myObjectEqualsTest() {
		Employee expectedEmpObj = new Employee(1,"raj", 15000);
		assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
	}

	}

