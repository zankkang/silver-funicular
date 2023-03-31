package com.a2_4140_812.dao812;

import com.a2_4140_812.pojo812.Lines812;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Lines812Repository extends JpaRepository<Lines812, Long> {
    List<Lines812> findByPoNo812(Long id);
}