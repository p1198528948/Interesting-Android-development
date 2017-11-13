package com.kwzk.www.downloader;

public class DownloadTask {
	
	private String taskName;
	
	private String taskDetail;
	
	private boolean isFinsh;
	
	private int id;
	
	public DownloadTask() {
		
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDetail() {
		return taskDetail;
	}

	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}

	public boolean isFinsh() {
		return isFinsh;
	}

	public void setFinsh(boolean isFinsh) {
		this.isFinsh = isFinsh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "[id = " + id + "] [taskName = " + taskName + "]";
	}
	
}
