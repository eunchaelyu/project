class Solution {
    public String[] solution(String s) {
        String str=new String(s);
        String[] reverse = str.split("[.,!? ]" );
        for(int j=0; j< reverse.length(); j++){
            for (int i=0; i<reverse[i].length(); i++){
                answer[j] += reverse.charAt(reverse[i].length()-i-1);
        }
        }
        return answer;
    }
}




String str=new String(s);
String[] reverse = str.split("[.,!? ]" );
for(int j=0; j< reverse.length(); j++){
    for (int i=0; i<reverse[i].length(); i++){
        answer[j] += reverse.charAt(reverse[i].length()-i-1);
}
}
return answer;
}
}