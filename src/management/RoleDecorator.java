package management;

public abstract class RoleDecorator extends Role {

    private Role decorateRole;

    public RoleDecorator(Role decorateRole){
        this.decorateRole = decorateRole;
    }

    public void role(){
        decorateRole.role();
    }
}
