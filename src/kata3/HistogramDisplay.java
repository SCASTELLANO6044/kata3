package kata3;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay(String title){  
        super(title);
        this.setContentPane(createPanel());
        this.pack();
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("JFreeChart Histogram",
                                                        "email domains",
                                                        "nº emails",
                                                        dataSet,
                                                        PlotOrientation.VERTICAL,
                                                        false,
                                                        false,
                                                        rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        dataSet.addValue(23, "", "ulpgc.es");
        dataSet.addValue(32, "", "dis.ulpgc.es");
        dataSet.addValue(2, "", "ull.es");
        dataSet.addValue(39, "", "gmail.com");
        dataSet.addValue(9, "", "hotmail.com");
        
        return dataSet;
    }
    
    public void execute(){
        this.setVisible(true);
    }
}