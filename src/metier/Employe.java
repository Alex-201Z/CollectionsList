package metier;

public class Employe {
    private String nom;
    private String prenom;
    private Service service;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    public Employe(String nom , String prenom, Service service  ) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setService(service);
    }
}
