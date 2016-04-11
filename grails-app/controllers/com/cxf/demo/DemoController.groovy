package com.cxf.demo

class DemoController {

    def stockQuoteClient

    def index() {
        render(view: "/index")
    }

    def stockQuoteDemo() {
        String stockQuote = ""
        try {
            stockQuote = stockQuoteClient.getQuote("AAPL")
        } catch (Exception e) {
            stockQuote = e.message
        }

        render(view: '/index', model: [stockQuote: stockQuote])
    }
}
