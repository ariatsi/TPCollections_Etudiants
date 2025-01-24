import java.util.Comparator;

public class EtudiantComparator implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        int nomComparison = e1.getNom().compareTo(e2.getNom());
        if (nomComparison == 0) {
            return e1.getPrenom().compareTo(e2.getPrenom());
        }
        return nomComparison;
    }
}
