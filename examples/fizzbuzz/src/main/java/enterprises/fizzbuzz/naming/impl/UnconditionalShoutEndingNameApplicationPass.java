package enterprises.fizzbuzz.naming.impl;

import enterprises.fizzbuzz.naming.IFizzBuzzNameApplicationPass;

public class UnconditionalShoutEndingNameApplicationPass implements IFizzBuzzNameApplicationPass {
    @Override
    public void apply(int counter, StringBuilder builder, int[] flags) {
        builder.append("!\n");
    }
}
