package model;

public record Customer(String name, String email, String phone) {
    public Customer {
        if(name.isBlank() || !email.contains("@") || phone.isBlank()) {
            throw new IllegalArgumentException("Все поля должны быть запонены корректно");
        }
    }
    public String getContactInfo() {
        return name + "<" + email + ">";
    }
}
