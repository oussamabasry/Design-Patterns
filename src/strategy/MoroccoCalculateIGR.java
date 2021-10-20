package strategy;

public class MoroccoCalculateIGR implements IEmployeeStrategy{
    private final float rate1 = 5;
    private final float rate2 = 20;
    private final float rate3 = 42;
    @Override
    public float calculateIGR(float grossMonthlySalary) {
        float grossAnnualSalary=grossMonthlySalary*12;
        if(grossAnnualSalary <= 40000) return grossAnnualSalary*rate1/100;
        if(grossAnnualSalary > 40000 && grossAnnualSalary <= 120000) return grossAnnualSalary*rate2/100;
        if(grossAnnualSalary < 120000) return grossAnnualSalary*rate3/100;
        return  0;
    }
}
