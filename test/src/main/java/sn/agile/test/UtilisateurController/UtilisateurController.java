package sn.agile.test.UtilisateurController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.agile.test.DTO.UtilisateurDTO;
import sn.agile.test.DTO.UtilisateurSaveDTO;
import sn.agile.test.Service.UtilisateurService;
import sn.agile.test.DTO.UtilisateurUpdateDTO;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/utilisateur")
public class UtilisateurController {

    @Autowired
   private UtilisateurService utilisateurService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UtilisateurSaveDTO utilisateurSaveDTO) {
        String id = utilisateurService.addUser(utilisateurSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllUsers")
    public List<UtilisateurDTO> getAllUsers() {
        List<UtilisateurDTO>allUsers = utilisateurService.getAllUsers();
        return allUsers;
    }

    @PutMapping(path = "/update")
    public String updateUtilisateur(@RequestBody UtilisateurUpdateDTO utilisateurUpdateDTO)
    {

        String id = utilisateurService.updateUtilisateur(utilisateurUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deleteutilisateur/{id}")
    public String saveUser(@PathVariable(value = "id") int id) {

        boolean deleteutilisateur = utilisateurService.deleteUtilisateur(id);
        return "supprimé";
    }

}
