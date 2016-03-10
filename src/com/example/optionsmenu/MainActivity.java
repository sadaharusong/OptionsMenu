package com.example.optionsmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		menu.add(1, 100, 1, "菜单1");
		
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case R.id.action_settings:
			Toast.makeText(MainActivity.this, "点击了菜单设置", Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(MainActivity.this, ac2.class);
			item.setIntent(intent);
			break;

		case R.id.action_item1:
			Toast.makeText(MainActivity.this, "点击了菜单1", Toast.LENGTH_SHORT).show();
			Intent intent2 = new Intent(MainActivity.this, ac2.class);
			item.setIntent(intent2);
			break;
		case R.id.action_item2:
			Toast.makeText(MainActivity.this, "点击了菜单2", Toast.LENGTH_SHORT).show();
			Intent intent3 = new Intent(MainActivity.this, ac2.class);
			item.setIntent(intent3);
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
