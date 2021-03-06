package kata6;

import java.io.FileNotFoundException;
import java.util.Map;

/**
 * @author Carlos
 */
public class Kata6 {
    Map<Integer, Integer> map;
    
    public static void main(String[] args) throws FileNotFoundException {
        Kata6 kata6 = new Kata6();
        kata6.execute();
        
    }

    private void execute() {
        input();
        process();
        output(); 
    }

    private void input() {
        MapCreator mapCreator = new MapCreator();
        map = mapCreator.getMegabytesMap(); 
        
    }

    private void process() {
        int prof = 2; //Profundidad para recorrer cada archivo recursivamente
        RecursiveSearch rs = new RecursiveSearch();
        
        map = rs.recursiveSearchByProf(prof, map);
    }

    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(map);
        histoDisplay.execute();
    }
    
}
