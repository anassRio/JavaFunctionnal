package FunctionnalInterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        System.out.println("Imperative Approach ");
        int increment = incrementByOne(1);
        System.out.println(increment);

        System.out.println("Function<T,R> Approach : using Apply");
        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        //Multply by 10 after increminting
        int multipleBy10 = multipleBy10Function.apply(incrementByOne(1));
        System.out.println(multipleBy10);

        //Using andThen()
        System.out.println("Function<T,R> Approach : Using andThen()");
        Function<Integer, Integer> addByOneAndThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(addByOneAndThenMultiplyBy10.apply(4));
    }

    static int incrementByOne(int number){
        return number + 1 ;
    }

    static Function<Integer,Integer> incrementByOneFunction = number -> number+1;

    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;

}
