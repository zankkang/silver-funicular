package com.a2_4140_812.dao812;

import com.a2_4140_812.pojo812.Lines812;
import com.a2_4140_812.pojo812.Pos812;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Pos812Repository extends JpaRepository<Pos812, Long> {

    List<Pos812> findByClientCompId812(Long id);
}