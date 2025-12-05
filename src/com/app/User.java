package com.app;

public class User {
    private String nom;
    private String email;
    private String password;

    private User(Builder builder) {
        this.nom = builder.nom;
        this.email = builder.email;
        this.password = builder.password;
    }

    public static class Builder {
        private String nom;
        private String email;
        private String password;

        public Builder setNom(String nom) { 
            this.nom = nom; 
            return this; 
        }
        
        public Builder setEmail(String email) { 
            this.email = email; 
            return this; 
        }
        
        public Builder setPassword(String password) { 
            this.password = password; 
            return this; 
        }
        
        public User build() { 
            return new User(this); 
        }
    }

    public void afficher() {
        System.out.println("User: " + nom + ", " + email);
    }
}
