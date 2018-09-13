package enterprises.fizzbuzz.naming.impl;

import enterprises.fizzbuzz.naming.IFizzBuzzNameApplicationPass;

public class NonMultipleLiteralNameApplicationPass implements IFizzBuzzNameApplicationPass {
    @Override
    public void apply(int counter, StringBuilder builder, int[] flags) {
        int flag = flags[0];
        if ((flag & MultipleOfThreeFizzNameApplicationPass.FL_MULTIPLE_OF_THREE) == 0 &&
                (flag & MultipleOfFiveBuzzNameApplicationPass.FL_MULTIPLE_OF_FIVE) == 0) {
            builder.append(counter);
        }
    }
}
