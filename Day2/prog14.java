public class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter methods
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // Setter methods
    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Creating a Pair object with String and Integer type parameters
        Pair<String, Integer> pair1 = new Pair<>("age", 30);
        
        // Getting the key and value
        String key1 = pair1.getKey();
        Integer value1 = pair1.getValue();
        System.out.println("Key: " + key1 + ", Value: " + value1);

        // Creating a Pair object with Integer and Double type parameters
        Pair<Integer, Double> pair2 = new Pair<>(123, 45.67);
        
        // Getting the key and value
        Integer key2 = pair2.getKey();
        Double value2 = pair2.getValue();
        System.out.println("Key: " + key2 + ", Value: " + value2);
    }
}
