#include <iostream>
#define SIZE 20
using std::cout;

int main()
{
    int64_t paths[SIZE+1][SIZE+1] = {};

    for (int x=0; x<=SIZE; x++)
        for (int y=0; y<=SIZE; y++)
            paths[y][x] = (x == 0 || y == 0) ? 1 : paths[y-1][x] + paths[y][x-1];

    cout << paths[SIZE][SIZE];
    return 0;
}