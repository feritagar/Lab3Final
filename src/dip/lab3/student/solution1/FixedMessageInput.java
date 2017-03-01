/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author FA
 */
public class FixedMessageInput implements MessageInput {

    @Override
    public String getMessage() {
       return "Java is Great";
    }

}
