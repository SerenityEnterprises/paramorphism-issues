package enterprises.fizzbuzz.launch;

import enterprises.fizzbuzz.FizzBuzzEntryDelegate;

public class ManifestMainClassApplicationEntryPoint {
    public static void main(String[] args) {
        FizzBuzzEntryDelegate delegate = new FizzBuzzEntryDelegate();
        delegate.start(args);
    }
}
