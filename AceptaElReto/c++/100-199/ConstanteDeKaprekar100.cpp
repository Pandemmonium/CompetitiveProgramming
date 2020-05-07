#include <iostream>
#include <string>
#include <algorithm>

//Ver si es un repDigit
bool repDigits(int num) {
	switch (num) 
	{
		case 0000:
		case 1111:
		case 2222:
		case 3333:
		case 4444:
		case 5555:
		case 6666:
		case 7777:
		case 8888:
		case 9999:
			return true;
		default:
			return false;
	}
}

int convertirInt(int lista[])
{
	int resul = 0;
	int desplazo = 1;
	for (int i = 3; i >= 0; i--)
	{
		resul += (lista[i] * desplazo);
		desplazo *= 10;
	}
	return resul;
}

//Preparar num1
int prepNum(int num)
{
	//Hacemos un array del numero para poder ordenarlo
	int lista[4];
	for (int i = 3; i >= 0; i--)
	{
		lista[i] = num % 10;
		num /= 10;
	}
	//Lo ordenamos de mayor a menor
	std::sort(lista, lista+4, std::greater<int>());

	//Lo volvemos a convertir en un numero
	int resul = convertirInt(lista);
	return resul;
}


//Preparar num2
int prepNum2(int num) 
{
	//Hacemos un array del numero para poder ordenarlo
	int lista[4];
	for (int i = 3; i >= 0; i--)
	{
		lista[i] = num % 10;
		num /= 10;
	}
	//Lo ordenamos de menor a mayor
	std::sort(lista, lista+4);

	//Lo volvemos a convertir en un numero
	int resul = convertirInt(lista);
	return resul;
}

int main()
{
	int casos;
	std::cin >> casos;
	for (int i = 0; i < casos; i++)
	{
		int num;
		std::cin >> num;

		bool continua = true;
		int instancias = 0;
		if (repDigits(num))
		{
			std::cout << 8 << std::endl;
		}
		else
		{
			while (continua)
			{
				if (num == 6174)
				{
					continua = false;
				}
				else
				{
					num = prepNum(num) - prepNum2(num);
					instancias++;
				}
			}
			std::cout << instancias << std::endl;
		}
	}
}
