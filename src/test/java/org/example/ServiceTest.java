package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    public void getNameTest(){
        Service service = new Service();

        String result = service.getName(-1);

        Assertions.assertEquals("A",result);

    }

}