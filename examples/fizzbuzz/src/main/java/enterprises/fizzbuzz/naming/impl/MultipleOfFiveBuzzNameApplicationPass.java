package enterprises.fizzbuzz.naming.impl;

import enterprises.fizzbuzz.naming.IFizzBuzzNameApplicationPass;

public class MultipleOfFiveBuzzNameApplicationPass implements IFizzBuzzNameApplicationPass {
    public static int FL_MULTIPLE_OF_FIVE = 0x1 << 1;

    @Override
    public void apply(int counter, StringBuilder builder, int[] flags) {
        if (counter % 5 == 0) { // TODO: Can this be done using bitwise operations? 3 is a mersenne number
            builder.append("Buzz");

            flags[0] |= FL_MULTIPLE_OF_FIVE;
        }
    }
}
