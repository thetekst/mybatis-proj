package ru.model;

import lombok.Data;

/**
 * @author Dmitry Tkachenko
 * 11.01.18
 */
@Data
public class City {

    private int id;

    private String name;

    private String state;

    private String country;
}
