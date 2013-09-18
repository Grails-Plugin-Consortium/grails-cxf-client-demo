grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.dependency.resolution = {

    inherits("global") {}
    log "info" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }

    dependencies {

    }

    plugins {

        compile ":hibernate4:4.1.11.1"
        build ':tomcat:7.0.41'

        compile ":jasper:1.6.1"

        compile ":cxf:1.1.1"
        compile ":cxf-client:1.5.6"
//        compile ":spring-security-core:1.2.7.3"
//        compild ":spring-security-acl:1.1.1"

//        test ":spock:0.6"
//        test ":code-coverage:1.2.5"
//        test ":codenarc:0.17"
    }
}

//grails.plugin.location.'cxf-client' = "../cxf-client"
//grails.plugin.location.'cxf' = "../grails-cxf"
