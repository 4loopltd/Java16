package uk.co._4loop.patternmatching.animal;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }

    public void eatPlants() {
        log.info("Elephant is eating plants");
    }
}
