import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void windowMax0() {//придумать новый тест
        int n = 8;
        int [] a = {1, 2, 2, 2, 2, 0, 0, 0};
        int w = 3;
        String actual = new Main().windowMax(n,a,w);
        String expected = "2 2 2 2 2 0 ";
        assertEquals(expected,actual);
    }


    @Test
    void windowMax1() {
        int n = 8;
        int [] a = {1, 0, 2, 2, 2, 2, 0, 0};
        int w = 4;
        String actual = new Main().windowMax(n,a,w);
        String expected = "2 2 2 2 2 ";
        assertEquals(expected,actual);
    }

    @Test
    void windowMax2() {
        int n = 3;
        int [] a = {2,1,5};
        int w = 1;
        String actual = new Main().windowMax(n,a,w);
        String expected = "2 1 5 ";
        assertEquals(expected,actual);
    }
    @Test
    void windowMax3() {
        int n = 8;
        int [] a = {2, 7, 3, 1, 5, 2, 6, 2};
        int w = 4;
        String actual = new Main().windowMax(n,a,w);
        String expected = "7 7 5 6 6 ";
        assertEquals(expected,actual);
    }

    @Test
    void windowMax4() {
        int n = 15;
        int [] a = {73, 65, 24, 14, 44, 20, 65, 97, 27, 6, 42, 1, 6, 41, 16};
        int w = 7;
        String actual = new Main().windowMax(n,a,w);
        String expected = "73 97 97 97 97 97 97 97 42 ";
        assertEquals(expected,actual);
    }

    @Test
    void windowMax5() {
        int n = 15;
        int [] a = {34, 51, 61, 90, 26, 84, 2, 25, 7, 8, 25, 78, 21, 47, 25};
        int w = 3;
        String actual = new Main().windowMax(n,a,w);
        String expected = "61 90 90 90 84 84 25 25 25 78 78 78 47 ";
        assertEquals(expected,actual);
    }

    @Test
    void windowMax6() {
        int n = 15;
        int [] a = {27, 83, 29, 77, 6, 3, 48, 2, 16, 72, 46, 38, 55, 2, 58};
        int w = 5;
        String actual = new Main().windowMax(n,a,w);
        String expected = "83 83 77 77 48 72 72 72 72 72 58 ";
        assertEquals(expected,actual);
    }

}