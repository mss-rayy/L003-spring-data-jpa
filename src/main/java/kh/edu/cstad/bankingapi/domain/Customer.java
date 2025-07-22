package kh.edu.cstad.bankingapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    @Column(nullable = false)
    private String fullName;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String gender;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private Boolean isDeleted;

//    Has-A
    @OneToMany(mappedBy = "customer")
    private List<Account> accounts;

    @OneToOne
    @JoinColumn(unique = true)
    private KYC kyc;

    @ManyToOne
    private CustomerSegment customerSegment;
}


