package sn.agile.test.Service;

import sn.agile.test.DTO.UtilisateurDTO;
import sn.agile.test.DTO.UtilisateurSaveDTO;
import sn.agile.test.DTO.UtilisateurUpdateDTO;

import java.util.List;

public interface UtilisateurService {

    String addUser(UtilisateurSaveDTO utilisateurSaveDTO);

    List<UtilisateurDTO> getAllUsers();
    String updateUtilisateur(UtilisateurUpdateDTO utilisateurUpdateDTO);
    boolean deleteUtilisateur(int id);


}
