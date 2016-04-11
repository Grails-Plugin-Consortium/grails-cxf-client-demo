package com.cxf.demo

import net.webservicex.ICD9Soap

class DemoController {

    ICD9Soap icd9Client

    def index() {
        render(view: "/index")
    }

    def icd9() {
        String icd9 = ""
        try {
            icd9 = icd9Client.getICD9ByDescription("Neoplasms")
        } catch (Exception e) {
            icd9 = e.message
        }

        render(view: '/index', model: [icd9: icd9])
    }
}
