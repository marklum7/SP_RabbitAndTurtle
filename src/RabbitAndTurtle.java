public class RabbitAndTurtle extends Thread {
    public static void main(String[] args) {
        AnimalThread rabbit = new AnimalThread("Кролик", 3);
        AnimalThread baby = new AnimalThread("Черепаха", 5);
        rabbit.start();
        baby.start();
    }

}
