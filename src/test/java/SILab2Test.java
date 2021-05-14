import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EveryBranch {
    //1,2,3,4,8
    @Test
    public void test1() {
        Time t = new Time(-11, 30, 30);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The hours are smaller than the minimum");
        }
    }
    //1,2,3,4,9
    @Test
    public void test2() {
        //Testing branch 1,2,3,4,5,8
        Time t = new Time(34, 30, 30);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The hours are grater than the maximum");
        }
    }
    //1,2,3,5,10
    @Test
    public void test3() {
        //Testing branch 1,2,3,4,5,8
        Time t = new Time(14, 74, 30);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The minutes are not valid!");
        }
    }
    //1,2,3,5,11,12
    @Test
    public void test4() {
        Time t = new Time(15, 26, 52);
        List<Time> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        list.add(t);
        result = SILab2.function(list);
        assertEquals(result.get(0).intValue(), t.getHours() * 3600 + t.getMinutes() * 60 + t.getSeconds());
    }
    //1,2,3,5,11,13
    @Test
    public void test5() {
        //Testing branch 1,2,3,4,5,8
        Time t = new Time(14, 54, 70);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The seconds are not valid");
        }
    }
    //1,2,3,6
    @Test
    public void test6() {
        Time t = new Time(24, 0, 0);
        List<Time> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        list.add(t);
        result = SILab2.function(list);
        assertEquals(result.get(0).intValue(), t.getHours() * 3600 + t.getMinutes() * 60 + t.getSeconds());
    }
    //1,2,3,7
    @Test
    public void test7() {
        Time t = new Time(24, 0, 2);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The time is greater than the maximum");
        }
    }
}
class MultipleCondition {
    //1,2,3,4,8
    @Test
    public void test1() {
        Time t = new Time(-11, 30, 30);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The hours are smaller than the minimum");
        }
    }
    //1,2,3,4,9
    @Test
    public void test2() {
        Time t = new Time(56, 30, 30);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The hours are grater than the maximum");
        }
    }
    //1,2,3,6
    @Test
    public void test3() {
        Time t = new Time(14, 0, 0);
        List<Time> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        list.add(t);
        result = SILab2.function(list);
        assertEquals(result.get(0).intValue(), t.getHours() * 3600 + t.getMinutes() * 60 + t.getSeconds());
    }
    //1,2,3,5,10 F || X
    @Test
    public void test4() {
        Time t = new Time(14, -23, 30);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The minutes are not valid!");
        }
    }
    //1,2,3,5,10 X || F
    @Test
    public void test5() {
        Time t = new Time(14, 73, 30);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The minutes are not valid!");
        }
    }
    //1,2,3,5,11,12 F || F
    @Test
    public void test6() {
        Time t = new Time(15, 26, 52);
        List<Time> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        list.add(t);
        result = SILab2.function(list);
        assertEquals(result.get(0).intValue(), t.getHours() * 3600 + t.getMinutes() * 60 + t.getSeconds());
    }
    //1,2,3,5,11,12 T && T
    @Test
    public void test7() {
        Time t = new Time(15, 26, 52);
        List<Time> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        list.add(t);
        result = SILab2.function(list);
        assertEquals(result.get(0).intValue(), t.getHours() * 3600 + t.getMinutes() * 60 + t.getSeconds());
    }
    //1,2,3,5,11,13 F && T
    @Test
    public void test8() {
        //Testing branch 1,2,3,4,5,8
        Time t = new Time(14, 54, -40);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The seconds are not valid");
        }
    }
    //1,2,3,5,11,13 T && F
    @Test
    public void test9() {
        //Testing branch 1,2,3,4,5,8
        Time t = new Time(14, 54, 90);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The seconds are not valid");
        }
    }
    //1,2,3,6 T && T && T
    @Test
    public void test10() {
        Time t = new Time(24, 0, 0);
        List<Time> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        list.add(t);
        result = SILab2.function(list);
        assertEquals(result.get(0).intValue(), t.getHours() * 3600 + t.getMinutes() * 60 + t.getSeconds());
    }
    //1,2,3,4,8  F && T && T
    @Test
    public void test11() {
        Time t = new Time(-11, 0, 0);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The hours are smaller than the minimum");
        }
    }
    //1,2,3,7  T && F && T
    @Test
    public void test12() {
        Time t = new Time(24, 5, 0);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The time is greater than the maximum");
        }
    }
    //1,2,3,7  T && T && F
    @Test
    public void test13() {
        Time t = new Time(24, 0, 42);
        List<Time> lists = new ArrayList<>();
        lists.add(t);
        try {
            SILab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The time is greater than the maximum");
        }
    }

}

