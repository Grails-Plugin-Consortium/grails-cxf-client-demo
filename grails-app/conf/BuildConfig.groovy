grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenRepo "http://m2repo.spockframework.org/snapshots"
        mavenLocal()
        mavenCentral()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
        //mavenRepo "https://nexus.codehaus.org/content/repositories/snapshots"

    }
    dependencies {
        //groovy group: 'org.codehaus.groovy', name: 'groovy', version: '1.8.3'
        //test "org.spockframework:spock-core:0.6-groovy-1.8-SNAPSHOT"
        //        compile('org.apache.ws.security:wss4j:1.5.9')
        //        compile('org.apache.cxf:cxf-rt-ws-security:2.3.0') {
        //            excludes 'spring-web'
        //        }
    }

    plugins {
        test(":spock:0.6") {
            export = false
        }
        test(":code-coverage:1.2.5") {
            export = false
        }
        test(":codenarc:0.17") {
            export = false
        }
    }
}

//grails.plugin.location.'cxf-client' = "../cxf-client"
