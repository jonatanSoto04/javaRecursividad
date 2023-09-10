class Recursividad {
    
    public void recursividad(int i, int cant, int op){
        int rep = 0;
        if(rep == cant){
            return i;
        }
        if(op == 1){
            i = i * cant;
            rep++;
            return recursividad(i, cant, op);
        }else if(op == 2){
            i = i + cant;
            rep++;
            return recursividad(i, cant, op);
        }
    }
    
    public static void main(String[] args) {
        recursividad obj = new recursividad();
        System.out.println(obj.recursividad(2, 3, 1));
    
    }
}