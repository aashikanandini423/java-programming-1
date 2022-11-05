
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(5);
        counter.increase();
        counter.decrease();
        System.out.println(counter.value());
        counter.increase(10);
        counter.decrease(10);
        System.out.println(counter.value());
        
        
    }
}
