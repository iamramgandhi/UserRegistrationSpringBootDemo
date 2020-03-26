package com.user.registration.UserRegistrationSpringBootDemo.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@ExtendWith(MockitoExtension.class)
public class UserRegistrationControllerTest {

    @Test
    public void testAddUser() {
        MockHttpServletRequest request = new MockHttpServletRequest(  );
        RequestContextHolder.setRequestAttributes( new ServletRequestAttributes( request ) );
    }

    
}
