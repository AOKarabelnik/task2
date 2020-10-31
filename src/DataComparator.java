import java.util.Comparator;

public class DataComparator implements Comparator<Data> {
    @Override
    public int compare(Data a, Data b) {
        int res = Integer.compare(a.getNumber(), b.getNumber());
        if(res == 0){
            return a.getName().compareTo(b.getName());
        }
        return res;
    }
}
