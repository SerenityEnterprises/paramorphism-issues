package enterprises.fizzbuzz.configuration;

public class FizzBuzzExecutionEnvironmentConfiguration {
    private int upperBound;
    private int startingPosition;
    private int iterationAddend;

    public FizzBuzzExecutionEnvironmentConfiguration(int upperBound, int startingPosition, int iterationAddend) {
        this.upperBound = upperBound;
        this.startingPosition = startingPosition;
        this.iterationAddend = iterationAddend;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public int getStartingPosition() {
        return startingPosition;
    }

    public void setStartingPosition(int startingPosition) {
        this.startingPosition = startingPosition;
    }

    public int getIterationAddend() {
        return iterationAddend;
    }

    public void setIterationAddend(int iterationAddend) {
        this.iterationAddend = iterationAddend;
    }
}
