package com.chapter.three;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueViaStacksTest {

    private QueueViaStacks queue;

    @BeforeEach
    public void setup() {
        queue = new QueueViaStacks();   
    }

    @Test
    public void offer_withNumber_shouldReturnTrue() {
        int numberToOffer = 8;
        
        assertTrue(queue.offer(numberToOffer));
    }
}