import javax.swing.*;
import java.awt.*;

public class AlgorithmVisualizer extends JPanel {

    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int BAR_WIDTH = 5;
    private static final int DELAY = 10;

    private int[] array;

    public AlgorithmVisualizer(int[] array) {
        this.array = array;
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        setBackground(Color.WHITE);
    }
    
    public void mergeSort(int[] arr, int start, int end) {
            if (start < end) {
                int mid = (start + end) / 2;
                mergeSort(arr, start, mid);
                mergeSort(arr, mid+1, end);
                merge(arr, start, mid, end);
            }
        }
        
    public void merge(int[] arr, int start, int mid, int end) {
            int[] temp = new int[end - start + 1];
            int i = start;
            int j = mid+1;
            int k = 0;
            
            while (i <= mid && j <= end) {
                if (arr[i] <= arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }
            
            while (i <= mid) {
                temp[k] = arr[i];
                i++;
                k++;
            }
            
            while (j <= end) {
                temp[k] = arr[j];
                j++;
                k++;
            }
            
            for (int p = 0; p < temp.length; p++) {
                arr[start + p] = temp[p];
            }
        }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int x = 0;
        for (int i : array) {
            int height = i * 5; // Scale the height of the bar according to the value of the array element
            int y = WINDOW_HEIGHT - height;
            g2.fillRect(x, y, BAR_WIDTH, height);
            x += BAR_WIDTH;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {5, 3, 8, 4, 2, 1, 7, 6,58, 26, 49, 102, 9, 1111, 10};
        AlgorithmVisualizer panel = new AlgorithmVisualizer(array);
        JFrame frame = new JFrame("Merge Sort Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        panel.mergeSort(array, 0, array.length-1);
    }
}


