package tagliaferro.adriano.projetodengue.Modelagem;

import android.media.Image;

/**
 * Created by Adriano on 30/04/2016.
 */
public class NotificacaoFoco {

    private int idNot;
    private String dataNot;
    private Image foto;
    private String localizacao;


    public int getIdNot() {
        return idNot;
    }

    public void setIdNot(int idNot) {
        this.idNot = idNot;
    }

    public String getDataNot() {
        return dataNot;
    }

    public void setDataNot(String dataNot) {
        this.dataNot = dataNot;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
