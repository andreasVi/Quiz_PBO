/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Andreas
 */
public class MainMenu implements ActionListener{
    JFrame frMain = new JFrame();
    JButton insertDataJurusan, lihatDataJurusan, insertDataMahasiswa, lihatDataMahasiswa;
    JLabel title;
    public MainMenu(){
        frMain.setSize(300,300);
        frMain.setLocationRelativeTo(null);
        frMain.setLayout(null);
        frMain.setVisible(true);
        frMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        title = new JLabel("Main Menu MyITHB");
        insertDataJurusan = new JButton("Insert Data Jurusan");
        lihatDataJurusan = new JButton("Lihat Data Jurusan");
        insertDataMahasiswa = new JButton("Insert Data Mahasiswa");
        lihatDataMahasiswa = new JButton("Lihat Data Mahasiswa");
        
        title.setBounds(60,45,200,20);
        insertDataJurusan.setBounds(45, 80, 200, 20);
        insertDataJurusan.setActionCommand("InsertJ");
        insertDataJurusan.addActionListener(this);
        
        lihatDataJurusan.setBounds(45, 110, 200, 20);
        lihatDataJurusan.setActionCommand("lihatJ");
        lihatDataJurusan.addActionListener(this);
        
        insertDataMahasiswa.setBounds(45, 140, 200, 20);
        insertDataMahasiswa.setActionCommand("InsertM");
        insertDataMahasiswa.addActionListener(this);
        
        lihatDataMahasiswa.setBounds(45, 170, 200, 20);
        lihatDataMahasiswa.setActionCommand("LihatM");
        lihatDataMahasiswa.addActionListener(this);
        
        frMain.add(title);
        frMain.add(insertDataJurusan);
        frMain.add(lihatDataJurusan);
        frMain.add(insertDataMahasiswa);
        frMain.add(lihatDataMahasiswa);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch(command){
            case "InsertJ":
                frMain.dispose();
                new InsertJurusan();
                break;
            case "LihatJ":
                frMain.dispose();
                new DataJurusan();
                break;
            case "InsertM":
                frMain.dispose();
                new InsertMahasiswa();
                break;
            case "LihatM":
                frMain.dispose();
                new DataMahasiswa();
                break;
        }
    }
}
