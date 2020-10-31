import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {

        List<Data> data = new ArrayList<>();
        data.add(new Data(1, "A"));
        data.add(new Data(1, "B"));
        data.add(new Data(2, "E"));
        data.add(new Data(2, "C"));
        data.add(new Data(3, "D"));

        data = data.stream().sorted(new DataComparator()).collect(Collectors.toList());

        data.forEach(e -> System.out.println(e.toString()));




    }

}
