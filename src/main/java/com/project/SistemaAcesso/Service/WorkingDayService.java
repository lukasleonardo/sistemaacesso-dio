package com.project.SistemaAcesso.Service;


import com.project.SistemaAcesso.Modelo.WorkingDay;
import com.project.SistemaAcesso.Repository.WorkingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class WorkingDayService {

    // Menção do repositório
    WorkingDayRepository workingDayRepository;
    @Autowired
    public WorkingDayService(WorkingDayRepository workingDayRepository) {
        this.workingDayRepository = workingDayRepository;
    }


    // Método save Jornada de trabalho
    public WorkingDay saveWorkingDay(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }

    //Método Get all
    public List<WorkingDay> findAll() {
        return workingDayRepository.findAll();
    }



    // metodo Get by ID
    public Optional<WorkingDay> getById(Long idWorkingDay) {
        return workingDayRepository.findById(idWorkingDay);
    }



    // update
    public WorkingDay setWorkingDay(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }

    // delete
    public void  deleteById(Long idWorkingDay) {
        workingDayRepository.deleteById(idWorkingDay);
    }


}
