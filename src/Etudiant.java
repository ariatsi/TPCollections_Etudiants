import java.util.HashMap;

public class Etudiant {
    private String id;
    private String nom;
    private String prenom;
    private HashMap<String, Double> notes;

    public Etudiant(String id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new HashMap<>();
    }

    // Getters et setters
    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void ajouterNote(String matiere, Double note) {
        notes.put(matiere, note);
    }

    public double getMoyenne() {
        double somme = 0;
        for (double note : notes.values()) {
            somme += note;
        }
        return somme / notes.size();
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " (ID: " + id + ", Moyenne: "+ getMoyenne() + ")";
    }
}
