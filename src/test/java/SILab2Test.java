import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


;

public class SILab2Test {\
	  
	userList.add(korisnik1);
	userList.add(korisnik2);
	userList.add(korisnik3);
	userList.add(korisnik4);
    @Test
    public void prvTest()
    {
        User user = null;
        List<User> allUsers = Arrays.asList(
                new User("korisnik1", "password", "korisnik1@gmail.com"),
                new User("korisnik2", "password2", "korisnik2@gmail.com"),
                new User("korisnik3", "password3", "korisnik3@gmail.com"),
                new User("korisnik4", "password4", "korisnik4@gmail.com"),
        );
     
   

        boolean result = SILab2.function(user, allUsers);

        assertEquals("Rezultatot", result);
    }
    @Test
    public void vtorTest()
    {
        User user = new User(null, "password", "korisnik1@gmail.com");
        List<User> allUsers = new ArrayList<>();

        SILab2.function(user, allUsers);

        assertEquals("korisnik1@gmail.com", user.getUsername());
    }
    @Test
    public void tretTest()
    {
        User user = new User("korisnik1", "password", "korisnik1@gmail.com");
        List<User> allUsers = Arrays.asList(
                new User("korisnik2", "password2", "korisnik2@example.com"),
                new User("korisnik3", "password3", "korisnik1@gmail.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false, result);
    }
  
    @Test
    public void vtorTest()
    {
        User user = new User("korisnik1", "password2", "korisnik1@gmail.com");
        List<User> allUsers = Arrays.asList(
                new User("korisnik2", "password1", "korisnik2@gmail.com"),
                new User("korisnik3", "password2", "korisnik3@gmail.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(true ,result);
    }
    @Test
    public void petiTest()
    {
        User user = new User("korisnik1", "password2", "korisnik1@gmail.com");
        List<User> allUsers = Arrays.asList(
                new User("korisnik2", "password1", "korisnik@gmail.com"),
                new User("korisnik3", "password2", "korisnik1@gmail.com")
        );

        boolean result = SILab2.function(user, allUsers);

        assertEquals(false ,result);
    }

   
}