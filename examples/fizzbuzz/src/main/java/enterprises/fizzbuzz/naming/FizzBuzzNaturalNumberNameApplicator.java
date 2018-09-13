package enterprises.fizzbuzz.naming;

import enterprises.fizzbuzz.naming.impl.MultipleOfFiveBuzzNameApplicationPass;
import enterprises.fizzbuzz.naming.impl.MultipleOfThreeFizzNameApplicationPass;
import enterprises.fizzbuzz.naming.impl.NonMultipleLiteralNameApplicationPass;
import enterprises.fizzbuzz.naming.impl.UnconditionalShoutEndingNameApplicationPass;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("Convert2Lambda")
public class FizzBuzzNaturalNumberNameApplicator {
    private List<IFizzBuzzNameApplicationPass> applicationPasses = new LinkedList<>();

    public FizzBuzzNaturalNumberNameApplicator() {
        applicationPasses.add(new MultipleOfThreeFizzNameApplicationPass());
        applicationPasses.add(new MultipleOfFiveBuzzNameApplicationPass());
        applicationPasses.add(new NonMultipleLiteralNameApplicationPass());
        applicationPasses.add(new UnconditionalShoutEndingNameApplicationPass());
    }

    public String applyName(int counter) {
        // Our company just let us use Java 8 and I'm very excited to try it out!

        StringBuilder builder = new StringBuilder();
        int[] flags = new int[] { 0 };

        applicationPasses.forEach(new Consumer<IFizzBuzzNameApplicationPass>() {
            @Override
            public void accept(IFizzBuzzNameApplicationPass iFizzBuzzNameApplicationPass) {
                iFizzBuzzNameApplicationPass.apply(counter, builder, flags);
            }
        });

        return builder.toString();
    }
}
