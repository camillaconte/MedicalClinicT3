package team3.dati;

import java.awt.image.BufferedImage;

/**
 * @author LucaGiorgi
 */
public class EmployeeBadge {

    //Attributi
    private String name;
    private String surname;
    private String role;
    private BufferedImage image; //BufferedImage o String image??


    //Costrutto


    public EmployeeBadge() {}

    //Get e Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
