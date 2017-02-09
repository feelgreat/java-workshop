package functionalInterface;

/**
 * Created by fjiang on 2/6/17.
 */

public class MathOperationTest {

//    class Addition implements MathOperation{
//        @Override
//        public int operate(int a, int b) {
//            return a+b;
//        }
//    }

    public static void main(String[] args) {
         int a = 5, b = 6;
//
//        MathOperationTest mathOperationTest = new MathOperationTest();
//        MathOperation mathOperation = mathOperationTest.new Addition();
//
//        System.out.println(mathOperation.operate(a, b));

        MathOperation<Integer, Integer, Long> addition = (Integer c, Integer d, Long e) ->{
           return c+d+e.intValue() ;
        };

        System.out.println(addition.operate(a, b, 5L));



    }



}
