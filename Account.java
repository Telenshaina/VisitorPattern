public interface Account{
    public double accept(InterestCalculator calculator, double money);
    public double accept(Insurance insurance, double money);
}