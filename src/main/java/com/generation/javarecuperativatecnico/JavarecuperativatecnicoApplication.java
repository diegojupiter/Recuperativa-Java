package com.generation.javarecuperativatecnico;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.javarecuperativatecnico.models.Producto;

@SpringBootApplication
public class JavarecuperativatecnicoApplication {

	//Funcion que permite ingresar los productos

	public static ArrayList <String> ingProducto(int cantProd){
		ArrayList <String> prodArray = new ArrayList<>();
		for (int i = 0; i < cantProd; i++){
			String nomProd = strIn("ingrese producto: " + (i+1));
			prodArray.add(nomProd);
		}
		return prodArray;
	}

	//Funcion que permite ingresar el tipo de producto

	public static ArrayList <String> ingTipoProducto(int tipoProd){
		ArrayList <String> tipProdArray = new ArrayList<>();
		for (int i = 0; i < tipoProd; i++){
			String tipProd = strIn("Ingrese tipo de producto: " + (i+1));
			tipProdArray.add(tipProd);
		}
		return tipProdArray;
	}

	//Funcion que permite calcular la ganancia

	public static Integer ganancia (ArrayList<Integer> gananc){
		int resta = 0;
		for(int i = 0; i < gananc.size(); i++){
			resta = resta - gananc.get(i);
		}
		return resta;
	}


	public static void main(String[] args) {
	
		//MENU
		Scanner teclado = new Scanner(System.in);

		int opcion = 1;
		while(opcion != 0){
			do{
				System.out.println("Bienvenido don José");
				System.out.println("Ingresa 1 si quiere saber la ganancia de un producto");
				System.out.println("Ingrese 2 si quiere guardar un producto");
				System.out.println("Ingrese 3 si quiere guardar productos y obtener ganancia total, producto más caro y producto más barato");
				System.out.println("Ingrese 0 para salir del menú");

			} while (opcion < 0 || opcion > 3);
			if(opcion == 1){
				HashMap <String, ArrayList<Integer>> costo = new HashMap<>();
				int cantProd;
				int costo;
				System.out.println("Ingrese cantidad de productos a guardar");
				cantProd = teclado. nextInt();
				System.out.println("Ingrese si tiene el costo de compra y valor de venta del producto: ");
				costo = teclado.nextInt();

				for (int i = 1; i <= costo; i++){
					ArrayList<Integer> costos = new ArrayList<Integer>();
					Producto product = new Producto();
					teclado.nextLine();
					System.out.println("Ingrese nombre de producto");
					product.setNombreProducto(teclado.nextLine());

					for (int x = 1; i <= cantProd; i++){
						System.out.println("Ingrese precio de venta " +x+ "del producto " + product.getNombreProducto() + ": ");
						product.setPrecioVenta(teclado.nextInt());
						costos.add(product.getPrecioVenta());
						System.out.println("Ingrese costo de compra " +x+ " del prodcuto " + product.getNombreProducto() + ": ");
						product.setPrecioCompra(teclado.nextInt());
						costos.add(product.getPrecioCompra());
					}
					costo.put(product.getNombreProducto(), costos);	
				}

				for(String i = costo.keySet()){
					Integer ganancia = ganancia(costo.get(i));
					System.out.println("La ganancia del producto " +i+ "es de: " + ganancia);
				}

			}else if(opcion == 2){
				productos();

			}else if(opcion == 3){
				ArrayList<Integer> ganancias = new ArrayList<Integer>();
				System.out.println("Ingrese cantidad de ganancias de productos que va a comparar: ");
				int cantProd = teclado.nextInt();

				for(int i = 0; i < cantProd; i++){
					Producto newProduct = new Producto();

					do {
						System.out.println("Ingrese ganancia numero" + (i+1));
						System.out.println("Ingrese ganancia: ");
						newProduct.setGanancia(teclado.nextInt());

					} while (i > cantProd);
					ganancias.add(newProduct.getGanancia());
				}
			}

		}
	}

}
