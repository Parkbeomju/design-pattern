package management;

public class Player {

    private String name;
    private int age;;
    private int number;
    private String position;
    private RolePlay rollPlay;

    public Player(final String name, int age, int number, String position){
        this.name = name;
        this.age = age;
        this.number = number;
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public void setRollPlay(RolePlay rollPlay){
        this.rollPlay = rollPlay;
        rollPlay.play();
    }

}
