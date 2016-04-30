package tagliaferro.adriano.projetodengue.Modelagem;

import java.util.Date;

/**
 * Created by Adriano on 30/04/2016.
 */
public class LembretesUsuario {

    private int idLemb;
    private String tipoLemb;
    private Date dataUlt;
    private Date dataProx;


    public int getIdLemb() {
        return idLemb;
    }

    public void setIdLemb(int idLemb) {
        this.idLemb = idLemb;
    }

    public String getTipoLemb() {
        return tipoLemb;
    }

    public void setTipoLemb(String tipoLemb) {
        this.tipoLemb = tipoLemb;
    }

    public Date getDataUlt() {
        return dataUlt;
    }

    public void setDataUlt(Date dataUlt) {
        this.dataUlt = dataUlt;
    }

    public Date getDataProx() {
        return dataProx;
    }

    public void setDataProx(Date dataProx) {
        this.dataProx = dataProx;
    }
}
