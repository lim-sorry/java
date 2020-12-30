# hello world

### JDK & Eclipse

자바 코딩을 위해서는 Java Develpoment Kit를 필수적으로 설치해야 한다. 또한 이클립스는 이러한 프로그램 작성을 도와주는 대표적인 IDE라고 할 수 있다.

자바 프로그램이 실행되는 과정은 다음과 같다.

1. 소스코드(MyPrograme.java)를 작성한다.
2. 컴파일러(Compiler)는 자바 소스코드를 이용하여 클래스 파일(MyProgram.class)을 생성한다. 컴파일 된 클래스 파일은 Java VM(Java Virtual Machine)이 인식할 수 있는 바이너리 파일이다.
3. Java VM(JVM)은 클래스 파일의 바이너리 코드를 해석하여 프로그램을 수행한다.
4. MyProgram 수행 결과가 컴퓨터에 반영된다.

자바는 JVM이라는 중간단계가 있기 때문에 c, c++ 등의 언어에 비해 느리지만 어떤 OS에서라도 사용할 수 있다는 장점이 있다.

### hello world

이클립스에서 새로운 프로젝트 `jump2java`를 생성한다.

> File => New => Java Project

신규 클래스 `HelloWorld`를 생성한다.

> File => New => Class

### main

프로그램의 시작과 끝을 담당하는 함수이다. 다만 클래스 내의 함수는 보통 메서드(method)라 부르기 때문에 클래스 기반의 자바에서 사용되는 함수는 모두 메서드가 된다.

HelloWorld.java 프로그램에 main 메서드를 추가해 보자.

```java
package jump2java;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
}
```

- public : 메소드의 접근제어자, public은 누구나 이 메소드에 접근할 수 있다는 의미
- static : 메소드에 static 이 지정되어 있는 경우 이 메소드는 인스턴스 생성없이 실행 할 수 있음을 의미
- void : 메소드의 리턴값이 없음(void: 사전적으로 "텅 빈" 이라는 뜻)을 의미
- String : 문자열을 나타내는 자바의 자료형
- args[] : String 자료형에 대한 변수명으로 args 뒤에 `[]`가 있으므로 한 개가 아닌 여러개의 값으로 이루어진 배열임을 의미
- System.out.println : 표준출력으로 메서드로 들어오는 문자열 값을 화면에 출력한다.

작성을 마친 프로그램을 실행시켜 보자.

> Run -> Run As -> Java Application

출력된 결과물을 확인할 수 있다.

```
Hello World
```



# 변수

변수의 선언은 자료형과 변수명을 지정하며 이루어진다.

```java
int one;
String two;
```

변수명에는 다음과 같은 규칙이 적용된다.

- 변수명은 숫자로 시작할 수 없다.
- `_`와 `&` 이외의 특수문자는 사용할 수 없다.
- 자바의 키워드는 사용할 수 없다.

```java
// 잘못된 변수명의 사용 예
int 1st;
int a#;
int class;
```

자주 쓰이는 자료형에는 int, long, double, boolean, char, String, StringBuffer, List, Map 등이 있다.

```java
StringBuffer sb;
List myList;
```

변수에는 자료형에 맞는 값을 대입할 수 있으며 선언과 동시에 값을 대입할 수도 있다. 만약 자료형에 맞지 않는 값을 대입하면 오류가 난다.

```java
int a;
a = 1;

String b = "hello java";

int c = "hello java";
// Type mismatch: cannot convert from String to int
```

직접 클래스로 정의한 사용자 정의 자료형으로 변수를 만들 수도 있다.

```java
class Animal {
}

Animal cat;
```




# 주석

### 블록 주석

블록주석은 `/*`으로 시작하여 `*/`으로 끝마칠 수 있다.

```java
/*
MyProgram에 대한 블록 주석
*/
public class MyProgram {
}
```

### 라인 주석

`//`를 시작한 부분부터 해당 라인의 끝까지 주석문이 된다. 한 라인에 대한 설명으로 주로 사용된다.

```java
int age; // 라인 주석
```

### 주석 사용시 주의점

주석을 누구나 알고 있는 내용에 달게되면 소스코드를 지저분하게 만들 뿐이다. 주석이 꼭 필요한 부분에만 추가하고 주석이 없이도 이해할 수 있는 "Simple Code"를 구현하는 것을 목표로 해야한다.