package oop1;

public class MusicPlayerMain3 {

        public static void main(String[] args) {
            MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
            data.isOn = true;
            System.out.println("음악 플레이어를 시작합니다");
        //볼륨 증가
            volumeup(data);
        //볼륨 증가
            volumeup(data);
        //볼륨 감소
            volumedown(data);

        //음악 플레이어 상태
            statePlayer(data);
        //음악 플레이어 끄기
            musicExit(data);
        }

        static void volumeup(MusicPlayerData data){
            data.volume++;
            System.out.println("음악 플레이어 볼륨:" + data.volume);
        }
        static void volumedown(MusicPlayerData data){
            data.volume--;
            System.out.println("음악 플레이어 볼륨:" + data.volume);
        }
        static void statePlayer(MusicPlayerData data){
            System.out.println("음악 플레이어 상태 확인");
            if (data.isOn) {
                System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
            }
            else {
                System.out.println("음악 플레이어 OFF");
            }
        }
        static void musicExit(MusicPlayerData data){
            data.isOn = false;
            System.out.println("음악 플레이어를 종료합니다");
        }
}

