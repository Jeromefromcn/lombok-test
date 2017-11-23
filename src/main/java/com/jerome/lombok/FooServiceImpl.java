package com.jerome.lombok;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author jeromejiang
 */
@Service
@Slf4j
public class FooServiceImpl implements FooService {

    @Override
    public Foo getFoo() {
        LOGGER.info("Foo service is running");
        return Foo.builder()
                .fooAge(10)
                .fooName("Foo")
                .build();
    }
}
