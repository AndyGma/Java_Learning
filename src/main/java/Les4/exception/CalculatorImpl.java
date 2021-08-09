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
    public double calculate(String expression) throws EvaluationException {
        Objects.requireNonNull(expression, "expression is null");

        if (expression.contains("!")) {
            throw new EvaluationException("Unsupported operator found"); // найден неподдерживаемый оператор
        }

        return 0;
    }
}
