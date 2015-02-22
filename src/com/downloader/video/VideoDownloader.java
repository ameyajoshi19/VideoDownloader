package com.downloader.video;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.downloader.video.util.VideoDownloderUtility;

/**
 * <p>
 * This is the main class for the VideoDownloader project. Given a URL link, this app will scrap that
 * page for all URLs and pick out the video links found in the video. It will then download these
 * videos.
 * </p>
 * @author AmeyaCJoshi
 *
 */
public class VideoDownloader {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String pageUrl = br.readLine();
		
		startProcessing(pageUrl);
	}
	
	private static void startProcessing(String URL) {
		VideoDownloderUtility util = new VideoDownloderUtility();
		boolean isUrlValid = util.isUrlValid(URL);
		if(isUrlValid) {
			//TODO: process URL.
		} else {
			System.err.println(String.format("Malformed URL! {%s} is not a valid URL.", URL));
		}
	}
}
