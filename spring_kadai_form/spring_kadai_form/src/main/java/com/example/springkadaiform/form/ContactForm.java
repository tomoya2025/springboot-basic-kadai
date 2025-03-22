package com.example.springkadaiform.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class ContactForm {

    @NotEmpty(message = "お名前を入力してください。")
    private String name;

    @NotEmpty(message = "メールアドレスを入力してください。")
    @Email(message = "メールアドレスの入力形式が正しくありません。")
    private String email;
 
    @NotEmpty(message = "お問い合わせ内容を入力してください。")
    private String message;

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


