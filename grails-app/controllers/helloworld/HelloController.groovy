package helloworld

class HelloController {

    def index() { 
    render "Hello World!"
    }
    
    def hello() {
//  redirect action: 'index'
            render "hello"
    }
}
