package management;

public class MidFiledPlay extends RoleDecorator implements RolePlay {

    public MidFiledPlay(Role decoratedRole){
        super(decoratedRole);
    }

    public void role(){
        super.role();
        play();
    }

    @Override
    public void play() {
        System.out.println("forward와 defender을 지원하고, 볼 배급을 합니다");
    }
}