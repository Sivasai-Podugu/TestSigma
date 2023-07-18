//Write a program to read a log file and load it to the list of objects. (log structure : {id; message; error code;}) in java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Log{
    String id;
    String message;
    String errorCode;

    Log(String logId, String msg, String error){
        id = logId;
        message = msg;
        errorCode = error;
    }
        
}

class Program6{

    
    public static void main(String[] args) {

        ArrayList<Log> arrofObj = new ArrayList<Log>(); 

        try{
            FileInputStream logfile = new FileInputStream(new File("logfile.log"));
            Scanner sc = new Scanner(logfile);
            while(sc.hasNextLine()){
                String[] arr = sc.nextLine().split(";");
                Log l = new Log(arr[0],arr[1], arr[2] );
                arrofObj.add(l);
            }

            System.out.println("No of logs: "+arrofObj.size());
            for (Log log : arrofObj) {
                System.out.println(log.id +"; "+ log.message+"; "+log.errorCode);
            }
            sc.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        
    }
}