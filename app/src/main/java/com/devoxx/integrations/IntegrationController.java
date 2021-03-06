package com.devoxx.integrations;

import com.devoxx.android.activity.RegisterUserActivity;

import android.app.Activity;
import android.view.Menu;

public interface IntegrationController {
	void register();

	void downloadNeededData(String confCode);

	void handleAppResume(String confCode, Activity activity);

	void talkVoted(String confCode, Activity activity);

	void userRegistered(String confId, String finalCode, RegisterUserActivity.InfoExtractor infoExtractor);

	void setupIntegrationToolbarMenuItem(Menu menu);

	void handleToolbarIconClick(String confId, Activity activity);

	void init();

	void clear();
}
