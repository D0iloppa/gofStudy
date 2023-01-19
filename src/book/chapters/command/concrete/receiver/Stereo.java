package book.chapters.command.concrete.receiver;

public class Stereo {
    private int volume;
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("오디오의 전원을 킵니다.");
    }
    public void setCD(){
        System.out.println("CD를 재생 시킵니다.");
    }
    public void setVolume(int volume){
        this.volume = volume;
        System.out.printf("오디오의 볼륨을 조절합니다.[Vol:%d]\n",volume);
    }

    public void off() {
        System.out.println("오디오의 전원을 종료합니다.");
    }
}
