public class AnimalThread extends Thread{
    String StreamName;
    int Priorety;
    private static int i;
    public AnimalThread(String StreamName, int Priorety){
        this.StreamName = StreamName;
        this.Priorety = Priorety;
        i = 0;
        setPriority(Priorety);
    }
    @Override
    public void run(){
        while (true){
            System.out.println(StreamName + " " + incrementCount());
        }
    }
    public int incrementCount(){
        synchronized (AnimalThread.class){
            return i++;
        }
    }

}
