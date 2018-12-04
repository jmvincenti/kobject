package com.jmvincenti.kobject

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        value_label.text = resources.getString(R.string.test_placeholder, Foo.FooOne, Foo.subList)
    }

}
