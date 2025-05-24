package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        JLabel labelNombre = new JLabel("NOMBRE: ");
        txtNombre = new JTextField();

        // Crea el selector para la calificación con una etiqueta al frente
        JLabel labelCalif = new JLabel("CALIFICACIÓN: ");
        cbbCalificacion = new JComboBox<String>();
        cbbCalificacion.addItem("5");
        cbbCalificacion.addItem("4");
        cbbCalificacion.addItem("3");
        cbbCalificacion.addItem("2");
        cbbCalificacion.addItem("1");

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        JLabel labelVisitado = new JLabel("VISITADO? ");
        cbbVisitado = new JComboBox<String>();
        cbbVisitado.addItem("Sí");
        cbbVisitado.addItem("No");

        // Agregar todos los elementos al panel
        setLayout( new GridLayout(3,1) );
        this.add(labelNombre);
        this.add(txtNombre);
        
        this.add(labelCalif);
        this.add(cbbCalificacion);
        
        this.add(labelVisitado);
        this.add(cbbVisitado);
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        String visita = ( String )cbbCalificacion.getSelectedItem();
        if (visita == "Sí") {
        	return true;
        }
        return false;
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        String nombre = txtNombre.getSelectedText();
        return nombre;
    }
}
