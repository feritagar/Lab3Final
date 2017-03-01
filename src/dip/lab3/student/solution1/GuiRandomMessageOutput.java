/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author FA
 */
public class GuiRandomMessageOutput implements MessageOutput {
    // single responsible princible e dikkat et.
    // sadece output yada sadece input
    // bu sinif output sinifi oldugu icin sadece output 
    // gorevini yerine getiriyor
    @Override
    public void displayMessageOutput(MessageInput input) {
        JOptionPane.showMessageDialog(null, input.getMessage());
    }
}
