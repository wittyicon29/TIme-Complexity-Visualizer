# TIme-Complexity-Viisualizer-in-Python & Java


The `time_complexity_visualizer` function takes an algorithm as input and generates a visualization of the running time of the algorithm for different input sizes. It measures the running time of the algorithm for input sizes ranging from `n_min` to `n_max` with a step size of `n_step`, and generates a plot of the running time as a function of the input size.

The function uses the `time` and `matplotlib` libraries to measure the running time and create the plot, respectively. The plot shows the input size on the x-axis and the running time in seconds on the y-axis. The running time is represented by dots, and a line is drawn to connect the dots.

The `time_complexity_visualizer` function can be used to visualize the time complexity of any algorithm. By varying the input range and step size, it is possible to get a better understanding of how the running time of the algorithm grows as the input size increases.

Note that the `time_complexity_visualizer` function is not perfect and may not accurately represent the true time complexity of an algorithm in all cases, especially for very small input sizes or for algorithms with very complex time complexity. However, it can still be a useful tool for getting a rough estimate of the time complexity of an algorithm.


Input arguments:
- algorithm: the function to be visualized, which takes an integer as input
- n_min: the minimum input size to be tested
- n_max: the maximum input size to be tested
- n_step: the step size for the input sizes

Output: a visualization of the running time of the algorithm for different input sizes
