package com.infinite.unittest

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {
    private val dummyVolume = "504.0"
    private val dummyCircumference = "100.0"
    private val dummySurfaceArea = "396.0"
    private val dummyLength = "12.0"
    private val dummyWidth = "7.0"
    private val dummyHeight = "6.0"
    private val emptyInput = ""
    private val fieldEmpty = "Field ini tidak boleh kosong"

    @Before
    fun setup(){
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun assertGetCircumference() {
        Espresso.onView(withId(R.id.edt_length))
            .perform(ViewActions.typeText(dummyLength), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.edt_width))
            .perform(ViewActions.typeText(dummyWidth), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.edt_height))
            .perform(ViewActions.typeText(dummyHeight), ViewActions.closeSoftKeyboard())

        Espresso.onView(withId(R.id.btn_save))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.btn_save)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn_calculate_circumference))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.btn_calculate_circumference)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tv_result))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_result))
            .check(ViewAssertions.matches(ViewMatchers.withText(dummyCircumference)))
    }

    @Test
    fun assertGetSurfaceArea() {
        Espresso.onView(withId(R.id.edt_length))
            .perform(ViewActions.typeText(dummyLength), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.edt_width))
            .perform(ViewActions.typeText(dummyWidth), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.edt_height))
            .perform(ViewActions.typeText(dummyHeight), ViewActions.closeSoftKeyboard())

        Espresso.onView(withId(R.id.btn_save))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.btn_save)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn_calculate_surface_area))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.btn_calculate_surface_area)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tv_result))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_result))
            .check(ViewAssertions.matches(ViewMatchers.withText(dummySurfaceArea)))
    }

    @Test
    fun assertGetVolume() {
        Espresso.onView(withId(R.id.edt_length))
            .perform(ViewActions.typeText(dummyLength), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.edt_width))
            .perform(ViewActions.typeText(dummyWidth), ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.edt_height))
            .perform(ViewActions.typeText(dummyHeight), ViewActions.closeSoftKeyboard())

        Espresso.onView(withId(R.id.btn_save))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.btn_save)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn_calculate_volume))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.btn_calculate_volume)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tv_result))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_result))
            .check(ViewAssertions.matches(ViewMatchers.withText(dummyVolume)))
    }

    //Pengecekan untuk empty input
    @Test
    fun assertEmptyInput() {
        // pengecekan input untuk length
        Espresso.onView(withId(R.id.edt_length))
            .perform(ViewActions.typeText(emptyInput), ViewActions.closeSoftKeyboard())

        Espresso.onView(withId(R.id.btn_save))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.btn_save)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.edt_length))
            .check(ViewAssertions.matches(ViewMatchers.hasErrorText(fieldEmpty)))
        Espresso.onView(withId(R.id.edt_length))
            .perform(ViewActions.typeText(dummyLength), ViewActions.closeSoftKeyboard())

        // pengecekan input untuk width
        Espresso.onView(withId(R.id.edt_width))
            .perform(ViewActions.typeText(emptyInput), ViewActions.closeSoftKeyboard())

        Espresso.onView(withId(R.id.btn_save))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.btn_save)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.edt_width))
            .check(ViewAssertions.matches(ViewMatchers.hasErrorText(fieldEmpty)))
        Espresso.onView(withId(R.id.edt_width))
            .perform(ViewActions.typeText(dummyWidth), ViewActions.closeSoftKeyboard())

        // pengecekan input untuk height
        Espresso.onView(withId(R.id.edt_height))
            .perform(ViewActions.typeText(emptyInput), ViewActions.closeSoftKeyboard())

        Espresso.onView(withId(R.id.btn_save))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.btn_save)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.edt_height))
            .check(ViewAssertions.matches(ViewMatchers.hasErrorText(fieldEmpty)))
        Espresso.onView(withId(R.id.edt_height))
            .perform(ViewActions.typeText(dummyHeight), ViewActions.closeSoftKeyboard())

        Espresso.onView(withId(R.id.btn_save))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.btn_save)).perform(ViewActions.click())
    }
}