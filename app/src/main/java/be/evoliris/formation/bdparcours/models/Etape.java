package be.evoliris.formation.bdparcours.models;

public class Etape {
    private long id;
    private String personnage;
    private String auteur;
    private String photo;
    private double latitude;
    private double longitude;

    public Etape(long id, String personnage, String auteur, String photo, double latitude, double longitude) {
        this.id = id;
        this.personnage = personnage;
        this.auteur = auteur;
        this.photo = photo;
        this.latitude = latitude;
        this.longitude = longitude;
        //Pour les data provenant de la base de donnée
    }

    public Etape(String personnage, String auteur, String photo, double latitude, double longitude) {
        this(0,personnage, auteur, photo, latitude, longitude);
        //Pour la recup des données => Web API
    }

    public long getId() {
        return id;
    }

    public String getPersonnage() {
        return personnage;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getPhoto() {
        return photo;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPersonnage(String personnage) {
        this.personnage = personnage;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
