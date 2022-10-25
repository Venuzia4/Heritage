public class Hangar{

   public static void main(String[] args) {
       Car clio=new Car("Clio",1000);

       Boat queen=new Boat("Queen Elizabeth 2",20000);

       System.out.println(queen.doStuff());
       System.out.println(clio.doStuff());

   }}