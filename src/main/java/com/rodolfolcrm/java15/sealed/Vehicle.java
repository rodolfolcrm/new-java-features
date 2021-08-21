package com.rodolfolcrm.java15.sealed;

public sealed interface Vehicle permits Car, Truck {

    String registrationNumber();
}
