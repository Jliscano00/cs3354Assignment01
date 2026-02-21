import java.util.Scanner;

//Juan Liscano

/*
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
}