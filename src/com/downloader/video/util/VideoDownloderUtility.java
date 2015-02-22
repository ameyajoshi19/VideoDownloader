package com.downloader.video.util;

import org.apache.commons.validator.routines.UrlValidator;

/**
 * <p>
 * This class contains the utility methods required by the video downloader app.
 * </p>
 * @author AmeyaCJoshi
 *
 */
public class VideoDownloderUtility {
	
	public boolean isUrlValid(String URL) {
		UrlValidator validator = new UrlValidator();
		return validator.isValid(URL);
	}
}
