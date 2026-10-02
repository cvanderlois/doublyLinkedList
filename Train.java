package csci.assignment2;

public class Train {
    private LinkedList<Wagon> wagons;
    private int wagonCount;

    public Train(int wagonCount, int wagonCapacity) {
        this.wagonCount = wagonCount;
        wagons = new LinkedList<Wagon>();
        for (int i = 0; i < wagonCount; i++) {
            Wagon wagon = new Wagon(wagonCapacity);
            wagons.pushBack(wagon);
        }
    }
    ///
    /// Create wagon object w and find the location of wagon by chosing first wagon in list and subtract by 1.
    /// then if wagon w size is count which is a parameter that is set in main class return true,
    /// if its not return message that wagon doesn't have room.
    ///
    public boolean buyTicket(int wagon, int count) {
        Wagon w = wagons.at(wagon - 1);
        if (w.setSize(count)) {
            return true;
        } else {
            System.out.println("The wagon does not have room.");
            return false;
        }
    }
    public void display() {
        for (int i = 0; i < wagonCount; i++) {
            Wagon wagon = wagons.at(i);
            System.out.println("Capacity: " + wagon.getCapacity() +
                    " Size: " + wagon.getSize());

        }
    }
    public int findLessCrowedWagon() {
        int smallest = 0;
        for (int i = 1; i < wagons.getSize(); i++) {
            if (wagons.at(i).getSize() < wagons.at(smallest).getSize()) {
                smallest = i;
            }
        }
        return smallest + 1;
    }
}
