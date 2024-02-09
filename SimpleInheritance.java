class test{
    int i, j;

    test(){
        i = 5;
        j = 6;
    }
}

class test2 extends test{
    int k;

    test2(){
        i = 5;
        j = 6;
    }
}

class SimpleInheritance{
    public static void main(String[] args){
        test testObject = new test();
        System.out.println(testObject.i);
    }
}