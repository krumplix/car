import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //This let the window properly close when user clicks the close ("x") button
        window.setResizable(false);
        window.setTitle("2D Car game");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();  //causes this window to be sized to fit the preferred size and layouts of its subcomponents (=GamePanel)

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();

       /*
       PetrolStation petrolStation = new PetrolStation(100);

        Tire t1 = new Tire(0, "black", 18, "ZigZag");
        Tire t2 = new Tire(0, "red", 18, "ZigZag");
        Tire t3 = new Tire(0, "white", 18, "ZigZag");
        Tire t4 = new Tire(0, "pink", 18, "ZigZag");
        Tire[] tires = {t1,t2,t3,t4};
        Engine v8 = new Engine("v8", 30, FuelType.diesel, 0);

        t3.inflate(50);
        t1.inflate(50);
        t2.inflate(50);
        t4.inflate(50);

        Car supercar = new Car();
        supercar.setColour("white");
        supercar.setMake("Skoda");
        supercar.setEngine(v8);
        supercar.setTires(tires);
        supercar.getEngine().fueling(50, petrolStation);


        supercar.start();

        while(supercar.getEngine().getFullness() > 0){
            supercar.moveForward();
        }

        supercar.start();
        supercar.getEngine().fueling(50, petrolStation);
        supercar.start();
        while(supercar.getEngine().getFullness() > 0){
            supercar.moveForward();
        }*/

    }
}