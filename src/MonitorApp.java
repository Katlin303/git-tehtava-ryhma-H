public class MonitorApp {
    public static void main(String[] args) throws Exception {
        // Luodaan monitorit
       Monitor monitor1 = new Monitor();
       Monitor monitor2 = new Monitor();

        // Käynnistetään monitori 1
       monitor1.start();
       monitor2.isOn = false;

       // Tulostetaan monitorien tila
       System.out.println("Monitor 2 is on: " + monitor2.isOn);

       if(monitor1.isOn)

       {
        System.out.println("Monitor is on.");
       }
    
       else
            
        {
            System.out.println("Monitor is off.");
        }
    }
} 

// Luodaan Monitor-luokka
class Monitor{

    public boolean isOn;

    public void start()
    {
        isOn = true;
    }

    public void shutDown()

    {
        isOn = false;
    }
}
