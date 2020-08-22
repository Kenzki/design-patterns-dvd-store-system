package Store;

public class Store {
    private  boolean open;
    private  String status;
    private static Store uniqueInstance;

    private Store(){
        open = false;
        status = "Store is Closed";
    }
    public static Store getInstance(){
        if(uniqueInstance == null){
            System.out.println("Creating Instance of Store Sys");
            uniqueInstance = new Store();
        }
        System.out.println("Returning instance of Store Sys\n");
        return  uniqueInstance;
    }
    public void storeOpen(){
        if(!open)
        {
            open = true;
            status = "Store is Open";
            System.out.println(status);
        }
    }
    public void storeLunch()
    {
        if(open = true)
        {
            open = false;
            status = "Closed for lunch...back soon";
            System.out.print(status);
        }
    }

    public void storeClosed() {
        if (open = true)
        {
            open = false;
            status = "Store is Closed";
            System.out.println(status);
        }
    }



    public boolean storeStatus() {
        return  open;
    }

    public String storeMessage(){
        return status;
    }
}
