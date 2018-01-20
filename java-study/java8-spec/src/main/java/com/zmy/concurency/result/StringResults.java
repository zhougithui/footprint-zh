package com.zmy.concurency.result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Result of Strings
 */
public class StringResults implements ConsolidatedResult<String> {

    private final List<String> results = new ArrayList<>();

    @Override
    public void addResult(final String result) {
        results.add(result);
    }

    public List<String> getResults() {
        return Collections.unmodifiableList(results);
    }
}