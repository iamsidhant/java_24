class Calcultor{
    int num = 5;

    public int add(int n1, int n2){
        System.out.println(num);
        return n1 + n2;
    }
}

class Demo{
    public static void main(String[] args){
        int data = 10;
        Calcultor obj = new Calcultor();
        Calcultor obj1 = new Calcultor();
        int r1 = obj.add(3, 4);
        // System.out.println(r1);

        obj.num = 8;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
