package com.kwzk.www.downloader;

public class Main {
	public static void main(String[] args) {
		RunPart runPart = new RunPart();
		runPart.onCreate();
	}
}

class RunPart{
	
	Downloader<DownloadTask> mDownloader;
	
	public void onCreate() {
		mDownloader = new Downloader<>();
		mDownloader.setDownloaderListener(
			new Downloader.DownloaderListener<DownloadTask>() {
				
			@Override
			public void onDownloaded(DownloadTask target, String url) {
				System.out.println(target.toString() + "|::|" + url);
			}
		});
	}
	
}
