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
import javax.swing.JTextField;

/**
 *
 * @author Andreas
 */
public class InsertMahasiswa implements ActionListener{
    JFrame frMahasiswa = new JFrame();
    JLabel lbNIM, lbNama, lbAngkatan, lbJurusan;
    JTextField textNIM, textNama, textAngkatan, textJurusan;
    
    JButton insert;
    
    public InsertMahasiswa(){
        frMahasiswa.setSize(500,300);
        frMahasiswa.setLocationRelativeTo(null);
        frMahasiswa.setLayout(null);
        frMahasiswa.setVisible(true);
        
        lbNIM = new JLabel("NIM:");
        lbNama = new JLabel("Nama:");        
        lbAngkatan = new JLabel("Angkatan:");        
        lbJurusan = new JLabel("Jurusan:");    
        
        lbNIM.setBounds(45, 40, 100, 20);
        lbNama.setBounds(45, 70, 100, 20);
        lbAngkatan.setBounds(45, 100, 100, 20);
        lbJurusan.setBounds(45, 130, 100, 20);
        
        textNIM = new JTextField();
        textNama = new JTextField();
        textAngkatan = new JTextField();
        textJurusan = new JTextField();
        
        textNIM.setBounds(200, 40, 200, 20);
        textNama.setBounds(200, 70, 200, 20);
        textAngkatan.setBounds(200, 100, 200, 20);
        textJurusan.setBounds(200, 130, 200, 20);
        
        insert.setBounds(220, 40, 100, 20);
        insert.addActionListener(this);
        
        frMahasiswa.add(lbNIM);
        frMahasiswa.add(lbNama);
        frMahasiswa.add(lbAngkatan);
        frMahasiswa.add(lbJurusan);
        frMahasiswa.add(textNIM);
        frMahasiswa.add(textNama);
        frMahasiswa.add(textAngkatan);
        frMahasiswa.add(textJurusan);
        frMahasiswa.add(insert);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
