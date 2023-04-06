Primera parte:

```

public class Ejercicio1 {

    public static void main(String[] args) {

        int num1 = 5;

        int num2 = 10;

        int num3 = 15;

        

        int suma = sumar(num1, num2, num3);

        

        System.out.println("La suma de los tres números es: " + suma);

    }

    

    public static int sumar(int num1, int num2, int num3) {

        return num1 + num2 + num3;

    }

}

```

Segunda parte:

```

public class Coche {

    private int numPuertas;

    

    public Coche() {

        numPuertas = 0;

    }

    

    public void addPuerta() {

        numPuertas++;

    }

    

    public int getNumPuertas() {

        return numPuertas;

    }

}

public class Ejercicio2 {

    public static void main(String[] args) {

        Coche miCoche = new Coche();

        

        miCoche.addPuerta();

        

        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");

    }

}

```
