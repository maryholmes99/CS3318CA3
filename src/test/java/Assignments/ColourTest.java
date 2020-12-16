package CS3318AssignmentThree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    public void acceptIfSatisfiesRange() {
        CS3318AssignmentThree.Colour TEST_COLOUR = new CS3318AssignmentThree.Colour("Grey", 153, 153, 153);
        assertTrue(CS3318AssignmentThree.Colour.satisfiesRange(TEST_COLOUR));
    }

    @Test
    public void rejectIfDoesNotSatisfyRange() {
        CS3318AssignmentThree.Colour TEST_COLOUR = new CS3318AssignmentThree.Colour("Pink", 293, 153, 153);
        assertFalse(CS3318AssignmentThree.Colour.satisfiesRange(TEST_COLOUR));
    }

    @Test
    public void acceptIfColoursAreEqual() {
        CS3318AssignmentThree.Colour COLOUR_TEST_A = new CS3318AssignmentThree.Colour("Red", 255, 0, 0);
        CS3318AssignmentThree.Colour COLOUR_TEST_B = new CS3318AssignmentThree.Colour("Red", 255, 0, 0);
        assertTrue(CS3318AssignmentThree.Colour.satisfiesColoursAreEqual(COLOUR_TEST_A, COLOUR_TEST_B));
    }

    @Test
    public void rejectIfColoursAreNotEqual() {
        CS3318AssignmentThree.Colour COLOUR_TEST_A = new CS3318AssignmentThree.Colour("Blue", 0, 0, 255);
        CS3318AssignmentThree.Colour COLOUR_TEST_B = new CS3318AssignmentThree.Colour("Red", 255, 0, 0);
        assertFalse(CS3318AssignmentThree.Colour.satisfiesColoursAreEqual(COLOUR_TEST_A, COLOUR_TEST_B));
    }

    @Test
    public void acceptIfColoursCanBeAddedTogether() {
        CS3318AssignmentThree.Colour COLOUR_TEST_A = new CS3318AssignmentThree.Colour("Red", 255, 0, 0);
        CS3318AssignmentThree.Colour COLOUR_TEST_B = new CS3318AssignmentThree.Colour("Red", 0, 0, 255);
        assertTrue(CS3318AssignmentThree.Colour.satisfiesAbilityToAddTogether(COLOUR_TEST_A, COLOUR_TEST_B));
    }

    @Test
    public void rejectIfColoursCannotBeAddedTogether(){
        CS3318AssignmentThree.Colour COLOUR_TEST_A = new CS3318AssignmentThree.Colour("Pink", 25, 175, 24);
        CS3318AssignmentThree.Colour COLOUR_TEST_B = new CS3318AssignmentThree.Colour("Red", 250, 196, 255);
        assertFalse(CS3318AssignmentThree.Colour.satisfiesAbilityToAddTogether(COLOUR_TEST_A, COLOUR_TEST_B));
    }
}

