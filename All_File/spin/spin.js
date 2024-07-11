function shuffle(array) {
	var currentIndex = array.length,
	randomIndex;
	while(0 !== currentIndex){
		randomIndex=Math.floor(Math.random() * currentIndex);
		currentIndex--;
		[array[currentIndex], array[randomIndex]]=[
		array[currentIndex],
		array[currentIndex],
		];
	}
	return array;

}

function onclick(event) {
	Spin()
	wheel.play();
	const box =document.getElementById("box");
	const element =document.getElementById("mainbox");
	let selectedItem ="";

	let বিরিয়ানি খাব =shuffle([1890,2250,2610]);
	let ফুচকা খাব=shuffle([1850,2210,2570]);
	let চাউমিন খাব=shuffle([1770,2130,2490]);
	let চাউমিন খাব=shuffle([1810,2170,2530]);
	let মোমো  খাব=shuffle([1750, 2110, 2470]);
	let অন্যের ছবি তুলে দেব=shuffle([1630, 1990,2350]);
	let ভিড়ের মধ্যে অন্যের পায়ে পা তুলবো=shuffle([1630, 1990, 2350]);

 
	let results =shuffle([
		বিরিয়ানি খাব[0],
		ফুচকা খাব[0],
		চাউমিন খাব[0],
		এগ রোল খাব[0],
		মোমো  খাব[0],
		অন্যের ছবি তুলে দেব[0],
		ভিড়ের মধ্যে অন্যের পায়ে পা তুলবো[0],
		]);
	

	if(বিরিয়ানি খাব.includes(results[0])) selectedItem="বিরিয়ানি খাব";
	if(ফুচকা খাব.includes(results[0])) selectedItem="ফুচকা খাব";
	if(চাউমিন খাব.includes(results[0])) selectedItem="চাউমিন খাব";
	if(চাউমিন খাব.includes(results[0])) selectedItem="চাউমিন খাব";
	if(মোমো  খাব.includes(results[0])) selectedItem="মোমো  খাব";
	if(অন্যের ছবি তুলে দেব.includes(results[0])) selectedItem="অন্যের ছবি তুলে দেব";
	if(ভিড়ের মধ্যে অন্যের পায়ে পা তুলবো.includes(results[0])) selectedItem="ভিড়ের মধ্যে অন্যের পায়ে পা তুলবো";

	box.style.setProperty("transition","all ease 5s");
	box.style.transform ="rotate("+ results[0] +"deg)";
	element.classlist.remove("animate");
	setTimeout(function(){
		element.classlist.add("animate");
	}, 5000);
	setTimeout(function(){
     
	})
	setTimeout(function(){
		box.style.setProperty("transition","initial");
		box.style.transform="rotate(90deg)";
	},6000);

}