#include <stdio.h>
#include <windows.h>
// Thread function - executed by each thread
DWORD WINAPI MyThreadFunction(LPVOID lpParam) {
int threadNum = *((int*)lpParam); // get thread number
for (int i = 1; i <= 5; i++) {
    printf("Thread %d: Step %d\n", threadNum, i);
 Sleep(500); // pause 0.5 seconds to simulate work
 }
 printf("Thread %d: Finished!\n", threadNum);
 return 0;
}

int main() {
  HANDLE thread1, thread2;
 int t1 = 1, t2 = 2;
 printf("Main program: Starting 
threads...\n");
 // Create two threads
 thread1 = CreateThread(NULL, 0, 
MyThreadFunction, &t1, 0, NULL);
 thread2 = CreateThread(NULL, 0, 
MyThreadFunction, &t2, 0, NULL);
 if (thread1 == NULL || thread2 == 
NULL) {
 printf("Error creating 
threads!\n");
 return 1;
 }
 // Main thread also does 
something
 for (int i = 1; i <= 5; i++) {
 printf("Main program: Working 
step %d\n", i);
 Sleep(300);

}

// Wait until both threads finish
 WaitForMultipleObjects(2, (HANDLE[]){thread1, thread2}, TRUE, INFINITE);
 printf("Main program: All threads have finished.\n");
 // Close handles
 CloseHandle(thread1);
 CloseHandle(thread2);
 return 0;

}