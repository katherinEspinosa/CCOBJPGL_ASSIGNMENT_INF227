public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pet myPet = new Pet();

        myPet.bark();
        System.out.println("Eye Color: "+ myPet.eyeColor);
        System.out.println("Height: "+ myPet.height);
    }
}
