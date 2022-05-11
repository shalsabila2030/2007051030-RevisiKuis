package setrika.model;

public class setrika {
    private String Id;
    private String nama;
    private String tglProduksi;
    private String merk;
    private String jenis;
    private String harga;

    public setrika(String Id, String nama, String tglProduksi, String jenis, String merk, String harga) {
        this.Id = Id;
        this.nama = nama;
        this.tglProduksi = tglProduksi;
        this.jenis = jenis;
        this.merk = merk;
        this.harga = harga;
    }

    public void setid(String Id) {
        this.Id = Id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglProduksi(String tglProduksi) {
        this.tglProduksi = tglProduksi;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getId() {
        return Id;
    }

    public String getNama() {
        return nama;
    }

    public String getTglProduksi() {
        return tglProduksi;
    }

    public String getJenis() {
        return jenis;
    }

    public String getMerk() {
        return merk;
    }

    public String getHarga() {
        return harga;
    }
}