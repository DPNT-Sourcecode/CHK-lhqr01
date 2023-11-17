package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {

    static final Map<Character, Integer> prices = new HashMap<>();
    static final Map<Character, SpecialOffer> specialOffers = new HashMap<>();

    // Add default values
    static {
        prices.put('A', 50);
        prices.put('B', 30);
        prices.put('C', 20);
        prices.put('D', 15);
        prices.put('E', 40);

        specialOffers.put('A', new SpecialOffer(3,  130));
        specialOffers.put('B', new SpecialOffer(2, 45));
        specialOffers.put('E', new SpecialOffer(2,40,'B'));
    }

    public Integer checkout(final String skus) {
        // The basket is empty
        if (skus == null || skus.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> skuCounts = new HashMap<>();

        for (char sku : skus.toCharArray()) {
            //Illegal input
            if (!prices.containsKey(sku)) {
                return -1;
            }

            skuCounts.put(sku, skuCounts.getOrDefault(sku, 0) + 1);
        }

        int total = 0;
        
        //Calculate basket price
        for (Map.Entry<Character, Integer> entry : skuCounts.entrySet()) {
            char sku = entry.getKey();
            int finalValue = entry.getValue();

            if (specialOffers.containsKey(sku)) {
                SpecialOffer offer = specialOffers.get(sku);
                int specialOfferCount = finalValue / offer.getQuantity();
                int remainCount = finalValue % offer.getQuantity();

                total += specialOfferCount * offer.getPrice() + remainCount * prices.get(sku);

                if (offer.getFreeItem() != 0) {
                    int freeItemCount =specialOfferCount * offer.getQuantity();
                    
                }
            } else {
                total += finalValue * prices.get(sku);
            }
        }

        return total;
    }

    /**
     * Special Offer Class for each sku.
     */
    private  static class SpecialOffer {
        private int quantity;
        private int price;
        private char freeItem;


        /**
         * Creates a special offer given the quantity and price.
         *
         * @param quantity quantity of the Offer sku
         * @param price    price of the Offer sku
         * @param freeItem free Item
         */
        public SpecialOffer(final int quantity, final int price, final char freeItem) {
            this.quantity = quantity;
            this.price = price;
            this.freeItem = freeItem;
        }
        public SpecialOffer(final int quantity, final int price) {
            this.quantity = quantity;
            this.price = price;
            this.freeItem = 0;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getPrice() {
            return price;
        }

        public char getFreeItem() {
            return freeItem;
        }
    }
}


