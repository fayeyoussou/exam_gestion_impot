package sn.youdev;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sn.youdev.model.Declarant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class DeclarantTest {
    @Test
    public void testEquals_SameId() {
        Declarant declarant1 = new Declarant();
        declarant1.setId(1L);

        Declarant declarant2 = new Declarant();
        declarant2.setId(1L);

        assertEquals(declarant1, declarant2);
    }
    @Test
    public void testUpdateValues() {
        Declarant existingDeclarant = new Declarant();
        existingDeclarant.setId(1L);
        existingDeclarant.setRaisonSocial("Company A");
        existingDeclarant.setAdresse("Address A");
        existingDeclarant.setEmail("emailA@example.com");
        existingDeclarant.setTelephone("1234567890");

        Declarant newDeclarant = new Declarant();
        newDeclarant.setId(1L);
        newDeclarant.setRaisonSocial("Company B");
        newDeclarant.setAdresse("Address B");

        existingDeclarant.updateValues(newDeclarant);

        assertEquals("Company B", existingDeclarant.getRaisonSocial());
        assertEquals("Address B", existingDeclarant.getAdresse());
        assertEquals("emailA@example.com", existingDeclarant.getEmail());
        assertEquals("1234567890", existingDeclarant.getTelephone());
    }
    @Test
    public void testUpdateValues_NullDeclarant() {
        Declarant declarant = new Declarant();
        declarant.setId(1L);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            declarant.updateValues(null);
        });

        assertEquals("Declarant cannot be null", exception.getMessage());
        assertEquals(1L, declarant.getId());
    }
}
