package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {

    final Map<Character, Integer> prices = new HashMap<>();
    final Map<Character, SpecialOffer> specialOffers = new HashMap<>();

    // Add default values
    static {
        prices.put('A', 50);
        prices.put('B', 30);
        prices.put('C', 20);
        prices.put('D', 15);

        specialOffers.put('A', new SpecialOffer(3, 130));
        specialOffers.put('B', new SpecialOffer(2, 45));
    }

    public Integer checkout(final String skus) {
        // The basket is empty
        if (skus == null || skus.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> itemCounts = new HashMap<>();

        for (char sku : skus.toCharArray()) {
            //Illegal input
            if (!prices.containsKey(sku)) {
                return -1;
            }

            itemCounts.put(sku, itemCounts.getOrDefault(sku, 0) + 1);
        }

        
    }
}


