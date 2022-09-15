class Solution {
    public int minDays(int[] BloomDay, int m, int k) {
        	int lo=Integer.MAX_VALUE;
		int hi=Integer.MIN_VALUE;
        if(BloomDay.length<(m*k))
              return -1;
		for(int day:BloomDay){
			lo=Math.min(lo,day);
			hi=Math.max(hi,day);
		}
		
	
		return Search(BloomDay,lo,hi,m,k);
    }
    public static int Search(int BloomDay[],int min,int max,int m ,int k){
		int ans=-1;
		System.out.println(min + "  "+ max);
		while(min<max){
			int mid=min+(max-min)/2;
			System.out.println("MID"+mid);
			boolean isPossibleToMakeBuoquets=isPossible(BloomDay,mid,k,m);
			if(isPossibleToMakeBuoquets){
				
				ans=mid;
				max=mid;
				// System.out.println("STATUS"+isPossibleToMakeBuoquets);
				// System.out.println("ANS"+ans);
				// System.out.println("MAXM"+max);
			
			}
			else {
				min=mid+1;
			}
		}
		return min;
	}
	
	
	public static boolean isPossible(int BloomDay[],int Day,int k,int m){
		  int buoquets=0;
		  int flowersCollected=0;
		  for(int d:BloomDay){
			  if(d<=Day){
				  flowersCollected++;
			  }
			  else {
				  flowersCollected=0;
			  }
			  if(flowersCollected==k){
				  flowersCollected=0;
				  buoquets++;
			  }
		  }
		// System.out.println("Bouquets"+buoquets);
		if(buoquets<m){
			return false;
		}
		return true;//if buoquets >=m
	}
}