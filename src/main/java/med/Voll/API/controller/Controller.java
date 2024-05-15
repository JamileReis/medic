package med.Voll.API.controller;


import med.Voll.API.medico.DadosCadastroMedico;
import med.Voll.API.medico.Medico;
import med.Voll.API.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class Controller {

    @Autowired
    private MedicoRepository repository;

   @PostMapping
   @Transactional
    public void cadastro(@RequestBody DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
}
