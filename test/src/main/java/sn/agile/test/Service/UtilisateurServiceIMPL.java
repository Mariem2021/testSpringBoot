package sn.agile.test.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.agile.test.DTO.UtilisateurDTO;
import sn.agile.test.DTO.UtilisateurSaveDTO;
import sn.agile.test.DTO.UtilisateurUpdateDTO;
import sn.agile.test.UtilisateurRepo.UtilisateurRepo;
import sn.agile.test.model.Utilisateur;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtilisateurServiceIMPL implements UtilisateurService {

    @Autowired
    private UtilisateurRepo utilisateurRepo;
    @Override
    public String addUser(UtilisateurSaveDTO utilisateurSaveDTO) {
        Utilisateur utilisateur = new Utilisateur(
                utilisateurSaveDTO.getPrenom(),
                utilisateurSaveDTO.getNom(),
                utilisateurSaveDTO.getDatenais(),
                utilisateurSaveDTO.getProfession()
        );
        utilisateurRepo.save(utilisateur);
        return utilisateur.getPrenom();
    }

    @Override
    public List<UtilisateurDTO> getAllUsers() {

        List<Utilisateur> getUsers = utilisateurRepo.findAll();
        List<UtilisateurDTO> utilisateurDTOList = new ArrayList<>();

        for (Utilisateur u:getUsers) {

            UtilisateurDTO utilisateurDTO = new UtilisateurDTO(
            u.getId(),
            u.getPrenom(),
            u.getNom(),
            u.getDatenais(),
            u.getProfession()
            );
            utilisateurDTOList.add(utilisateurDTO);
        }
        return utilisateurDTOList;
    }

    @Override
    public String updateUtilisateur(UtilisateurUpdateDTO utilisateurUpdateDTO) {

        if (utilisateurRepo.existsById(utilisateurUpdateDTO.getId())) {

            Utilisateur utilisateur = utilisateurRepo.getById((utilisateurUpdateDTO.getId()));

            utilisateur.setPrenom(utilisateurUpdateDTO.getPrenom());
            utilisateur.setNom(utilisateurUpdateDTO.getNom());
            utilisateur.setDatenais(utilisateurUpdateDTO.getDate());
            utilisateur.setProfession(utilisateurUpdateDTO.getProfession());

        }
        else {
            System.out.println("id de lutilisateur nexiste pas");
        }
        return null;
    }


    @Override
    public boolean deleteUtilisateur(int id) {
        if (utilisateurRepo.existsById(id)) {
            utilisateurRepo.deleteById(id);
        }
        else {
            System.out.println("utilisateur non trouver");
        }
        return true;
    }


}
