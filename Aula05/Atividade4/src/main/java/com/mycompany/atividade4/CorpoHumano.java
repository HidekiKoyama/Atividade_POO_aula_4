package com.mycompany.atividade4;

public class CorpoHumano{

private float massa;
private float volume;
private float densidade;

public CorpoHumano(float massa, float volume){
    this.massa = massa;
    this.volume = volume;
    densidade = massa / volume;
}
public float getMassa() {
    return massa;
}

public void setMassa(float massa) {
    this.massa = massa;
    densidade = massa / volume;
}

public float getVolume() {
    return volume;
}

public void setVolume(float volume) {
    this.volume = volume;
    densidade = massa / volume;
}

public float getDensidade() {
    return densidade;
}
}