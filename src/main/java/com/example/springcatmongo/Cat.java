package com.example.springcatmongo;


import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@ToString
public class Cat {
    @Id
    private String id;
    private final String name;
    private final String furColor;
    private final String cityName;

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", furColor='" + furColor + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
