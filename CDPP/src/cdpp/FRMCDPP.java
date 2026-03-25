package cdpp;

import java.awt.Color;
import java.time.LocalDate;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class FRMCDPP extends javax.swing.JFrame {
   ImageIcon iconobtn = new ImageIcon("src/cdpp/invisible (1).png");
   ImageIcon iconbtn = new ImageIcon("src/cdpp/ojo (1).png");
  //usuario1      
   double cdia,cmes,cyear;   
    String d1,m1,y1;
  //DATOS
    String Tnombre,Cdia,Cmes,Cyear,Tubica,RBsex; 
  //PORCENTAJES
    Double ef,ch,t,TE,TC;
    double pore,porc;
  //efectivo
    String hora;
    double efectivo,hrs,hrsex;
    double t1,t2,t3,t4;
    //ESPECIALIDADES
     double secre,inten,geren,superv,employee;
     int oxion;
     int oxion1;
  //X
    int a1=0,a2=0;
  //nombres (ALEATORIO)
    String h="HUITRÓN";
    String l="LARIOS";
    String r="REA";
  
  //EMPRESA
    int trabajadores=0;
    double TOTAL=0;
  // CONTRASEÑA 
    String contra;
    String usu;
    /**
     * Creates new form FRMCDPP
     */                          
     int asd;

    public FRMCDPP() {
        initComponents();
         asd=asd+1;
            //POR EL BIEN DEL PROGRAMA ESTÁN EN FALSE
          TXTPORCENTE.setVisible(false);
          TXTPORCENTC.setVisible(false);
          TXTPORCENTT.setVisible(false);
          TXTFONT.setVisible(false);
          
          LBLPORCENTT.setVisible(false);
          LBLTOTALPORCENT.setVisible(false);
          LBLPORCENTE.setVisible(false);
          LBLPORCENTC.setVisible(false); 
          
          SPRTE.setVisible(false);
          SPRTC.setVisible(false);
          SPREMPRESA2.setVisible(false);
                    
          BTNEMPRESA2.setVisible(false);                        
          BTNEMPRESA2.setEnabled(false);
                     
      //bucles para dia, mes y año de las CBB 
     for (int e=1;e<=31;e++)    //DIA
       {
        d1=String.valueOf(e); 
        CBBDIA.addItem(d1);
       }
        for (int e=1;e<=12;e++)  //MES
          {  
           m1=String.valueOf(e);
           CBBMES.addItem(m1);
          } 
           for (int e=1970;e<=2023;e++)  //AÑO 
             {
              y1=String.valueOf(e);
              CBBYEAR.addItem(y1); 
             }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNGRPSEX = new javax.swing.ButtonGroup();
        see = new javax.swing.JPanel();
        BTNUSUARIO = new javax.swing.JButton();
        SPRUSUARIO = new javax.swing.JSeparator();
        BTNEMPRESA = new javax.swing.JButton();
        SPREMPRESA = new javax.swing.JSeparator();
        LBLTITULO = new javax.swing.JLabel();
        LBLTITULO1 = new javax.swing.JLabel();
        SPRUSUARIO2 = new javax.swing.JSeparator();
        BTNUSUARIO2 = new javax.swing.JButton();
        BTNUSUARIO3 = new javax.swing.JButton();
        SPRUSUARIO3 = new javax.swing.JSeparator();
        BTNUSUARIO4 = new javax.swing.JButton();
        SPRUSUARIO4 = new javax.swing.JSeparator();
        SPREMPRESA2 = new javax.swing.JSeparator();
        BTNEMPRESA2 = new javax.swing.JButton();
        BTNREGRESAR = new javax.swing.JButton();
        SPRUSUARIO5 = new javax.swing.JSeparator();
        LBLTITULOCDPP = new javax.swing.JPanel();
        LBLTITULO2 = new javax.swing.JLabel();
        TBPN = new javax.swing.JTabbedPane();
        ZERO = new javax.swing.JPanel();
        PNLUSUARIO1 = new javax.swing.JPanel();
        LBLDIA = new javax.swing.JLabel();
        LBLFECHA = new javax.swing.JLabel();
        LBLSEX = new javax.swing.JLabel();
        TXTNOMBRE = new javax.swing.JTextField();
        RBTHOMBRE = new javax.swing.JRadioButton();
        RBTMUJER = new javax.swing.JRadioButton();
        RBTNOSE = new javax.swing.JRadioButton();
        SPRNOMBRE = new javax.swing.JSeparator();
        LBLUBICA = new javax.swing.JLabel();
        TXTUBICA = new javax.swing.JTextField();
        SPRUBICA = new javax.swing.JSeparator();
        LBLNOMBRE = new javax.swing.JLabel();
        LBLMES = new javax.swing.JLabel();
        LBLYEAR = new javax.swing.JLabel();
        CBBDIA = new javax.swing.JComboBox<>();
        CBBMES = new javax.swing.JComboBox<>();
        CBBYEAR = new javax.swing.JComboBox<>();
        BTNOK1 = new javax.swing.JButton();
        PNLTRABAJO = new javax.swing.JPanel();
        TXTHRS = new javax.swing.JTextField();
        LBLHORASTR = new javax.swing.JLabel();
        SPRTHORASTR = new javax.swing.JSeparator();
        CHBBEFECTIVO = new javax.swing.JCheckBox();
        CHBBCHEQUE = new javax.swing.JCheckBox();
        LBLPAGO = new javax.swing.JLabel();
        LBLPORCENTT = new javax.swing.JLabel();
        TXTPORCENTE = new javax.swing.JTextField();
        SPRTE = new javax.swing.JSeparator();
        TXTPORCENTC = new javax.swing.JTextField();
        SPRTC = new javax.swing.JSeparator();
        LBLPORCENTC = new javax.swing.JLabel();
        LBLPORCENTE = new javax.swing.JLabel();
        LBLTOTALPORCENT = new javax.swing.JLabel();
        TXTPORCENTT = new javax.swing.JTextField();
        BTNOK = new javax.swing.JButton();
        SPRTC1 = new javax.swing.JSeparator();
        CBBPUESTO = new javax.swing.JComboBox<>();
        LBLHORASTR1 = new javax.swing.JLabel();
        PNLEFECTO = new javax.swing.JPanel();
        LBLTITULO3 = new javax.swing.JLabel();
        SPRTEFECTO = new javax.swing.JSeparator();
        LBLEFECTO = new javax.swing.JLabel();
        PNLCHEQUE = new javax.swing.JPanel();
        LBLICONO = new javax.swing.JLabel();
        LBLINDUSTRIAS = new javax.swing.JLabel();
        LBLNOMBRET = new javax.swing.JLabel();
        LBLNOMBRECH = new javax.swing.JLabel();
        SPRTNOMBRECH = new javax.swing.JSeparator();
        LBLEXPEDICION = new javax.swing.JLabel();
        LBLAPELLIDO = new javax.swing.JLabel();
        SPRTEXPEDICION = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        LBLCLAVE = new javax.swing.JLabel();
        SPRTCLAVE = new javax.swing.JSeparator();
        LBLCHFECHA = new javax.swing.JLabel();
        LBLD = new javax.swing.JLabel();
        SPRTDATE = new javax.swing.JSeparator();
        LBL$ = new javax.swing.JLabel();
        LBLCANT = new javax.swing.JLabel();
        SPRTCANT = new javax.swing.JSeparator();
        LBLCANTIDADT = new javax.swing.JLabel();
        PNLEMPRESA = new javax.swing.JPanel();
        LBLUSUARIO = new javax.swing.JLabel();
        TXTPASS = new javax.swing.JTextField();
        TXTUSUARIO = new javax.swing.JTextField();
        LBLPASSWORD = new javax.swing.JLabel();
        SPRTUSUARIO = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        TGBTNVER = new javax.swing.JToggleButton();
        TXTFONT = new javax.swing.JTextField();
        BTNCHECK = new javax.swing.JButton();
        SPRTPASS = new javax.swing.JSeparator();
        PNLEMPRESA2 = new javax.swing.JPanel();
        LBLINFORME = new javax.swing.JLabel();
        LBLTRABAJADORES = new javax.swing.JLabel();
        SPRTNOMBRECH1 = new javax.swing.JSeparator();
        LBLCHFECHA1 = new javax.swing.JLabel();
        LBLDATE = new javax.swing.JLabel();
        SPRTDATE1 = new javax.swing.JSeparator();
        LBLDINERRO = new javax.swing.JLabel();
        LBLCASH = new javax.swing.JLabel();
        SPRTCANT1 = new javax.swing.JSeparator();
        LBLDINEROEXP = new javax.swing.JLabel();
        LBLPUESTO = new javax.swing.JLabel();
        CBBPUESTOCH = new javax.swing.JComboBox<>();
        LBLTRRE = new javax.swing.JLabel();
        LBLDINEROEXP1 = new javax.swing.JLabel();
        LBLDINERRO1 = new javax.swing.JLabel();
        LBLCASHP = new javax.swing.JLabel();
        SPRTCANT2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        see.setBackground(new java.awt.Color(153, 153, 153));
        see.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNUSUARIO.setBackground(new java.awt.Color(51, 51, 51));
        BTNUSUARIO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNUSUARIO.setText("USUARIO");
        BTNUSUARIO.setBorder(null);
        BTNUSUARIO.setContentAreaFilled(false);
        BTNUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUSUARIOActionPerformed(evt);
            }
        });
        see.add(BTNUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 23));
        see.add(SPRUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, -1));

        BTNEMPRESA.setBackground(new java.awt.Color(51, 51, 51));
        BTNEMPRESA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNEMPRESA.setText("EMPRESA");
        BTNEMPRESA.setBorder(null);
        BTNEMPRESA.setContentAreaFilled(false);
        BTNEMPRESA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEMPRESAActionPerformed(evt);
            }
        });
        see.add(BTNEMPRESA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 23));
        see.add(SPREMPRESA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, -1));

        LBLTITULO.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        LBLTITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLTITULO.setText("MODO");
        LBLTITULO.setFocusable(false);
        see.add(LBLTITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 150, 30));

        LBLTITULO1.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        LBLTITULO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLTITULO1.setText("ELIGE EL ");
        LBLTITULO1.setFocusable(false);
        see.add(LBLTITULO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 30));
        see.add(SPRUSUARIO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        BTNUSUARIO2.setBackground(new java.awt.Color(51, 51, 51));
        BTNUSUARIO2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNUSUARIO2.setForeground(new java.awt.Color(102, 102, 102));
        BTNUSUARIO2.setText("TRABAJO");
        BTNUSUARIO2.setBorder(null);
        BTNUSUARIO2.setContentAreaFilled(false);
        BTNUSUARIO2.setEnabled(false);
        BTNUSUARIO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUSUARIO2ActionPerformed(evt);
            }
        });
        see.add(BTNUSUARIO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 23));

        BTNUSUARIO3.setBackground(new java.awt.Color(51, 51, 51));
        BTNUSUARIO3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNUSUARIO3.setForeground(new java.awt.Color(102, 102, 102));
        BTNUSUARIO3.setText("EFECTIVO");
        BTNUSUARIO3.setBorder(null);
        BTNUSUARIO3.setContentAreaFilled(false);
        BTNUSUARIO3.setEnabled(false);
        BTNUSUARIO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUSUARIO3ActionPerformed(evt);
            }
        });
        see.add(BTNUSUARIO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, 23));
        see.add(SPRUSUARIO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, -1));

        BTNUSUARIO4.setBackground(new java.awt.Color(51, 51, 51));
        BTNUSUARIO4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNUSUARIO4.setForeground(new java.awt.Color(102, 102, 102));
        BTNUSUARIO4.setText("CHEQUE");
        BTNUSUARIO4.setBorder(null);
        BTNUSUARIO4.setContentAreaFilled(false);
        BTNUSUARIO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUSUARIO4ActionPerformed(evt);
            }
        });
        see.add(BTNUSUARIO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 23));
        see.add(SPRUSUARIO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, -1));
        see.add(SPREMPRESA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, -1));

        BTNEMPRESA2.setBackground(new java.awt.Color(51, 51, 51));
        BTNEMPRESA2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNEMPRESA2.setForeground(new java.awt.Color(102, 102, 102));
        BTNEMPRESA2.setText("INFORME");
        BTNEMPRESA2.setBorder(null);
        BTNEMPRESA2.setContentAreaFilled(false);
        BTNEMPRESA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEMPRESA2ActionPerformed(evt);
            }
        });
        see.add(BTNEMPRESA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, 23));

        BTNREGRESAR.setBackground(new java.awt.Color(51, 51, 51));
        BTNREGRESAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNREGRESAR.setForeground(new java.awt.Color(102, 102, 102));
        BTNREGRESAR.setText("REGRESAR");
        BTNREGRESAR.setBorder(null);
        BTNREGRESAR.setContentAreaFilled(false);
        BTNREGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNREGRESARActionPerformed(evt);
            }
        });
        see.add(BTNREGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, 23));
        see.add(SPRUSUARIO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, -1));

        getContentPane().add(see, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 150, 420));

        LBLTITULOCDPP.setBackground(new java.awt.Color(0, 0, 0));
        LBLTITULOCDPP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLTITULO2.setFont(new java.awt.Font("DialogInput", 1, 40)); // NOI18N
        LBLTITULO2.setForeground(new java.awt.Color(0, 255, 255));
        LBLTITULO2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLTITULO2.setText("CDPP");
        LBLTITULO2.setFocusable(false);
        LBLTITULOCDPP.add(LBLTITULO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -10, 320, 50));

        getContentPane().add(LBLTITULOCDPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 30));

        ZERO.setBackground(new java.awt.Color(51, 51, 51));
        ZERO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TBPN.addTab("tab1", ZERO);

        PNLUSUARIO1.setBackground(new java.awt.Color(51, 51, 51));
        PNLUSUARIO1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLDIA.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        LBLDIA.setForeground(new java.awt.Color(102, 255, 102));
        LBLDIA.setText("DIA");
        PNLUSUARIO1.add(LBLDIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        LBLFECHA.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        LBLFECHA.setForeground(new java.awt.Color(102, 255, 102));
        LBLFECHA.setText("FECHA DE NACIMIENTO");
        PNLUSUARIO1.add(LBLFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        LBLSEX.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        LBLSEX.setForeground(new java.awt.Color(102, 255, 102));
        LBLSEX.setText("SEXO");
        PNLUSUARIO1.add(LBLSEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, 30));

        TXTNOMBRE.setBackground(new java.awt.Color(102, 102, 102));
        TXTNOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        TXTNOMBRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTNOMBRE.setBorder(null);
        TXTNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNOMBREActionPerformed(evt);
            }
        });
        TXTNOMBRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNOMBREKeyTyped(evt);
            }
        });
        PNLUSUARIO1.add(TXTNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 30));

        RBTHOMBRE.setBackground(new java.awt.Color(102, 102, 102));
        BTNGRPSEX.add(RBTHOMBRE);
        RBTHOMBRE.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        RBTHOMBRE.setForeground(new java.awt.Color(102, 255, 102));
        RBTHOMBRE.setText("HOMBRE");
        RBTHOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTHOMBREActionPerformed(evt);
            }
        });
        PNLUSUARIO1.add(RBTHOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 120, 30));

        RBTMUJER.setBackground(new java.awt.Color(102, 102, 102));
        BTNGRPSEX.add(RBTMUJER);
        RBTMUJER.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        RBTMUJER.setForeground(new java.awt.Color(102, 255, 102));
        RBTMUJER.setText("MUJER");
        RBTMUJER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTMUJERActionPerformed(evt);
            }
        });
        PNLUSUARIO1.add(RBTMUJER, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 150, 30));

        RBTNOSE.setBackground(new java.awt.Color(102, 102, 102));
        BTNGRPSEX.add(RBTNOSE);
        RBTNOSE.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        RBTNOSE.setForeground(new java.awt.Color(102, 255, 102));
        RBTNOSE.setText("OTROS");
        RBTNOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTNOSEActionPerformed(evt);
            }
        });
        PNLUSUARIO1.add(RBTNOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 250, 30));

        SPRNOMBRE.setForeground(new java.awt.Color(255, 255, 0));
        PNLUSUARIO1.add(SPRNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 10));

        LBLUBICA.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        LBLUBICA.setForeground(new java.awt.Color(102, 255, 102));
        LBLUBICA.setText("UBICACIÓN");
        PNLUSUARIO1.add(LBLUBICA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        TXTUBICA.setBackground(new java.awt.Color(102, 102, 102));
        TXTUBICA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TXTUBICA.setForeground(new java.awt.Color(255, 255, 255));
        TXTUBICA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTUBICA.setBorder(null);
        PNLUSUARIO1.add(TXTUBICA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 250, 30));

        SPRUBICA.setForeground(new java.awt.Color(255, 0, 0));
        PNLUSUARIO1.add(SPRUBICA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, 10));

        LBLNOMBRE.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        LBLNOMBRE.setForeground(new java.awt.Color(102, 255, 102));
        LBLNOMBRE.setText("NOMBRE COMPLETO");
        PNLUSUARIO1.add(LBLNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        LBLMES.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        LBLMES.setForeground(new java.awt.Color(102, 255, 102));
        LBLMES.setText("MES");
        PNLUSUARIO1.add(LBLMES, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        LBLYEAR.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        LBLYEAR.setForeground(new java.awt.Color(102, 255, 102));
        LBLYEAR.setText("AÑO");
        PNLUSUARIO1.add(LBLYEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        PNLUSUARIO1.add(CBBDIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        CBBMES.setBorder(null);
        PNLUSUARIO1.add(CBBMES, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 50, -1));

        PNLUSUARIO1.add(CBBYEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        BTNOK1.setBackground(new java.awt.Color(0, 0, 0));
        BTNOK1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        BTNOK1.setForeground(new java.awt.Color(255, 255, 255));
        BTNOK1.setText("OK");
        BTNOK1.setBorder(null);
        BTNOK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNOK1ActionPerformed(evt);
            }
        });
        PNLUSUARIO1.add(BTNOK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 40, 30));

        TBPN.addTab("tab2", PNLUSUARIO1);

        PNLTRABAJO.setBackground(new java.awt.Color(0, 0, 0));
        PNLTRABAJO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTHRS.setBackground(new java.awt.Color(0, 0, 0));
        TXTHRS.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        TXTHRS.setForeground(new java.awt.Color(255, 0, 255));
        TXTHRS.setBorder(null);
        TXTHRS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTHRSMouseClicked(evt);
            }
        });
        PNLTRABAJO.add(TXTHRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, 30));

        LBLHORASTR.setFont(new java.awt.Font("DialogInput", 2, 18)); // NOI18N
        LBLHORASTR.setForeground(new java.awt.Color(0, 255, 255));
        LBLHORASTR.setText("HORAS TRABAJADAS A LA SEMANA: ");
        LBLHORASTR.setToolTipText("");
        PNLTRABAJO.add(LBLHORASTR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 330, 30));
        PNLTRABAJO.add(SPRTHORASTR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, 10));

        CHBBEFECTIVO.setBackground(new java.awt.Color(0, 0, 0));
        CHBBEFECTIVO.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        CHBBEFECTIVO.setForeground(new java.awt.Color(255, 255, 0));
        CHBBEFECTIVO.setText("EFECTIVO ");
        CHBBEFECTIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHBBEFECTIVOActionPerformed(evt);
            }
        });
        PNLTRABAJO.add(CHBBEFECTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, 40));

        CHBBCHEQUE.setBackground(new java.awt.Color(0, 0, 0));
        CHBBCHEQUE.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        CHBBCHEQUE.setForeground(new java.awt.Color(255, 0, 0));
        CHBBCHEQUE.setText("CHEQUE");
        CHBBCHEQUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHBBCHEQUEActionPerformed(evt);
            }
        });
        PNLTRABAJO.add(CHBBCHEQUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, 40));

        LBLPAGO.setFont(new java.awt.Font("DialogInput", 2, 18)); // NOI18N
        LBLPAGO.setForeground(new java.awt.Color(0, 255, 0));
        LBLPAGO.setText("MEDIO DE PAGO:");
        LBLPAGO.setToolTipText("");
        PNLTRABAJO.add(LBLPAGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 30));

        LBLPORCENTT.setBackground(new java.awt.Color(0, 0, 0));
        LBLPORCENTT.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        LBLPORCENTT.setForeground(new java.awt.Color(255, 255, 255));
        LBLPORCENTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLPORCENTT.setText("PORCENTAJES ");
        PNLTRABAJO.add(LBLPORCENTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 110, -1));

        TXTPORCENTE.setBackground(new java.awt.Color(0, 0, 0));
        TXTPORCENTE.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        TXTPORCENTE.setForeground(new java.awt.Color(255, 255, 0));
        TXTPORCENTE.setBorder(null);
        TXTPORCENTE.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TXTPORCENTEComponentAdded(evt);
            }
        });
        TXTPORCENTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTPORCENTEMouseClicked(evt);
            }
        });
        TXTPORCENTE.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TXTPORCENTEInputMethodTextChanged(evt);
            }
        });
        TXTPORCENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPORCENTEActionPerformed(evt);
            }
        });
        TXTPORCENTE.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TXTPORCENTEPropertyChange(evt);
            }
        });
        TXTPORCENTE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTPORCENTEKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTPORCENTEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPORCENTEKeyTyped(evt);
            }
        });
        PNLTRABAJO.add(TXTPORCENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 40, 30));
        PNLTRABAJO.add(SPRTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 40, 10));

        TXTPORCENTC.setBackground(new java.awt.Color(0, 0, 0));
        TXTPORCENTC.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        TXTPORCENTC.setForeground(new java.awt.Color(255, 0, 0));
        TXTPORCENTC.setBorder(null);
        TXTPORCENTC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTPORCENTCMouseClicked(evt);
            }
        });
        TXTPORCENTC.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TXTPORCENTCInputMethodTextChanged(evt);
            }
        });
        TXTPORCENTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTPORCENTCKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTPORCENTCKeyReleased(evt);
            }
        });
        PNLTRABAJO.add(TXTPORCENTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 40, 30));
        PNLTRABAJO.add(SPRTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 40, 10));

        LBLPORCENTC.setFont(new java.awt.Font("DialogInput", 2, 18)); // NOI18N
        LBLPORCENTC.setForeground(new java.awt.Color(255, 0, 0));
        LBLPORCENTC.setText("%");
        LBLPORCENTC.setToolTipText("");
        PNLTRABAJO.add(LBLPORCENTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 20, 30));

        LBLPORCENTE.setFont(new java.awt.Font("DialogInput", 2, 18)); // NOI18N
        LBLPORCENTE.setForeground(new java.awt.Color(255, 255, 0));
        LBLPORCENTE.setText("%");
        LBLPORCENTE.setToolTipText("");
        PNLTRABAJO.add(LBLPORCENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 20, 30));

        LBLTOTALPORCENT.setFont(new java.awt.Font("DialogInput", 2, 18)); // NOI18N
        LBLTOTALPORCENT.setForeground(new java.awt.Color(255, 102, 0));
        LBLTOTALPORCENT.setText("TOTAL %");
        LBLTOTALPORCENT.setToolTipText("");
        PNLTRABAJO.add(LBLTOTALPORCENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 80, 30));

        TXTPORCENTT.setBackground(new java.awt.Color(0, 0, 0));
        TXTPORCENTT.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        TXTPORCENTT.setForeground(new java.awt.Color(255, 255, 255));
        TXTPORCENTT.setBorder(null);
        TXTPORCENTT.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TXTPORCENTTComponentAdded(evt);
            }
        });
        TXTPORCENTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTPORCENTTMouseClicked(evt);
            }
        });
        TXTPORCENTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTPORCENTTKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPORCENTTKeyTyped(evt);
            }
        });
        PNLTRABAJO.add(TXTPORCENTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 70, 30));

        BTNOK.setBackground(new java.awt.Color(0, 0, 0));
        BTNOK.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        BTNOK.setForeground(new java.awt.Color(255, 255, 255));
        BTNOK.setText("OK");
        BTNOK.setBorder(null);
        BTNOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNOKActionPerformed(evt);
            }
        });
        PNLTRABAJO.add(BTNOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 40, 30));
        PNLTRABAJO.add(SPRTC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 40, 10));

        CBBPUESTO.setBackground(new java.awt.Color(0, 0, 0));
        CBBPUESTO.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        CBBPUESTO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INTENDENTE", "EMPLEAD@", "SECRETARI@", "SUPERVISOR (A)", "GERENTE" }));
        CBBPUESTO.setBorder(null);
        PNLTRABAJO.add(CBBPUESTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        LBLHORASTR1.setFont(new java.awt.Font("DialogInput", 2, 18)); // NOI18N
        LBLHORASTR1.setForeground(new java.awt.Color(255, 255, 255));
        LBLHORASTR1.setText("PUESTO:");
        LBLHORASTR1.setToolTipText("");
        PNLTRABAJO.add(LBLHORASTR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 30));

        TBPN.addTab("tab3", PNLTRABAJO);

        PNLEFECTO.setBackground(new java.awt.Color(51, 51, 51));
        PNLEFECTO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLTITULO3.setBackground(new java.awt.Color(0, 0, 0));
        LBLTITULO3.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        LBLTITULO3.setForeground(new java.awt.Color(255, 255, 255));
        LBLTITULO3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLTITULO3.setText("SU TOTAL ES DE: ");
        LBLTITULO3.setFocusable(false);
        PNLEFECTO.add(LBLTITULO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 240, 40));
        PNLEFECTO.add(SPRTEFECTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 260, 10));

        LBLEFECTO.setBackground(new java.awt.Color(0, 0, 0));
        LBLEFECTO.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        LBLEFECTO.setForeground(new java.awt.Color(255, 255, 255));
        LBLEFECTO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLEFECTO.setFocusable(false);
        PNLEFECTO.add(LBLEFECTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 240, 40));

        TBPN.addTab("tab4", PNLEFECTO);

        PNLCHEQUE.setBackground(new java.awt.Color(255, 255, 255));
        PNLCHEQUE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLICONO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cdpp/ICONO2.jpg"))); // NOI18N
        PNLCHEQUE.add(LBLICONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        LBLINDUSTRIAS.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        LBLINDUSTRIAS.setText("I. HLr");
        LBLINDUSTRIAS.setToolTipText("");
        PNLCHEQUE.add(LBLINDUSTRIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, 60));

        LBLNOMBRET.setBackground(new java.awt.Color(255, 255, 255));
        LBLNOMBRET.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        LBLNOMBRET.setText("NOMBRE");
        PNLCHEQUE.add(LBLNOMBRET, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        LBLNOMBRECH.setBackground(new java.awt.Color(255, 255, 255));
        LBLNOMBRECH.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        LBLNOMBRECH.setForeground(new java.awt.Color(51, 51, 51));
        PNLCHEQUE.add(LBLNOMBRECH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, 20));
        PNLCHEQUE.add(SPRTNOMBRECH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 360, 10));

        LBLEXPEDICION.setBackground(new java.awt.Color(255, 255, 255));
        LBLEXPEDICION.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        LBLEXPEDICION.setText("EXPEDIDO POR");
        PNLCHEQUE.add(LBLEXPEDICION, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        LBLAPELLIDO.setBackground(new java.awt.Color(255, 255, 255));
        LBLAPELLIDO.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        LBLAPELLIDO.setForeground(new java.awt.Color(51, 51, 51));
        PNLCHEQUE.add(LBLAPELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 150, 20));
        PNLCHEQUE.add(SPRTEXPEDICION, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 150, 10));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        jLabel7.setText("CLAVE");
        PNLCHEQUE.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        LBLCLAVE.setBackground(new java.awt.Color(255, 255, 255));
        LBLCLAVE.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        LBLCLAVE.setForeground(new java.awt.Color(51, 51, 51));
        PNLCHEQUE.add(LBLCLAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, 20));
        PNLCHEQUE.add(SPRTCLAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, 10));

        LBLCHFECHA.setBackground(new java.awt.Color(255, 255, 255));
        LBLCHFECHA.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        LBLCHFECHA.setText("FECHA");
        PNLCHEQUE.add(LBLCHFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        LBLD.setBackground(new java.awt.Color(255, 255, 255));
        LBLD.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        LBLD.setForeground(new java.awt.Color(51, 51, 51));
        LBLD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PNLCHEQUE.add(LBLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 110, 20));
        PNLCHEQUE.add(SPRTDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 110, 10));

        LBL$.setBackground(new java.awt.Color(255, 255, 255));
        LBL$.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        LBL$.setText("$");
        PNLCHEQUE.add(LBL$, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 20, -1));

        LBLCANT.setBackground(new java.awt.Color(255, 255, 255));
        LBLCANT.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        LBLCANT.setForeground(new java.awt.Color(51, 51, 51));
        PNLCHEQUE.add(LBLCANT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 130, 20));
        PNLCHEQUE.add(SPRTCANT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 130, 10));

        LBLCANTIDADT.setBackground(new java.awt.Color(255, 255, 255));
        LBLCANTIDADT.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        LBLCANTIDADT.setText("CANTIDAD");
        PNLCHEQUE.add(LBLCANTIDADT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 140, -1));

        TBPN.addTab("tab5", PNLCHEQUE);

        PNLEMPRESA.setBackground(new java.awt.Color(61, 61, 61));
        PNLEMPRESA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLUSUARIO.setFont(new java.awt.Font("DialogInput", 2, 18)); // NOI18N
        LBLUSUARIO.setForeground(new java.awt.Color(255, 255, 255));
        PNLEMPRESA.add(LBLUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        TXTPASS.setBackground(new java.awt.Color(61, 61, 61));
        TXTPASS.setFont(new java.awt.Font("DialogInput", 2, 24)); // NOI18N
        TXTPASS.setForeground(new java.awt.Color(255, 255, 255));
        TXTPASS.setText("CONTRASEÑA:");
        TXTPASS.setBorder(null);
        TXTPASS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTPASSMouseClicked(evt);
            }
        });
        TXTPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPASSActionPerformed(evt);
            }
        });
        PNLEMPRESA.add(TXTPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 210, 30));

        TXTUSUARIO.setBackground(new java.awt.Color(61, 61, 61));
        TXTUSUARIO.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        TXTUSUARIO.setForeground(new java.awt.Color(255, 255, 255));
        TXTUSUARIO.setText("USUARIO:");
        TXTUSUARIO.setBorder(null);
        TXTUSUARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTUSUARIOMouseClicked(evt);
            }
        });
        TXTUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTUSUARIOActionPerformed(evt);
            }
        });
        PNLEMPRESA.add(TXTUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 230, 30));

        LBLPASSWORD.setFont(new java.awt.Font("DialogInput", 2, 18)); // NOI18N
        LBLPASSWORD.setForeground(new java.awt.Color(255, 255, 255));
        PNLEMPRESA.add(LBLPASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, 30));
        PNLEMPRESA.add(SPRTUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 122, 230, 10));
        PNLEMPRESA.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 342, 110, 10));

        TGBTNVER.setBackground(new java.awt.Color(61, 61, 61));
        TGBTNVER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cdpp/ojo (1).png"))); // NOI18N
        TGBTNVER.setBorder(null);
        TGBTNVER.setBorderPainted(false);
        TGBTNVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TGBTNVERActionPerformed(evt);
            }
        });
        PNLEMPRESA.add(TGBTNVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 40, 30));

        TXTFONT.setFont(new java.awt.Font("Bookshelf Symbol 7", 0, 24)); // NOI18N
        TXTFONT.setText("u");
        PNLEMPRESA.add(TXTFONT, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        BTNCHECK.setBackground(new java.awt.Color(61, 61, 61));
        BTNCHECK.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        BTNCHECK.setForeground(new java.awt.Color(255, 255, 255));
        BTNCHECK.setText("VERIFICAR");
        BTNCHECK.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTNCHECK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCHECKActionPerformed(evt);
            }
        });
        PNLEMPRESA.add(BTNCHECK, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 110, 30));
        PNLEMPRESA.add(SPRTPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, -1));

        TBPN.addTab("tab6", PNLEMPRESA);

        PNLEMPRESA2.setBackground(new java.awt.Color(255, 255, 255));
        PNLEMPRESA2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLINFORME.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        LBLINFORME.setText("INFORME:");
        LBLINFORME.setToolTipText("");
        PNLEMPRESA2.add(LBLINFORME, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 130, 60));

        LBLTRABAJADORES.setBackground(new java.awt.Color(255, 255, 255));
        LBLTRABAJADORES.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        LBLTRABAJADORES.setForeground(new java.awt.Color(51, 51, 51));
        LBLTRABAJADORES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PNLEMPRESA2.add(LBLTRABAJADORES, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 260, 20));
        PNLEMPRESA2.add(SPRTNOMBRECH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 260, 10));

        LBLCHFECHA1.setBackground(new java.awt.Color(255, 255, 255));
        LBLCHFECHA1.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        LBLCHFECHA1.setText("FECHA");
        PNLEMPRESA2.add(LBLCHFECHA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        LBLDATE.setBackground(new java.awt.Color(255, 255, 255));
        LBLDATE.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        LBLDATE.setForeground(new java.awt.Color(51, 51, 51));
        LBLDATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PNLEMPRESA2.add(LBLDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 110, 20));
        PNLEMPRESA2.add(SPRTDATE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 110, 10));

        LBLDINERRO.setBackground(new java.awt.Color(255, 255, 255));
        LBLDINERRO.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        LBLDINERRO.setText("$");
        PNLEMPRESA2.add(LBLDINERRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 20, -1));

        LBLCASH.setBackground(new java.awt.Color(255, 255, 255));
        LBLCASH.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        LBLCASH.setForeground(new java.awt.Color(51, 51, 51));
        LBLCASH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PNLEMPRESA2.add(LBLCASH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 130, 20));
        PNLEMPRESA2.add(SPRTCANT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 130, 10));

        LBLDINEROEXP.setBackground(new java.awt.Color(255, 255, 255));
        LBLDINEROEXP.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        LBLDINEROEXP.setText("DINERO TOTAL ENTREGADO:");
        PNLEMPRESA2.add(LBLDINEROEXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 330, -1));

        LBLPUESTO.setBackground(new java.awt.Color(255, 255, 255));
        LBLPUESTO.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        LBLPUESTO.setText("PUESTO:");
        PNLEMPRESA2.add(LBLPUESTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 100, -1));

        CBBPUESTOCH.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        CBBPUESTOCH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INTENDENTE", "EMPLEAD@", "SECRETARI@", "SUPERVISOR (A)", "GERENTE" }));
        CBBPUESTOCH.setBorder(null);
        CBBPUESTOCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBBPUESTOCHActionPerformed(evt);
            }
        });
        PNLEMPRESA2.add(CBBPUESTOCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 150, -1));

        LBLTRRE.setBackground(new java.awt.Color(255, 255, 255));
        LBLTRRE.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        LBLTRRE.setText("TRABAJADORES REGISTRADOS:");
        PNLEMPRESA2.add(LBLTRRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        LBLDINEROEXP1.setBackground(new java.awt.Color(255, 255, 255));
        LBLDINEROEXP1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        LBLDINEROEXP1.setText("DINERO ENTREGADO:");
        PNLEMPRESA2.add(LBLDINEROEXP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 150, -1));

        LBLDINERRO1.setBackground(new java.awt.Color(255, 255, 255));
        LBLDINERRO1.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        LBLDINERRO1.setText("$");
        PNLEMPRESA2.add(LBLDINERRO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 20, -1));

        LBLCASHP.setBackground(new java.awt.Color(255, 255, 255));
        LBLCASHP.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        LBLCASHP.setForeground(new java.awt.Color(51, 51, 51));
        LBLCASHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PNLEMPRESA2.add(LBLCASHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 130, 20));
        PNLEMPRESA2.add(SPRTCANT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 130, 10));

        TBPN.addTab("tab7", PNLEMPRESA2);

        getContentPane().add(TBPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 0, 430, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNUSUARIO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUSUARIO2ActionPerformed
      TBPN.setSelectedIndex(2);
        trabajadores++;
        
        BTNUSUARIO.setEnabled(false);
        BTNUSUARIO.setForeground(Color.gray);
        Tnombre=TXTNOMBRE.getText();
         Cdia=String.valueOf(CBBDIA.getSelectedItem());
         Cmes=String.valueOf(CBBMES.getSelectedItem());
         Cyear=String.valueOf(CBBYEAR.getSelectedItem());
        Tubica=TXTUBICA.getText();
    }//GEN-LAST:event_BTNUSUARIO2ActionPerformed

    private void BTNEMPRESAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEMPRESAActionPerformed
     TBPN.setSelectedIndex(5);
    }//GEN-LAST:event_BTNEMPRESAActionPerformed

    private void BTNUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUSUARIOActionPerformed
     TBPN.setSelectedIndex(1);
     BTNREGRESAR.setEnabled(false);
     BTNREGRESAR.setForeground(Color.gray);
    }//GEN-LAST:event_BTNUSUARIOActionPerformed

    private void TXTNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNOMBREActionPerformed
        
    }//GEN-LAST:event_TXTNOMBREActionPerformed

    private void TXTNOMBREKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNOMBREKeyTyped
            int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
       {
        evt.consume();
       }
    }//GEN-LAST:event_TXTNOMBREKeyTyped

    private void RBTHOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTHOMBREActionPerformed

    }//GEN-LAST:event_RBTHOMBREActionPerformed

    private void TXTHRSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTHRSMouseClicked

    }//GEN-LAST:event_TXTHRSMouseClicked

    private void CHBBEFECTIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHBBEFECTIVOActionPerformed
      if (CHBBEFECTIVO.isSelected() && CHBBCHEQUE.isSelected())
        {
         LBLPORCENTE.setVisible(true);
         LBLPORCENTC.setVisible(true); 
         LBLPORCENTT.setVisible(true);  
         LBLTOTALPORCENT.setVisible(true); 
          TXTPORCENTE.setVisible(true);
          TXTPORCENTC.setVisible(true);     
          TXTPORCENTT.setVisible(true);      
           SPRTE.setVisible(true);
           SPRTC.setVisible(true);                             
           BTNOK.setEnabled(false);                    
          }
          if (CHBBEFECTIVO.isSelected() && !CHBBCHEQUE.isSelected())
            {
             LBLPORCENTE.setVisible(false);
             LBLPORCENTC.setVisible(false); 
             LBLPORCENTT.setVisible(false);
             LBLTOTALPORCENT.setVisible(false);           
              TXTPORCENTE.setVisible(false);
              TXTPORCENTC.setVisible(false);
              TXTPORCENTT.setVisible(false);
               SPRTE.setVisible(false);
               SPRTC.setVisible(false);              
               BTNOK.setEnabled(true);               
            }                                                  
    }//GEN-LAST:event_CHBBEFECTIVOActionPerformed

    private void TXTPORCENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTPORCENTEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPORCENTEMouseClicked

    private void TXTPORCENTCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTPORCENTCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPORCENTCMouseClicked

    private void TXTPORCENTEComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TXTPORCENTEComponentAdded
        
    }//GEN-LAST:event_TXTPORCENTEComponentAdded

    private void TXTPORCENTEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPORCENTEKeyTyped
       
    }//GEN-LAST:event_TXTPORCENTEKeyTyped

    private void TXTPORCENTEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPORCENTEKeyPressed
        // TODO add your handling code here:
//VAN LAS VARIABLES

    }//GEN-LAST:event_TXTPORCENTEKeyPressed

    private void CHBBCHEQUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHBBCHEQUEActionPerformed
      if (CHBBEFECTIVO.isSelected() && CHBBCHEQUE.isSelected())
        {
         LBLPORCENTE.setVisible(true);
         LBLPORCENTC.setVisible(true); 
         LBLPORCENTT.setVisible(true);  
         LBLTOTALPORCENT.setVisible(true); 
          TXTPORCENTE.setVisible(true);
          TXTPORCENTC.setVisible(true);     
          TXTPORCENTT.setVisible(true);      
           SPRTE.setVisible(true);
           SPRTC.setVisible(true);                   
          
           BTNOK.setEnabled(false);                    
          }
          if (!CHBBEFECTIVO.isSelected() && CHBBCHEQUE.isSelected())
            {
             LBLPORCENTE.setVisible(false);
             LBLPORCENTC.setVisible(false); 
             LBLPORCENTT.setVisible(false);
             LBLTOTALPORCENT.setVisible(false);           
              TXTPORCENTE.setVisible(false);
              TXTPORCENTC.setVisible(false);
              TXTPORCENTT.setVisible(false);
               SPRTE.setVisible(false);
               SPRTC.setVisible(false);              
               BTNOK.setEnabled(true);
               
            }
    }//GEN-LAST:event_CHBBCHEQUEActionPerformed

    private void TXTPORCENTTComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TXTPORCENTTComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPORCENTTComponentAdded

    private void TXTPORCENTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTPORCENTTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPORCENTTMouseClicked

    private void TXTPORCENTTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPORCENTTKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPORCENTTKeyPressed

    private void TXTPORCENTTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPORCENTTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPORCENTTKeyTyped

    private void TXTPORCENTCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPORCENTCKeyPressed
//VAN LAS VARIABLES 

    }//GEN-LAST:event_TXTPORCENTCKeyPressed

    private void TXTPORCENTEInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TXTPORCENTEInputMethodTextChanged

    }//GEN-LAST:event_TXTPORCENTEInputMethodTextChanged

    private void TXTPORCENTCInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TXTPORCENTCInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_TXTPORCENTCInputMethodTextChanged

    private void TXTPORCENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPORCENTEActionPerformed

    }//GEN-LAST:event_TXTPORCENTEActionPerformed

    private void TXTPORCENTEPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TXTPORCENTEPropertyChange

    }//GEN-LAST:event_TXTPORCENTEPropertyChange

    private void TXTPORCENTEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPORCENTEKeyReleased
    t=0.0;
    String a1,a2;
   
      a1=TXTPORCENTE.getText();
       ef=Double.parseDouble(a1);
        t=t+ch+ef;
        if (t<=100)
         {
          TXTPORCENTT.setText(String.valueOf(t));
         }
         else
          {
           TXTPORCENTT.setText("error");   
          }
           if (t==100)
            {
             BTNOK.setEnabled(true);
            }
    }//GEN-LAST:event_TXTPORCENTEKeyReleased

    private void TXTPORCENTCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPORCENTCKeyReleased
    t=0.0;
    String a1,a2;
    
      a2=TXTPORCENTC.getText();        
       ch=Double.parseDouble(a2);
        t=t+ch+ef;
         if (t<=100)
          {
           TXTPORCENTT.setText(String.valueOf(t));
          }
           else
            {
             TXTPORCENTT.setText("error");   
            }
             if (t==100)
              {
               BTNOK.setEnabled(true);
              }        
    }//GEN-LAST:event_TXTPORCENTCKeyReleased

    private void BTNUSUARIO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUSUARIO3ActionPerformed
       TBPN.setSelectedIndex(3);        
    }//GEN-LAST:event_BTNUSUARIO3ActionPerformed

    private void BTNUSUARIO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUSUARIO4ActionPerformed
     TBPN.setSelectedIndex(4);
    //FECHA
       LocalDate todaysDate = LocalDate.now();
       LBLD.setText(String.valueOf(todaysDate));
    //CLAVE   
      int i=1;
      int i1=3;
      String clave="";             
   
        clave=clave+Tnombre.substring(2,3);
        clave=clave+Tnombre.substring(8,9);
        clave=clave+Tnombre.substring(15,16);
        clave=clave+String.valueOf(Cdia);
  
       LBLCLAVE.setText(clave);
    //PAGO

    //NOMBRE
       LBLNOMBRECH.setText(Tnombre);
    //RANDOM
     int valorDado = (int)Math.floor(Math.random()*3+1);
      if (valorDado==1)
      {
       LBLAPELLIDO.setText(h);
      }
       if (valorDado==2)
        {
         LBLAPELLIDO.setText(l);
        } 
         if (valorDado==3)
         {
          LBLAPELLIDO.setText(r);
         }
    }//GEN-LAST:event_BTNUSUARIO4ActionPerformed

    private void BTNOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNOKActionPerformed
     BTNREGRESAR.setEnabled(true);
     BTNREGRESAR.setForeground(Color.black);
      BTNUSUARIO2.setEnabled(false);
      BTNUSUARIO2.setForeground(Color.gray);
       hora=TXTHRS.getText();
       hrs=Double.parseDouble(hora);
       hrsex=hrs-40;
        if (hrsex<0)
         {
          hrsex=0;   
         }
         t1=hrs-hrsex;
         oxion=CBBPUESTO.getSelectedIndex();
         switch (oxion)
           {
             case 0:
              t2=30*t1;
              t3=40*hrsex;         
              t4=t3+t2;
              inten=inten+t4;
                 break;
           
             case 1:
              t2=50*t1;
              t3=60*hrsex;         
              t4=t3+t2;
              employee=employee+t4;               
                 break;
                 
             case 2:
              t2=75*t1;
              t3=80*hrsex;         
              t4=t3+t2;
              secre=secre+t4;
                 break;
                 
             case 3:
              t2=150*t1;
              t3=165*hrsex;         
              t4=t3+t2;
              superv=superv+t4;               
                 break;
             case 4:
              t2=200*t1;
              t3=250*hrsex;         
              t4=t3+t2;
              geren=geren+t4;
                 break;    
         }               
         //TXTPORNCENT    E O C
         //ef,ch,t
         //pore,porc
         if (CHBBEFECTIVO.isSelected() && CHBBCHEQUE.isSelected())
           {
             BTNUSUARIO4.setEnabled(true);
             BTNUSUARIO4.setForeground(Color.black);
              BTNUSUARIO3.setEnabled(true);
              BTNUSUARIO3.setForeground(Color.black);
               pore=Double.parseDouble(TXTPORCENTE.getText());
               porc=Double.parseDouble(TXTPORCENTC.getText());
             TE=t4*(pore/100);
             TC=t4*(porc/100);
              LBLEFECTO.setText(String.valueOf(TE));
              LBLCANT.setText(String.valueOf(TC));                 
             TOTAL=TOTAL+t4; 
            }             
             else if (CHBBEFECTIVO.isSelected())
               {
                BTNUSUARIO3.setEnabled(true);
                BTNUSUARIO3.setForeground(Color.black);
                LBLEFECTO.setText(String.valueOf(t4));
                 TOTAL=TOTAL+t4;         
        
               }          
                else if (CHBBCHEQUE.isSelected())
                  {
                    BTNUSUARIO4.setEnabled(true);
                    BTNUSUARIO4.setForeground(Color.black);
                     TOTAL=TOTAL+t4; 
                     LBLCANT.setText(String.valueOf(t4));
                  }                         
    }//GEN-LAST:event_BTNOKActionPerformed

    private void RBTMUJERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTMUJERActionPerformed
     /*           BTNUSUARIO2.setEnabled(true);
        BTNUSUARIO2.setForeground(Color.black);
        */
    }//GEN-LAST:event_RBTMUJERActionPerformed

    private void RBTNOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTNOSEActionPerformed

    }//GEN-LAST:event_RBTNOSEActionPerformed

    private void BTNOK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNOK1ActionPerformed
     if (TXTNOMBRE.getText().isEmpty())
      {
       JOptionPane.showMessageDialog(null, "Falta por llenar campos","ERROR",JOptionPane.ERROR_MESSAGE);
      } 
       else
        {
         BTNUSUARIO2.setEnabled(true);
         BTNUSUARIO2.setForeground(Color.black);                     
        }
         if (TXTUBICA.getText().isEmpty())
          {
           JOptionPane.showMessageDialog(null, "Falta por llenar campos","ERROR",JOptionPane.ERROR_MESSAGE);
          }
           else
            {
             BTNUSUARIO2.setEnabled(true);
             BTNUSUARIO2.setForeground(Color.black);                        
            }
    }//GEN-LAST:event_BTNOK1ActionPerformed

    private void TGBTNVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TGBTNVERActionPerformed
       if (TGBTNVER.isSelected())
         {
          TXTPASS.setFont(LBLUSUARIO.getFont());
          TGBTNVER.setIcon(iconobtn);
         }
          if (!TGBTNVER.isSelected())
           {
            TXTPASS.setFont(TXTFONT.getFont());
            TGBTNVER.setIcon(iconbtn);
           }
    }//GEN-LAST:event_TGBTNVERActionPerformed

    private void TXTUSUARIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTUSUARIOMouseClicked
      a1++;
       if (a1==1)
        {
         TXTUSUARIO.setText("");
         LBLUSUARIO.setText("USUARIO:");             
        }
    }//GEN-LAST:event_TXTUSUARIOMouseClicked

    private void TXTPASSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTPASSMouseClicked
      a2++;
       if (a2==1)
         {        
          LBLPASSWORD.setText("CONTRASEÑA:");
           TXTPASS.setText("");
           TXTPASS.setFont(TXTFONT.getFont());
         }                
    }//GEN-LAST:event_TXTPASSMouseClicked

    private void BTNCHECKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCHECKActionPerformed
      contra=TXTPASS.getText();
      usu=TXTUSUARIO.getText();
       if ("HUITRON".equals(usu) && "2539".equals(contra)) 
         {
          BTNEMPRESA2.setForeground(Color.black);
          BTNEMPRESA2.setVisible(true);              
          SPREMPRESA2.setVisible(true);
          BTNEMPRESA2.setEnabled(true);
         }
          else if ("LARIOS".equals(usu) && "3647".equals(contra)) 
              {
               BTNEMPRESA2.setForeground(Color.black);
               BTNEMPRESA2.setVisible(true);              
               SPREMPRESA2.setVisible(true);
               BTNEMPRESA2.setEnabled(true);
              }       
               else if ("REA".equals(usu) && "9541".equals(contra)) 
                 {
                  BTNEMPRESA2.setForeground(Color.black);
                  BTNEMPRESA2.setVisible(true);              
                  SPREMPRESA2.setVisible(true);
                  BTNEMPRESA2.setEnabled(true);
                 }
                  else
                   {
                    JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTOS","ERROR", JOptionPane.ERROR_MESSAGE);
                   }            
    }//GEN-LAST:event_BTNCHECKActionPerformed

    private void BTNEMPRESA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEMPRESA2ActionPerformed
      TBPN.setSelectedIndex(6);    
      LocalDate todaysDate = LocalDate.now();
       LBLDATE.setText(String.valueOf(todaysDate));
        LBLTRABAJADORES.setText(String.valueOf(trabajadores));
        LBLCASH.setText(String.valueOf(TOTAL));
    }//GEN-LAST:event_BTNEMPRESA2ActionPerformed

    private void TXTPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPASSActionPerformed

    private void TXTUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTUSUARIOActionPerformed

    private void BTNREGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNREGRESARActionPerformed
        BTNUSUARIO.setEnabled(true);
        BTNUSUARIO.setForeground(Color.black);
        
        BTNUSUARIO3.setEnabled(false);
        BTNUSUARIO3.setForeground(Color.gray);

        BTNUSUARIO4.setEnabled(false);
        BTNUSUARIO4.setForeground(Color.gray);        
        
        TXTNOMBRE.setText("");        
        TXTHRS.setText("");
        CBBDIA.setSelectedIndex(0);
        CBBMES.setSelectedIndex(0);
        CBBYEAR.setSelectedIndex(0);
        TXTUBICA.setText("");
        TXTHRS.setText("");
        CHBBEFECTIVO.setSelected(false);
        CHBBCHEQUE.setSelected(false);
        TXTPORCENTE.setText("");
        TXTPORCENTC.setText("");
        TXTPORCENTT.setText("");
    }//GEN-LAST:event_BTNREGRESARActionPerformed

    private void CBBPUESTOCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBBPUESTOCHActionPerformed
        oxion1=CBBPUESTOCH.getSelectedIndex();
          switch (oxion1)
            {
             case 0:
              LBLCASHP.setText(String.valueOf(inten));
                 break;
           
             case 1:
              LBLCASHP.setText(String.valueOf(secre));               
                 break;
                 
             case 2:
             LBLCASHP.setText(String.valueOf(employee));
                 break;
                 
             case 3:
              LBLCASHP.setText(String.valueOf(superv));            
                 break;
             case 4:
              LBLCASHP.setText(String.valueOf(geren));
                 break;      
            }
    }//GEN-LAST:event_CBBPUESTOCHActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMCDPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMCDPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMCDPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMCDPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMCDPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTNCHECK;
    public javax.swing.JButton BTNEMPRESA;
    public javax.swing.JButton BTNEMPRESA2;
    public javax.swing.ButtonGroup BTNGRPSEX;
    public javax.swing.JButton BTNOK;
    public javax.swing.JButton BTNOK1;
    public javax.swing.JButton BTNREGRESAR;
    public javax.swing.JButton BTNUSUARIO;
    public javax.swing.JButton BTNUSUARIO2;
    public javax.swing.JButton BTNUSUARIO3;
    public javax.swing.JButton BTNUSUARIO4;
    public javax.swing.JComboBox<String> CBBDIA;
    public javax.swing.JComboBox<String> CBBMES;
    public javax.swing.JComboBox<String> CBBPUESTO;
    public javax.swing.JComboBox<String> CBBPUESTOCH;
    public javax.swing.JComboBox<String> CBBYEAR;
    public javax.swing.JCheckBox CHBBCHEQUE;
    public javax.swing.JCheckBox CHBBEFECTIVO;
    public javax.swing.JLabel LBL$;
    public javax.swing.JLabel LBLAPELLIDO;
    public javax.swing.JLabel LBLCANT;
    public javax.swing.JLabel LBLCANTIDADT;
    public javax.swing.JLabel LBLCASH;
    public javax.swing.JLabel LBLCASHP;
    public javax.swing.JLabel LBLCHFECHA;
    public javax.swing.JLabel LBLCHFECHA1;
    public javax.swing.JLabel LBLCLAVE;
    public javax.swing.JLabel LBLD;
    public javax.swing.JLabel LBLDATE;
    public javax.swing.JLabel LBLDIA;
    public javax.swing.JLabel LBLDINEROEXP;
    public javax.swing.JLabel LBLDINEROEXP1;
    public javax.swing.JLabel LBLDINERRO;
    public javax.swing.JLabel LBLDINERRO1;
    public javax.swing.JLabel LBLEFECTO;
    public javax.swing.JLabel LBLEXPEDICION;
    public javax.swing.JLabel LBLFECHA;
    public javax.swing.JLabel LBLHORASTR;
    public javax.swing.JLabel LBLHORASTR1;
    public javax.swing.JLabel LBLICONO;
    public javax.swing.JLabel LBLINDUSTRIAS;
    public javax.swing.JLabel LBLINFORME;
    public javax.swing.JLabel LBLMES;
    public javax.swing.JLabel LBLNOMBRE;
    public javax.swing.JLabel LBLNOMBRECH;
    public javax.swing.JLabel LBLNOMBRET;
    public javax.swing.JLabel LBLPAGO;
    public javax.swing.JLabel LBLPASSWORD;
    public javax.swing.JLabel LBLPORCENTC;
    public javax.swing.JLabel LBLPORCENTE;
    public javax.swing.JLabel LBLPORCENTT;
    public javax.swing.JLabel LBLPUESTO;
    public javax.swing.JLabel LBLSEX;
    public javax.swing.JLabel LBLTITULO;
    public javax.swing.JLabel LBLTITULO1;
    public javax.swing.JLabel LBLTITULO2;
    public javax.swing.JLabel LBLTITULO3;
    public javax.swing.JPanel LBLTITULOCDPP;
    public javax.swing.JLabel LBLTOTALPORCENT;
    public javax.swing.JLabel LBLTRABAJADORES;
    public javax.swing.JLabel LBLTRRE;
    public javax.swing.JLabel LBLUBICA;
    public javax.swing.JLabel LBLUSUARIO;
    public javax.swing.JLabel LBLYEAR;
    public javax.swing.JPanel PNLCHEQUE;
    public javax.swing.JPanel PNLEFECTO;
    public javax.swing.JPanel PNLEMPRESA;
    public javax.swing.JPanel PNLEMPRESA2;
    public javax.swing.JPanel PNLTRABAJO;
    public javax.swing.JPanel PNLUSUARIO1;
    public javax.swing.JRadioButton RBTHOMBRE;
    public javax.swing.JRadioButton RBTMUJER;
    public javax.swing.JRadioButton RBTNOSE;
    public javax.swing.JSeparator SPREMPRESA;
    public javax.swing.JSeparator SPREMPRESA2;
    public javax.swing.JSeparator SPRNOMBRE;
    public javax.swing.JSeparator SPRTC;
    public javax.swing.JSeparator SPRTC1;
    public javax.swing.JSeparator SPRTCANT;
    public javax.swing.JSeparator SPRTCANT1;
    public javax.swing.JSeparator SPRTCANT2;
    public javax.swing.JSeparator SPRTCLAVE;
    public javax.swing.JSeparator SPRTDATE;
    public javax.swing.JSeparator SPRTDATE1;
    public javax.swing.JSeparator SPRTE;
    public javax.swing.JSeparator SPRTEFECTO;
    public javax.swing.JSeparator SPRTEXPEDICION;
    public javax.swing.JSeparator SPRTHORASTR;
    public javax.swing.JSeparator SPRTNOMBRECH;
    public javax.swing.JSeparator SPRTNOMBRECH1;
    public javax.swing.JSeparator SPRTPASS;
    public javax.swing.JSeparator SPRTUSUARIO;
    public javax.swing.JSeparator SPRUBICA;
    public javax.swing.JSeparator SPRUSUARIO;
    public javax.swing.JSeparator SPRUSUARIO2;
    public javax.swing.JSeparator SPRUSUARIO3;
    public javax.swing.JSeparator SPRUSUARIO4;
    public javax.swing.JSeparator SPRUSUARIO5;
    public javax.swing.JTabbedPane TBPN;
    public javax.swing.JToggleButton TGBTNVER;
    public javax.swing.JTextField TXTFONT;
    public javax.swing.JTextField TXTHRS;
    public javax.swing.JTextField TXTNOMBRE;
    public javax.swing.JTextField TXTPASS;
    public javax.swing.JTextField TXTPORCENTC;
    public javax.swing.JTextField TXTPORCENTE;
    public javax.swing.JTextField TXTPORCENTT;
    public javax.swing.JTextField TXTUBICA;
    public javax.swing.JTextField TXTUSUARIO;
    public javax.swing.JPanel ZERO;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JPanel see;
    // End of variables declaration//GEN-END:variables
}
