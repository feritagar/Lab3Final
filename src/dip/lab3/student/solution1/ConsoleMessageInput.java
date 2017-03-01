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
public class ConsoleMessageInput implements MessageInput {

    private String userName;

    public ConsoleMessageInput(String userName) {
        this.userName = userName;

    }

    public final String getUserName() {
        return userName;
    }

    //open-close princible.All concrete method should be final.
    //dangerous inheritance
    public final void setUserName(String userName) {
        if (userName == null || userName.length() == 0) {
            throw new IllegalArgumentException("User Name CAN NOT be empty!!!");
        }
        this.userName = userName;
    }

    @Override
    public String getMessage() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Hello " + userName + " Please enter your message");
        return scn.nextLine();

    }

}
