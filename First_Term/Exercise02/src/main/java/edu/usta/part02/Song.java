package edu.usta.part02;

public class Song {
    /**
     * Attributes of the class Song:
     * - cod: The code of the song
     * - name: The name of the song
     * - artist: The artist of the song
     * - duration: The duration of the song
     * 
     * Methods of the class Song:
     * - Constructor without parameters
     * - Constructor with parameters
     * - Getters and setters for all attributes
     * - hashCode
     * - equals
     * - toString
     */
    private Integer cod;
    private String name;
    private String artist;
    private Integer duration;

    public Song() {
    }

    public Song(Integer cod, String name, String artist, Integer duration) {
        this.cod = cod;
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public Integer getDuration() {
        return duration;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cod == null) ? 0 : cod.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((artist == null) ? 0 : artist.hashCode());
        result = prime * result + ((duration == null) ? 0 : duration.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Song other = (Song) obj;
        if (cod == null) {
            if (other.cod != null)
                return false;
        } else if (!cod.equals(other.cod))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (artist == null) {
            if (other.artist != null)
                return false;
        } else if (!artist.equals(other.artist))
            return false;
        if (duration == null) {
            if (other.duration != null)
                return false;
        } else if (!duration.equals(other.duration))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Song [cod=" + cod + ", name=" + name + ", artist=" + artist + ", duration=" + duration + "]";
    }
}
