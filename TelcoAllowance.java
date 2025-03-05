import java.util.*;

public class TelcoAllowance implements UsagePromo {

    private static final Map<String, Integer> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", 15);
        allowanceMap.put("Globe", 10);
        allowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double promoPrice) {
        int allowance = allowanceMap.getOrDefault(telcoName, 0);
        return telcoName + " offers " + allowance + "GB for " + promoPrice + " pesos.";
    }
}
