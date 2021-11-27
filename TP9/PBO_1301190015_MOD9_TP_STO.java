package pbo_1301190015_mod9_tp_sto;

import java.time.LocalDate;
import java.util.ArrayList;

public class PBO_1301190015_MOD9_TP_STO {

    public static void main(String[] args) {
        ArrayList<Side_1301190015<String,Integer>> A_1301190015 = new ArrayList();
        A_1301190015.add(new Side_1301190015("nilai",60));
        A_1301190015.add(new Side_1301190015("tahun",2021));
        
        System.out.println("ArrayList A");
        for (Side_1301190015 data_1301190015: A_1301190015){ 		    
            data_1301190015.info_1301190015(); 		
	}
        
        System.out.println();
        
        ArrayList<Side_1301190015<LocalDate,Double>> B_1301190015 = new ArrayList();
        B_1301190015.add(new Side_1301190015(LocalDate.parse("2021-09-13"),9.6));
        B_1301190015.add(new Side_1301190015(LocalDate.parse("2002-05-01"),201.6));
  
        System.out.println("ArrayList B");
        for (Side_1301190015 data_1301190015: B_1301190015){ 		    
            data_1301190015.info_1301190015(); 		
	}
        
    }
    
}
