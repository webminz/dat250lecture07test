package no.hvl.dat250.lecture07;

public class SubtractCalculator implements CalculationInterface {
    @Override
    public double calculate(double lhs, double rhs) {
        return lhs - rhs;
    }
}
