package com.jerome.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Foo {
    private String fooName;
    private Integer fooAge;
}
