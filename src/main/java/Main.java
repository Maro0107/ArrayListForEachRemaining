import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars =new ArrayList<>();
        cars.add("Dodge");
        cars.add("Ferrari");
        cars.add("Alfaromeo");

        cars.iterator().forEachRemaining(el -> System.out.println(el));
    }
}
