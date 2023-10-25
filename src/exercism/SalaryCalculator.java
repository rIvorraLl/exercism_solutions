package exercism;

public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
	double salaryPercent = daysSkipped <= 5 ? 1.0 : 0.85;
	return salaryPercent;
    }

    public int multiplierPerProductsSold(int productsSold) {
	int multiplier = productsSold > 20 ? 13 : 10;
	return multiplier;
    }

    public double bonusForProductSold(int productsSold) {
	int multiplier = this.multiplierPerProductsSold(productsSold);
	return (double) (multiplier * productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
	double multiplier = this.multiplierPerDaysSkipped(daysSkipped);
	double bonus = this.bonusForProductSold(productsSold);
	double salary = 1000.0 * multiplier + bonus;
	double result = salary < 2000.0 ? salary : 2000.0;
	return result;
    }
}
