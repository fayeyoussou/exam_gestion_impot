package sn.youdev;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import sn.youdev.dto.converter.DeclarantConverter;
import sn.youdev.dto.request.DeclarantRequest;
import sn.youdev.model.Declarant;
import sn.youdev.repository.DeclarantRepository;
import sn.youdev.service.DeclarantServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static net.bytebuddy.matcher.ElementMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class DeclarantServiceTest {

    @Autowired
    private DeclarantRepository declarantRepository;

    @Autowired
    private DeclarantConverter declarantConverter;

    @Autowired
    private DeclarantServiceImpl declarantService;

//    @Test
//    public void testSaveDeclarant() {
//        // Create a DeclarantRequest
//        DeclarantRequest request = new DeclarantRequest();
//        request.setRaisonSocial("Company XYZ");
//        request.setAdresse("123 Main St");
//        request.setEmail("company@example.com");
//        request.setTelephone("1234567890");
//
//        // Convert the request to a Declarant entity
//        Declarant declarant = declarantConverter.convert(request);
//
//        // Save the entity using the service
//        Declarant savedDeclarant = declarantService.saveDeclarant(request);
//
//        // Fetch the entity from the database using the repository
//        Declarant fetchedDeclarant = declarantRepository.findById(savedDeclarant.getId()).orElse(null);
//
//        // Perform assertions
//        assertNotNull(savedDeclarant);
//        assertEquals(request.getRaisonSocial(), fetchedDeclarant.getRaisonSocial());
//        assertEquals(request.getAdresse(), fetchedDeclarant.getAdresse());
//        assertEquals(request.getEmail(), fetchedDeclarant.getEmail());
//        assertEquals(request.getTelephone(), fetchedDeclarant.getTelephone());
//    }
}