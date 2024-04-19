public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped < 5) ? 1.0 : 0.85;
    }
    public int bonusMultiplier(int productsSold) {
        return (productsSold < 20) ? 10 : 13;
    }
    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }
    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = salaryMultiplier(daysSkipped) * 1000.00 + bonusForProductsSold(productsSold);
        return (salary < 2000.00) ? salary : 2000.00;
    } 
}

// learning ternary operators in Java. Pretty much identical to JS. I don't use ternary operators much.
// I find if/else much more human readable.