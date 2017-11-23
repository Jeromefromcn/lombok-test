package com.jerome.lombok;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author jeromejiang
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class LombokTestImpl implements LombokTest {

    private final BarService barService;
    private final FooService fooService;

    @Override
    public void test() {
        System.out.println(barService.getBar());
        System.out.println(fooService.getFoo());
    }
}
