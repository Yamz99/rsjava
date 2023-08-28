package demopackage;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=20;
//print numbers 20 to 30
		
		do {
			
			k++;
			System.out.println(k);
		} 
// 1 loop of execution is guarenteed in do while loop;
// without evaluating the boolean expression first the execution happens in this block , post which the boolean expr is evaluated 
			while(k<30);
			
	
	}

}
