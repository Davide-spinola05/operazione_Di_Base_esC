/*Scrivere un programma che letti come argomenti da linea di comando
i tre coefficienti a, b, c di un'equazione di secondo grado, trovi le soluzioni.*/

public class Main {
    public static void main(String[] args) {
        if(args.length != 3){ //verifichiamo qaunti argomenti l'utente ci ha passato durante linea di comando
            System.out.println("è stato inserito una quantità di numeri sbagliata, sono accettati 3 valori");
            return; //se l'utente ci ha passato una quantità di argomenti diversi da 3 allora interrompiamo il programma
        }
        double a = Double.parseDouble(args[0]);// convertiamo l'argomento in posizione 0 (a) da stringa a double
        double b = Double.parseDouble(args[1]);// convertiamo l'argomento in posizione 1 (b) da stringa a double
        double c = Double.parseDouble(args[2]);// convertiamo l'argomento in posizione 2 (c) da stringa a double

        double delta = b * b - 4 * a * c;
        if(delta > 0){
            double x1 = (- b + Math.sqrt(delta)) / (2 * a);
            double x2 = (- b - Math.sqrt(delta)) / (2 * a);
            System.out.println("il valore di x1 e':" + x1);
            System.out.println("il valore di x2 e':" + x2);
        } else if (delta == 0) {
            double x = - b / (2 * a);
            System.out.println("il valore di x e':" + x);
        }else{
            System.out.println("equazione impossibile");
        }


    }
}