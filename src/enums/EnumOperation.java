package enums;

import java.util.function.BiFunction;

public enum EnumOperation {
    SUM(Integer::sum, "+"),
    SUBTRACTION((Integer v1, Integer v2) -> v1 - v2, "-"),
    MULTIPLICATION((Integer v1, Integer v2) -> v1 * v2, "*"),
    DIVISION((Integer v1, Integer v2) -> v1 / v2, "/");

    private final BiFunction<Integer, Integer, Integer> calculate;

    public BiFunction<Integer, Integer, Integer> getCalculate() {
        return calculate;
    }

    private final String symbol;

    public String getSymbol() {
        return symbol;
    }

    EnumOperation(BiFunction<Integer, Integer, Integer> calculate, String symbol) {
        this.calculate = calculate;
        this.symbol = symbol;
    }

}
