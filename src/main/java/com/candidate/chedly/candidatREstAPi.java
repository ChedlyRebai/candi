package com.candidate.chedly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/candidats")
public class candidatREstAPi {
    
    @Autowired
    private CandidatService candidatService;
    private String title="hello world";

    @GetMapping
    public ResponseEntity<List<Candidat>> getCandidats() {
        return ResponseEntity.ok(candidatService.getAllCandidats());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Candidat> updateCandidat(@PathVariable Long id,@RequestBody Candidat body){
        return  ResponseEntity.ok(this.candidatService.updateCandidat(id, body));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> DeleteCandidat(@PathVariable Long id){
        return ResponseEntity.ok(this.candidatService.deleteCandidat(id));
    }

    @PostMapping("/add")
    public ResponseEntity<Candidat> addCandida(@RequestBody Candidat candidat) {
        return ResponseEntity.ok(this.candidatService.addCandidat(candidat));
    }
}
