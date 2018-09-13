package enterprises.fizzbuzz.validation;

import enterprises.fizzbuzz.configuration.FizzBuzzExecutionEnvironmentConfiguration;

public class FizzBuzzValidator {
    private FizzBuzzExecutionEnvironmentConfiguration environmentConfiguration;

    public FizzBuzzValidator(FizzBuzzExecutionEnvironmentConfiguration environmentConfiguration) {
        this.environmentConfiguration = environmentConfiguration;
    }

    // TODO: Can we generalize this for all algorithms, not just FizzBuzz?
    private boolean doesHalt() {
        return Math.signum(environmentConfiguration.getIterationAddend()) != 1
                && environmentConfiguration.getUpperBound() > environmentConfiguration.getStartingPosition();
    }

    public boolean isValid() {
        return !doesHalt();
    }
}
