package Utils;

public class TestSetup {
	
    public DriverManager drverManager;
	public TestBase currentTest;
	
	public TestSetup() {
	   
		drverManager = new DriverManager();
		currentTest = new TestBase ();
	}

}
