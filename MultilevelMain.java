public class MultilevelMain {
   
    public static void main(String[] args) {
        // Animal object 
        Animal a = new Animal();
        a.showAnimalDetail();

        //Mammal object
        mammal m = new mammal();
        m.showAnimalDetail();
        m.showMammalDetail();

        // Human Object 
        Human h = new Human();
        h.showAnimalDetail();
        h.showHumanDetail();
        h.showMammalDetail();
    }
}
