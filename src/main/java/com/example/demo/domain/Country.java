package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 实体bean，与数据库表对应.
 */
@Data
public class Country implements Serializable {
    private static final long serialVersionUID = -7201633561701216267L;
    @Id
    private Integer id;
    private String countryName;
    private String countryCode;
}