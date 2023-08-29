package mujahid.data;

public record LoginRequest(String username, String password) {

    public LoginRequest {
        System.out.println("akan dipanggil ketika constructor utama dipanggil");
    }

    // overloading di record class.
    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }

    void sayHello(){
        System.out.println("Hello");
    }
}
