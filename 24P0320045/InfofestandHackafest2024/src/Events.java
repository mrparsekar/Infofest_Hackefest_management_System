/*
seat Number: 24P0320045
Description:This class handles the Events properties.
 */
public class Events {

    private String eventName;
    private String eventTiming;
    private String eventVenue;
    private int eventdeadline;

    public Events(String eventName,String eventTiming,String eventVenue,int eventdeadline){
        this.eventName=eventName;
        this.eventTiming=eventTiming;
        this.eventVenue=eventVenue;
        this.eventdeadline=eventdeadline;
    }


    private String getEventName(){
        return eventName;
    }
    private String getEventTiming(){
        return eventTiming;
    }
    private String getEventVenue(){
        return eventVenue;
    }
    private int getEventdeadline(){
        return eventdeadline;
    }

    public void displaydetailsEvent(){
        System.out.println("Event Name:"+getEventName());
        System.out.println("Event Timing:"+getEventTiming());
        System.out.println("Event Venue:"+getEventVenue());
        System.out.println("Event Deadline:"+getEventdeadline());
    }
}
