package opgave4.model;

import opgave4.controller.Controller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {

    @Test
    void calulateTotalPrice() {
        assertEquals(0, Controller.getRegistrations().size());
        Controller.init();
        assertEquals(4, Controller.getRegistrations().size());
        assertEquals(4500, Controller.getRegistrations().get(0).calulateTotalPrice());
        Controller.getRegistrations().get(0).setSpeaker(true);
        assertEquals(0, Controller.getRegistrations().get(0).calulateTotalPrice());
        assertEquals(2800, Controller.getRegistrations().get(3).calulateTotalPrice());
    }

}