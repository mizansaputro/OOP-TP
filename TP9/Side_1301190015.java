package pbo_1301190015_mod9_tp_sto;
/**
 *
 * @author Mizan Saputro
 * @param <T>
 */
public class Side_1301190015<T,U> {
    private T left_1301190015;
    private U right_1301190015;
    
    public Side_1301190015(T left_1301190015, U right_1301190015){
        setLeft_1301190015(left_1301190015);
        setRight_1301190015(right_1301190015);
    }
    public void setLeft_1301190015(T left_1301190015){
        this.left_1301190015 = left_1301190015;
    }
    public void setRight_1301190015(U right_1301190015){
        this.right_1301190015 = right_1301190015;
    }
    public T getLeft_1301190015(){
        return left_1301190015;
    }
    public U getRight_1301190015(){
        return right_1301190015;
    }
    public void info_1301190015(){
        System.out.println("tipe left\t: "+left_1301190015.getClass());
        System.out.println("nilai left\t: "+getLeft_1301190015());
        System.out.println("tipe right\t: "+right_1301190015.getClass());
        System.out.println("nilai right\t: "+getRight_1301190015());
    }
}
