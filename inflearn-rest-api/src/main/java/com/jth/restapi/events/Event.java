package com.jth.restapi.events;

import lombok.*;

import java.time.LocalDateTime;

@Builder @AllArgsConstructor @NoArgsConstructor
@Getter @Setter @EqualsAndHashCode(of = "id")
public class Event {

    private int id;

    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDateTime;
    private LocalDateTime endEventDateTime;
    private String location;    // optional
    private int basePrice;      // optional
    private int maxPrice;       // optional
    private int limitOfEnrollment;

    private boolean offline;
    private boolean free;

    private EventStatus eventStatus;

}