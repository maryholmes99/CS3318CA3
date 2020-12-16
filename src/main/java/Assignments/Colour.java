package CS3318AssignmentThree;

public class Colour {

    private String model = "RGB";
    private int componentOne = 0;
    private int componentTwo = 0;
    private int componentThree = 0;

    public Colour(String m, int c1, int c2, int c3){
        model = m;
        this.componentOne = c1;
        this.componentTwo = c2;
        this.componentThree = c3;
    }

    public static boolean satisfiesRange(Colour colour) {
        return (colour.componentOne >= 0 && colour.componentOne <=255) &&
                (colour.componentTwo >= 0 && colour.componentTwo <=255) &&
                (colour.componentThree >= 0 && colour.componentThree <=255);
    }

    public static boolean satisfiesColoursAreEqual(Colour colour_a, Colour colour_b) {
        return (colour_a.model == colour_b.model) &&
                (colour_a.componentOne == colour_b.componentOne) &&
                (colour_a.componentTwo == colour_b.componentTwo) &&
                (colour_a.componentThree == colour_b.componentThree);
    }

    public static boolean satisfiesAbilityToAddTogether(Colour colour_a, Colour colour_b) {
        return (colour_a.model == colour_b.model) &&
                ((colour_a.componentOne + colour_b.componentOne) <= 255) &&
                ((colour_a.componentTwo + colour_b.componentTwo) <= 255) &&
                ((colour_a.componentThree + colour_b.componentThree) <= 255);
    }
}
