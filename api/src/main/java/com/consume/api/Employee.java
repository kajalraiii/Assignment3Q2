package com.consume.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "getApi")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String employee_name;
    private int employee_age;
    private String profile_image;
    private int employee_salary;

    @Override
    public String toString() {
        return "Value [id=" + id + ", employee_name=" + employee_name + ", employee_age=" + employee_age
                + ", profile_image=" + profile_image + "]";
    }

}