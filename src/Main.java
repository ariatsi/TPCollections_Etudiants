public class Main {
    public static void main(String[] args) {

        Cours cours = new Cours();

        Etudiant et1 = new Etudiant("1", "Martin", "Julie");
        Etudiant et2 = new Etudiant("2", "Dupont", "Jean");
        Etudiant et3 = new Etudiant("3", "Durand", "Marie");

        et1.ajouterNote("Math", 15.0);
        et1.ajouterNote("Science", 14.5);
        et2.ajouterNote("Math", 17.0);
        et2.ajouterNote("Science", 18.5);
        et3.ajouterNote("Math", 14.0);
        et3.ajouterNote("Science", 16.5);

        cours.ajouterEtudiant(et1);
        cours.ajouterEtudiant(et2);
        cours.ajouterEtudiant(et3);

        System.out.println("\nÉtudiants par ordre par defaut :");
        cours.afficherEtudiants();

        System.out.println("\nMeilleur étudiant: " + cours.trouverMeilleurEtudiant().toString());

        System.out.println("\nÉtudiants par ordre alphabétique (v1-Comparator) :");
        cours.afficherEtudiantsParOrdreAlphabetiqueV1();
        System.out.println("\nÉtudiants par ordre alphabétique (v2-Boucle) :");
        cours.afficherEtudiantsParOrdreAlphabetiqueV2();

        System.out.println("\nSupprimont l'étudiant '2' :");
        cours.retirerEtudiant("2");
        cours.afficherEtudiants();
    }
}