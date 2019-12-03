package vista;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import modelo.Libro;

public class ModeloTablaVtn extends AbstractTableModel {
	
	private int li_codigo;
	private String li_titulo;
	private String autor;
	private String fecha_publicacion;
	
		public String[] columnas = { "li_codigo", "li_titulo", "autor","fecha_publicacion"};
	    public Class[] columnasTipos = { int.class, String.class, String.class, String.class};
	    private List<Libro> libros;

	    public ModeloTablaVtn() {
	      super();
	      libros = new ArrayList<Libro>();
	    }
	    
	    public ModeloTablaVtn(List<Libro> libros) {
	      super();
	      this.libros = libros;
	    }
	    public int getColumnCount() {
	      return columnas.length;
	    }
	    public int getRowCount() {
	      return libros.size();
	    }
	    public void setValueAt(Object value, int row, int col) {
	    	Libro libro = (Libro) (libros.get(row));

			switch (col) {
			case 0:
				libro.setLi_codigo((int) value);
				//dato.setLocation_id((int) value);
				break;
			case 1:
				libro.setLi_titulo((String) li_titulo);
				break;
			case 2:
				libro.setAutor((String) autor);
				break;
			case 3:
				libro.setFecha_publicacion((String) fecha_publicacion);
				break;
			default:
				break;
	      }
	    }

	    public String getColumnName(int col) {
	      return columnas[col];
	    }

	    public Class getColumnClass(int col) {
	      return columnasTipos[col];
	    }
	    public Object getValueAt(int row, int col) {
	    	Libro libro = (Libro) (libros.get(row));

	      switch (col) {
			case 0:
				return libro.getLi_codigo();
			case 1:
				return libro.getLi_titulo();
			case 2:
				return libro.getAutor();
			case 3:
				return libro.getFecha_publicacion();
			default:
				break;
	      }
	      return new String();
	    }

}

	
	
	
	
	
	
	
	
	
	
	

