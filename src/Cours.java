import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Cours {
    private ArrayList<Etudiant> etudiants;

    public Cours() {
        etudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public void retirerEtudiant(String id) {
        Iterator<Etudiant> iterator = etudiants.iterator();
        while (iterator.hasNext()) {
            Etudiant etudiant = iterator.next();
            if (etudiant.getId().equals(id)) {
                iterator.remove();
                break; // Sortir après avoir supprimé l'étudiant
            }
        }
    }


    public Etudiant trouverMeilleurEtudiant() {
        if (etudiants.isEmpty()) {
            return null; // Si la liste est vide, retourner null
        }

        Etudiant meilleur = etudiants.get(0); // Supposons que le premier étudiant est le meilleur

        for (Etudiant etudiant : etudiants) {
            if (etudiant.getMoyenne() > meilleur.getMoyenne()) {
                meilleur = etudiant; // Remplacer si une meilleure moyenne est trouvée
            }
        }

        return meilleur;
    }

    public void afficherEtudiantsParOrdreAlphabetiqueV1() {
        Collections.sort(etudiants, new EtudiantComparator());
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    public void afficherEtudiantsParOrdreAlphabetiqueV2() {
        ArrayList<Etudiant> etudiantsTries = new ArrayList<>();
        ArrayList<Etudiant> etudiantsRestants = new ArrayList<>(etudiants); // Copie de la liste originale

        while (!etudiantsRestants.isEmpty()) {
            // Trouver l'étudiant "le plus petit"
            Etudiant plusPetit = etudiantsRestants.get(0);
            for (Etudiant etudiant : etudiantsRestants) {
                if (etudiant.getNom().compareTo(plusPetit.getNom()) < 0 ||
                        (etudiant.getNom().equals(plusPetit.getNom()) &&
                                etudiant.getPrenom().compareTo(plusPetit.getPrenom()) < 0)) {
                    plusPetit = etudiant;
                }
            }

            // Ajouter le plus petit dans la liste triée
            etudiantsTries.add(plusPetit);

            // Retirer le plus petit de la liste des restants
            etudiantsRestants.remove(plusPetit);
        }

        // Afficher les étudiants triés
        for (Etudiant etudiant : etudiantsTries) {
            System.out.println(etudiant);
        }
    }


}
