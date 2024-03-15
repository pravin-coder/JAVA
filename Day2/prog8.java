// Define the Tree interface
interface Tree {
    void fruits(int type, int quantity);
    void leaves(String color, int count, boolean isDeciduous);
    void flowers(String color, String fragrance, int petalCount, boolean hasPollen);
}

// Implement the Branch1 class from the Tree interface
class Branch1 implements Tree {
    @Override
    public void fruits(int type, int quantity) {
        System.out.println("Branch1: Fruits of type " + type + " with quantity " + quantity);
    }

    @Override
    public void leaves(String color, int count, boolean isDeciduous) {
        System.out.println("Branch1: Leaves of color " + color + ", count " + count + ", isDeciduous " + isDeciduous);
    }

    @Override
    public void flowers(String color, String fragrance, int petalCount, boolean hasPollen) {
        System.out.println("Branch1: Flowers of color " + color + ", fragrance " + fragrance + ", petalCount " + petalCount + ", hasPollen " + hasPollen);
    }
}

// Implement the Branch2 class from the Tree interface
class Branch2 implements Tree {
    @Override
    public void fruits(int type, int quantity) {
        System.out.println("Branch2: Fruits of type " + type + " with quantity " + quantity);
    }

    @Override
    public void leaves(String color, int count, boolean isDeciduous) {
        System.out.println("Branch2: Leaves of color " + color + ", count " + count + ", isDeciduous " + isDeciduous);
    }

    @Override
    public void flowers(String color, String fragrance, int petalCount, boolean hasPollen) {
        System.out.println("Branch2: Flowers of color " + color + ", fragrance " + fragrance + ", petalCount " + petalCount + ", hasPollen " + hasPollen);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Branch1 and Branch2
        Branch1 branch1 = new Branch1();
        Branch2 branch2 = new Branch2();

        // Calling methods of Branch1
        branch1.fruits(1, 10);
        branch1.leaves("green", 50, true);
        branch1.flowers("yellow", "sweet", 5, true);

        // Calling methods of Branch2
        branch2.fruits(2, 20);
        branch2.leaves("red", 30, false);
        branch2.flowers("pink", "fragrant", 6, true);
    }
}
