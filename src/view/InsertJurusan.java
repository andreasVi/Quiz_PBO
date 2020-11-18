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
public class InsertJurusan implements ActionListener{
    JFrame inJuFrame = new JFrame();
    JLabel lbKode, lbNamaJurusan;
    JTextField textKode, textJurusan;
    JButton insert;
    
    public InsertJurusan(){
        inJuFrame.setSize(500,300);
        inJuFrame.setLocationRelativeTo(null);
        inJuFrame.setLayout(null);
        inJuFrame.setVisible(true);
        
        lbKode = new JLabel("Kode: ");
        lbNamaJurusan = new JLabel("Nama Jurusan: ");
        lbKode.setBounds(45, 40, 100, 20);
        lbNamaJurusan.setBounds(45, 70, 100, 20);
        
        textKode = new JTextField();
        textJurusan = new JTextField();
        textKode.setBounds(150, 40, 100, 20);
        textJurusan.setBounds(150, 70, 100, 20);
        
        insert = new JButton("Insert");
        insert.setBounds(300, 130, 100, 20);
        insert.addActionListener(this);
        
        inJuFrame.add(lbKode);
        inJuFrame.add(lbNamaJurusan);
        inJuFrame.add(textKode);
        inJuFrame.add(textJurusan);
        inJuFrame.add(insert);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
