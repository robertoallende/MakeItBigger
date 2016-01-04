package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import junit.framework.Assert;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>

public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
}

Following
 http://www.making-software.com/2012/10/31/testable-android-asynctask/
 http://stackoverflow.com/questions/15938538/how-can-i-make-a-junit-test-wait
 */

public class ApplicationTest extends AndroidTestCase implements IDownloadListener {

    private boolean completed = false;
    private String result = "";

    public void testVerifyApiResponse() throws InterruptedException {
        new AsyncFileDownloader(this).getJoke(this.getContext());

        while (completed == false) {
            Thread.sleep(100);
        }

        if (result == null) {
            fail("Bad joke: AsyncTask result is null");
        }

        if (result.length() == 0) {
            fail("Bad joke: AsyncTask result is empty");
        }
    }

    @Override
    public void downloadCompleted(String string) {
        result = string;
        completed = true;
    }
}