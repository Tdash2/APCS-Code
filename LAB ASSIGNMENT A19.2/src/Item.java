class Item implements Comparable<Item> {

    private int myId;
    private int myInv;

    /**
     * Makes an item
     * @param id  id value
     * @param inv inventory value
     */
    public Item(int id, int inv) {
        myId = id;
        myInv = inv;
    }

    /**
     * Gets the id of the Item object
     * @return The id
     */
    public int getId() {
        return myId;
    }

    /**
     * Gets the inv Item
     * @return The inv value
     */
    public int getInv() {
        return myInv;
    }

    /**
     * Compares this item to another item based on id number and returns the difference between this item's id and the other item's id.
     * @param other Item object to compare to
     * @return positive int if myId > other.myId, if myId == other.myId negative int if myId < other.myId
     */
    public int compareTo(Item other) {
        return myId == other.myId ? 0 : myId - other.myId;
    }

    /**
     * Compares the Item to the specified object
     * @param other Item object to compare to
     * @return true if equal, false otherwise
     */
    public boolean equals(Item other) {
        return compareTo(other) == 0;
    }

    /**
     * Returns the Id and the inv
     * @return A nicely formatted string of Id and the inv
     */
    public String toString() {
        return "ID: " + myId + " Inventory: " + myInv;
    }
}