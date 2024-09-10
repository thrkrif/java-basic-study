package static1;

public class Data1 {
    public String name;
    public int count;


    public Data1(String name) {
        this.name = name;
        count++;
    }

    public Data1(String name, Data1 data) {
        this.name = name;
        data.count++;
    }

    public Data1(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }


}
