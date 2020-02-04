package management;

public class ForwardPlay extends RoleDecorator implements RolePlay {

    public ForwardPlay(Role decoratedRole){
        super(decoratedRole);
    }

    public void role(){
        super.role();
        play();
    }

    @Override
    public void play() {
        System.out.println("골을 넣기 위한 플레이를 합니다");
    }

}