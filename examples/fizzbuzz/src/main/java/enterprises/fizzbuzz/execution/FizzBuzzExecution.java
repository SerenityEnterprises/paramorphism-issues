package enterprises.fizzbuzz.execution;

import enterprises.fizzbuzz.configuration.FizzBuzzExecutionEnvironmentConfiguration;
import enterprises.fizzbuzz.naming.FizzBuzzNaturalNumberNameApplicator;

public class FizzBuzzExecution {
    private final FizzBuzzExecutionEnvironmentConfiguration fizzBuzzExecutionEnvironmentConfiguration;
    private final FizzBuzzNaturalNumberNameApplicator  fizzBuzzNaturalNumberNameApplicator;

    public FizzBuzzExecution(FizzBuzzExecutionEnvironmentConfiguration fizzBuzzExecutionEnvironmentConfiguration,
                             FizzBuzzNaturalNumberNameApplicator fizzBuzzNaturalNumberNameApplicator) {
        this.fizzBuzzExecutionEnvironmentConfiguration = fizzBuzzExecutionEnvironmentConfiguration;
        this.fizzBuzzNaturalNumberNameApplicator = fizzBuzzNaturalNumberNameApplicator;
    }

    public void enact() {
        for (int fizzBuzzCounterVariable = fizzBuzzExecutionEnvironmentConfiguration.getStartingPosition();
             fizzBuzzCounterVariable <= fizzBuzzExecutionEnvironmentConfiguration.getUpperBound();
             fizzBuzzCounterVariable += fizzBuzzExecutionEnvironmentConfiguration.getIterationAddend()) {
            // TODO: Replace inflexible sysout with a more versatile logging solution
            System.out.print(fizzBuzzNaturalNumberNameApplicator.applyName(fizzBuzzCounterVariable));
        }
    }
}
