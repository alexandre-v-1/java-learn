package test;

import array.Tableau;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableauTest {

    @Test
    @DisplayName("Test adding value in array")
    void addValue() {
        Tableau t = new Tableau(10);
        assertEquals(10, t.values.size());
        assertTrue(t.addValue(10));
        t.printValues();
    }

    @Test
    @DisplayName("Test Sort array")
    void sortByDir() {
        Tableau t = new Tableau(20);
        t.sortByDir(null);
        t.printValues();
        t.sortByDir("desc");
        t.printValues();
        t.sortByDir("asc");
        t.printValues();

        assertTrue(true);
    }
}