grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.dependency.resolution = {

    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve true // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }

    dependencies {

    }

    plugins {

        build ":tomcat:7.0.52.1"

        // plugins for the compile step
        compile ":scaffolding:2.0.3"
        compile ':cache:1.1.2'
        compile ":cxf:1.1.4"
        compile ":build-test-data:2.1.2"
        compile ":asset-pipeline:1.8.7"
        compile ":build-info:1.2.5"

        compile ":jasper:1.8.0"

        // plugins needed at runtime but not for compilation
        runtime ":hibernate:3.6.10.13" // or ":hibernate4:4.3.5.1"
        runtime ":database-migration:1.4.0"
        runtime ":jquery:1.11.0.2"

        compile ":cxf:1.1.4"
        compile ":cxf-client:1.6.2"
//        compile ":spring-security-core:2.0-RC3"
//        compile ":spring-security-acl:2.0-RC1"

        test ":code-coverage:1.2.7"
        test ":codenarc:0.17"
    }
}

//grails.plugin.location.'cxf-client' = "../cxf-client"
//grails.plugin.location.'cxf' = "../grails-cxf"
