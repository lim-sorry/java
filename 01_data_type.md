# Number

숫자(Number) 자료형에는 정수, 실수, 8진수, 16진수가 있다.



### 정수

정수를 표현하기 위한 자료형은 int, long 등이 있다. byte, short 등 다른 자료형도 있지만 거의 사용하지 않는다.

| 자료형 | 표현범위                                   |
| ------ | ------------------------------------------ |
| int    | -2147483648 ~ 2147483647                   |
| long   | -9223372036854775808 ~ 9223372036854775807 |

long 변수에 값을 대입할 때 int 자료형의 최댓값인 2147483647보다 큰 경우 `L` 또는 `l`을 접미사로 붙여 주어야 한다. 누락하면 컴파일 에러가 발생한다.

```java
int intNum = 10;
long longNum = 8764827384923849L;
```



### 실수

실수를 표현하기 위한 자료형은 float, double이 있다. 실수형은 double이 기본값이기 때문에 float 변수에 값을 대입할 때에는 `F` 또는 `f`를 접미사로 붙여 주어야 한다. 또한 지수 표현식을 사용할 수 있다.

```java
float pi = 3.14F;
double doublePi = 3.14159265358979323846;
double doubleNum = 1.234e2;
```



### 8진수와 16진수

8진수와 16진수는 int 자료형을 사용하여 표기할 수 있다. `0`으로 시작하면 8진수, `0x`로 시작하면 16진수가 된다.

```java
int oct = 023;
int hex = 0xC;
```



### 숫자연산

사칙연산은 `+`, `-`, `*`, `/` 기호를 이루어진다.

```java
//Number.java

package jump2java;

public class Number {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(a + b); // 15
		System.out.println(a - b); // 5
		System.out.println(a * b); // 50
		System.out.println(a / b); // 2
	}
}
```

`%` 연산자는 나머지 값을 반환하는 연산자이다.

```java
System.out.println(7 % 3); // 1
System.out.println(3 % 7); // 3
```



### 증감연산

`--` 혹은 `++` 기호를 증감연산자라 부르며 이를 이용하여 **값을 증가시키거나 감소시킬 수 있다.**

```java
int i = 0;
int j = 10;
i++;
j--;
System.out.println(i); // 1
System.out.println(j); // 9
```

이때 연산자의 위치에 따라 결과가 바뀜을 주의하자.  증감연산자가 변수 뒤에 붙으면 변수가 참조된 이후에 증감이 이뤄지고, 앞에 붙으면 증감이 이뤄진 후 참조된다.

```java
int l = 0;
System.out.println(++l); // 1
System.out.println(l); // 1
```



# Boolean

참 또는 거짓 값을 갖는 자료형을 부울 자료형이라고 한다. 대입되는 값은 참(true) 또는 거짓(false)만 가능하다.



### 부울 연산

참, 거짓을 판단하는 부울 연산의 결과값이 대입될 수도 있다.

```java
2 > 1			// 참
1 == 2			// 거짓
3 % 2 == 1		// 참
"3".equals("2")	// 거짓
```



### 조건문

조건문의 판단 기준으로 부울 연산이 많이 사용된다.

```java
int base = 180;
int height = 185;
boolean isTall = height > base;

if (isTall) {
    System.out.println("키가 급니다");
}
```

