import java.util.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Write a description of class MemberList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MemberList
{
    private ArrayList<Member>MemberList = new ArrayList<Member>();

    private String name;
    private String address;
    private String gender;

    public void addMember(Member m1){
        MemberList.add(m1);
    }

    public String listMembers(){
        String list = "";
        int i = 0;
        for(Member m : MemberList){
            list = list + "Index: " + i +": " +  m+ "\n";
            i++;
        }
        return list;
    }


    public void deleteMember(int i){
        MemberList.remove(i);
    }

    public String searchMembersbyName(String nameIn){
        String results = "";
        for(Member m : MemberList){

            if(m.getname().equals(nameIn)){
                results = results + m.toString() + "\n";
            }
        }
        return results;
    }
    public String searchMembersbyGender(String genderIn){
        String results = "";
        for(Member g : MemberList){

            if(g.getgender().equals(genderIn)){
                results = results + g.toString() + "\n";
            }
        }
        return results;
    }
    
    public Member getMember(int index){
        return MemberList.get(index);
        
        
    }
    
    
   
    public String listCoach(){
        
         String list = "";
        int i = 0;
         for(Member m1 : MemberList){
           if(m1 instanceof Coach){
               list = list + "Index: " + i +": " +  m1+ "\n";
            
            }
           i++;
        }
        return list;
      
    }
     public String listYouth(){
        
         String list = "";
        int i = 0;
         for(Member m1 : MemberList){
           if(m1 instanceof YouthPlayer){
               list = list + "Index: " + i +": " +  m1+ "\n";
            
            }
          i++;
        }
        return list;
      
    }
     public String listAdult(){
        
         String list = "";
        int i = 0;
         for(Member m1 : MemberList){
           if(m1 instanceof AdultPlayer){
               list = list + "Index: " + i +": " +  m1+ "\n";
            
            }
          i++;
        }
        return list;
      
    }
   

    public void save() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("Members.xml"));
        out.writeObject(MemberList);
        out.close();    
    }

    @SuppressWarnings("unchecked")
    public void load() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("Members.xml"));
        MemberList = (ArrayList<Member>) is.readObject();
        is.close();
    }

}
