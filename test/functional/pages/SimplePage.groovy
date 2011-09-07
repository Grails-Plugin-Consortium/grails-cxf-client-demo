package pages

import geb.Page

/**
 */
class SimplePage extends Page {

    static url = "demo/simpleServiceDemo"

    static at = { title == "Simple Service Demo" }

    static content = {
        name { $(".name").text() }
        isOld { $(".isOld").text() }
        status { $(".status").text() }
    }
}
