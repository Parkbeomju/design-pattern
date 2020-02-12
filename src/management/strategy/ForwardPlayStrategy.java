package management.strategy;

public class ForwardPlayStrategy implements PlayStrategy {

    @Override
    public void play() {
        System.out.println("골을 넣기 위한 플레이를 합니다");
    }

}