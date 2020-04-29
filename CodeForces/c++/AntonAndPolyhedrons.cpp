#include <iostream>
#include <string>
#include <map>

int main()
{
	//We create the map
	std::map<std::string, int> list;
	list["Tetrahedron"]  =  4;
	list["Cube"]         =  6;
	list["Octahedron"]   =  8;
	list["Dodecahedron"] = 12;
	list["Icosahedron"]  = 20;

	int n;
		std::cin >> n;

	int result = 0;

	for (int i = 0; i < n; i++) {
		std::string figure;
			std::cin >> figure;
		result += list[figure]; //We access the value of the figure received and add it to the total result
	}
	std::cout << result;

	return 0;
}
