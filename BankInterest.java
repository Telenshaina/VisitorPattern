import java.util.*;
public class BankInterest implements InterestCalculator{

    private static Map<String, Double> interestMap = new HashMap<>();
    
    static{
        interestMap.put("Cimb", 0.026);
        interestMap.put("SeaBank", 0.05);
        interestMap.put("GoTyme", 0.045);
    }

    @Override
    public double computeInterest(String bankName, double money) {
        return interestMap.get(bankName) * money;
    }
    
}