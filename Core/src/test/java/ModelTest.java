import contacts.Email;
import org.junit.Test;
import tasks.Task;

import java.util.Date;

import static contacts.ContactType.HOME;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Тестирование модели предметной области
 */
public class ModelTest {
    @Test
    public void testEmail() {
        Email email = new Email();
        email.setAddress("super.denis@gmail.com");
        assertEquals("super.denis@gmail.com", email.getAddress());
        assertEquals("<a href=\"mailto:super.denis@gmail.com\">super.denis@gmail.com</a>",
                email.getLink());
        email.setPrimary(true);
        assertTrue(email.isPrimary());
        email.setType(HOME);
        assertEquals(HOME, email.getType());

        // В конструктор сразу можно передать email
        Email email2 = new Email("StDen@mail.ru");
        assertEquals("StDen@mail.ru", email2.getAddress());
    }

    @Test
    public void testTask() {
        Task task1 = new Task();
        task1.setDescription("This description of task");
        assertEquals("This description of task", task1.getDescription());
        Task task2 = new Task("Task2 name","Task2 description");
        task1.setPlaningDate(new Date());
        assertEquals("Task2 description", task2.getDescription());
/*        email.setPrimary(true);
        assertTrue(email.isPrimary());
        email.setType(HOME);
        assertEquals(HOME, email.getType());

        // В конструктор сразу можно передать email
        Email email2 = new Email("StDen@mail.ru");
        assertEquals("StDen@mail.ru", email2.getAddress());*/
    }
}
