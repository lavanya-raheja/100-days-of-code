public static void selectionSort(int a[]) {
        for(int i=0; i<a.length; i++) {
            int maxPos = i; 
            for(int j=i+1; j<a.length; j++) {
                if(a[maxPos]<a[j]) {
                    maxPos = j; 
                }
            }
            
            // swap 
            int temp = a[i]; 
            a[i] = a[maxPos]; 
            a[maxPos] = temp; 
        }
    }
