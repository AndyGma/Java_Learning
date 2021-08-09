package Les4.exception;

import java.util.Objects;

public class CalculatorImpl implements Calculator{ // класс реализует интерфейс

    /**
     *
     * @param expression
     * @return
     * @throws NullPointerException when <code>expression</code> is null
     */

    @Override
    public double calculate(String expression) {
        Objects.requireNonNull(expression, "expression is null");
//        if (expression == null) {
//            throw new NullPointerException("expression is null");
//        }

        foo(expression);
        return 0;
    }
    private void foo(String expression) {
        bar(expression);
    }
    private void bar(String expression) {
        baz(expression);
    }
    private void baz(String expression) {
        expression.toString();
    }
}
