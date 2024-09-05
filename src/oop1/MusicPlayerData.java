package oop1;

public class MusicPlayerData {
    int volume = 0;
    boolean isOn = false;

    void isOn(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    void volumeup(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    void volumedown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    void statePlayer(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    void musicExit(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}