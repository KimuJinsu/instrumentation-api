# Java Instrumentation API

**Java Instrumentation API**는 JVM(Java Virtual Machine)에서 클래스를 로드하거나, 이미 로드된 클래스를 동적으로 변경할 수 있는 기능을 제공합니다. 이 API는 주로 **Java Agent**와 함께 사용되며, 런타임에 클래스의 바이트코드를 수정하거나 새로운 클래스를 삽입하는 작업을 수행할 수 있습니다.

## 주요 기능 및 사용 사례

### 1. **클래스 변환 및 재정의**
   - Instrumentation API는 클래스가 JVM에 로드되기 전에 해당 클래스의 바이트코드를 수정할 수 있게 해줍니다. 이는 **ClassFileTransformer** 인터페이스를 통해 이루어지며, 개발자는 자신만의 변환 로직을 구현할 수 있습니다.

### 2. **런타임에 새로운 클래스 삽입**
   - 이미 JVM에 로드된 클래스가 아닌, 새롭게 정의된 클래스를 JVM에 동적으로 추가할 수 있습니다. 이는 프로그램의 동작 중 새로운 기능을 추가하거나 기존 기능을 확장하는 데 유용합니다.

### 3. **클래스 초기화 측정 및 모니터링**
   - Instrumentation API를 사용하면 클래스가 언제 로드되고 초기화되는지를 추적할 수 있습니다. 이는 성능 모니터링이나 로깅 시스템을 구현할 때 매우 유용합니다.

### 4. **메서드 실행 시간 측정**
   - 메서드의 실행 시간을 측정하는 등, 메서드 호출 시 추가적인 로직을 삽입할 수 있습니다. 이는 성능 분석 도구에서 자주 사용됩니다.

### 5. **바이트코드 수준의 에이전트 작성**
   - 개발자는 Java Agent를 통해 바이트코드 수준에서 애플리케이션의 동작을 제어할 수 있습니다. 이는 보안 검토, 성능 최적화, 디버깅 등의 목적으로 많이 사용됩니다.
