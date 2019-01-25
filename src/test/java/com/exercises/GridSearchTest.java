package com.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridSearchTest {

    @Test
    public void gridSearch() {
        GridSearch search = new GridSearch();
        String[] grid = new String[]{
                "7283455864",
                "6731158619",
                "8988242643",
                "3830589324",
                "2229505813",
                "5633845374",
                "6473530293",
                "7053106601",
                "0834282956",
                "4607924137"
        };
        String[] searchCase = new String[]{
                "9505",
                "3845",
                "3530"
        };

        String result = search.gridSearch(grid,searchCase);
        assertEquals("YES", result);

        grid = new String[]{
                "1234",
                "4321",
                "9999",
                "9999"
        };
        searchCase = new String[]{
          "12",
          "21"
        };
        result = search.gridSearch(grid,searchCase);
        assertEquals("NO", result);

    }
}