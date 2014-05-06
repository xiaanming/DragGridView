package com.example.draggridview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.framework.DragGridView;

import android.app.Activity;
import android.os.Bundle;

/**
 * @blog http://blog.csdn.net/xiaanming 
 * 
 * @author xiaanming
 *
 */
public class MainActivity extends Activity {
	private List<HashMap<String, Object>> dataSourceList = new ArrayList<HashMap<String, Object>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DragGridView mDragGridView = (DragGridView) findViewById(R.id.dragGridView);
		for (int i = 0; i < 15; i++) {
			HashMap<String, Object> itemHashMap = new HashMap<String, Object>();
			itemHashMap.put("item_image",R.drawable.com_tencent_open_notice_msg_icon_big);
			itemHashMap.put("item_text", "мов╖ " + Integer.toString(i));
			dataSourceList.add(itemHashMap);
		}
		
		final DragAdapter mDragAdapter = new DragAdapter(this, dataSourceList);
		
		mDragGridView.setAdapter(mDragAdapter);
	}
	

}
