package com.jerome.lombok;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author jeromejiang
 */
@Service
@Slf4j
public class BarServiceImpl implements BarService {
    @Override
    public Bar getBar() {
        LOGGER.info("Bar service is running");
        return Bar.builder()
                .barAge(10)
                .barName("Bar")
                .build();
    }
}
