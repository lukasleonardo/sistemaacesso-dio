package com.project.SistemaAcesso.Repository;

import com.project.SistemaAcesso.Modelo.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingDayRepository extends JpaRepository<WorkingDay,Long> {
}
