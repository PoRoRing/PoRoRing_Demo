package Proring.Proring_prototype.domain;

import Proring.Proring_prototype.domain.common.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Condition extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id", nullable=false)
    private Member member;
}
