import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class SortMatrix {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\temp\\input_data.txt"));
		String line = null;
		ArrayList<HashMap<String,Value>> matrix = new ArrayList<HashMap<String,Value>>();
		String[] titles;
		ArrayList<String> gene = new ArrayList<String>();
		
		if ((line = reader.readLine()) != null) {
			titles=line.split("\\s+");
			for (int i=1;i<titles.length;i++) {
				matrix.add(new HashMap<String,Value>());
			}
		}
		while((line = reader.readLine()) != null) {
		    
		    String[] parts=line.split("\\s+");
			String geneId = parts[0];
		    gene.add(geneId);
		    
		    
		    for(int i=1;i<parts.length;i++){
		    	Value value =new Value(geneId,parts[i]);
		    	matrix.get(i-1).put(geneId,value);
		    }
		}

//		for (int i =0;i<gene.size();i++){    
//			String key = gene.get(i);
//			for (int j =0;j<matrix.size();j++) {
//				HashMap<String,Value> map = matrix.get(j);
//				System.out.print(key+" , "+ map.get(key).getValue()+"   ");
//			}
//			System.out.println();
//		}
		
		ArrayList<ArrayList<Value>> sortedColumns = new ArrayList<ArrayList<Value>>();
		
		for (int j =0;j<matrix.size();j++) {
			HashMap<String,Value> map = matrix.get(j);
			ArrayList<Value> list = new ArrayList<Value>(map.values());
			Collections.sort(list,new Comparator<Value>() {
				@Override
				public int compare(Value o1, Value o2) {
					// TODO Auto-generated method stub
					Double d1 = o1.getValue();
					Double d2 = o2.getValue();
					
					return -d1.compareTo(d2);
				}
			});
			sortedColumns.add(list);
		}
		
		
		for(int i=0;i<sortedColumns.get(0).size();i++){
			for (int j =0;j<sortedColumns.size();j++){
				Value v = sortedColumns.get(j).get(i);
				System.out.print(v.getKey()+"  "+v.getValue()+"     ");
			}
			System.out.println();
		}
		
		ArrayList<Double> avg = new ArrayList<Double>();
		
		for(int i=0;i<sortedColumns.get(0).size();i++){
			Double avgval = 0d;
			for (int j =0;j<sortedColumns.size();j++){
				Value v = sortedColumns.get(j).get(i);
				avgval+=v.getValue();
			}
			avgval/=sortedColumns.size();
			for (int j =0;j<sortedColumns.size();j++){
				sortedColumns.get(j).get(i).setValue(avgval);
			}
			avg.add(avgval);
			System.out.println(avgval);
		}
		
		
//		for(int i=0;i<sortedColumns.get(0).size();i++){
//			for (int j =0;j<sortedColumns.size();j++){
//				Value v = sortedColumns.get(j).get(i);
//				System.out.print(v.getKey()+"  "+v.getValue()+"     ");
//			}
//			System.out.println();
//		}
		
		
		for(int i=0;i<gene.size();i++){
			String key = gene.get(i);
			System.out.print(key+"  ");
			for (int j =0;j<matrix.size();j++){
				Value v = matrix.get(j).get(key);
				double d = v.getValue();
		        DecimalFormat df = new DecimalFormat("#.##");
				System.out.print(df.format(d)+"   ");
			}
			System.out.println();
		}
		
		
 		
//		HashMap<String,Value> map = new HashMap<String, Value>();
//		map.put("A", new Value(3d));
//		map.put("C", new Value(1d));
//		map.put("B", new Value(2d));
//		
//		
//		ArrayList<Value> l = new ArrayList<Value>(map.values());
////		LinkedList<Double> l2 = new LinkedList<Double>();
////		l2.i
//		Collections.sort(l, new Comparator<Value>() {
//
//			@Override
//			public int compare(Value o1, Value o2) {
//				// TODO Auto-generated method stub
//				return (int)(o2.getD()-o1.getD());
//			}
//		});
////		Double d =l.;
////		d=5d;
////		map.put("A", 5d);
////		l.get(0).setD(7d);
//	
//		Iterator<Value> i = l.iterator();
//		while(i.hasNext()){
////			Double dd = i.next();
////			dd=5d;
//			System.out.print(i.next().getD()+" ");
//		}
//		
//		System.out.println(map.get("A").getD()+"");
//		System.out.println(map.get("B").getD()+"");
//		System.out.println(map.get("C").getD()+"");
		
	}

}
