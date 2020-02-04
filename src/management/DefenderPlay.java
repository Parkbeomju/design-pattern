package management;

public class DefenderPlay extends RoleDecorator implements RolePlay {

    public DefenderPlay(Role decoratedRole){
        super(decoratedRole);
    }

    public void role(){
        super.role();
        play();
    }

    @Override
    public void play() {
        System.out.println("상대방 forward를 수비합니다");
    }

}
