import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;

    private String artist;

    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }



    public boolean addSong(String title, double duration){
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        Song checkedSong = songs.findSong(trackNumber);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song checkedSong = songs.findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add (Song songToAdd) {
//            Song result = findSong(songToAdd.getTitle());
//            if (result != null){
//                return false;
//            }
//            for (Song song : songs) {
//                if (songToAdd.getTitle().equals(song.getTitle())) {
//                    System.out.println("Song already add to playlist");
//                    return false;
//                }
//            }
//            songs.add(songToAdd);
//            return true;

            if (songs.contains(songToAdd)) {
                return false;
            }
            songs.add(songToAdd);
            return true;
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

        private Song findSong(int trackNumber) {
            if (trackNumber - 1 < songs.size() && trackNumber - 1 >= 0){
                return songs.get(trackNumber - 1);
            } else {
                System.out.println("Track Number out of bounds");
                return null;
            }
        }

    }




}

