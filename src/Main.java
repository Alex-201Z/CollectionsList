import metier.Employe;
import metier.Service;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employe> LesEmployer = chargerListe();
        parcourirListe(LesEmployer);
    }
    private static List<Employe> chargerListe() {
        List<Employe> mesEmployes = new ArrayList<Employe>();
        Service comptabilite = new Service("Comptabilité");
        Service commercial = new Service("Commercial");
        Employe unEmploye = new Employe("Paul", "Auchon", comptabilite);
        mesEmployes.add(unEmploye);
        return mesEmployes;
    }
    private static void parcourirListe(List<Employe> LesEmployes) {
        for (Employe unEmploye : LesEmployes)
        {
            System.out.println(unEmploye.getPrenom() + " " +
                    unEmploye.getNom() + ",Service : " +
                    unEmploye.getService().getLibelle());

        }

    }
}
