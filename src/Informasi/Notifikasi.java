package Informasi;

public class Notifikasi {
    private String pesan;
    private boolean status_baca;
    private String tanggal;

    public Notifikasi(String pesan, String tanggal) {
        this.pesan = pesan;
        this.tanggal = tanggal;
        this.status_baca = true;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public void setStatus_baca(boolean status_baca) {
        this.status_baca = status_baca;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    @Override
    public String toString() {
        return "Notifikasi{" +
                "pesan='" + pesan + '\'' +
                ", status_baca=" + status_baca +
                ", tanggal='" + tanggal + '\'' +
                '}';
    }
}
