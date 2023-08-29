package mujahid.application;

import mujahid.data.LoginRequest;
import mujahid.error.ValidationException;
import mujahid.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "");

        try {
            ValidationUtil.validate(loginRequest);
        }catch (ValidationException e) {
            System.err.println("Terjadi error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("the data can't be null");
        } finally {
            System.out.println("ini akan dijalankan baik catch atau tidak dijalankan");
        }

        // bisa juga digabung seperti ini
        /*
        catch(ValidationException | NullPointerException e) { System.err.println("Terjadi error : " + e.getMessage());
         */

        LoginRequest loginRequest1 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest1); // tidak wajib menggunakan try catch tapi tetep mati aplikasinya
    }
}
