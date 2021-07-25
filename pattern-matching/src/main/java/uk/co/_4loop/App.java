package uk.co._4loop;

import lombok.extern.slf4j.Slf4j;
import uk.co._4loop.patternmatching.ZooKeeper;
import uk.co._4loop.patternmatching.animal.Elephant;
import uk.co._4loop.patternmatching.animal.Tiger;

@Slf4j
public class App {

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(final String[] args) {

        ZooKeeper keeper = new ZooKeeper();
        keeper.feed(new Tiger("Ralf"));
        keeper.feed(new Elephant("Nelly"));

    }
}
