//Este nos permite ingresar datos a través de la consola por el usuario
import java.util.Scanner;

//creamos una clase pública
public class ProyectoFinal {

 public static void main (String[] args) {

 Scanner calculadora=new Scanner(System.in);

   //Declaración de las variables	 
   int numero1, numero2, opcion, op, suma=0, resta=0, multiplicar=0, dividir=0;String[] sumas=new String[10000]; String[] restas=new String[10000]; String[] multi=new String[10000]; String[] divi=new String[10000]; 

	// Acá se encuentra el menú de opciones que el usuario puede elegir
      do{
       System.out.println("Menu de opciones");
       System.out.println("1. Suma de dos numero");
       System.out.println("2. Resta de dos numeros");
       System.out.println("3. Multiplicacion de dos numeros");
       System.out.println("4. Division de dos numeros");
       System.out.println("5. Ver Bitacora");
       System.out.println("6. Borrar Bitacora");
       System.out.println("7. Salir");
       System.out.println("\nIngrese una opcion");   
     

   op = calculadora.nextInt();  

  
         switch (op) {  

               
	//El caso 1 lo utilizaremos para la suma        
        case 1:
		System.out.println("Selecciono la opcion \"1.Suma de dos numeros\""+'\n');
		System.out.println ("Ingrese Número 1:");

		//El usuario ingresa los numeros a sumar
     		numero1=calculadora.nextInt();
      		System.out.println("Ingrese numero 2:");
    		numero2=calculadora.nextInt();

		//Resultado de la operación
		suma=numero1+numero2;

		//La información se almacena para ser enviada a la bitacora
		sumas[suma]=numero1+"+"+numero2+"="+""+suma;

		//Se imprime en pantalla el resultado de la operación
           	System.out.println("El Resultado de la Operacion es: " + suma +'\n');

		//El menú se desplega nuevamente al presionar ENTER 
		System.out.println("Presione Una Tecla Para Desplegar Nuevamente El Menu Principal");
		String j ="";
		Scanner menu=new Scanner(System.in);
		j=menu.nextLine();
		System.out.println('\n');
	    break;

	//El caso 2 lo utilizaremos para la resta 
	case 2:
		System.out.println("Selecciono la opcion \"2.Resta de dos numeros\""+'\n');
           	System.out.println ("Ingrese Número 1:");

		//El usuario ingresa los numeros a restar
     		numero1=calculadora.nextInt();
      		System.out.println("Ingrese numero 2:");
    		numero2=calculadora.nextInt();

		//Resultado de la operación
		resta=numero1-numero2;
		
		//La información se almacena para ser enviada a la bitacora
		restas[resta]=numero1+"+"+numero2+"="+""+resta;
		
		//Se imprime en pantalla el resultado de la operación
           	System.out.println("El Resultado de la Operacion es: " + resta +'\n'); 

		//El menú se desplega nuevamente al presionar ENTER
		System.out.println("Presione Una Tecla Para Desplegar Nuevamente El Menu Principal");
		String k ="";
		Scanner menu1=new Scanner(System.in);
		k=menu1.nextLine();
		System.out.println();
	    break;

	
	//El caso 3 lo utilizaremos para la multiplicación 
	case 3:
		System.out.println("Selecciono la opcion \"3.Multiplicacion de dos numeros\""+'\n');
                System.out.println ("Ingrese Número 1:");

		
		//El usuario ingresa los numeros a multiplicar
     		numero1=calculadora.nextInt();
      		System.out.println("Ingrese numero 2:");
    		numero2=calculadora.nextInt();
		
		//Resultado de la operación
		multiplicar=numero1*numero2;

		//La información se almacena para ser enviada a la bitacora
		multi[multiplicar]=numero1+"+"+numero2+"="+""+multiplicar;

           	System.out.println("El Resultado de la Operacion es: " + multiplicar +'\n'); 

		//El menú se desplega nuevamente al presionar ENTER
		System.out.println("Presione Una Tecla Para Desplegar Nuevamente El Menu Principal");
		String l ="";
		Scanner menu2=new Scanner(System.in);
		l=menu2.nextLine();
		System.out.println();
            break;

	
	//El caso 4 lo utilizaremos para la division 
	case 4:
		System.out.println("Selecciono la opcion \"4.Division de dos numeros\""+'\n');
                System.out.println ("Ingrese numero 1:");

		//El usuario ingresa los numeros a dividir
     		numero1=calculadora.nextInt();
      		System.out.println("Ingrese numero 2:");
    		numero2=calculadora.nextInt();

		//Se verifica si el divisor es diferente a 0
		if(numero2!=0){

		//Resultado de la operacion
		dividir=numero1/numero2;

		//La informacion se almacena para ser enviada a la bitacora
		divi[dividir]=numero1+"+"+numero2+"="+""+dividir;
		System.out.println("El Resultado de la Operacion es: " + dividir +'\n');
           
		}else{System.out.println("Error: Division entre 0 no es permitida!");}
		
		//El menu se desplega nuevamente al presionar ENTER
		System.out.println("Presione Una Tecla Para Desplegar Nuevamente El Menu Principal");
		String m ="";
		Scanner menu3=new Scanner(System.in);
		m=menu3.nextLine();
		System.out.println('\n');
	    break;

	case 5:
		System.out.println("Se realizaron las siguientes operaciones: "+'\n');

		//Se declaran las variables
		int sum=0, res=0, mult=0, div=0;

		//Se verifica si las condiciones se cumplen para un ciclo while
		while(sum<50){
		if(sumas[sum]==null || sumas[sum]==""){ 
		if(restas[res]==null || restas[res]==""){
		if(multi[mult]==null || multi[mult]==""){
		if(divi[div]==null || divi[div]==""){ 

		System.out.println("Presione Una Tecla Para Desplegar Nuevamente El Menu Principal");
		String ingrese5="";
		Scanner ot5=new Scanner(System.in);
		ingrese5 = ot5.nextLine();
		System.out.println('\n');
		break;

		}else{

		System.out.println(divi[div]);
		div=div+1;}

		}else{

		System.out.println(multi[mult]);
		mult=mult+1;
		}

		}else{

		System.out.println(restas[res]);
		res=res+1;
		}
		
		}else{

		System.out.println(sumas[sum]);
		sum=sum+1;
		}

	}	
	break;

	
	case 6:
            System.exit(0);
            break;
	default:System.out.println("La opcion ingresada no es valida");
	break;

     }           
    } while (op !=6);
   }
  }
 