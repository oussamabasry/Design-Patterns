package strategy;

public class AlgeriaCalculateIGR implements IEmployeeStrategy{
    private final float rate = 35;
    @Override
    public float calculateIGR(float grossMonthlySalary) {
        float grossAnnualSalary = grossMonthlySalary * 12;
        return grossAnnualSalary * rate /100;
    }
}
