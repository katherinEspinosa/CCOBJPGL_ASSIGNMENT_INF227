public class App {

    //EXERCISE 1 PROGRAMMING BY CONTACT 
    //initial value
    static boolean iwillReview = true;
    static boolean iwillNotFail = true;
    public static void main(String[] args) throws Exception {
       
    App myApp = new App();

    //precondition
    assert iwillReview == true: "Clown yarn";

    myApp.Study();
    //post condition
    assert iwillNotFail == true: "Bawi next life";

    System.out.println(iwillReview);
    System.out.println(iwillNotFail);

    }
    void Study () {
        iwillReview = false;
        iwillNotFail = false;
    }

}

