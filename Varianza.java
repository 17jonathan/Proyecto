public class Varianza {
    public static void main(String[] args){
    double[] nums={11,4,7,5,2,3,9,8,7,10};
    double sum2=0;
    double media=6.6;
    for (int x=0;x<nums.length;x=x+1){
            sum2=sum2+Math.pow(nums[x]-media,2);        
        }
        double varianza=sum2/(nums.length-1);
        double desviacion=Math.sqrt(varianza);
        System.out.println("La varianza es: "+varianza);
        System.out.println("La desviacion es: "+desviacion);
System.out.println("Gracias por usar Git");
System.out.println("Develop branch");
<<<<<<< HEAD
System.out.println("Master 2.0");
System.out.println("New feature")
=======
System.out.println("Going to add new features");
>>>>>>> master
    } 
}