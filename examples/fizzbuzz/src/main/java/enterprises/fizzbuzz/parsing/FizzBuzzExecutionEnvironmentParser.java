package enterprises.fizzbuzz.parsing;

import enterprises.fizzbuzz.configuration.FizzBuzzExecutionEnvironmentConfiguration;

// Should we rename this to a Factory?
public class FizzBuzzExecutionEnvironmentParser {
    private int upperBound = 100;
    private int startingPosition = 1;
    private int iterationAddend = 1;

    public FizzBuzzExecutionEnvironmentParser parseArgs(String[] args) {
        // TODO: parse startingPosition and iterationAddend
        // This might take significant R&D -- Offload to R&D dept?

        if (args.length >= 1) {
            try {
                upperBound = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }

        return this;
    }

    public FizzBuzzExecutionEnvironmentConfiguration parse() {
        return new FizzBuzzExecutionEnvironmentConfiguration(upperBound, startingPosition, iterationAddend);
    }
}
