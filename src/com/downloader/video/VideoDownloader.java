package com.downloader.video;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.downloader.video.util.VideoDownloderUtility;

/**
 * <p>
 * This is the main class for the Video Downloader app. Given a URL link, this app will scrape the
 * page for all URLs and pick out the video links found in the video. It will then download these
 * videos.
 * </p>
 * 
 * @author AmeyaCJoshi
 *
 */
public class VideoDownloader {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		VideoDownloader downloader = new VideoDownloader();
		String pageUrl = br.readLine();
		downloader.startProcessing(pageUrl);
	}
	
	private void startProcessing(String URL) {
		VideoDownloderUtility util = new VideoDownloderUtility();
		
		// Check if the given string is a valid URL.
		boolean isUrlValid = util.isUrlValid(URL);
		if(isUrlValid) {
			List<String> linksFoundInThePage = util.parseWebPageToFindAllHrefs(URL);
			List<String> videoHrefsFoundInThePage = util.findAllVideoLinks(linksFoundInThePage);
			util.downloadVideos(videoHrefsFoundInThePage);
			
		} else {
			System.err.println(String.format("Malformed URL! {%s} is not a valid URL.", URL));
		}
	}
}
