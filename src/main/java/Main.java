import java.io.IOException;
import java.util.List;
import joinery.DataFrame;
import tech.tablesaw.api.Table;



public class Main {

    public static void main(String[] args) throws IOException{


//        //Read file by using joinry
//        DataFrame<Object> df = DataFrame.readCsv("E:\\titanic.csv");
//        List<Object> passengers = df.col("Survived");
//        System.out.println("Survived length " + passengers.size());
//        System.out.println("survived passengers " + passengers);

       //Reading file using TableSaw
       Table data;
        data = Table.read().csv("E:\\titanic.csv");
        System.out.println("data");
        System.out.println(data.summary());

    }
}
