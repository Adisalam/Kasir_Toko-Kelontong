package tampilan.obj;

public class Pegawai {

    private int id;
    private String nama;
    private String jabatan;
    private String username;
    private String passsword;
    private String level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }
    
    public String getLevel() {
    return level;
}

    // KODE PERBAIKAN DI PEGAWAI.JAVA
    public void setLevel(String level) {
        this.level = level; // Asumsi ada private String level;
    }

}
