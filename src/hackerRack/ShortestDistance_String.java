package hackerRack;

public class ShortestDistance_String {

	
	
}
/*

private static int findShortestDistance(String str1, String str2, String[] strs) {
    int distance = Integer.MAX_VALUE;
    String temp = null;
    int index = 0;
    for(int i=0; i<strs.length; ++i) {
      if(str1.equals(strs[i]) || str2.equals(strs[i])) {
         if(temp != null && !strs[i].equals(temp)) {
            distance = Math.min(distance, i - index);
         }
         temp = strs[i];
         index = i;
       }
    }
 return distance;
}
*/


//alternative way 

/*

String[] strArray = {"the","quick","brown","fox","quick"};
    String str1 = "quick";
    String str2 = "fox";
    int i,startIndex=0,minDistnace=100;
    for( i=0;i<strArray.length;i++){
        if(strArray[i].equals(str1)||strArray[i].equals(str2)){
            startIndex = i;         //get the first occurence of either word
            break;
        }
    }
    for(;i<strArray.length;i++){
        if(strArray[i].equals(str1)||strArray[i].equals(str2)){
            //compare every word from that first occurence 
            // if words not same and distance less than minimun distance then update
            if(!strArray[i].equals(strArray[startIndex]) && (i-startIndex)<minDistance){
                minDistance = i-startIndex;
                startIndex =i;
            }
            else{
                startIndex =i;
            }
        }
    }
    System.out.println(minDistance);

*/