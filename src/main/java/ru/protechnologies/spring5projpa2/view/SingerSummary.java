/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.protechnologies.spring5projpa2.view;

import java.io.Serializable;

/**
 *
 * @author hitman
 */
public class SingerSummary implements Serializable {

    private String firstName;
    private String lastName;
    private String latestAlbum;

    public SingerSummary(String firstName, String lastName,
            String latestAlbum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.latestAlbum = latestAlbum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLatestAlbum() {
        return latestAlbum;
    }

    @Override
    public String toString() {
        return "First name: " + firstName + ", Last Name: " + lastName
                + ", Most Recent Album: " + latestAlbum;
    }
}
