package edu.fpdual.ejemplo.fpdualejemplomaven;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Canon {

    private String letra;
    private int frecuencia;

    public void setLetra(final String letra){
        this.letra=letra.toUpperCase();
    }

    @Override
    public String toString(){
        String mensaje= "";
        for (int i = 0; i<frecuencia;i++){
            mensaje += " "+letra;
        }
        return mensaje;
    }

}
