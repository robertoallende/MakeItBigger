package com.udacity.gradle.builditbigger;

/**
 * Following:
 * http://www.making-software.com/2012/10/31/testable-android-asynctask/
 */
public interface IDownloadListener {

    void downloadCompleted(String string);

}
