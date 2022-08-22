package ru.netology.venikov_d_i;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> calculatorSupplier = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> division = (x, y) -> y > 0 ? (x / y) : 0;

    UnaryOperator<Integer> power = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
