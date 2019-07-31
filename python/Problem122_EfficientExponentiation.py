# python3

import heapq
import sys
import threading
from collections import namedtuple

MAX = 200

class PriorityQueue:
    def __init__(self):
        self._queue = []
        self._index = 0
    
    def push(self, item, priority):
        heapq.heappush(self._queue, (priority, self._index, item))
        self._index += 1

    def empty(self):
        return len(self._queue) == 0
    
    def pop(self):
        return heapq.heappop(self._queue)[-1]
    
    def __str__(self):
        return str(self._queue)


lookup = [0, 0]
for i in range(1, MAX):
    lookup.append(99999)

Point = namedtuple('Point', 'i history muls')

search_data = PriorityQueue()
search_data.push(Point(1, [1], 0), 1)


def search_and_destory(his=""):
    if search_data.empty():
        return "jhee"

    n = search_data.pop()

    for h in reversed(n.history):
        i = n.i + h
        if i <= MAX and n.muls + 1 <= lookup[i]:
            lookup[i] = n.muls + 1
            new_history = n.history[:]
            new_history.append(i)
            search_data.push(Point(i, new_history, n.muls + 1), n.muls+1)

    search_and_destory(str(n.i))

def main():
    print(search_and_destory())
    assert lookup[15] == 5
    assert lookup[1] == 0
    assert lookup[2] == 1
    print(lookup)
    print("\n\n", sum(lookup))
    


sys.setrecursionlimit(10**7)  # max depth of recursion
threading.stack_size(2**27)   # new thread will get stack of such size
threading.Thread(target=main).start()