package infnet.com.projetobloco.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import infnet.com.projetobloco.api.modelo.Alimento;
import infnet.com.projetobloco.api.repositorio.Repositorio;

@RestController
@CrossOrigin(origins = "*")
public class Controle {

    @Autowired
    private Repositorio acao;

    @PostMapping("/")
    public Alimento cadastrar(@RequestBody Alimento a){
        return acao.save(a);
    }


    @GetMapping("/")
    public Iterable<Alimento> selecionar(){
        return acao.findAll();
    }

    @PutMapping("/")
    public Alimento alterar(@RequestBody Alimento a){
        return acao.save(a);
    }

    @DeleteMapping("/{codigo}")
    public void deletar(@PathVariable long codigo){
        acao.deleteById(codigo);
    }
    
}
