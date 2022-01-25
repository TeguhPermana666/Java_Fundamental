package dat.src;

public class operator_unary {
    public static void main(String[] args) {
        //Operator unary
        int a=11;
        System.out.println("Nilai dari a adalah ="+ +a);
        System.out.println("Nilai dari a adalah ="+ -a);
        
        //Operator icrement
        System.out.println("\n\nIncerement Aplication");
            //Prefix
            System.out.printf("Nilai dari a prefix adalah %d",++a);
            //Postfix
            int b=11;
            System.out.printf("\nNilai dari b postfix adalah %d",b++);
            System.out.printf("\nNilai dari b adalah %d",b);
        //Operator decrement
        System.out.println("\n\nDecrement Aplication");
            //Prefix
            System.out.println("Nilai dari a prefix adalah "+ --a);
            
            System.out.println("Nilai dari b postfix adalah "+ b--);
            System.out.println("Nilai dari b adalah "+b);
        //Operator logika
        System.out.println("\n\nLogika Aplication");
        boolean ucup=true;
        System.out.println("Nilai dari ucup adalah "+ucup);
        System.out.println("Nilai dari ucup adalah "+!ucup);

    }
}
