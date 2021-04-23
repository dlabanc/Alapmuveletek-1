package alapmuvgyak;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Muveletek extends javax.swing.JFrame {

    String mentettFajl;
    int szam1;
    int szam2;
    int osszKerdes = 0;
    int osszProba = 0;
    int osztasKerdes = 0;
    int osztasProba = 0;
    int szorzasKerdes = 0;
    int szorzasProba = 0;
    int kivonKerdes = 0;
    int kivonProba = 0;
    int osszeadKerdes = 0;
    int osszeadProba = 0;
    int helyesvalasz = 0;
    String megoldas;
    boolean megvalaszolt = false;
    boolean megoldastMutat = false;
    boolean mutat = true;

    public Muveletek() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lblOsszProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        lblMuvelet = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        mnuFajlMent = new javax.swing.JMenuItem();
        mnMentes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        mnuMuvelet = new javax.swing.JMenu();
        rbmOsszead = new javax.swing.JRadioButtonMenuItem();
        rbmKivon = new javax.swing.JRadioButtonMenuItem();
        rbmSzoroz = new javax.swing.JRadioButtonMenuItem();
        rbmOszt = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakoroltatása");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        lblValasz.setText("visszajelzés");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEllenorzes)
                .addContainerGap())
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEllenorzes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");
        btnUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjActionPerformed(evt);
                tisztit(evt);
            }
        });

        btnMegoldas.setText("Megoldás");
        btnMegoldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegoldasActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszKerdes.setText("Össz kérdések száma: 0");

        lblOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszProba.setText("Össz Probálkozások száma: 0");

        lblEredmeny.setText("Eredmény: 0 %");

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 0");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasKerdes.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 0");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblEredmeny))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadKerdes)
                            .addComponent(lblKivonasKerdes)
                            .addComponent(lblOsztasKerdes)
                            .addComponent(lblSzorzasKerdes)
                            .addComponent(lblOsszKerdes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKivonasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszProba, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKivonasKerdes, lblOsszeadKerdes, lblOsztasKerdes, lblSzorzasKerdes});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)))
                .addGap(18, 18, 18)
                .addComponent(lblEredmeny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblMuvelet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMuvelet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        mnuFajl.setText("Fájl");

        mnuFajlMegnyit.setText("Megnyit");
        mnuFajlMegnyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMegnyitActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMegnyit);

        mnuFajlMent.setText("Ment");
        mnuFajlMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMent);

        mnMentes.setText("Mentés másként...");
        mnMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMentesActionPerformed(evt);
            }
        });
        mnuFajl.add(mnMentes);
        mnuFajl.add(jSeparator1);

        mnuFajlKilep.setText("Kilép");
        mnuFajl.add(mnuFajlKilep);

        jMenuBar1.add(mnuFajl);

        mnuMuvelet.setText("Műveletek");

        buttonGroup1.add(rbmOsszead);
        rbmOsszead.setText("Összeadás");
        rbmOsszead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmOsszeadActionPerformed(evt);
                tisztit(evt);
            }
        });
        mnuMuvelet.add(rbmOsszead);

        buttonGroup1.add(rbmKivon);
        rbmKivon.setText("Kivonás");
        rbmKivon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmKivonActionPerformed(evt);
                tisztit(evt);
            }
        });
        mnuMuvelet.add(rbmKivon);

        buttonGroup1.add(rbmSzoroz);
        rbmSzoroz.setText("Szorzás");
        rbmSzoroz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmSzorozActionPerformed(evt);
                tisztit(evt);
            }
        });
        mnuMuvelet.add(rbmSzoroz);

        buttonGroup1.add(rbmOszt);
        rbmOszt.setText("Osztás");
        rbmOszt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmOsztActionPerformed(evt);
                tisztit(evt);
            }
        });
        mnuMuvelet.add(rbmOszt);

        jMenuBar1.add(mnuMuvelet);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMuvelet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(btnMegoldas))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(btnUj)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMuvelet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        boolean helyes = txtEredmeny.getText().equals(megoldas);

        if (!megoldastMutat) {
            if (!(txtEredmeny.getText().isEmpty() || megvalaszolt)) {
                if (helyes) {
                    helyesvalasz += 1;
                    lblFeladat.setText("Helyes!");
                    lblEredmeny.setText("Eredmény:");
                } else {
                    lblFeladat.setText("Helytelen!");
                }
                osszProba += 1;
                lblOsszProba.setText("Össz Próbálkozások száma: " + osszProba);

                if (rbmOszt.isSelected()) {
                    osztasProba += 1;
                    lblOsztasProba.setText("Osztás: " + osztasProba);
                } else if (rbmSzoroz.isSelected()) {
                    szorzasProba += 1;
                    lblSzorzasProba.setText("Szorzás: " + szorzasProba);
                } else if (rbmOsszead.isSelected()) {
                    osszeadProba += 1;
                    lblOsszeadProba.setText("Összeadás: " + osszeadProba);
                } else if (rbmKivon.isSelected()) {
                    kivonProba += 1;
                    lblKivonasProba.setText("Kivonás: " + kivonProba);
                }

                double eredmeny = ((double) helyesvalasz / osszProba) * 100;
                String eredmenykiir = String.format("%.0f", eredmeny);
                lblEredmeny.setText("Eredmény: " + eredmenykiir + " %");

                megvalaszolt = true;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Már ellenőrízted! Kérj új feladatot!", "Ellenőrízve", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEllenorzesActionPerformed

    private void btnMegoldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegoldasActionPerformed
        if (mutat) {
            lblMuvelet.setText(lblMuvelet.getText() + " = " + megoldas);
            mutat = false;
            megoldastMutat = true;
        }

    }//GEN-LAST:event_btnMegoldasActionPerformed

    private void mnMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMentesActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Mentés másként");
        fc.setAcceptAllFileFilterUsed(false);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(filter);
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter("csak szöveg *.txt)", "txt");
        fc.addChoosableFileFilter(txtfilter);
        FileNameExtensionFilter ldfilter = new FileNameExtensionFilter("speciális (*.ld)", "ld");
        fc.addChoosableFileFilter(ldfilter);
        fc.setFileFilter(txtfilter);

        int valasztottGombErteke = fc.showSaveDialog(this);
        if (valasztottGombErteke == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();

            String[] kit = ((FileNameExtensionFilter) fc.getFileFilter()).getExtensions();

            String fn = f.getPath();

            /*Kiterjesztés van-e */
            if (!fn.endsWith("." + kit[0])) {
                fn += "." + kit[0];
            }

            /*VÉGE*/
            mentettFajl = fn;

            Path path = Paths.get(fn);
            boolean mentes = true;

            /*Létezik-e */
            if (Files.exists(path)) {
                valasztottGombErteke = JOptionPane.showConfirmDialog(this, "Felülírjam?", "A fájl létezik!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (valasztottGombErteke == JOptionPane.NO_OPTION) {
                    mentes = false;
                }
            }

            /*VÉGE*/
            lblEredmeny.setText("<html>Elérés: " + fn + "<br>Fájl neve: " + f.getName() + "." + kit[0] + "</html>");
            try {
                if (mentes) {
                    Files.write(path, tartalomOsszeallitas().getBytes());
                }
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Mentés megszakítva", "Nincs mentés", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mnMentesActionPerformed

    private void mnuFajlMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentActionPerformed
        if (mentettFajl == null) {
            /*1. mentés során a mentés másként metódus kell*/
            mnMentesActionPerformed(evt);
        } else {

            try {
                /* További mentésnél a megadott helyre és a megadott néven kell menteni */
                Files.write(Paths.get(mentettFajl), "Statisztika: ment".getBytes());
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_mnuFajlMentActionPerformed

    private void mnuFajlMegnyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMegnyitActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Mentés másként");

        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            File f = fc.getSelectedFile();
            String fn = f.getPath();

            lblEredmeny.setText(
                    "<html>Elérés: " + fn + "<br>Fájl neve: " + f.getName() + "</html>");

            /*Tényleges megnyitás*/
            Path path = Paths.get(fn);
            try {
                
                byte[] bajtTomb = Files.readAllBytes(path);
                byte egyBajt = bajtTomb[0];
                
                List<String> stringLista = Files.readAllLines(path);
                String egySor = stringLista.get(1);
                String[] adatok = egySor.split(":");
                
                
                int temp = 7;
                /*Tényleges megnyitás vége*/

            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Megnyitás megszakítva", "Nincs megnyitott fájl", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_mnuFajlMegnyitActionPerformed

    private void rbmOsztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmOsztActionPerformed
        boolean jo;
        do {
            szam1 = (int) (Math.random() * 100);
            szam2 = (int) (Math.random() * 100);
            jo = szam2 != 0 && szam1 % szam2 == 0;
        } while (!jo);

        megoldas = szam1 / szam2 + "";
        lblMuvelet.setText(szam1 + " / " + szam2);

        osszKerdes += 1;
        osztasKerdes += 1;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdes);
        lblOsztasKerdes.setText("Osztás: " + osztasKerdes);
    }//GEN-LAST:event_rbmOsztActionPerformed

    private void btnUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjActionPerformed
        megvalaszolt = false;
        megoldastMutat = false;
        txtEredmeny.setText("");
        if (rbmOszt.isSelected()) {
            rbmOsztActionPerformed(evt);
            lblFeladat.setText("");
        } else if (rbmSzoroz.isSelected()) {
            rbmSzorozActionPerformed(evt);
            lblFeladat.setText("");
        } else if (rbmOsszead.isSelected()) {
            rbmOsszeadActionPerformed(evt);
            lblFeladat.setText("");
        } else if (rbmKivon.isSelected()) {
            rbmKivonActionPerformed(evt);
            lblFeladat.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Nincs művelet kiválasztva!", "Nincs művelet", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUjActionPerformed

    private void rbmOsszeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmOsszeadActionPerformed
        szam1 = (int) (Math.random() * 100);
        szam2 = (int) (Math.random() * 100);

        megoldas = szam1 + szam2 + "";
        lblMuvelet.setText(szam1 + " + " + szam2);

        osszKerdes += 1;
        osszeadKerdes += 1;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdes);
        lblOsszeadKerdes.setText("Összeadás: " + osszeadKerdes);
    }//GEN-LAST:event_rbmOsszeadActionPerformed

    private void rbmKivonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmKivonActionPerformed
        szam1 = (int) (Math.random() * 100);
        szam2 = (int) (Math.random() * 100);

        megoldas = szam1 - szam2 + "";
        lblMuvelet.setText(szam1 + " - " + szam2);

        osszKerdes += 1;
        kivonKerdes += 1;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdes);
        lblKivonasKerdes.setText("Kivonás: " + kivonKerdes);
    }//GEN-LAST:event_rbmKivonActionPerformed

    private void rbmSzorozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmSzorozActionPerformed
        szam1 = (int) (Math.random() * 100);
        szam2 = (int) (Math.random() * 100);

        megoldas = szam1 * szam2 + "";
        lblMuvelet.setText(szam1 + " * " + szam2);

        osszKerdes += 1;
        szorzasKerdes += 1;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszKerdes);
        lblSzorzasKerdes.setText("Szorzás: " + szorzasKerdes);
    }//GEN-LAST:event_rbmSzorozActionPerformed

    private void tisztit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tisztit
        megvalaszolt = false;
        megoldastMutat = false;
        mutat = true;
    }//GEN-LAST:event_tisztit

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
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblMuvelet;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszProba;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JMenuItem mnMentes;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlMent;
    private javax.swing.JMenu mnuMuvelet;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JRadioButtonMenuItem rbmKivon;
    private javax.swing.JRadioButtonMenuItem rbmOsszead;
    private javax.swing.JRadioButtonMenuItem rbmOszt;
    private javax.swing.JRadioButtonMenuItem rbmSzoroz;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables

    private String tartalomOsszeallitas() {
        String statisztika = "Alapműveletek gyakoroltatása statisztika:\n";
        JLabel[] lblTomb = new JLabel[]{lblOsszKerdes, lblOsszProba, lblOsszeadKerdes, lblOsszeadProba, lblKivonasKerdes, lblKivonasProba, lblSzorzasKerdes, lblSzorzasProba, lblSzorzasKerdes, lblSzorzasProba};

        final int HE = 3;
        final int kerdesMaxHossz = lblOsszKerdes.getText().length() + HE;
        final int probaMaxHossz = lblOsszProba.getText().length() + HE;

        for (int i = 0; i < lblTomb.length - 1; i += 2) {
            JLabel labKerdes = lblTomb[i];
            JLabel labProba = lblTomb[i + 1];
            String formazo = "%" + (kerdesMaxHossz) + "s%" + (probaMaxHossz) + "s\n";
            statisztika += String.format(formazo, labKerdes.getText(), labProba.getText());
        }

        return statisztika;
    }
}
