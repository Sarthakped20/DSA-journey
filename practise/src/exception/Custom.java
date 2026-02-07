package exception;
class Custom extends Exception{
    public Custom(String str){
        super(str);
    }
}

class testException {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age<18){
                throw new Custom("Not eligible to Vote!");
            }
            System.out.println("Eligible to Vote!");
        }catch (Exception e){
            System.out.println("Custom Exception caught "+e.getMessage());
        }
    }
}
