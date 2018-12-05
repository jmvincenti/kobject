# kobject
Test kotlin object limitation

The point is to understrand how the followg code:

```kotlin
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
```
will return an unexpected null element on subList:

<div align="center">
    <img src="screencap.png" width="400px"</img> 
</div>
