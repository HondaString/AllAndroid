package com.infinite.unittest

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mockito

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainViewModelTest {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var cuboidModel: CuboidModel
    private val dummyVolume = 504.0
    private val dummyCircumference = 100.0
    private val dummySurfaceArea = 396.0
    private val dummyLength = 12.0
    private val dummyWidth = 7.0
    private val dummyHeight = 6.0

    @Before
    fun before() {
        cuboidModel = Mockito.mock(CuboidModel::class.java)
        mainViewModel = MainViewModel(cuboidModel)
    }

    @Test
    fun testVolume() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = mainViewModel.volume
        assertEquals(dummyVolume, volume, 0.0001)
    }

    @Test
    fun testCircumference() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val circumference = mainViewModel.circumference
        assertEquals(dummyCircumference, circumference, 0.0001)
    }

    @Test
    fun testSurfaceArea() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val surfaceArea = mainViewModel.surfaceArea
        assertEquals(dummySurfaceArea, surfaceArea, 0.0001)
    }

    @Test
    fun testMockVolume() {
        Mockito.`when`(mainViewModel.volume).thenReturn(dummyVolume)
        val volume = mainViewModel.volume
        Mockito.verify(cuboidModel).volume
        assertEquals(dummyVolume, volume, 0.0001)
    }

    @Test
    fun testMockCircumference() {
        Mockito.`when`(mainViewModel.circumference).thenReturn(dummyCircumference)
        val circumference = mainViewModel.circumference
        Mockito.verify(cuboidModel).circumference
        assertEquals(dummyCircumference, circumference, 0.0001)
    }

    @Test
    fun testMockSurfaceArea() {
        Mockito.`when`(mainViewModel.surfaceArea).thenReturn(dummySurfaceArea)
        val surfaceArea = mainViewModel.surfaceArea
        Mockito.verify(cuboidModel).surfaceArea
        assertEquals(dummySurfaceArea, surfaceArea, 0.0001)
    }
}
