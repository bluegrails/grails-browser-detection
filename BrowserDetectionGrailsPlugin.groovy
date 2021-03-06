class BrowserDetectionGrailsPlugin {
    def version = "1.1"

    def grailsVersion = "1.2.2 > *"

    def dependsOn = [:]

    def pluginExcludes = [
            "grails-app/views/error.gsp",
            "grails-app/controllers/org/geeks/browserdetection/TestController.groovy",
            "grails-app/views/index.gsp"
    ]

    def author = "Kevin M. Gill, Edvinas Bartkus, Gennady Tsarik"
    def authorEmail = "vare6gin@gmail.com"
    def title = "Browser detection"
    def description = '''\\
This plugin provides service and tag library for browser detection. You can know what is the browser, version, operating system and language specified in request headers.
'''
    def documentation = "http://grails.org/plugin/browser-detection"
}