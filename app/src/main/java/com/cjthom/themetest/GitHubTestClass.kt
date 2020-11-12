package com.cjthom.themetest

import android.content.Context

class GitHubTestClass {

    fun getSomeString() {
        "Some String"
    }

    fun getSomeStringFromResource(context: Context) {
        context.getString(R.string.test_string_1)
    }

    fun getSomeColorFromResource(context: Context) {
        context.getColor(R.color.test_color_1)
    }

}