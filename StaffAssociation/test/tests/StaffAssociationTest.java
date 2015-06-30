package tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import controller.Administration;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import model.Employee;
import model.Event;
import model.Role;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class StaffAssociationTest {
    // declare registries
      Administration admin = new Administration(); 
    
    // declare four employees jrs, krs, hdn and pos
      Employee jrs = new Employee("Bas", "van Grinsven", "Bas@gmail.com", Role.Member);
      Employee krs = new Employee("Nick", "de Kesel", "Nick@gmail.com", Role.Member);
      Employee hdn = new Employee("Dominik", "de Smit", "Dominik@gmail.com", Role.Member);
      Employee pos = new Employee("Patrick", "Dronk", "Patrick@gmail.com", Role.Member);

    // declare efteling event 
      Date start = new Date(2015, 06, 29);
      Date end  = new Date(2015, 06, 30);
      Event e = new Event("Event-2015", 3, start, end, 2.5);
    

    @Before
    public void setUp() {
        // optional: init of registries if needed 

        // init jrs: register as member: employee Jrs with name Janus Jorissen and emailadres j.jorissen@sa.nl
        
        // init krs: register as member: employee Krs with name Petra Kuijpers and emailadres p.kuipers@sa.nl
        
        // init hdn: register as member: employee Hdn with name Harold van der Heiden and emailadres h.vanderheiden@sa.nl
        
        // init pos: register as member: employee Pos with name Ina van Post and emailadres i.vanpost@sa.nl  
       
        // init efteling: create Efteling 2015 event with coordinator employee Jrs
        
        // employee Pos has a partner with first name "Harold"
        
    }

    @After
    public void clearRegistries() {
        // todo
        
    }

    @Test @Ignore
    public void testSecretary() {
        // employee Krs is the new secretary of the staff association
        
        // assert employee Krs is the secretary of the staff association
        
        // assert the other way around: the secretary of the staff association is Krs
        
        // employee Krs retires as the secretary of the staff association
        
        // assert employee Krs is not the secretary anymore
        
        // assert the other way around: the role of the secretary is vacant
       
        // employee Pos is the new secretary of the staff association
        
        // assert employee Pos is the secretary of the staff association
       
        // assert the other way around: the secretary of the staff association is Pos
       
        // employee Jrs is the new secretary of the staff association
        
        // assert employee Jrs is the secretary of the staff association
       
        // assert employee Pos is not anymore the secretary of the staff association
        
        // assert the other way around: the secretary of the staff association is Jrs
        
    }

    @Test @Ignore
    public void testEmployee() {
        // assert count of employees is 4
      
        // addding new employee with the same code (Piet Jorissen, code: Jrs, email p.jorissen@sa.nl)
        
        // assert new employee isn't created
        
        // assert count of employees is 4
       
    }

    @Test @Ignore
    public void testAgeChild() {
        // create a variable someDay initialised as Today
        GregorianCalendar someDay = new GregorianCalendar();
        // set someDay to yesterday
        someDay.add(Calendar.DAY_OF_MONTH, -1);
        // employee Pos does have a first child "Stephan" with date of birth yesterday in 2010
       
        // assert age of Stephan is 5
       
        // set someDay to today
        someDay.add(Calendar.DAY_OF_MONTH, 1);
        // employee Pos does have a second child "Judith" with date of birth today in 2012
        
        // assert age of Judith is 3
        
        // set someDay to tomorrow
        someDay.add(Calendar.DAY_OF_MONTH, 1);
        // employee Pos does have a third child "Bas" with date of birth tomorrow - 2014 
        
        // assert age of Bas is 0
        
    }

    @Test @Ignore
    public void testEventSubscription() {
        // create child ("Stef", 12-3-2015) of employee Jrs 
       
        // set partner ("Han") of employee Jrs 
       
        // registration of employee Jrs, child Stef en partner Han to the efteling 2015 event
        
        
        
        // assert 3 registrations of the efteling 2015 event
       
        // redundant registration of child Stef of employee Jrs to the efteling 2015 event
       
        // redundant registration of partner of employee Jrs to the efteling 2015 event
       
        // assert 3 registrations of the efteling 2015 event
       
        // create the Guus Meeuwis 2015 event coordinated by employee Pos
       
        // assert that employee Pos is coordinator of the Guus Meeuwis 2015 event
       
        // assert the other way around that the coordinator of the Guus Meeuwis 2015 event equals employee Pos
        
        // set employee Jrs as coordinator of the Guus Meeuwis 2015 event
       
        // assert that employee Jrs is coordinator of the Guus Meeuwis 2015 event
       
        // assert that employee Pos is not anymore coordinator of the Guus Meeuwis 2015 event
       
        // assert the other way around that the coordinator of the Guus Meeuwis 2015 event equals employee Jrs
       
        // set start date time of the Guus Meeuwis 2015 event at 12 June 2015 20:00
        
        // assert that start date time of the Guus Meeuwis 2015 event equals 12 June 2015 20:00
        
        // set max entrees of the Guus Meeuwis 2015 event to 230
        
        // assert max entrees of the Guus Meeuwis 2015 event is 230
        
    }

    @Test @Ignore
    public void testDeclaration() {
        // register a declaration of 120 euro from pos at efteling-event
      
        // assert declaration number is 1 and amount is 120 and author is Pos
       
        // register a declaration of 220 euro from pos at efteling-event
       
        // assert declaration number is 2 and amount is 220 and athor is Pos
      
        // register a declaration of 100 euro from krs at efteling-event
   
        // assert declaration number is 3 and amount is 100 and author is Krs
      
        // withdraw declaration 1 of the efteling event
    
        // assert declaration with number 2 has amount 220
      
        // assert declaration with number 2 's author is Pos
      
        // assert total expenses at the efteling event is 320
      
    }

    @Test @Ignore
    public void testResigningEmployee() {
        // create child ("Stef", 12-3-2015) of employee Krs 
     
        // set partner ("Han") of employee Krs 
     
        // krs subscribes to the efteling
     
        // child 1 of employee krs subscribes to the efteling
     
        // partner of krs subscribes to the efteling
    
        // assert 3 subscriptions at efteling
     
        // krs resigns
      
        // assert krs is not an employee anymore
     
        // assert krs doesn't belong to the subscribers of efteling
    
        // assert child 1 of krs doesn't belong to the subscribersof efteling
     
        // assert count of subscribers of the efteling is 0
     
    }

}
