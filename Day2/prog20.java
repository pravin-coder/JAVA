public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        System.out.println(obj); // Output: MyClass{value=10}
    }
}
