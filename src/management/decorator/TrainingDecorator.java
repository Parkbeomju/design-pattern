package management.decorator;

public abstract class TrainingDecorator extends Training {

  private Training decoratedTraining;

  public TrainingDecorator(final Training decoratedTraining) {
    this.decoratedTraining = decoratedTraining;
  }

  public void doTraining() {
    decoratedTraining.doTraining();
  }

}
