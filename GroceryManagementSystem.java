import java.util.Scanner;

    /**Juan Liscano

     *
     * Creates Main class with parameters that will be used.
     * Outputs menu for users to interact with.
     * 1 entered: View inventory.
     * 2 entered: Restock and Search.
     * 3 entered: Exit Gracefully.
     *
     * @param choice scanner that receives user input.
     * @param num int that is inputted by user.
     * @param itemNames array containing item names.
     * @param itemPrices array containing item prices.
     * @param itemStocks array containing item stock.
     * @param target string inputted by user for which item to restock.
     * @param amount int inputted by user for how much of specific item to restock.
     *
     */
    public class GroceryManagementSystem {
        public static void main(String[] args) {
            Scanner choice = new Scanner(System.in);
            int num;

            String[] itemNames = new String[10];
            double[] itemPrices = new double[10];
            int[] itemStocks = new int[10];

            while (true) {
                System.out.println("Grocery Management system");
                System.out.println("Please enter your choice");
                System.out.println("Press 1 for View");
                System.out.println("Press 2 for Restock");
                System.out.println("Press 3 to Exit");

                num = choice.nextInt();

                if (num == 1) {
                    printInventory(itemNames, itemPrices, itemStocks);

                } else if (num == 2) {
                    System.out.println("What item do you want to restock?");
                    choice.nextLine();
                    String target = choice.nextLine();

                    System.out.println("What is the amount");
                    int amount = choice.nextInt();

                    restockItem(itemNames, itemStocks, target, amount);
                } else if (num == 3) {
                    System.out.println("Now exiting program");
                    break;
                }

            }
        }
/** Leslie Tejeda-Peña
 * 
 * Restocks a specific item in the inventory if the target item is found. 
 * If the item is not found, a message is printed indicating that the 
 * item does not exist.
 *
 * @param names an array of item names in the inventory
 * @param stocks a parallel array containing the stock quantity for each item
 * @param target the name of the item to restock
 * @param amount the quantity to add to the item's current stock
 */
public static void restockItem(String[] names, int[] stocks, String target, int amount){
  boolean found = false; 

  for(int i = 0; i < names.length; i++){
    if(names[i] != null && names[i].equals(target)){
      stocks[i]+= amount; 
      found = true; 
      break; 
    }
  }
  
  if (found == false){
    System.out.println("Item not found"); 
  }

}
/**Chazon Mingarine

        *
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
    }
