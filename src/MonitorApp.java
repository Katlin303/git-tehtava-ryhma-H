public class MonitorApp {
    public static void main(String[] args) throws Exception {
       Monitor monitor1 = new Monitor();
       Monitor monitor2 = new Monitor();

       monitor1.start();
       monitor2.isOn = false;

       System.out.println(monitor2.isOn);

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
