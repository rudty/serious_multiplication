# serious_multiplication 
진지한 곱셈을 계산하는 스프링 프로젝트 

### Multiplication
곱셈 자료형(int, double, bigint ... ) 별로 구현 이 다를 수 있기에
Number 를 반환하고 두개의 곱을 제네릭으로 만들 수 있는 [인터페이스](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/Multiplication.java) 제작  

### MultiplicationStrategy 
실제로 곱셈 연산을 하는 부분 오버플로우 처리가 자료형마다 다르기 때문에 각 자료형별로 클래스 제작
- [인터페이스](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/strategies/MultiplicationStrategy.java)
- [int](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/strategies/IntegerMultiplicationStrategy.java)
- [double](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/strategies/DoubleMultiplicationStrategy.java) 

### MultiplicationService
- [AbstractMultiplicationService](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/business/AbstractMultiplicationService.java) 
구현 자료형별로 상속해서 제네릭 타입 확정
- [int](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/business/IntegerMultiplicationService.java)
- [double](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/business/DoubleMultiplicationService.java)

### Printer
1. 화면에 출력(로그 용도)은 [printer 클래스](https://github.com/rudty/serious_multiplication/tree/master/src/main/java/org/rudtyz/serious/multiplication/printer)를 통해서 출력
2. string printer, number printer, newline printer 가 있다
3. `2 * 2 = 4` 를 곱셈 연산후 출력 방법은 다음과 같다
```
2 숫자 출력
" * " 문자 출력
2 숫자 출력
" = " 문자 출력
4 숫자 출력
newline 출력
```

### Printer Factory
1. printer 객체는 [factory 클래스](https://github.com/rudty/serious_multiplication/tree/master/src/main/java/org/rudtyz/serious/multiplication/factory)를 통해서 제작
2. 각 printer 별로 [factory 클래스](https://github.com/rudty/serious_multiplication/tree/master/src/main/java/org/rudtyz/serious/multiplication/factory)가 있다

### Print Facade 
printer 는 자료형별로 동작하고 있어 한번의 연산마다 한번의 호출로 동작할 수 있게 하는 
[facade 클래스](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/support/MultiplicationPrintFacade.java) 제작

### AOP
1. 예외
 - 오버플로우 발생 시 로그를 남기고 다시 에러를 던지도록 하는 [클래스](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/aop/MultiplicationExceptionProcessingAspect.java) 제작
2. 출력
 - 서비스 동작 실행 시 printer 클래스 동작을 수행하도록 하는 [클래스](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/aop/MultiplicationAfterProcessingAspect.java) 제작 
 
### Event 
aop 에서 [로그 이벤트 서비스](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/support/MultiplicationEventService.java)로 동작을 연결하기 위해서 [이벤트](https://github.com/rudty/serious_multiplication/blob/master/src/main/java/org/rudtyz/serious/multiplication/service/support/MultiplicationEvent.java)로 전달  

