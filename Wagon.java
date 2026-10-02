package csci.assignment2;

public class Wagon {
    private int capacity;//Maximum number of people in the wagon
    private int size;//Number of people that are on the train (# of tickets purchased.)
    public Wagon(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getSize() {
        return size;
    }

    ///
    /// if size + size is greater than capacity return false else add to size.
    public boolean setSize(int size) {
        if (this.size + size > capacity) {
            return false;
        } else {
            this.size += size;
            return true;
        }
    }
    @Override
    public String toString() {
        return "Capacity: " +
                capacity +
                " Size: " +
                size;
    }
}
