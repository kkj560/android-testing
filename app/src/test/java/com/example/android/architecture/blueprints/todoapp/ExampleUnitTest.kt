package com.example.android.architecture.blueprints.todoapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)

    }

    @Test
    fun ifParamIsNullThen(){
        var list : MutableList<Int> = mutableListOf()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)

        var testNull = TestNull(list)
        assertEquals(4, testNull.getNumbers())

        var testNull2 = TestNull(null)
        assertEquals(0, testNull2.getNumbers())
    }

    inner class TestNull(var tasks: MutableList<Int>? = mutableListOf()){
        fun getNumbers() : Int{
            tasks?.let { return ArrayList(it).size }
            return 0
        }
    }
}
