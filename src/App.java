public class App {
/**
     * This method takes in two int parameters to add.
     */
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * This is an Overloading method that compute the sum of 2 numbers
     */
    private static int computeSum(int num1, int num2){
    return num1 + num2;
    }
    /**
     * This is an Overloading method that compute the sum of 3 numbers
     */
    private static int computeSum(int num1, int num2, int num3){
    return num1 + num2 + num3;
    }

    /**
     * This method returns the greater integer value
     */
    private static int greaterValue(int a, int b){
      if(a > b){
        return a;
        }else return b;
    }
    /**
     * This method returns the greater double value
     */
    private static double greaterValue(double x, double y){
        if(x > y){
            return x;
        }else return y;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        System.out.println("Computing 2 numbers 100 and 50 = "+App.computeSum(100, 50));
        System.out.println("Computing 3 numbers 100, 50, and 20 = "+App.computeSum(100, 50, 20));
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}