package pages

import geb.Page

/**
 */
class ComplexPage extends Page {

    static url = "demo/complexServiceDemo"

    static at = { title == "Simple Service Demo" }

    static content = {
        name { $(".name").text() }
        isOld { $(".isOld").text() }
        status { $(".status").text() }
    }
}
