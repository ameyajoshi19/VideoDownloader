package com.downloader.video.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.validator.routines.UrlValidator;

/**
 * <p>
 * This class contains the utility methods required by the video downloader app.
 * </p>
 * 
 * @author AmeyaCJoshi
 *
 */
public class VideoDownloderUtility {
	
	public void downloadVideos(List<String> videoLinks) {
		//TODO: implement
	}
	
	public List<String> findAllVideoLinks(List<String> allLinks) {
		List<String> allVideoLinks = new ArrayList<String>();
		
		//TODO: implement
		
		return allVideoLinks;
	}
	
	public List<String> parseWebPageToFindAllHrefs(String URL) {
		List<String> hrefsInThePage = new ArrayList<String>();
		
		//TODO: implement
		
		return hrefsInThePage;
	}
	
	public boolean isUrlValid(String URL) {
		UrlValidator validator = new UrlValidator();
		return validator.isValid(URL);
	}
}
