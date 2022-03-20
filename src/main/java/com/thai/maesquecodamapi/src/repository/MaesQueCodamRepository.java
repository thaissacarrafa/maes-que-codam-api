package com.thai.maesquecodamapi.src.repository;

import com.thai.maesquecodamapi.src.entity.MaesQueCodam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaesQueCodamRepository extends JpaRepository<MaesQueCodam, Long> {
}
