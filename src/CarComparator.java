import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int brandCompare = o1.brand.compareTo(o2.brand);
        if (brandCompare != 0) {
            return brandCompare;
        }
        return Integer.compare(o2.speed, o1.speed);
    }
}
