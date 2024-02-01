//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("    ");

        dog=dog+2;
        cat=cat+2;
        paper=paper+2;

        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("    ");

        var friend=19;
            System.out.println(friend);
            friend=friend+2;
            System.out.println(friend);
            friend=friend/7;
            System.out.println(friend);
            System.out.println("    ");

        var frog=3.5;
            System.out.println(frog);
            frog=frog*10;
            System.out.println(frog);
            frog=frog/3.5;
            System.out.println(frog);
            frog=frog+4;
            System.out.println(frog);
            System.out.println("    ");

        var firstBoxer=78.2;
        var secondBoxer=82.7;
        var sumBoxers=firstBoxer+secondBoxer;
            System.out.println(sumBoxers);
            System.out.println("   ");

        var diffBoxers1=secondBoxer-firstBoxer;
            System.out.println(diffBoxers1);
            System.out.println("   ");

        var diffBoxers2=secondBoxer % firstBoxer;
            System.out.println(diffBoxers2);
            System.out.println("   ");

        var totalTime=640;
        var workTime=8;
        var amountWorkers=totalTime/workTime;
            System.out.println("Всего работников в компании - "+ amountWorkers);
            System.out.println("   ");
            amountWorkers=amountWorkers+94;
            totalTime=amountWorkers*workTime;
            System.out.println("Если в компании работает - "+ amountWorkers +" человек, то всего " + totalTime+ " часов");
            System.out.println("работы может быть поделено между сотрудниками");
            System.out.println("   ");













    }
}