grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.dependency.resolution = {

    def exportLibs = { export: false }
    def excludeConflicting = { excludes 'xmlbeans', 'spring-web', 'spring-core', 'xml-apis' }
    def pluginsGroup = 'org.grails.plugins'
    def grailsVersion = '2.1.0'

    inherits("global") { }
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

        runtime name: 'hibernate',
                version: grailsVersion,
                group: pluginsGroup,
                exportLibs

        runtime name: 'tomcat',
                version: grailsVersion,
                group: pluginsGroup,
                exportLibs

        compile ":cxf:1.0.6"
        compile ":cxf-client:1.4.7"
        compile ":spring-security-core:1.2.7.3"
        compild ":spring-security-acl:1.1.1"

        test ":spock:0.6"
        test ":code-coverage:1.2.5"
        test ":codenarc:0.17"
    }
}

//grails.plugin.location.'cxf-client' = "../cxf-client"
//grails.plugin.location.'cxf' = "../grails-cxf"
