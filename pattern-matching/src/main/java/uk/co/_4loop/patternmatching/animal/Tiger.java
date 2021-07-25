package uk.co._4loop.patternmatching.animal;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    public void eatMeat() {
        log.info("Tiger is eating meat");
    }
}
