package Problem1;

public class Client {
    public static void main(String[] args) {
        SingleTestCase tc1 = new SingleTestCase("Age Test Case - Valid");
        tc1.setAge(20);
        SingleTestCase tc2 = new SingleTestCase("Age Test Case - Invalid_1");
        tc2.setAge(17);
        SingleTestCase tc3 = new SingleTestCase("Age Test Case - Invalid_2");
        tc3.setAge(-6);

        TestSuite ts1 = new TestSuite("Age Test suite");
        ts1.addTestCase(tc1);
        ts1.addTestCase(tc2);
        ts1.addTestCase(tc3);


        SingleTestCase tc4 = new SingleTestCase("Arthimetic Test Case - Valid_1");
        tc4.setA(10);
        tc4.setB(30);
        tc4.setOp("*");
        SingleTestCase tc5 = new SingleTestCase("Arthimetic Test Case - Valid_2");
        tc5.setA(100);
        tc5.setB(30);
        tc5.setOp("/");
        SingleTestCase tc6 = new SingleTestCase("Age Test Case - Invalid");
        tc6.setA(100);
        tc6.setB(0);
        tc6.setOp("/");

        TestSuite ts2 = new TestSuite("Arthimetic Operations Test suite");
        ts2.addTestCase(tc4);
        ts2.addTestCase(tc5);
        ts2.addTestCase(tc6);

        SingleTestCase tc7 = new SingleTestCase("Array accesing Test Case - Valid");
        int[] arr = {1,2,4,5};
        tc7.setArr(arr);
        tc7.setIndex(1);

        SingleTestCase tc8 = new SingleTestCase("Array accesing Test Case - Invalid_1");
        tc8.setArr(arr);
        tc8.setIndex(4);

        SingleTestCase tc9 = new SingleTestCase("Array accesing Test Case - Invalid_2");
        tc9.setArr(arr);
        tc9.setIndex(-10);

        TestSuite ts3 = new TestSuite("Array Accessing Test suite");
        ts3.addTestCase(tc7);
        ts3.addTestCase(tc8);
        ts3.addTestCase(tc9);


        TestPlan testplan = new TestPlan("Testsigma test plan...");
        testplan.addTestSuite(ts1);
        testplan.addTestSuite(ts2);
        testplan.addTestSuite(ts3);

        testplan.run();


        







    }
    
}
