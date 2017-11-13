package com.kwzk.www.downloader;

public abstract class HandlerDownloaderThread {
	
	abstract void handlerDownloaderThread(DownloadTask dt);
	
	abstract void addNewTask(DownloadTask dt);
	
}
