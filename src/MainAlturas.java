import entities.People;

import java.util.Scanner;

public class MainAlturas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double alturasSum = 0;
        double idadeSum = 0;
        System.out.print("Quantas pessoas serão inseridas?: ");
        int q = sc.nextInt();

        People[] people = new People[q];

        for(int i = 0; i < people.length; i++){
            String nome;
            double altura;
            int  age;

            System.out.print("Dados da " + (i + 1) +"° Pessoa: ");

            System.out.print("Name: ");
            nome =  sc.next();

            System.out.print("Age: ");
            age = sc.nextInt();

            System.out.println("Hight: ");
            altura = sc.nextDouble();

            people[i] = new People(nome, age, altura);
        }

        for(int i = 0; i < people.length; i++){
            alturasSum += people[i].getAltura();
            if(people[i].getAge() > 16){
                idadeSum++;;
            }
        }
        System.out.printf("Média de altura do grupo: %.2f \n",(alturasSum / people.length));
        System.out.printf("Porcentagem das pessoas com menos de 16 anos do grupo: %.2f %% \n",((idadeSum / people.length)*100));
        System.out.println("Nome das pessoas com Menos de 16 anos: ");
        for(int i = 0; i < people.length; i++){
            if(people[i].getAge() < 16){
                System.out.println((i+1) + "° Pessa: "+ people[i].getName());
            }
        }

        sc.close();
    }
}
