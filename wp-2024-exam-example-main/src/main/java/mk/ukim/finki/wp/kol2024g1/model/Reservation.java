package mk.ukim.finki.wp.kol2024g1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String guestName;

    private LocalDate dateCreated;

    private Integer daysOfStay;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    @ManyToOne
    private Hotel hotel;

    public Reservation(String guestName, LocalDate dateCreated, Integer daysOfStay, RoomType roomType, Hotel hotel) {
        this.guestName = guestName;
        this.dateCreated = dateCreated;
        this.daysOfStay = daysOfStay;
        this.roomType = roomType;
        this.hotel = hotel;
    }
}
