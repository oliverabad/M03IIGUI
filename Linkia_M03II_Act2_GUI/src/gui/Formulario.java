package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Formulario extends JFrame {
	private static JFrame jframe;
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private static JDialog jdialog;
	private ButtonGroup btng;

	public Formulario() {
		jframe = new JFrame();
		setDefaultCloseOperation(jframe.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(47, 34, 97, 16);
		getContentPane().add(lblNombre);

		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellidos.setBounds(47, 63, 97, 16);
		getContentPane().add(lblApellidos);

		tfNombre = new JTextField();
		tfNombre.setBounds(145, 32, 223, 22);
		getContentPane().add(tfNombre);
		tfNombre.setColumns(10);

		tfApellidos = new JTextField();
		tfApellidos.setBounds(145, 60, 223, 22);
		getContentPane().add(tfApellidos);
		tfApellidos.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Seleccione una opcion", "10-15", "15-20", "20-25", "25-50", "+50" }));
		comboBox.setBounds(145, 89, 223, 22);
		getContentPane().add(comboBox);

		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdad.setBounds(47, 92, 56, 16);
		getContentPane().add(lblEdad);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSexo.setBounds(47, 214, 56, 16);
		getContentPane().add(lblSexo);

		btng = new ButtonGroup();
		JRadioButton rdbtnHombre = new JRadioButton("HOMBRE");
		rdbtnHombre.setBounds(145, 211, 127, 25);
		getContentPane().add(rdbtnHombre);
		btng.add(rdbtnHombre);

		JRadioButton rdbtnMujer = new JRadioButton("MUJER");
		rdbtnMujer.setBounds(308, 211, 127, 25);
		getContentPane().add(rdbtnMujer);
		btng.add(rdbtnMujer);

		JLabel lblAficiones = new JLabel("Aficiones:");
		lblAficiones.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAficiones.setBounds(47, 312, 90, 16);
		getContentPane().add(lblAficiones);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Deporte");
		chckbxNewCheckBox.setBounds(145, 369, 113, 25);
		getContentPane().add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Bailar");
		chckbxNewCheckBox_1.setBounds(276, 369, 113, 25);
		getContentPane().add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Viajar");
		chckbxNewCheckBox_2.setBounds(145, 339, 113, 25);
		getContentPane().add(chckbxNewCheckBox_2);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Yoga");
		chckbxNewCheckBox_3.setBounds(276, 339, 113, 25);
		getContentPane().add(chckbxNewCheckBox_3);

		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Cine");
		chckbxNewCheckBox_4.setBounds(145, 309, 113, 25);
		getContentPane().add(chckbxNewCheckBox_4);

		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Idiomas");
		chckbxNewCheckBox_5.setBounds(276, 309, 113, 25);
		getContentPane().add(chckbxNewCheckBox_5);

		this.setTitle("Formulario");
		// this.setSize(700, 600);
		this.setBounds(600, 200, 700, 600);
		setVisible(true);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAceptar.setBounds(306, 493, 97, 25);
		getContentPane().add(btnAceptar);

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evn) {
				if (tfNombre.getText().isEmpty() || tfApellidos.getText().isEmpty() || comboBox.getSelectedIndex() == 0
						|| rdbtnHombre.isSelected() == false & rdbtnMujer.isSelected() == false
						|| !chckbxNewCheckBox.isSelected() & !chckbxNewCheckBox_1.isSelected()
								& !chckbxNewCheckBox_2.isSelected() & !chckbxNewCheckBox_3.isSelected()
								& !chckbxNewCheckBox_4.isSelected() & !chckbxNewCheckBox_5.isSelected()) {
					jdialog = new JDialog(jframe, "Formulario INCORRECTO");
					JLabel lblerror = new JLabel("ERROR CAMPOS DEL FORMULARIO VACÍOS", JLabel.CENTER);
					lblerror.setFont(new Font("Tahoma", Font.BOLD, 18));
					lblerror.setForeground(Color.RED);
					jdialog.getContentPane().add(lblerror);
					jdialog.setSize(500, 400);
					jdialog.setVisible(true);
				} else {
					jdialog = new JDialog(jframe, "FORMULARIO CORRECTO");
					JLabel lblaplicacion = new JLabel("GRACIAS POR UTILIZAR LA APLICACION", JLabel.CENTER);
					lblaplicacion.setFont(new Font("Tahoma", Font.BOLD, 18));
					lblaplicacion.setForeground(Color.BLUE);
					jdialog.getContentPane().add(lblaplicacion);
					jdialog.setSize(500, 400);
					jdialog.setVisible(true);
				}
			}
		});

	}

}
