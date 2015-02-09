package arrays;
import java.util.Scanner;

public class Arrays {
/*
    Metodo iniciar
    */
    public static void inicializar (int v[]){
    Scanner introducir=new Scanner(System.in);
    int talla, x;
    talla=v.length;

     for (x=0; x<talla; x++){
     System.out.println("Introduce el numero "+(x+1));  
     v[x]=introducir.nextInt(); 
     }
    }
    /*
    metodo mostrar
    */
    public static void mostrar (int v[]){
     int x, talla=v.length;
     for(x=0;x<talla-1;x++){System.out.print(v[x]+", ");} 
     System.out.println(v[x]+".");
    }   
    /*
    Te indica el numero maximo
    */
    public static int maximo (int v[]){
    int x, max=v[0],talla=v.length;
    for (x=1; x<talla; x++){ if(max<v[x]){max=v[x];} }   
    return max;
    }        
    /*
    Te indica el numero minimo
    */
    public static int minimo (int v[]){
    int x, min=v[0],talla=v.length;
    for (x=1; x<talla; x++){ if(min>v[x]){min=v[x];} }   
    return min;
    }   
    
    public static double media (int v[]){
    int x, suma=v[0],talla=v.length; 
    double media;
    for (x=1;x<talla;x++){suma=suma+v[x]; }
    media=suma/(double)talla;
    return media;   
    }   
    
    
   public static boolean iguales (int v1[], int v2[]){
   int x,cont=0,talla1=v1.length,talla2=v2.length;
       if (talla1==talla2){
    for (x=0;x<talla1;x++){
    if(v1[x]==v2[x]){cont++;}
    }
    }  
  
       if (cont==talla1){return true;}   
    return false;   
   }   
  
   public static boolean palindromo (int v[]){
    int x,talla=v.length, j=(talla-1),mitad=talla/2,cont=0;
    for (x=0;x<mitad;x++){if (v[x]==v[j]){cont++;} j--;}
    
    if (cont==mitad){return true;}  
    return false;
    }   
  
    
    public static void ordenar (int v[]){
    int x, aux,z, talla=v.length;
   for(z=1;z<talla;z++){  
    for (x=0; x<talla-z; x++){ 
    if(v[x]>v[(x+1)]){aux=v[x]; v[x]=v[(x+1)]; v[(x+1)]=aux;}
        }
   }
   
   for(x=0;x<talla-1;x++){System.out.print(v[x]+", ");} 
   System.out.println(v[x]+".");
      } 
  
    public static int[] copiar(int v[]){
	int talla=v.length, x;
	int[] nouvector= new int[talla];
	for (x=0;x<talla;x++){nouvector[x]=v[x];}
	return nouvector;
	}

   
    
    public static void main(String[] args) {
      Scanner introducir=new Scanner(System.in);	
      
      int v,v2, maxim, minim, op;
      double medi;
      boolean palin;
      boolean igual; 
      System.out.println("Introduce el tamaño de arrays");
        v=introducir.nextInt(); 
        int[] vector= new int[v];
        inicializar(vector);
        mostrar(vector);
      
      do { 
		System.out.println("");
       System.out.println("Elige que opcion quieres"); 
       System.out.println("1 - Maximo:");
		System.out.println("2 - Minimo:");
		System.out.println("3 - Media:");
		System.out.println("4 - Palindromo:");
		System.out.println("5 - Iguales:");
		System.out.println("6 - Copiar:");
		System.out.println("7 - Ordenar:");
       op=introducir.nextInt();
       
       
        switch (op){
       case 1: 
        maxim=maximo(vector);
       System.out.println("el maximo es "+maxim); 
       break;
       case 2:
         minim=minimo(vector);
       System.out.println("el minimo es "+minim); 
       break;
       case 3:
        medi=media(vector);
       System.out.println("la media es "+medi); 
       break;
       case 4:
        palin=palindromo(vector);
        if (palin==true){System.out.println("es palindromo");}
        else {System.out.println("no es palindromo");}
        break;
        case 5:
        System.out.println("Introduce el tamaño del segundo arrays");
        v2=introducir.nextInt(); 
        int[] vector2= new int[v2];
        inicializar(vector2);
        mostrar(vector2);
        
        igual=iguales(vector,vector2);
         if (igual==true){System.out.println("son iguales");}
         else {System.out.println("son diferentes");}
         break;
        case 6:
          int[] vector3= new int[vector.length];
          vector3=copiar(vector);
          mostrar(vector3);
          break;
         case 7:
           ordenar(vector);
           break;
        default: System.out.print("Has introducido mal el operador!");	
        
        
         }
         
        } while (op<8); 
         
    }
    
}
