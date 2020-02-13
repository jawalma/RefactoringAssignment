public abstract class InsuranceStrategy {
    public double calculate(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public abstract int getAdjustment();

    public abstract double getWeight();

    public abstract int getConstant();
}
