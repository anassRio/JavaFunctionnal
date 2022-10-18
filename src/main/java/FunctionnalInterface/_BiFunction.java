package FunctionnalInterface;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {

        System.out.println("Imperative Approach ");
        int incrementAndMultiply = incrementBy1AndMultiply(4, 100);
        System.out.println(incrementAndMultiply);

        System.out.println("BiFunction<T,U,R> Approach : using Apply");
        Integer applyResult = incrementBy1AndMultiplyBiFunction.apply(4, 100);
        System.out.println(applyResult);
    }

    // Normal java Function
    static int incrementBy1AndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }

    // BiFunctionnal
    static BiFunction<Integer, Integer, Integer> incrementBy1AndMultiplyBiFunction =
            (numberToIncrementBy1, numberToMultiplyBy)
                    -> (numberToIncrementBy1 + 1) * numberToMultiplyBy;

}
