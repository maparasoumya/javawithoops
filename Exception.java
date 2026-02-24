class Exception {
    static void fun(){
        try{
            throw new NullPointerException();
        }
        catch(NullPointerException e){
            System.out.println("Caught NullPointerException");
            throw e; // rethrowing the exception
        }
    }
    public static void main(String[] args) {
        try{
            fun();
        }
        catch(NullPointerException e){
            System.out.println("Caught in main: " + e);
        }
    }
}
