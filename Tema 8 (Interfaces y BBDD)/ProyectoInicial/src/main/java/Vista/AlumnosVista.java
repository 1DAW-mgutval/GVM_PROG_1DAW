package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AlumnosVista extends JFrame {

        private JComboBox<String> cbCursos;
        private JButton btnRefrescar;
        private JLabel lblAnadirAlumno;
        private JTable tablaAlumnos;
        private DefaultTableModel modeloTabla;

        public AlumnosVista() {
            setTitle("Listado de Alumnos");
            setSize(800, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            initComponents();
        }

        private void initComponents() {
            // Panel superior (Filtros)
            JPanel panelFiltro = new JPanel(new FlowLayout(FlowLayout.LEFT));
            panelFiltro.add(new JLabel("Filtrar por curso:"));

            cbCursos = new JComboBox<>();
            cbCursos.addItem("Todos los cursos");
            // Aquí el controlador cargará los cursos reales
            panelFiltro.add(cbCursos);

            btnRefrescar = new JButton("Refrescar");
            panelFiltro.add(btnRefrescar);

            // Panel para el enlace "Añadir alumno"
            JPanel panelAnadir = new JPanel(new FlowLayout(FlowLayout.LEFT));
            lblAnadirAlumno = new JLabel("<html><a href=''>Añadir alumno</a></html>");
            lblAnadirAlumno.setCursor(new Cursor(Cursor.HAND_CURSOR));
            panelAnadir.add(lblAnadirAlumno);

            // Contenedor para la parte superior
            JPanel panelTop = new JPanel(new BorderLayout());
            panelTop.add(panelFiltro, BorderLayout.NORTH);
            panelTop.add(panelAnadir, BorderLayout.SOUTH);

            // Tabla
            String[] columnas = {"Nombre", "Email", "Mayor de edad", "Curso", "Acciones"};
            modeloTabla = new DefaultTableModel(columnas, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return column == 4; // Solo la columna de acciones (Editar) es "editable" para pulsar el botón
                }
            };
            tablaAlumnos = new JTable(modeloTabla);

            // (Opcional) Aquí tendrías que añadir un TableCellRenderer y Editor personalizado
            // para que la columna "Acciones" se vea y funcione como un texto clickeable "Editar".

            JScrollPane scrollPane = new JScrollPane(tablaAlumnos);

            // Añadir todo al Frame
            setLayout(new BorderLayout(10, 10));
            add(new JLabel("<html><h1>Listado de Alumnos</h1></html>"), BorderLayout.NORTH);
            add(panelTop, BorderLayout.CENTER); // Reorganizamos un poco para que cuadre

            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(panelTop, BorderLayout.NORTH);
            mainPanel.add(scrollPane, BorderLayout.CENTER);

            add(mainPanel, BorderLayout.CENTER);
        }

        // Getters para que el Controlador pueda acceder a los componentes
        public JButton getBtnRefrescar() { return btnRefrescar; }
        public JComboBox<String> getCbCursos() { return cbCursos; }
        public JLabel getLblAnadirAlumno() { return lblAnadirAlumno; }
        public DefaultTableModel getModeloTabla() { return modeloTabla; }
        public JTable getTablaAlumnos() { return tablaAlumnos; }
}
