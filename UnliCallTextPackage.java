import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer {

    private static final Map<String, String> unliOfferMap = new HashMap<>();

    static {
        unliOfferMap.put("Smart", "Unlimited Calls & Text");
        unliOfferMap.put("Globe", "Unlimited Calls & Text");
        unliOfferMap.put("Ditto", "Limited Calls & Text");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            return unliOfferMap.getOrDefault(telcoName, "No unlimited package available.");
        } else {
            return "No unlimited package available for " + telcoName;
        }
    }
}
