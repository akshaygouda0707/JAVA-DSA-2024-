public class ClmByColumn {
    public static void main(String[] args) {
        int array[][]={{1,2,3},{3,4,10}};
        for(int i=0;i<2;i++){//for(int i=0;i<3;i++)
            for(int j=0;j<array[i].length;j++)//for(int j=0;j<2;j++)
                if(array[i][j]==4)
                System.out.print("element found ");
                System.out.println();

        }
    }
}
