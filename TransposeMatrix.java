class HelloWorld {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int m=inp.nextInt();
        
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        
        int[][] ans=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=arr[j][i];
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+"*");
                
            }
            System.out.println("");
        }
        
        
    }
}
