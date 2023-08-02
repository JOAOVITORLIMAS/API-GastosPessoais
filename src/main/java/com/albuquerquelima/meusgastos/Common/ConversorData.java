package com.albuquerquelima.meusgastos.Common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorData {
    
    public static String converterDataParaDataEHora( Date data){

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYY HH:mm:ss" );
        return formatador.format(data);
    }
}
