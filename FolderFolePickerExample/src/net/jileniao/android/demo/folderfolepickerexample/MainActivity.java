package net.jileniao.android.demo.folderfolepickerexample;

import net.jileniao.android.views.folderfilepicker.FolderFilePicker;
import net.jileniao.android.views.folderfilepicker.FolderFilePicker.PickPathEvent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	private String mPath;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void pickFile(View v) {
		FolderFilePicker picker = new FolderFilePicker(this,
				new PickPathEvent() {

					@Override
					public void onPickEvent(String resultPath) {
						mPath = resultPath;
						Toast.makeText(MainActivity.this, mPath,
								Toast.LENGTH_LONG).show();
					}
				}, "jpg");
		picker.show();
	}

	public void pickFolder(View v) {
		FolderFilePicker picker = new FolderFilePicker(this,
				new PickPathEvent() {

					@Override
					public void onPickEvent(String resultPath) {
						mPath = resultPath;
						Toast.makeText(MainActivity.this, mPath,
								Toast.LENGTH_LONG).show();
					}
				});
		picker.show();
	}
}
