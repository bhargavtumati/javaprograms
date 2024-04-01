class Solution {
    static convertSeconds(seconds) {
      //Write your code here
    let hr = 0, min = 0, sec = 0;
    if (seconds >= 3600) {
      hr = Math.floor(seconds / 3600);
      seconds -= 3600 * hr;
    }
    if (seconds >= 60) {
      min = Math.floor(seconds / 60);
      seconds -= 60 * min;
    }
    if (seconds > 0) {
      sec = seconds;
    }
   let formattedTime = hr.toString().padStart(2, '0') + ":" +
                        min.toString().padStart(2, '0') + ":" +
                        sec.toString().padStart(2, '0');
       console.log(formattedTime);
  }
    
}
