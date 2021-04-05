import java.util.*;
/**
 * Write a description of class PlayerList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayerList
{
    //variable
    //creates a new player array list of type player
    private ArrayList<Player>playerlist = new ArrayList<Player>();
    //constructor

    //methods
    //adds player to player arraylist
    public void addplayer(Player player1){
        playerlist.add(player1); 
    }
    //removes player from player arraylist
    public void removeplayer(int index){
        playerlist.remove(index); 
    }
    //gets player from player arraylist
    public Player getplayer(int index){
        return  playerlist.get(index); 
    }
    //list player in arraylist
    public String listOfplayer(){
        String allPlayers="";
        int index = 0 ;
        if(playerlist.isEmpty()){
            allPlayers = "there are no players in the system";
        }else{
            for(Player p: playerlist){
                allPlayers = allPlayers + "index " + index +": "+ p + "\n";

                index++;
            }

        }
        return allPlayers;
    }
    //list player in arraylist by club
    public String listPlayersBySpecificClub(String clubIn){
        String results="";

        for(Player p: playerlist){
            if(p.getclub().equals(clubIn)){

                results = results + p.toString() + "\n";
            }
        }
        return results;
    }
    //list player in arraylist by sport
    public String listPlayersBySpecificSport(String sportIn){
        String results="";

        for(Player p: playerlist)
        {
            if(p.getsport().equals(sportIn)){

                results = results + p.toString() + "\n";
            }
        }
        return results;
    }

}
