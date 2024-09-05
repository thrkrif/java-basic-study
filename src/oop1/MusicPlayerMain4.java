package oop1;

public class MusicPlayerMain4 {

        public static void main(String[] args) {
            MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
            data.isOn(data);
        //볼륨 증가
            data.volumeup(data);
        //볼륨 증가
            data.volumeup(data);
        //볼륨 감소
            data.volumedown(data);

        //음악 플레이어 상태
            data.statePlayer(data);
        //음악 플레이어 끄기
            data.musicExit(data);
        }


}

