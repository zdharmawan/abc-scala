def computeNFibonacci( n : Int) : Int = { 
	n match {
  	 	case 0 | 1 => n
   		case _ => computeNFibonacci( n-1 ) + computeNFibonacci(n-2)
	}
}

println(computeNFibonacci(5))