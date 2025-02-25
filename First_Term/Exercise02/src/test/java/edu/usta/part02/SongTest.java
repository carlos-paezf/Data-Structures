package edu.usta.part02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SongTest {

    /**
     * The testDefaultConstructor function tests the default constructor of the Song
     * class by checking that all attributes are initialized to null.
     */
    @Test
    public void testDefaultConstructor() {
        Song song = new Song();
        assertNull(song.getCod());
        assertNull(song.getName());
        assertNull(song.getArtist());
        assertNull(song.getDuration());
    }

    /**
     * The testParameterizedConstructor function tests the parameterized constructor
     * of the Song class by creating a Song object with specific attributes and
     * asserting that the object's getters return the expected values.
     */
    @Test
    public void testParameterizedConstructor() {
        Song song = new Song(1, "Song Name", "Artist Name", 300);
        assertEquals(1, song.getCod());
        assertEquals("Song Name", song.getName());
        assertEquals("Artist Name", song.getArtist());
        assertEquals(300, song.getDuration());
    }

    /**
     * The testSettersAndGetters function tests the setters and getters of a Song
     * object by setting values and then asserting that the retrieved values match
     * the set values.
     */
    @Test
    public void testSettersAndGetters() {
        Song song = new Song();
        song.setCod(1);
        song.setName("Song Name");
        song.setArtist("Artist Name");
        song.setDuration(300);

        assertEquals(1, song.getCod());
        assertEquals("Song Name", song.getName());
        assertEquals("Artist Name", song.getArtist());
        assertEquals(300, song.getDuration());
    }

    /**
     * The testEqualsAndHashCode method tests the equals and hashCode methods of the
     * Song class with different instances of songs.
     */
    @Test
    public void testEqualsAndHashCode() {
        Song song1 = new Song(1, "Song Name", "Artist Name", 300);
        Song song2 = new Song(1, "Song Name", "Artist Name", 300);
        Song song3 = new Song(2, "Another Song", "Another Artist", 200);

        assertEquals(song1, song2);
        assertNotEquals(song1, song3);
        assertEquals(song1.hashCode(), song2.hashCode());
        assertNotEquals(song1.hashCode(), song3.hashCode());
    }

    /**
     * The testToString method tests the toString method of a Song object by
     * creating a Song instance and comparing its string representation with an
     * expected value.
     */
    @Test
    public void testToString() {
        Song song = new Song(1, "Song Name", "Artist Name", 300);
        String expected = "Song [cod=1, name=Song Name, artist=Artist Name, duration=300]";
        assertEquals(expected, song.toString());
    }
}
