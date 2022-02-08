package modelo;

public class Ingrediente {
	
	// ************************************************************************
		// Atributos
		// ************************************************************************

		private String ingrediente;
		private double precio;
		
		public Ingrediente(String ingre, String price)
		{
			this.ingrediente = ingre;
			double precioDouble = Double.parseDouble(price);
			this.precio = precioDouble;
		}
		
		// ************************************************************************
		// Métodos para consultar los atributos
		// ************************************************************************
		public String daringrediente()
		{
			return ingrediente;
		}
		
		public double darPrecio()
		{
			return precio;
		}

	
}
