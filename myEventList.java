/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmangement;



/**
 *
 * @author Nasir Iqbal
 */
class myEventList {
    
    int id ;
    String eventName;
    String eventDiscription;
    String Date;
    int Participant;
    String Email;

    public myEventList(int id, String eventName, String eventDiscription, int Participant, String Email) {
        this.id = id;
        this.eventName = eventName;
        this.eventDiscription = eventDiscription;
        //this.Date = Date;
        this.Participant = Participant;
        this.Email = Email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDiscription() {
        return eventDiscription;
    }

    public void setEventDiscription(String eventDiscription) {
        this.eventDiscription = eventDiscription;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getParticipant() {
        return Participant;
    }

    public void setParticipant(int Participant) {
        this.Participant = Participant;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
    
    
   
    
    
}
