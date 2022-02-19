package pl.sda;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
@Slf4j
public class RedisBackedCacheIntTest {

    // container {
    @Container
    public GenericContainer redis = new GenericContainer(DockerImageName.parse("redis:5.0.3-alpine"))
            .withExposedPorts(6379);
    // }


    @BeforeEach
    public void setUp() {
        String address = redis.getHost();
        Integer port = redis.getFirstMappedPort();
        System.out.println(address+port);
        // Now we have an address and port for Redis, no matter where it is running
    }

    @Test
    public void testSimplePutAndGet() {
    }
}
