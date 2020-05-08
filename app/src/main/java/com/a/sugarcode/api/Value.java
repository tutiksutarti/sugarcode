package com.a.sugarcode.api;

import com.a.sugarcode.model.Hidangan;
import com.a.sugarcode.model.Komentar;
import com.a.sugarcode.model.Pelanggan;
import java.util.List;



public class Value {
    Boolean success;
    List<Hidangan> hidangan;
    List<Komentar> komentar;
//    Pelanggan pelanggan;
    List<Pelanggan> pelanggan;
    String message;

    public Boolean getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
    public List<Hidangan> getHidangan() {
        return hidangan;
    }
    public List<Komentar> getKomentar(){
        return komentar;
    }

    public List<Pelanggan> getPelanggan() {
        return pelanggan;
    }
}
