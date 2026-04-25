import java.util.*;

public class q49 {

    Map<String, List<String>> data = new HashMap<>();

    public boolean isKeyPresent(String key) {

        for (Map.Entry<String, List<String>> entry : this.data.entrySet()) {
            if (key.equals(entry.getKey())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void storingDataInMap(String key, String value) {

        if (this.data.isEmpty()) {
            this.data.put(key, new ArrayList<>(Arrays.asList(value)));
        } else {
            if (isKeyPresent(key)) {
                this.data.get(key).add(value);
            } else {
                this.data.put(key, new ArrayList<>(Arrays.asList(value)));
            }
        }
    }

    public static void main(String[] Args) {

        q49 obj = new q49();

        obj.storingDataInMap("key 1", "value 1.1");
        obj.storingDataInMap("key 1", "value 1.2");
        obj.storingDataInMap("key 2", "value 2.1");
        obj.storingDataInMap("key 3", "value 3.1");
        obj.storingDataInMap("key 3", "value 3.2");

        Map<String,List<String>> result = new TreeMap<>(obj.data);
        for(Map.Entry<String,List<String>> entry : result.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
