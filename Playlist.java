import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
//Create new playlist "desertIslandPlaylist"  
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
//Adding songs
        String a,b;
        a = "Post";
        b = a;
        desertIslandPlaylist.add("Post");
        desertIslandPlaylist.add("SUPERMODEL");
        desertIslandPlaylist.add("Ostatnia nadzieja");
        desertIslandPlaylist.add("RiRi");
        desertIslandPlaylist.add("As It Was");
        desertIslandPlaylist.add("Jakie to Uczucie?");
        desertIslandPlaylist.add("La Manga");
        //System.out.println(desertIslandPlaylist);
        //System.out.println("The size of playlist is: "+desertIslandPlaylist.size());
        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove(2);
        //System.out.println("The size after remove songs from playlist is: "+desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist.indexOf("Post"));
        System.out.println(desertIslandPlaylist.indexOf("RiRi"));
    }

}