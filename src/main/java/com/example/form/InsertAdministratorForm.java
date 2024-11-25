package com.example.form;

import jakarta.validation.GroupSequence;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {

	public interface Group1 {
	}

	public interface Group2 {
	}

	public interface Group3 {
	}

	@GroupSequence({Group1.class,Group2.class})
	public interface  All {}

	/** 名前 */
	@NotBlank(message = "名前を入力してください")
	@Size(min = 1, max = 127, message = "１文字以上１２７文字以内で入力してください")
	private String name;

	/** メールアドレス */
	@NotBlank(message = "メールアドレスを入力してください。")
	@Email(message = "メールアドレスの形式で入力してください")
	@Size(min = 1, max = 254, message = "１文字以上２５４文字以内で入力してください")
	private String mailAddress;

	/** パスワード */
	@NotBlank(message = "パスワードを入力してください")
	@Size(min = 8, max = 50, message = "８文字以上５０文字以内で入力してください")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}

}
