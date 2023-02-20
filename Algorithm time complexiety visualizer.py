import time
import numpy as np
import matplotlib.pyplot as plt

def time_complexity_visualizer(algorithm, n_min, n_max, n_step):
    times = []
    input_sizes = range(n_min, n_max + n_step, n_step)
    for n in input_sizes:
        start_time = time.time()
        algorithm(n)
        end_time = time.time()
        times.append(end_time - start_time)
    plt.plot(input_sizes, times, 'o-')
    plt.xlabel('Input size')
    plt.ylabel('Running time (seconds)')
    plt.title('Algorithm time complexity visualization')
    plt.show()


def linear_search(n):
    for i in range(n):
        if i == n-1:
            return i
time_complexity_visualizer(linear_search, 10, 10000, 10)


def bubble_sort(n):
    arr = np.random.randint(0, 100, n)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1] :
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

time_complexity_visualizer(bubble_sort, 10, 10000, 10)
