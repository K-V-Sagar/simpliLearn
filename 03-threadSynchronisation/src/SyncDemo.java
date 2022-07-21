class SyncDemo 
{ 
    public static void main(String args[]) 
    { 
        Sender snd = new Sender(); 
        ThreadedSend S1 = new ThreadedSend( " Hello " , snd ); 
        ThreadedSend S2 = new ThreadedSend( " Bye Bye " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
} 

