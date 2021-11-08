package com.sonata.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Long>{

}
