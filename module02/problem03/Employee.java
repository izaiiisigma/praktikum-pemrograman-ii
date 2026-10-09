package module02.problem03;

//Pada baris ini terjadi error karena nama class Pegawai tidak sama dengan nama file Employee.java dan tidak cocok dengan new Employee() di Main
//public class Pegawai {
public class Employee {
    public String name;
    //Pada baris ini terjadi error karena tipe data char hanya bisa menyimpan satu karakter, tidak bisa menyimpan string Kingdom of Orvel
    //public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    //Pada baris ini terjadi error karena method tidak punya parameter, padahal dipanggil dengan setRole("Assasin") dan memakai variabel r yang belum dideklarasikan
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}