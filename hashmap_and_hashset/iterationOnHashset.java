import java.util.HashSet;
import java.util.Iterator;

public class iterationOnHashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Bengaluru");
        cities.add("Mumbai");
        cities.add("Kolkata");

        @SuppressWarnings("rawtypes")
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String city : cities) {
            System.out.println(city);
        }
    }

}
