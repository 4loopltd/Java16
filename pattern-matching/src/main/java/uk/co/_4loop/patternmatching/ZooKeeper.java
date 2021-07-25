package uk.co._4loop.patternmatching;

import uk.co._4loop.patternmatching.animal.Animal;
import uk.co._4loop.patternmatching.animal.Elephant;
import uk.co._4loop.patternmatching.animal.Tiger;

public class ZooKeeper {

    public void feed(Animal animal) {
        // The expression variable instanceof Type typedVar checks whether variable is an instance of Type and if it is,
        // declares a new variable typedVar of that type.

        if (animal instanceof Elephant elephant)
            elephant.eatPlants();
        else if (animal instanceof Tiger tiger)
            tiger.eatMeat();
    }
}
