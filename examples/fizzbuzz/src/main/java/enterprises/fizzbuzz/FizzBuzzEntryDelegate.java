package enterprises.fizzbuzz;

import enterprises.fizzbuzz.configuration.FizzBuzzExecutionEnvironmentConfiguration;
import enterprises.fizzbuzz.execution.FizzBuzzExecution;
import enterprises.fizzbuzz.naming.FizzBuzzNaturalNumberNameApplicator;
import enterprises.fizzbuzz.parsing.FizzBuzzExecutionEnvironmentParser;
import enterprises.fizzbuzz.validation.FizzBuzzValidator;

public class FizzBuzzEntryDelegate {
    public void start(String[] args) {
        FizzBuzzExecutionEnvironmentConfiguration fizzBuzzExecutionEnvironmentConfiguration =
                new FizzBuzzExecutionEnvironmentParser().parseArgs(args).parse();

        FizzBuzzValidator fizzBuzzValidator = new FizzBuzzValidator(fizzBuzzExecutionEnvironmentConfiguration);
        if (fizzBuzzValidator.isValid()) {
            FizzBuzzNaturalNumberNameApplicator fizzBuzzNaturalNumberNameApplicator = new FizzBuzzNaturalNumberNameApplicator();
            FizzBuzzExecution execution = new FizzBuzzExecution(fizzBuzzExecutionEnvironmentConfiguration, fizzBuzzNaturalNumberNameApplicator);

            execution.enact();
        }
    }
}
