package MyFirstTest;

import mavenlesson1.Person;
import mavenlesson1.Room;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class RoomTest {

    @Test
    public void test() {
        Room room = new Room();
        assertTrue(room.settlePeople(new Person("1")));
        assertTrue(room.settlePeople(new Person("2")));
        assertTrue(room.settlePeople(new Person("3")));
        assertTrue(room.settlePeople(new Person("4")));
        assertFalse(room.settlePeople(new Person("5")));

        assertEquals(4, room.getPerson().size());

        assertTrue(room.toString().contains("1"));
        assertTrue(room.toString().contains("2"));
        assertTrue(room.toString().contains("3"));
        assertTrue(room.toString().contains("4"));

        assertEquals(" 1 2 3 4", room.toString());
    }
}
