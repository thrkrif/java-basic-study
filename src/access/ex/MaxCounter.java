package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }
    public void increment(){
        // 검증 로직
        if(count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행 로직
        count++;
        // if else 써도 되지만 위처럼 작성해도 된다. 검증 로직을 통과하지 못하면 실행 로직으로 가지 않는다.
    }
    public int getCount(){
        return count;
    }

}
