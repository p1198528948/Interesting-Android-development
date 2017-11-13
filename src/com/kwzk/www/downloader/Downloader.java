package com.kwzk.www.downloader;

public class Downloader<T> extends HandlerDownloaderThread{

	private DownloaderListener<T> mDownloaderListener; 
	
	public Downloader() {
		super();
	}
	
	public interface DownloaderListener<T>{
		void onDownloaded(T target, String url);
	}
	
	@Override
	public void handlerDownloaderThread(DownloadTask dt) {
		
	}

	public void setDownloaderListener(DownloaderListener<T> listener) {
		mDownloaderListener = listener;
	}
	
	@Override
	void addNewTask(DownloadTask dt) {
		
	}
	
}
