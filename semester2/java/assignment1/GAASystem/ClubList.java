import java.util.*;
/**
 * Write a description of class ClubList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClubList
{
    //creates a new array list of type Club called clublist1
    private ArrayList <Club> clubList1 = new ArrayList<Club>();

    //creates the array list
    public ClubList(){

    }

    //adds club to club arraylist
    public void addClub(Club club1){
        clubList1.add(club1);
    }
    //gets club of the arraylist in a specific index
    public String getClub(int index){
        clubList1.get(index);
        return clubList1.toString();
    }
    //lists club in arraylist
    public String listClub(){
        String allclubs="";
        int index = 0 ;
        if(clubList1.isEmpty()){

            allclubs = "there are no clubs in the system";

        }else{

            for(Club c: clubList1){
                allclubs = allclubs + "Index " + index + ":    "+ c + "\n";

                index++;
            }

        }
        return allclubs;
    }
    //returns the clublist size
    public int numberofClub(){
        return clubList1.size();

    }
    //removes club from arraylist
    public void removeClub(int index){

        clubList1.remove(index);
    }

}
