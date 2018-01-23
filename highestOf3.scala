def highestOf3(a:Int, b:Int, c:Int) : Int = {
	var max = a;
	if (b > max) max = b;
	if (c > max) max = c;
	max
}

println(highestOf3(5,7,3))