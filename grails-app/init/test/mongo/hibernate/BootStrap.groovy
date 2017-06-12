package test.mongo.hibernate

class BootStrap {

    def init = { servletContext ->
        Test.findAll()
    }
    def destroy = {
    }
}
