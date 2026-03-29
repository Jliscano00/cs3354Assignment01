//Chazon Mingarine

/*
 * Prints the current inventory of grocery items.
 * Only non-empty slots in the arrays are displayed.
 *
 * @param names  array containing item names
 * @param prices array containing item prices
 * @param stocks array containing item stock quantities
 */
public static void printInventory(String[] names, double[] prices, int[] stocks) {
    System.out.println("\n--- Current Inventory ---");

    for (int i = 0; i < names.length; i++) {
        // Only print items that exist
        if (names[i] != null) {
            System.out.println(
                    "Item: " + names[i] +
                            " | Price: $" + prices[i] +
                            " | Stock: " + stocks[i]
            );
        } else {

        }
    }
}
