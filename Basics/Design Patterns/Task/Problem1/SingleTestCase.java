package Problem1;

class TestCaseFailure  extends Exception  
{  
    public TestCaseFailure (String str)  
    {    
        super(str);  
    }  
}



class ArgumentsNotGiven  extends Exception  
{  
    public ArgumentsNotGiven (String str)  
    {    
        super(str);  
    }  
}

class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {    
        super(str);  
    }  
} 

class InvalidAccessing  extends Exception  
{  
    public InvalidAccessing (String str)  
    {    
        super(str);  
    }  
} 

class InvalidArthimeticOperation extends Exception{
    public InvalidArthimeticOperation (String str)  
    {    
        super(str);  
    } 
}

public class SingleTestCase implements TestCase {
    String name;
    int a, b, age, index;
    String op;
    int[] arr;
    boolean isFailed = false;

    boolean isA=false, isB=false, isAge=false, isIndex=false, isOp=false,isArr =false;

    public void setA(int a){
        this.a = a;
        this.isA = true;
    }
    public void setB(int b){
        this.b = b;
        this.isB = true;
    }
    public void setAge(int age){
        this.age = age;
        this.isAge = true;
    }
    public void setIndex(int index){
        this.index = index;
        this.isIndex = true;
    }
    public void setOp(String op){
        this.op = op;
        this.isOp = true;
    }
    public void setArr(int []arr){
        this.arr = arr;
        this.isArr = true;
    }
    

    SingleTestCase(String name){
        this.name = name;
    }

    public void arrayAccesing(int[] arr, int index) {
        try {
            if(index >= arr.length || index<0){
                throw new InvalidAccessing("You are accessing an invalid location");
            }
            System.out.println("The accessed element is: "+ arr[index]);
            
        } catch (InvalidAccessing e) {
            System.out.println("Exception occured: "+e);
            this.isFailed = true;
            


        }
        
    }


    public void arthimeticTest(int a, int b, String op) {
        switch (op) {
            case "+":
                System.out.println("a + b = "+(a+b));
                break;
            case "-":
                System.out.println("a - b = " + (a-b));
                break;
            case "*":
                System.out.println("a * b = " + (a*b));
                break;

            case "/":
                try {
                    if(b == 0){
                        throw new InvalidArthimeticOperation("Division by Zero is not allowed");
                    }
                    System.out.println("a / b = " + (a/b));

                } catch (Exception e) {
                    System.out.println("Exception occured: "+e);
                    this.isFailed = true;
                    
                }
                break;
            default:
                break;
        }
        
    }

    public void eligibilityTest(int age) {
        
        try {
            if (age <18) {
                throw new InvalidAgeException("You are not eligible....");
            }
            else if(age<0){
                throw new InvalidAgeException("Age should be positive");
            }

            System.out.println("Hurray... You are eligible");
            
        } catch (Exception e) {
            System.out.println("Exception occured: "+e);
            this.isFailed = true;
        }
        
    }

    public boolean run(){
        System.out.println("Running the test case: "+ this.name);
        if(isA && isB && isOp){
            this.arthimeticTest(a, b, op);

        }
        else if (isAge){
            this.eligibilityTest(age);
        }

        else if( isIndex && isArr){
            this.arrayAccesing(arr, index);
        }
        else{
            try {
                throw new ArgumentsNotGiven("Please set the arguments first....");
            } catch (Exception e) {
                System.out.println("Exception occured: "+e);
                this.isFailed = true;
                
            }
        }

        try {
            if(isFailed){
                throw new TestCaseFailure("OOPS.....This test case failed..");
            }
        } catch (Exception e) {
            System.out.println("Test Case Failure: "+ e);
        }
        return isFailed;
    }

}
