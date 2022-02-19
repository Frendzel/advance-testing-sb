package pl.sda.user;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserRepositoryTest {

    @Mock
    UserRepository userRepository;

    @Test
    void shouldJustShowHowToMockMethodToThrowException() {
        final Long id = 1L;
        when(userRepository.getById(id)).thenThrow(new NoSuchElementException("User with given id does not exist"));
        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(() -> userRepository.getById(id)); // ok, wyjątek wystąpił
//        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(() -> userRepository.getById(2L)); // błąd, wyjątek nie wystąpił
    }

}