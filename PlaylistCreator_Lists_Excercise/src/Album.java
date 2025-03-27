import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String title) {
        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equals(title)){
                System.out.println("Song found already in songs: " + checkedSong);
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        Song result = findSong(title);
        if(result == null) {
            songs.add(new Song(title, duration));
            System.out.println("Song added");
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        trackNumber--;  //pomniejszenie o jeden aby uzyskac rzeczywisty index licząc od 0
        if (trackNumber >= 0 && trackNumber <= songs.size()) {
            Song result = findSong(songs.get(trackNumber).getTitle());
            if (result != null) {
                playlist.addLast(songs.get(trackNumber));
                return true;
            }
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song result = findSong(title);
        if(result != null) {
            playlist.addLast(result);
            return true;
        }
        return false;
    }


}

