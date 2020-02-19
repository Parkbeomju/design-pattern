package management.player;

import management.decorator.Training;
import management.state.Condition;
import management.state.Normal;
import management.strategy.PlayStrategy;

public abstract class Player {

    private PlayStrategy playStrategy;
    private Training training;
    private String name;
    private int age;
    private int number;
    private String position;
    private Condition condition;


    public Player(final String name, final int age, final int number, final String position)
    {
        this.name = name;
        this.age = age;
        this.number = number;
        this.position = position;
        this.condition = Normal.getInstance();
        System.out.println("선수가 등록되었습니다.");
    }


    public void play(){
      playStrategy.play();
    }

    public void doTraining(){
        training.doTraining();
    }

    public void setPlayStrategy(final PlayStrategy playStrategy){
        this.playStrategy = playStrategy;
    }

    public void setTraining(final Training training) {
        this.training = training;
    }

    public void setCondition(final Condition condition) {
        this.condition = condition;
    }

    public void isInguried(){
        condition.isInjured(this);
    }

    public void isNormalCondition(){
        condition.isNormalCondition(this);
    }

//    public void setAge(final int age) {
//        this.age = age;
//    }
//
//    public void setNumber(final int number) {
//        this.number = number;
//    }
//
//    public void setPosition(final String position) {
//        this.position = position;
//    }

    public  String getName() {
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

}
