grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.dependency.resolution = {

    def exportLibs = { export: false }
    def excludeConflicting = { excludes 'xmlbeans', 'spring-web', 'spring-core', 'xml-apis' }
    def pluginsGroup = 'org.grails.plugins'
    def grailsVersion = '2.1.0'

    inherits("global") { }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

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

        compile ":cxf:1.0.0"

        test name: 'spock',
             version: '0.6',
             group: pluginsGroup,
             exportLibs

        test name: 'code-coverage',
             version: '1.2.5',
             group: pluginsGroup,
             exportLibs

        test name: 'codenarc',
             version: '0.17',
             group: pluginsGroup,
             exportLibs
    }
}

//grails.plugin.location.'cxf-client' = "../cxf-client"
