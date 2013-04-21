package somtab;
import java.util.*;
public class Somtab {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int tab1[],tab2[],i,T;
System.out.println("entré la taille du tableau1");
T = scan.nextInt();
tab1 = new int[T];
for(i = 0;i<tab1.length;i++){
System.out.println("entré l'element"+(i+1) );
tab1[i] = scan.nextInt();
}
for(i=0;i<tab1.length;i++){
System.out.println("l'élément"+":"+tab1[i]+"\n");
}
tab2 = new int[T];
for(i=0;i<tab2.length;i++){
System.out.println("entré l'élément"+(i+1));
tab2[i] = scan.nextInt();
}
for(i=0;i<tab2.length;i++){
System.out.println("l'element"+":"+tab2[i]+"\n");
}
int som = 0;
som=tab1[i]+tab2[i];
System.out.println(som);
}
} 