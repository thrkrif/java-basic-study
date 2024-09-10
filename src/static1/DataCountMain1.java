package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
//        Data1 data1 = new Data1("A");
//        System.out.println("A count=" + data1.count);
//        Data1 data2 = new Data1("B");
//        System.out.println("B count=" + data2.count);
//        Data1 data3 = new Data1("C");
//        System.out.println("C count=" + data3.count);

        // 외부에서 값을 받아들이면서 count를 늘리기.
//        Data1 data1 = new Data1("A");
//        System.out.println("A count=" + data1.count);
//        Data1 data2 = new Data1("B",data1);
//        System.out.println("B count=" + data1.count);
//        Data1 data3 = new Data1("C",data1);
//        System.out.println("C count=" + data1.count);

//        Counter c = new Counter();
//        Data1 data1 = new Data1("A", c);
//        System.out.println("A count=" + c.count);
//        Data1 data2 = new Data1("B",c);
//        System.out.println("B count=" + c.count);
//        Data1 data3 = new Data1("C",c);
//        System.out.println("C count=" + c.count);


        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);
        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);
        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);




    }
}
