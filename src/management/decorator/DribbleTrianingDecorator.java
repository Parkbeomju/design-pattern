package management.decorator;

public class DribbleTrianingDecorator extends TrainingDecorator {

  public DribbleTrianingDecorator(final Training decoratedTraining) {
    super(decoratedTraining);
  }

  public void doTraining() {
    super.doTraining();
    doDribbleTraining();

  }

  private void doDribbleTraining() {
    System.out.println("드리블 훈련을 합니다.");
  }


}
