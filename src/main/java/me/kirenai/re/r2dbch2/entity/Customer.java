package me.kirenai.re.r2dbch2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("customers")
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {

    @Id
    private Long customerId;
    private String name;

}
