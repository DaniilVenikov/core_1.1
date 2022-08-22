package ru.netology.venikov_d_i;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = Calculator.calculatorSupplier.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);
        //может возникнуть ошибка, если b равно нулю (т.к. на 0 делить нельзя)
        // чтобы этого не происходило, в теле лямбда-выражения мы добавляем проверку на равенство нулю второго параметра
        int c = calculator.division.apply(a, b);

        calculator.println.accept(c);

    }
}
