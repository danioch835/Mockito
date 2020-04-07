package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AppServiceTest {

    @Mock
    SimpleService service;

    @Test
    public void givenService_whenGetUserName_ThenTest() {

        Mockito.when(service.getUserName()).thenReturn("Test");

        SimpleAppService appService = new SimpleAppService();
        appService.setSimpleService(service);

        String userName = appService.getUserName();

        assertEquals("Test", userName);
        Mockito.verify(service).getUserName();
    }

}
