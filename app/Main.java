package app;

import model.Direccion;
import model.GuiaTuristico;
import model.Persona;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA LLANQUIHUE TOUR =====");
        System.out.println();

        // creo la direccion primero y luego el cliente
        Direccion dir1 = new Direccion("Av. Fuchslocher", 1230, "Llanquihue", "Los Lagos");
        Persona cliente1 = new Persona("Carlos Mendoza", "15.234.567-8", "carlos.mendoza@correo.cl", dir1);

        Direccion dir2 = new Direccion("Calle Maule", 450, "Puerto Montt", "Los Lagos");
        GuiaTuristico guia1 = new GuiaTuristico("Ana Reyes", "12.345.678-9",
                "ana.reyes@llanquihuetour.cl", dir2, "Tours lacustres", 5);

        Direccion dir3 = new Direccion("Los Canelos", 88, "Frutillar", "Los Lagos");
        GuiaTuristico guia2 = new GuiaTuristico("Roberto Soto", "11.987.654-3",
                "roberto.soto@llanquihuetour.cl", dir3, "Excursiones culturales", 8);

        System.out.println("--- Cliente ---");
        System.out.println(cliente1);
        System.out.println();

        System.out.println("--- Guia 1 ---");
        System.out.println(guia1);
        System.out.println();

        System.out.println("--- Guia 2 ---");
        System.out.println(guia2);
    }
}