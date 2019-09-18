package homework;

public class Songs {
    public String title;
    public String artist;
    public Songs(String title, String artist) {
        this.title = title;
        this.artist=artist;
    }
public void setTitle(String title){
    System.out.println(title);

}
public void play(){
    System.out.println(title);
}
public void favoriteTrack(String[] songs){
        String favoriteTrack = songs[songs.length-1];
    System.out.println(favoriteTrack);
}

    @Override
    public String toString() {
        return "Songs{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
