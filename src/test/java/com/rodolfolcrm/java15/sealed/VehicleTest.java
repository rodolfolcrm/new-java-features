package com.rodolfolcrm.java15.sealed;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class VehicleTest {

    public static final int SEATS = 5;
    public static final int LOAD_CAPACITY = 1000;
    public static final String CAR_REGISTRATION_NUMBER = UUID.randomUUID().toString();
    public static final String TRUCK_REGISTRATION_NUMBER = UUID.randomUUID().toString();

    @Test
    void should_create_vehicles() {
        var vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car(CAR_REGISTRATION_NUMBER, SEATS));
        vehicles.add(new Truck(TRUCK_REGISTRATION_NUMBER, LOAD_CAPACITY));

        vehicles.forEach(vehicle -> {
                    if (vehicle instanceof Car car) {
                        assertThat(car.registrationNumber()).isEqualTo(CAR_REGISTRATION_NUMBER);
                        assertThat(car.seats()).isEqualTo(SEATS);
                    } else if (vehicle instanceof Truck truck) {
                        assertThat(truck.registrationNumber()).isEqualTo(TRUCK_REGISTRATION_NUMBER);
                        assertThat(truck.loadCapacity()).isEqualTo(LOAD_CAPACITY);
                    }
                }
        );
    }
}