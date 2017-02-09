/*
 * @(#)RangeAlgorithmsTest.java         1.00, 2017/02/09 (09 February, 2017)
 *
 * This file is part of 'research-common' project.
 * Can not be copied and/or distributed without
 * the express permission of Segoviasoft company.
 *
 * Copyright (C) 2017 Segoviasoft
 * All Rights Reserved.
 */
package org.rgrygorovych.research;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * RangeAlgorithmsTest
 *
 * @author Roman Grygorovych
 * @version 1.00, 02/09/2017
 * @since 1.0
 */
public class RangeAlgorithmsTest {

    @Data
    static class Scores {
        final long firstScore;
        final long secondScore;
    }

    @Test
    public void testMiddle() {
        final List<Scores> scores = new ArrayList<>();

        scores.add(new Scores(0L, 0L));
        scores.add(new Scores(0L, 1L));
        scores.add(new Scores(0L, 3L));
        scores.add(new Scores(1L, 1L));
        scores.add(new Scores(1L, 3L));
        scores.add(new Scores(3L, 0L));
        scores.add(new Scores(3L, 1L));
        scores.add(new Scores(3L, 3L));


    }

}