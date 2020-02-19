package management.decorator;

public class PassTrainingDecorator extends TrainingDecorator {

    public PassTrainingDecorator(final Training decoratedTraining){
        super(decoratedTraining);
    }

    public void doTraining(){
        super.doTraining();
        doPassTraining();
    }

    private void doPassTraining(){
        System.out.println("패스 훈련을 합니다.");
    }

}
