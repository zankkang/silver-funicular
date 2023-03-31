package com.a2_4140_812.dto812;

import com.a2_4140_812.pojo812.Lines812;
import lombok.Data;

import java.util.List;

@Data
public class Order812 {
    private Long clientCompId812;
    private List<Lines812> lines812s;
}
