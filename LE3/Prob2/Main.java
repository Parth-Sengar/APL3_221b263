/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test implements Testable {
    
    // Provide concrete implementation for display() method
    @Override
    public void display() {
        System.out.println("Display method of Test class is called.");
    }
}
public class Main
{
    
	public static void main(String[] args) {
	Testable test = new Test();  // Creating an instance of Test class
        test.display();  // Calling the display method
	}
}