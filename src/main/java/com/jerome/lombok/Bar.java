package com.jerome.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bar {
    private String barName;
    private Integer barAge;
}
