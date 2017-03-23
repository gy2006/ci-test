package com.example.ns.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void test2()throws Exception{
        assertEquals(6,2+4);
    }
    //~/Library/Android/sdk/tools/emulator
    //~/Library/Android/sdk/tools/bin/avdmanager
    //~/Library/Android/sdk/platform-tools/adb
}


//
// ~/Library/Android/sdk/tools/bin/avdmanager create avd -n test --package 'system-images;android-23;google_apis;x86_64' --tag 'google_apis'
//
//~/Library/Android/sdk/tools/emulator -avd test -no-skin -no-audio -no-window -system /Users/ns/Library/Android/sdk/system-images/android-22/google_apis/x86_64/system.img
//./gradlew build
//adb install -r app/build/outputs/apk/app-debug.apk

//adb shell am start -n com.example.ns.myapplication/com.example.ns.myapplication.MainActivity

//adb shell pm list instrumentation 列举所有instrument

//adb shell am instrument -e class com.example.ns.myapplication.MainActivityInstrumentationTest -w com.example.ns.myapplication.test/android.support.test.runner.AndroidJUnitRunner

