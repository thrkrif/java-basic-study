package static2.ex;

public class MathArrayUtils {
    private static int sum;
    private static int min;
    private static int max;
    // 정적 변수를 생성하는 것보다 메서드 내부에 지역 변수를 만드는 게 훨씬 좋다.
    // 왜냐하면 메서드 내부에서만 이용할건데 정적 변수는 프로그램이 종료되면 사라지기 때문에 메모리 효율이 낮다.
    private MathArrayUtils(){

    }

//`sum(int[] array)` : 배열의 모든 요소를 더하여 합계를 반환합니다.
//`average(int[] array)` : 배열의 모든 요소의 평균값을 계산합니다.
//`min(int[] array)` : 배열에서 최소값을 찾습니다.
//`max(int[] array)` : 배열에서 최대값을 찾습니다.

    public static int sum(int[] array){
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static int average(int[] array){
        return sum / array.length;
    }

    public static int min(int[] array){
        min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array){
        max = array[0];
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }



}
