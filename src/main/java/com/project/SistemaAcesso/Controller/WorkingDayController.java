package com.project.SistemaAcesso.Controller;

import com.project.SistemaAcesso.Modelo.WorkingDay;
import com.project.SistemaAcesso.Service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/workingday")
public class WorkingDayController {


    WorkingDayService workingDayService;

    @Autowired
    public WorkingDayController(WorkingDayService workingDayService) {
        this.workingDayService = workingDayService;
    }
//*****************************************************************************

    // CRIA NOVA ENTRADA NA TABELA
    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay){
        return workingDayService.saveWorkingDay(workingDay);
    }
    // OBTEM TODOS OS RESULTADOS
    @GetMapping
    public List<WorkingDay> getAllWorkingDay(){
        return workingDayService.findAll();
    }

    // OBTEM RESULTADO DADO UM ID
    @GetMapping("/{idWorkingDay}")
    public ResponseEntity<WorkingDay> getWorkingDayById(@PathVariable("idWorkingDay") Long idWorkingDay ) throws Exception {
        return ResponseEntity.ok(workingDayService
                .getById(idWorkingDay)
                .orElseThrow(()-> new NoSuchElementException("Jornada not found")));
    }

    // UPDATE
    @PutMapping
    public  WorkingDay updateWorkingDay(@RequestBody WorkingDay workingDay){
        return workingDayService.setWorkingDay(workingDay);
    }

    // CORRIGIR O DELETE MAL FUNCIONAMENTO
    @DeleteMapping("/{idWorkingDay}")
    public void deleteWorkingDay(@PathVariable("idWorkingDay")Long idWorkingDay){
        try{ workingDayService.deleteById(idWorkingDay);}
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
