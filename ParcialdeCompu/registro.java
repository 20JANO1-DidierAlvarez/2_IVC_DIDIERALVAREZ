import javax.swing.JTable;

/**
 *
 * @author
 */
public class registro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(registro.class.getName());

    private int tiposIntrs, añosMeses;
    private double credito;
    private int periodoMax, periodoMin;
    private double interesMin, interesMax;
    private double incremento;
    private boolean tablaPagos; 
    private double pagoMensual;
    
    private javax.swing.JTable jtablaPrestamo;
    private javax.swing.JTable jtablaCabsFilas;
    
    private void initTable(final int filasTabla, final int colTabla) {
        class CModeloTablaPrestamo extends javax.swing.table.AbstractTableModel {
            Object dato[][] = new Object[filasTabla][colTabla];
            String cabecera[] = new String[colTabla];
            boolean editColum[] = new boolean[colTabla];

            CModeloTablaPrestamo() {
                for (int c = 0; c < colTabla; ++c) {
                    cabecera[c] = "Columna " + c;
                    if (c != 0) editColum[c] = true;
                }
            }
            public int getColumnCount() { return cabecera.length; }
            public int getRowCount() { return dato.length; }
            public String getColumnName(int col) { return cabecera[col]; }
            public Object getValueAt(int fila, int col) { return dato[fila][col]; }
            public void setValueAt(Object obj, int fila, int col) { dato[fila][col] = obj; }
            public boolean isCellEditable(int indFila, int indColum) { return editColum[indColum]; }
        }

       
        javax.swing.table.TableColumnModel modeloColums = new javax.swing.table.DefaultTableColumnModel() {
            boolean primeraCol = true;
            public void addColumn(javax.swing.table.TableColumn col) {
                if (primeraCol) { primeraCol = false; return; }
                col.setMinWidth(110);
                super.addColumn(col);
            }
        };

      
        javax.swing.table.TableColumnModel modeloCabsFilas = new javax.swing.table.DefaultTableColumnModel() {
            boolean primeraCol = true;
            public void addColumn(javax.swing.table.TableColumn col) {
                if (primeraCol) {
                    col.setMaxWidth(55);
                    super.addColumn(col);
                    primeraCol = false;
                }
            }
        };

        javax.swing.table.TableModel modeloTabla = new CModeloTablaPrestamo();
        jtablaPrestamo = new javax.swing.JTable(modeloTabla, modeloColums);
        jtablaCabsFilas = new javax.swing.JTable(modeloTabla, modeloCabsFilas);
        
        jtablaPrestamo.createDefaultColumnsFromModel();
        jtablaCabsFilas.createDefaultColumnsFromModel();
        
        // Sincronización y estética
        jtablaPrestamo.setSelectionModel(jtablaCabsFilas.getSelectionModel());
        jtablaCabsFilas.setBackground(java.awt.Color.lightGray);
        jtablaCabsFilas.setSelectionBackground(java.awt.Color.lightGray);
        
        jtablaPrestamo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtablaCabsFilas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        
        // Configuración del ScrollPane
        jScrollPane1.setViewportView(jtablaPrestamo);
        javax.swing.JViewport jv = new javax.swing.JViewport();
        jv.setView(jtablaCabsFilas);
        jv.setPreferredSize(jtablaCabsFilas.getMaximumSize());
        jScrollPane1.setRowHeader(jv);
    }
    
    private void jtablaPrestamoMouseClicked(java.awt.event.MouseEvent evt) {
        Object datoCelda = jtablaPrestamo.getValueAt(jtablaPrestamo.getSelectedRow(), jtablaPrestamo.getSelectedColumn());
        if (datoCelda != null && tablaPagos) {
            StringBuffer s = new StringBuffer(datoCelda.toString());
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '.') s.delete(i, i + 1);
                if (s.charAt(i) == ',') s.setCharAt(i, '.');
            }
            pagoMensual = Double.parseDouble(s.toString().trim());
            jbtCalculoAmort.setEnabled(true);
        }
    }
    
    public registro() {
        initComponents();
        this.setTitle("Préstamos Bancarios");
        this.setLocationRelativeTo(null);
        tiposIntrs = 18;
        añosMeses = 4;
        this.setSize(550,460);
        this.setResizable(false);
        
        jmItemAños.setEnabled(false);
        jPanel1.setBorder(new javax.swing.border.TitledBorder("Años del préstamo"));
        
        jtfCredito.setText("6000");
        jtfPeriodoMax.setText("1");
        jtfPeriodoMin.setText("1");
        jtfInteresMax.setText("10.00");
        jtfInteresMin.setText("0.00");
        jcbIncremento.setSelectedIndex(2);
        
        initTable(tiposIntrs, añosMeses + 1);
    }
    
    private StringBuffer AlinDer(String patron, double dato) {
        java.text.DecimalFormat formato = new java.text.DecimalFormat(patron);
        StringBuffer salida = new StringBuffer();
        java.text.FieldPosition fp = new java.text.FieldPosition(java.text.NumberFormat.FRACTION_FIELD);
        formato.format(dato, salida, fp);
        for (int i = 0; i < (patron.length() - fp.getEndIndex()); i++) {
            salida.insert(0, ' ');
        }
        return salida;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfCredito = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfPeriodoMax = new javax.swing.JTextField();
        jtfPeriodoMin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfInteresMax = new javax.swing.JTextField();
        jtfInteresMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbIncremento = new javax.swing.JComboBox<>();
        jbtCalculoPagos = new javax.swing.JButton();
        jbtCalculoAmort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnuOpciones = new javax.swing.JMenu();
        jmItemInstruc = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmItemSalir = new javax.swing.JMenuItem();
        jmnuPrestanoEn = new javax.swing.JMenu();
        jmItemAños = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmItemMeses = new javax.swing.JMenuItem();
        jmnuAyuda = new javax.swing.JMenu();
        jmItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(485, 385));

        jLabel1.setText("Crédito:");

        jtfCredito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Duración del préstamo"));
        jPanel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N

        jLabel2.setText("Máximo:");

        jLabel3.setText("Mínimo:");

        jtfPeriodoMax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jtfPeriodoMin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(jtfPeriodoMin, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtfPeriodoMax)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfPeriodoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfPeriodoMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de interés"));

        jLabel4.setText("% máximo:");

        jLabel5.setText("% mínimo:");

        jtfInteresMax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jtfInteresMin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setText("Incremento:");

        jcbIncremento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.10", "0.20", "0.30", "0.40", "0.50" }));
        jcbIncremento.addActionListener(this::jcbIncrementoActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jcbIncremento, 0, 74, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfInteresMax)
                            .addComponent(jtfInteresMin))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfInteresMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfInteresMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jbtCalculoPagos.setForeground(new java.awt.Color(0, 0, 0));
        jbtCalculoPagos.setText("Pagos");
        jbtCalculoPagos.addActionListener(this::jbtCalculoPagosActionPerformed);

        jbtCalculoAmort.setForeground(new java.awt.Color(0, 51, 204));
        jbtCalculoAmort.setText("Amortización");
        jbtCalculoAmort.addActionListener(this::jbtCalculoAmortActionPerformed);

        jmnuOpciones.setForeground(new java.awt.Color(0, 102, 102));
        jmnuOpciones.setMnemonic('O');
        jmnuOpciones.setText("Opciones");

        jmItemInstruc.setMnemonic('I');
        jmItemInstruc.setText("Instrucciones");
        jmItemInstruc.addActionListener(this::jmItemInstrucActionPerformed);
        jmnuOpciones.add(jmItemInstruc);
        jmnuOpciones.add(jSeparator1);

        jmItemSalir.setMnemonic('S');
        jmItemSalir.setText("Salir");
        jmItemSalir.addActionListener(this::jmItemSalirActionPerformed);
        jmnuOpciones.add(jmItemSalir);

        jMenuBar1.add(jmnuOpciones);

        jmnuPrestanoEn.setForeground(new java.awt.Color(0, 102, 102));
        jmnuPrestanoEn.setMnemonic('P');
        jmnuPrestanoEn.setText("Préstamo en");

        jmItemAños.setMnemonic('A');
        jmItemAños.setText("Años");
        jmItemAños.addActionListener(this::jmItemAñosActionPerformed);
        jmnuPrestanoEn.add(jmItemAños);
        jmnuPrestanoEn.add(jSeparator2);

        jmItemMeses.setMnemonic('M');
        jmItemMeses.setText("Meses");
        jmItemMeses.addActionListener(this::jmItemMesesActionPerformed);
        jmnuPrestanoEn.add(jmItemMeses);

        jMenuBar1.add(jmnuPrestanoEn);

        jmnuAyuda.setForeground(new java.awt.Color(0, 102, 102));
        jmnuAyuda.setMnemonic('A');
        jmnuAyuda.setText("Ayuda");

        jmItemAcercaDe.setMnemonic('A');
        jmItemAcercaDe.setText("Acerca de");
        jmItemAcercaDe.addActionListener(this::jmItemAcercaDeActionPerformed);
        jmnuAyuda.add(jmItemAcercaDe);

        jMenuBar1.add(jmnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtCalculoAmort, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtCalculoPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtfCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtCalculoPagos)
                .addGap(18, 18, 18)
                .addComponent(jbtCalculoAmort)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCalculoPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCalculoPagosActionPerformed
        try {
            credito = Double.parseDouble(jtfCredito.getText());
            periodoMin = Integer.parseInt(jtfPeriodoMin.getText());
            periodoMax = Integer.parseInt(jtfPeriodoMax.getText());
            interesMin = Double.parseDouble(jtfInteresMin.getText());
            interesMax = Double.parseDouble(jtfInteresMax.getText());
            incremento = Double.parseDouble((String)jcbIncremento.getSelectedItem());

            if (credito <= 0 || periodoMin <= 0 || periodoMax < periodoMin || 
                interesMin < 0 || interesMax < interesMin) 
                throw new NumberFormatException();
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos no válidos", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        tiposIntrs = (int)((interesMax - interesMin) / incremento) + 1;
        añosMeses = (periodoMax - periodoMin) + 1;
        
        int filas = tiposIntrs, cols = añosMeses;
        if (tiposIntrs < 18) filas = 18;
        if (añosMeses < 4) cols = 4;
        
        initTable(filas, cols + 1);


        for (int fila = 0; fila < tiposIntrs; ++fila) {
            jtablaCabsFilas.setValueAt(AlinDer("##0.00", interesMin + incremento * fila) + "%", fila, 0);
        }

        String per = jmItemAños.isEnabled() ? " meses" : " años";
        for (int columna = 0; columna < añosMeses; ++columna) {
            javax.swing.table.TableColumn colum = jtablaPrestamo.getColumnModel().getColumn(columna);
            colum.setHeaderValue((periodoMin + columna) + per);
        }

       
        int P = jmItemAños.isEnabled() ? 1 : 12;
        for (int fila = 0; fila < tiposIntrs; ++fila) {
            String sinteres = jtablaCabsFilas.getValueAt(fila, 0).toString();
            sinteres = sinteres.substring(0, sinteres.indexOf('%')).replace(',', '.');
            double interes = Double.parseDouble(sinteres) / 100 / 12;

            for (int columna = 0; columna < añosMeses; ++columna) {
                int meses = (periodoMin + columna) * P;
                if (interes == 0.0) {
                    pagoMensual = credito / meses;
                } else {
                    pagoMensual = credito * (interes / (1 - (1 / (Math.pow(1.0 + interes, (double)meses)))));
                }
                jtablaPrestamo.setValueAt(AlinDer("###,###,##0.00", pagoMensual), fila, columna);
            }
        }
        tablaPagos = true;
    }//GEN-LAST:event_jbtCalculoPagosActionPerformed

    private void jbtCalculoAmortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCalculoAmortActionPerformed
        // Tipo de intereses
    int fila = jtablaPrestamo.getSelectedRow();
    int columna = jtablaPrestamo.getSelectedColumn();
    String sinteres = (String)jtablaCabsFilas.getValueAt(fila, 0);
    sinteres = sinteres.substring(0, sinteres.indexOf('%'));
    sinteres = sinteres.replace(',', '.');
    double interes = Double.parseDouble(sinteres) / 100 / 12;

    // Periodo
    int P = 0;
    if (!jmItemAños.isEnabled())
        P = 12; // la orden seleccionada fue años
    else
        P = 1;  // la orden seleccionada fue meses

    javax.swing.table.TableColumn colum = null;
    colum = jtablaPrestamo.getColumnModel().getColumn(columna);
    String smeses = (String)colum.getHeaderValue();
    smeses = smeses.substring(0, smeses.indexOf(' '));
    int meses = Integer.parseInt(smeses) * P;

    // Definir tabla
    int filas = meses, cols = 5;
    if (filas < 18) filas = 18;
    initTable(filas, cols);

    // Mostrar la cantidad de meses
    for (int mes = 0; mes < meses; ++mes)
        jtablaCabsFilas.setValueAt(AlinDer("#####", mes + 1), mes, 0);

   
    String cab[] = {"Capital", "Intereses", "Capital pendiente", "Total intereses"};
    for (columna = 0; columna < 4; ++columna)
    {
        colum = jtablaPrestamo.getColumnModel().getColumn(columna);
        colum.setHeaderValue(cab[columna]);
    }

    // Tabla de amortizaciones
    double interesesMensuales = 0, creditoPendiente = credito;
    double capitalMensualAmort = 0, totalIntereses = 0;
    String formato = "###,###,##0.00";

    for (int mes = 0; mes < meses; ++mes)
    {
        // Cálculo de los intereses 
        interesesMensuales = creditoPendiente * interes;
        // Cálculo del capital 
        capitalMensualAmort = pagoMensual - interesesMensuales;
        
        creditoPendiente -= capitalMensualAmort;
        // Cálculo de los intereses totales pagados hasta el momento
        totalIntereses += interesesMensuales;

         //Resultados
        jtablaPrestamo.setValueAt(AlinDer(formato, capitalMensualAmort), mes, 0);
        jtablaPrestamo.setValueAt(AlinDer(formato, interesesMensuales), mes, 1);
        jtablaPrestamo.setValueAt(AlinDer(formato, creditoPendiente), mes, 2);
        jtablaPrestamo.setValueAt(AlinDer(formato, totalIntereses), mes, 3);
    }

    // fin
    jbtCalculoAmort.setEnabled(false);
    tablaPagos = false; // Ya no estamos en la tabla de pagos general
    }//GEN-LAST:event_jbtCalculoAmortActionPerformed

    private void jmItemInstrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemInstrucActionPerformed
        String mensaje;
        mensaje = "Coloque el crédito, la duración del préstamo y el tipo de interés.\n";
        mensaje += "Pulse el botón [Pagos] para visualizar\n";
        mensaje += "los pagos mensuales en la rejilla.\n\n";
        mensaje += "Elija un pago mensual y pulse el botón [Amortización]\n";
        mensaje += "para visualizar el plan de amortización para el interés\n";
        mensaje += "y Períodos correspondientes al pago elegido.\n\n";
        mensaje += "Para copiar datos en el portapapeles, seleccione las celdas\n";
        mensaje += "Que desee y pulse las teclas Ctrl y C.\n";
    
        javax.swing.JOptionPane.showMessageDialog(
            null, mensaje, "Instrucciones", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jmItemInstrucActionPerformed

    private void jmItemAñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemAñosActionPerformed
        Object item = evt.getSource();
        String tituloMarco = "";
    
        if (item == jmItemAños) {
            jmItemAños.setEnabled(false);
            jmItemMeses.setEnabled(true);
            tituloMarco = "Años del préstamo";
        } else if (item == jmItemMeses) {
            jmItemAños.setEnabled(true);
            jmItemMeses.setEnabled(false);
            tituloMarco = "Meses del préstamo";
        }
    
        // Cambia el título del borde del panel según la elección
        jPanel1.setBorder(new javax.swing.border.TitledBorder(tituloMarco));
    }//GEN-LAST:event_jmItemAñosActionPerformed

    private void jmItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemAcercaDeActionPerformed
        javax.swing.JOptionPane.showMessageDialog
        (null, "Aplicación Préstamo. Versión 1.0\n Copyright (c) Didier Alvarez IV C, 2026", "Acerca de Préstamo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jmItemAcercaDeActionPerformed

    private void jmItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmItemSalirActionPerformed

    private void jmItemMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemMesesActionPerformed
        Object item = evt.getSource();
        String tituloMarco = "";
    
        if (item == jmItemAños) {
            jmItemAños.setEnabled(false);
            jmItemMeses.setEnabled(true);
            tituloMarco = "Años del préstamo";
        } else if (item == jmItemMeses) {
            jmItemAños.setEnabled(true);
            jmItemMeses.setEnabled(false);
            tituloMarco = "Meses del préstamo";
        }
    
        
        jPanel1.setBorder(new javax.swing.border.TitledBorder(tituloMarco));
    }//GEN-LAST:event_jmItemMesesActionPerformed

    private void jcbIncrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbIncrementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbIncrementoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new registro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton jbtCalculoAmort;
    private javax.swing.JButton jbtCalculoPagos;
    private javax.swing.JComboBox<String> jcbIncremento;
    private javax.swing.JMenuItem jmItemAcercaDe;
    private javax.swing.JMenuItem jmItemAños;
    private javax.swing.JMenuItem jmItemInstruc;
    private javax.swing.JMenuItem jmItemMeses;
    private javax.swing.JMenuItem jmItemSalir;
    private javax.swing.JMenu jmnuAyuda;
    private javax.swing.JMenu jmnuOpciones;
    private javax.swing.JMenu jmnuPrestanoEn;
    private javax.swing.JTextField jtfCredito;
    private javax.swing.JTextField jtfInteresMax;
    private javax.swing.JTextField jtfInteresMin;
    private javax.swing.JTextField jtfPeriodoMax;
    private javax.swing.JTextField jtfPeriodoMin;
    // End of variables declaration//GEN-END:variables

}