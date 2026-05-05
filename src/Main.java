import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(120, "black", "A5", "Audi", false));
        cars.add(new Car(240, "white", "Panamera", "Porsche", false));
        cars.add(new Car(90, "green", "968", "ZAZ", true));
        cars.add(new Car(160, "yellow", "Taycan", "Porsche", false));
        cars.add(new Car(320, "blue", "Chiron", "Bugatti", false));

        System.out.println("Початковий масив:");
        printArray(cars);
        System.out.println();

        cars.sort(new CarComparator());

        System.out.println("Відсортований масив:");
        printArray(cars);
        System.out.println();

        Car target = new Car(240, "white", "Panamera", "Porsche", false);
        System.out.println("Пошук машини " + target);

        int index = -1;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).equals(target)) {
                index = i;
                break;
            }
        }

        if (index < 0) {
            System.out.println("Не знайдено");
        } else {
            System.out.println("Знайдено, індекс: " + index);
        }
    }

    private static void printArray(List<Car> array) {
        for (Car car : array) {
            System.out.println(car);
        }
    }
}