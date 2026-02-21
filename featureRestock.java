        /**
         * Leslie Tejeda-Peña
         * <p>
         * Restocks a specific item in the inventory if the target item is found.
         * If the item is not found, a message is printed indicating that the
         * item does not exist.
         *
         * @param names  an array of item names in the inventory
         * @param stocks a parallel array containing the stock quantity for each item
         * @param target the name of the item to restock
         * @param amount the quantity to add to the item's current stock
         */
        public static void restockItem(String[] names, int[] stocks, String target, int amount) {
            boolean found = false;

            for (int i = 0; i < names.length; i++) {
                if (names[i] != null && names[i].equals(target)) {
                    stocks[i] += amount;
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("Item not found");
            }

        }
