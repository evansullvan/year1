import java.util.*;
/**
 * Write a description of class ClubList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClubList
{
    private ArrayList <Club> clubList1 = new ArrayList<Club>();
    public ClubList(){

    }

    public void addClub(Club club1){
        clubList1.add(club1);
    }

    public String getClub(int index){
        clubList1.get(index);
        return clubList1.toString();
    }

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

    public int numberofClub(){
        return clubList1.size();

    }

    public void removeClub(int index){
        
        clubList1.remove(index);
    }

}
