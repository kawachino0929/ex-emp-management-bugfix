package com.example.form;

import com.example.form.InsertAdministratorForm.Group1;
import com.example.form.InsertAdministratorForm.Group2;

import jakarta.validation.GroupSequence;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * ログイン時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class LoginForm {

	public interface Group1 {
	}

	public interface Group2 {
	}

	public interface Group3 {
	}

	@GroupSequence({Group1.class,Group2.class})
	public interface  All {}

	/** メールアドレス */
	@NotBlank(message = "メールアドレスを入力してください。", groups = Group1.class)
	@Email(message = "メールアドレスの形式で入力してください", groups = Group1.class)
	@Size(min = 1, max = 254, message = "１文字以上２５４文字以内で入力してください", groups = Group2.class)
	private String mailAddress;

	/** パスワード */
	@NotBlank(message = "パスワードを入力してください", groups = Group1.class)
	@Size(min = 8, max = 50, message = "８文字以上５０文字以内で入力してください", groups = Group2.class)
	private String password;
	
	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [mailAddress=" + mailAddress + ", password=" + password + "]";
	}

}
