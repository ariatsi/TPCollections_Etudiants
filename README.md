# TP : Gestion d'un Cours en Java

## Objectif
Ce TP a pour but de pratiquer la manipulation des collections en Java, en particulier `ArrayList` et `Comparator`, en développant une application permettant de gérer les étudiants d'un cours. Vous apprendrez à :
- Manipuler des listes (`ArrayList`) pour stocker des objets.
- Utiliser des comparateurs (`Comparator`) pour trier des données.
- Appliquer les concepts de programmation orientée objet, tels que les classes, les objets, et les méthodes.

---

## Fonctionnalités à Implémenter
1. **Ajouter des étudiants :**
    - Ajoutez des étudiants dans une liste en spécifiant leur nom, prénom, et identifiant unique.

2. **Afficher les étudiants dans l'ordre alphabétique :**
    - Utilisez un `Comparator` pour trier la liste des étudiants par leur nom, puis leur prénom en cas d'égalité.
    - Affichez ensuite la liste triée.

3. **Trouver le meilleur étudiant :**
    - Chaque étudiant a des notes associées à différentes matières.
    - Calculez la moyenne des notes pour chaque étudiant et trouvez celui ayant la meilleure moyenne.

4. **Supprimer un étudiant :**
    - Supprimez un étudiant de la liste à l'aide de son identifiant unique.

---

## Structure des Classes
### 1. Classe `Etudiant`
Représente un étudiant avec les attributs suivants :
- `id` : Identifiant unique (String).
- `nom` : Nom de l'étudiant (String).
- `prenom` : Prénom de l'étudiant (String).
- `notes` : Un `HashMap` associant les matières aux notes obtenues.

### Méthodes principales :
- `ajouterNote(String matiere, Double note)` : Ajoute une note pour une matière spécifique.
- `getMoyenne()` : Retourne la moyenne des notes de l'étudiant.

### 2. Classe `EtudiantComparator`
Un comparateur permettant de trier les étudiants par :
- Nom (ordre alphabétique).
- Prénom en cas d'égalité sur le nom.

### 3. Classe `Cours`
Représente un cours avec une liste d'étudiants.

### Méthodes principales :
- `ajouterEtudiant(Etudiant etudiant)` : Ajoute un étudiant à la liste.
- `retirerEtudiant(String id)` : Supprime un étudiant de la liste à l'aide de son identifiant.
- `trouverMeilleurEtudiant()` : Retourne l'étudiant avec la meilleure moyenne.
- `afficherEtudiantsParOrdreAlphabetique()` : Trie et affiche les étudiants par ordre alphabétique.

---

## Étapes de Réalisation
1. **Créer la classe `Etudiant` :**
    - Implémentez les attributs, le constructeur, et les méthodes `ajouterNote()` et `getMoyenne()`.

2. **Créer la classe `EtudiantComparator` :**
    - Implémentez un comparateur qui compare les étudiants par nom, puis prénom.

3. **Créer la classe `Cours` :**
    - Implémentez les méthodes pour ajouter, supprimer, afficher, et trouver le meilleur étudiant.

4. **Tester le code :**
    - Dans la classe `Main`, ajoutez plusieurs étudiants, attribuez-leur des notes, et testez les fonctionnalités.

---

## Licence
- Ce projet est sous licence MIT. Vous pouvez le modifier et le redistribuer librement.
