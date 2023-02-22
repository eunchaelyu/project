
class Solution {

public int solution(int[] array) {

int answer = array[0];

int max = 0;

int index[] = new int[1000];


for(int i = 0; i < array.length; i++) {

index[array[i]]++;


if(max < index[array[i]]) {

max = index[array[i]];

answer = array[i];

}

}


int many = 0;

for(int j = 0; j < 1000; j++) {

if(max == index[j]) many++;

if(many > 1) answer = -1;

}


return answer;

}

}

