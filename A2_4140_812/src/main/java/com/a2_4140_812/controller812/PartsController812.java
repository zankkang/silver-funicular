package com.a2_4140_812.controller812;

import com.a2_4140_812.dao812.ClientRepository812;
import com.a2_4140_812.dao812.Lines812Repository;
import com.a2_4140_812.dao812.PartsRepository812;
import com.a2_4140_812.dao812.Pos812Repository;
import com.a2_4140_812.dto812.Order812;
import com.a2_4140_812.pojo812.Lines812;
import com.a2_4140_812.pojo812.Parts812;
import com.a2_4140_812.pojo812.Pos812;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("part812")
public class PartsController812 {
    private final ClientRepository812 client;
    private final PartsRepository812 parts;
    private final Pos812Repository pos;
    private final Lines812Repository line;

    @GetMapping("all812")
    public List<Parts812> all812() {
        return parts.findAll();
    }

    @PostMapping("purchase812")
    @Transactional
    public ResponseEntity<String> purchase812(@RequestBody Order812 order812) {
        System.out.println(order812);
        try {
            for (Lines812 lines812 : order812.getLines812s()) {
                parts.findById(lines812.getPartNo812()).ifPresent(parts -> {
                    if (!lines812.getPriceOrdered812().equals(parts.getCurrentPrice812())) {
                        throw new RuntimeException();
                    }
                    if (lines812.getQty812() > parts.getPoH812()) {
                        throw new RuntimeException();
                    }
                });
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }

        boolean client = this.client.findById(order812.getClientCompId812()).isEmpty();
        if (client) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }

        Pos812 pos812 = new Pos812();
        pos812.setDateOfPo812(new Date());
        pos812.setStatus812("yes");
        pos812.setClientCompId812(order812.getClientCompId812());
        pos.save(pos812);
        List<Lines812> lines812List = order812.getLines812s().stream().peek(v -> v.setPoNo812(pos812.getPoNo812())).collect(Collectors.toList());
        line.saveAll(lines812List);
        return ResponseEntity.ok("success");
    }
}
