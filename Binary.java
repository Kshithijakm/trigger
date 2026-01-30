class Binary{
  public static void main(String[]args){
    int arr[]={1,2,3,4,5};
    int n=arr.length;
    int target=3;
    int low=0;
    int high=n-1;
    int flag=0;
    for(int i=0;i<n;i++){
      while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target){
          flag=1;
        }
        else if(target<arr[mid]){
          low++;
          mid--;
        }
        else{
            high--;
            mid++;
        }
      }
      
    }
    if(flag==1){
      System.out.println("found");
    }
    else{
      System.out.println("not found");
    }
  }
}

