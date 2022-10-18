# JavaFunctionnal
Java Functionnal Programming


#Imperative Approach
    Defining every single detail, lot of code for something very simple.

#Declarative Approach ( Functionnal Style programming )
[Java Utils Functions Package](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html)

##Function<T,R>
    Represents a function that accepts one argument and produces a result.
> Func.apply(param) : run Function with parameter

> Func1.andThen(Func2).apply(param) : Run Func1 with param after that passing result as parm to Func2
>(Run Func2 after Func1)

##BiFunction<T,U,R>
    Represents a function that accepts two arguments and produces a result.
##Consumer<T>
    Represents an operation that accepts a single input argument and returns no result.
>Func.accept(param) : accept param to process.
##BiConsumer<T,U>
    Represents an operation that accepts two input arguments and returns no result.
##Predicate<T>
    Represents a predicate (boolean-valued function) of one argument.
>PredicateFunc.test(param)
##BiPredicate<T,U>
    Represents a predicate (boolean-valued function) of two arguments.
##Supplier<T>
    Represents a supplier of results.
>SupplierFunc.get()


The benefits with using Java Functionnal Interfaces, is when using optional & streams

#Streams
