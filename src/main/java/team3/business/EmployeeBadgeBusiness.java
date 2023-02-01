package team3.business;

import team3.dati.EmployeeBadge;

import java.awt.image.BufferedImage;

public class EmployeeBadgeBusiness {

    public void createBadge(String name, String surname, String role, BufferedImage image) {

        EmployeeBadge badge = new EmployeeBadge();
        badge.setImage(image);
        badge.setName(name);
        badge.setSurname(surname);
        badge.setRole(role);

    }
}

