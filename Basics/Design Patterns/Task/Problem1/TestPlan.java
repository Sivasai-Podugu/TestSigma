package Problem1;

import java.util.ArrayList;
import java.util.List;

class TestPlanFailure  extends Exception  
{  
    public TestPlanFailure (String str)  
    {    
        super(str);  
    }  
}

public class TestPlan implements TestCase {
    List<TestSuite> listOfTestSuites;
    boolean isFailed = false;
    String name;
    TestPlan(String name){
        this.name = name;
        listOfTestSuites = new ArrayList<>();
    }

    public void addTestSuite(TestSuite ts){
        listOfTestSuites.add(ts);
    }

    public void removeTestSuite(TestSuite ts){
        listOfTestSuites.remove(ts);
    }
    @Override
    public boolean run() {
        System.out.println("Running the test suite: "+ this.name);
        for (TestSuite ts : listOfTestSuites) {
            boolean fail = ts.run();
            if( fail && !isFailed){
                isFailed =true;
            }
              
        }
        try {
                if(isFailed){
                    throw new TestPlanFailure("One of the test suite of this plan failed......");

                }
                
            } catch (Exception e) {
                System.out.println("Test Plan Failure: "+ e);
            } 
        System.out.println("\u001B[34m"+"....\n.....\n.....\n...\n....\n"+ "\u001B[0m");
        return isFailed;
        
    }
    
}
