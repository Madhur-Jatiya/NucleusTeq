package mapsorting;

import java.util.Comparator;
import java.util.TreeMap;

public class SortByValue implements Comparator<String>
{
    TreeMap<String, Integer> map = new TreeMap<>();
    
    public SortByValue(TreeMap<String,Integer> map) {
        this.map = map;              
    }
    
            
    @Override
    public int compare(String o1, String o2) {
       
        if (map.get(o1)>map.get(o2)) {
            return 1;
        }
            return -1;
        }    
}
