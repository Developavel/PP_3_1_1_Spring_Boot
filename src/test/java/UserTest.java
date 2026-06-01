import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.javamentor.SpringBoot.dao.UserDao;
import ru.javamentor.SpringBoot.model.User;
import ru.javamentor.SpringBoot.service.UserServiceImpl;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void testListUsers() {
        when(userDao.listUsers()).thenReturn(List.of(new User()));

        List<User> result = userService.listUsers();

        assertThat(result).isNotNull();
    }
}
