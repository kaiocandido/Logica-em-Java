public class SalaryCalculator {

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int resultado = bonusMultiplier(productsSold);
        int bonus = 0;

        bonus = productsSold * resultado;

        return bonus;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salario = salaryMultiplier(daysSkipped);
        double bonus = bonusForProductsSold(productsSold);

        double salarioFinal = 1000.00 * salario + bonus;
        return  salarioFinal  > 2000 ? 2000 : salarioFinal;
    }
}
