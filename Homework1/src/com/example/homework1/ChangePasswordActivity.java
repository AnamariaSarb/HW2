package com.example.homework1;

import com.parse.Parse;
import com.parse.ParseUser;

import com.example.homework1.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ChangePasswordActivity extends Activity {
	
	private EditText oldPassField, newPassField;
	Button changePassBtn;
	
	ParseUser currentUser = ParseUser.getCurrentUser();

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_change_password);

		Parse.initialize(this, "BmbiDoWmcHnINiTcLUymM6lcP84rHYd5XrfC2gFW",
				"KY1MGCdC2HawkP4msjtNx4Y1V3qNNWNEbSlEfG82");
		getIntent();

		ParseUser currentUser = ParseUser.getCurrentUser();
		oldPassField = (EditText) findViewById(R.id.old_password);
		newPassField = (EditText) findViewById(R.id.new_password);
	


}
}