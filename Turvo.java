1,0,2,0,0,-2,-3,0
1,2,0,0,0,-2,-3,0
1,2,-2,0,0,0,-3,0
1,2,-2,-3,0,0,0,0

1,2,-2,-3,0,0,0,0


Public void rearrageArray(int [] arr) {
Int lastSeenZero = -1; //1,2,3
for(int i = 0 ; i < arr.length ; i++) {
	if(arr[i] != 0 && lastSeenZero != -1) {
swap(arr,i,lastSeenZero));
lastSeenZero = lastSeenZero+1;
} else  if(arr[i] == 0 && lastSeenZero == -1) lastSeenZero = i;
}
for(int i : arr) sysout(i);
}

Public void swap(int[] arr, int start, int end) {
	Int temp = arr[start];
	Arr[start] = arr[end];
	Arr[end] = temp;
}




















ABC Trucking

Hyd -> Blore



Food
Petrol
Fireworks

….

Petrol-Fireworks
Food-Fireworks

2 Trucks are suff. To transport all goods?

Yes


Food
Petrol
Fireworks

….

Petrol-Fireworks
Food-Fireworks
Petrol-Food

2 Trucks are suff. To transport all goods?

No

Public String doesTrucksSufficient(List<String> items, Map<String,List<String>> incompatabilies) {
	Set<String> truckOneItems = new HashSet<>();
	Set<String> truckTwoItems = new HashSet<>():
	//if(truckOneItems.contains(items.get(i)) || truckTwoItems.contains(items.get(i)) continue;
	for(int i = 0 ; i < items.size() ; i++) {
		List<String> notCompatable = map.get(items.get(i));
		if(truckOneItems.size() == 0) {
truckOneItems.add(items.get(i));
String val = checkCompatablity(truckTwoItems,notCompatable);
if(val.equals(“No”)) return val;

}
Else {
	if(truckOneItems.split(incompatabilies.get(items(i)).size() == 0) {
truckOneItems.add(items(i));
if(truckTwoItems.split(notCompatable).size() == 0) {
String val = checkCompatablity(truckTwoItems,notCompatable);
if(val.equals(“No”)) return val;
} else {
	Return “No”;
}
}
	Else if(truckTwoItems.split(incompatabilities.get(items(i)).size() == 0) {
truckTwoItems.add(items(i)); 
if(truckOneItems.split(notCompatable).size() == 0) {
String val = checkCompatablity(truckOneItems,notCompatable);
if(val.equals(“No”)) return val;
} else {
	Return “No”;
}
}
}

}
Return “Yes”;
}

Public void checkCompatibility(List<String> truckTwoItems,List<String> notCompatable){
		for(int j = 0 ; j < notCompatable.size(); j++){
	if(truckTwoItems.split(notCompatable.get(j)) == 0){
		truckTwoItems.add(notCompatable);
}else {
	Return “No”;
}
}
}


1 - 2, 3
2 - 1, 3
3 - 1, 2
