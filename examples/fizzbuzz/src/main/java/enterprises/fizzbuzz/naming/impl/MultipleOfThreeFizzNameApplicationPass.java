package enterprises.fizzbuzz.naming.impl;

import enterprises.fizzbuzz.naming.IFizzBuzzNameApplicationPass;

public class MultipleOfThreeFizzNameApplicationPass implements IFizzBuzzNameApplicationPass {
    public static int FL_MULTIPLE_OF_THREE = 0x1;

    @Override
    public void apply(int counter, StringBuilder builder, int[] flags) {
        if (counter % 3 == 0) { // TODO: Can this be done using bitwise operations? 3 is a mersenne number
            builder.append("Fizz");

            flags[0] |= FL_MULTIPLE_OF_THREE;
        }
    }
}
