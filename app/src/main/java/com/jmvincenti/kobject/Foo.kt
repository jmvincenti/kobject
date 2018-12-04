package com.jmvincenti.kobject

sealed class Foo {
    override fun toString(): String = this.javaClass.simpleName

    object FooOne : Foo()
    object FooTwo : Foo()
    object FooThree : Foo()
    object FooFour : Foo()

    companion object {
        val subList = listOf(FooOne, FooTwo)
    }
}
