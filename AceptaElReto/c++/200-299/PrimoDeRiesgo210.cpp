#include <iostream>
#include <string>
#include <array>
#include <cmath>

int main()
{
	int casos;
	std::cin >> casos;

	for (int i = 0; i < casos; i++)
	{

		std::string palabra;
		std::cin >> palabra;
		int resul = 0;

		for (char ch : palabra)
			resul += ch;
		resul--; //Porque hay que averiguar el primo más cercano al número, aunque nuestro número sea primo

		bool continua = true;
		while (continua)
		{
			bool entrado = false;
			for (int i = 2; i < std::sqrt(resul)+1 && !entrado; i++)
			{
				if (resul % i == 0)
					entrado = true;
			}
			if (entrado)
				resul--;
			else
			{
				continua = false;
				std::cout << resul << std::endl;
			}	
		}
	}
}

