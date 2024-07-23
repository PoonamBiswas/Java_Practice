public class NCR {
    public static int fact(int n){
        int factn = 1;
        for(int i =1; i<=n;i++){
            factn = factn*i;
        }
        return factn;
    }
    public static void calculate_ncr (int n, int r){
        int nfact = fact(n);
        int rfact = fact(r);
        int diff = n-r;
        int diffact = fact(diff);
        int ncr = nfact/(rfact*diffact);
        System.out.println(ncr);
    }
    public static void main(String[] args) {
        calculate_ncr(5, 2);
        System.out.println();
    
}
