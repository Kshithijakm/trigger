class Binary{
  public static void main(String[]args){
    int arr[]=[1,2,3,4,5];
    int n=arr.length;
    int target=4;
    int low=0;
    int high=n-1;
    while(low<=high){
      int mid=(low+high)/2;
      for(int i=0;i<n;i++){
        if(arr[mid]==target){
          System.out.println("target found");
        }
        else if(target<arr[mid]){
          low++;
        }
        else{
          high--;
        }
      }
      System.out.println("not found");
    }
  }
}
