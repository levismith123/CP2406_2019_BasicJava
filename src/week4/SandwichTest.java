package week4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {
    @Test
     void makeSandwich() {
        Sandwich sandwich = new Sandwich();

        sandwich.setMainIngredient("Ham");
        assertEquals("Ham", sandwich.getMainIngredient());

        sandwich.setBreadType("White");
        assertEquals("White",sandwich.getBreadType());

        sandwich.setPrice(1.00);
        assertEquals(1.00, sandwich.getPrice());

    }
}