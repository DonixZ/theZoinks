public class donekMain {
    public static void main(String[] args) {


        Person Danny = new Person();
        Person Natan = new Person();

        Danny.name = "Danny";
        Danny.id = 315610915;
        Danny.height = 1.65;
        Danny.isMarried = false;


        Natan.name = "Natan";
        Natan.id = 315610915;
        Natan.height = 1.75;
        Natan.isMarried = false;

        Cup es = new Cup();
        es.size = 'S';
        es.typeOfDrink = "Coffee";

        System.out.println(es.size);
        System.out.println(es.typeOfDrink);
        es.drink();
        es.spill();
    }
}
