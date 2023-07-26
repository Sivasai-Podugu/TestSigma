package Problem1;
import java.util.List;
import java.util.ArrayList;

class TestSuiteFailure  extends Exception  
{  
    public TestSuiteFailure (String str)  
    {    
        super(str);  
    }  
}
public class TestSuite implements TestCase{
    List<TestCase> listOfTestCases;
    String name;
    boolean isFailed=false;
    TestSuite(String name){
        this.name = name;
        listOfTestCases = new ArrayList<>();
    }

    public void addTestCase(TestCase tc){
        listOfTestCases.add(tc);
    }

    public void removeTestCase(TestCase tc){
        listOfTestCases.remove(tc);
    }
    @Override
    public boolean run() {
        System.out.println("Running the test suite: "+ this.name);
        for (TestCase tc : listOfTestCases) {
            boolean fail = tc.run();
            if( fail && !isFailed){
                isFailed =true;
            }
            
        }
         try {
            if(isFailed){
                throw new TestSuiteFailure("One of the test case of this suite failed......");

            }
            
        } catch (Exception e) {
            System.out.println("Test suite Failure: "+ e);
            isFailed =true;
        } 
        System.out.println("\u001B[34m"+"....\n.....\n.....\n...\n....\n"+ "\u001B[0m");
       
        return isFailed;
    }

    
}
