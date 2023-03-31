package com.a2_4140_812.controller812;

import com.a2_4140_812.dao812.Lines812Repository;
import com.a2_4140_812.dao812.Pos812Repository;
import com.a2_4140_812.pojo812.Lines812;
import com.a2_4140_812.pojo812.Pos812;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("pos812")
public class PosController812 {
    private final Pos812Repository pos;
    private final Lines812Repository line;

    @GetMapping("all812")
    public List<Pos812> all812() {
        return pos.findAll();
    }

    @GetMapping("find812")
    public List<Lines812> find812(@RequestParam("id") Long id){
        return line.findByPoNo812(id);
    }

    @GetMapping("client812")
    public List<Pos812> client812(@RequestParam("id") Long id){
        return pos.findByClientCompId812(id);
    }
}
