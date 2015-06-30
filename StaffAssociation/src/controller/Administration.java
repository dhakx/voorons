package controller;

import java.util.ArrayList;
import java.util.List;
import model.Event;
import model.Member;

public class Administration {
  
  private List<Member> members;
  private List<Event> events;
  
  public Administration()
  {
    members = new ArrayList<>();
    events = new ArrayList<>();
  }
     
	public void addEvent(Event event) {
		this.events.add(event);
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public List<Member> getMembers() {
		return this.members;
	}
    
    public void addMember(Member m)
    {
      this.members.add(m);
    }

}