package Programmers;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int xpark = park[0].length();
        int ypark = park.length;
        
        int startX = 0;//시작x
        int startY =0;//시작y
        int[][] allPark = new int[ypark][xpark];//공원크기
        
        for(int j=0;j<park.length;j++) {
	        for(int i=0;i<park[0].length();i++) {
	        	if(park[i].contains("S")) {
	        		startX = i;
	        		startY = j;
	        		allPark[j][i] = 0;
	        	}else if(park[i].contains("O")) {
	        		allPark[j][i] = 0;
	        	}else {
	        		allPark[j][i] = 1;
	        	}
	        }
        }
         
        for(int i=0; i<routes.length;i++) {
        	char direct = park[i].charAt(0);
        	int weith = park[i].charAt(2);
        	for(int j =0 ; j<weith;j++) {
	        	if(direct == 'E') {
	        		
        			if(allPark[i][j] == 1) {
        				break;
        			}else {
        				startX++;
        				
        			}
	        	}
	        	if(direct == 'W') {
	        		
        			if(allPark[i][j] == 1) {
        				break;
        			}else {
        				startX--;
        				
        			}
	        	}
	        	if(direct == 'S') {
	        		
        			if(allPark[i][j] == 1) {
        				break;
        			}else {
        				startY++;
        				
        			}
	        	}
	        	if(direct == 'N') {
	        		
        			if(allPark[i][j] == 1) {
        				break;
        			}else {
        				startY--;
        				
        			}
	        	}
        	}
        	
        }
        
        int[] answer = {startX , startY};
        return answer;
    }
}