public class Task {
    public void doSomething(Callback callback){
        System.out.println("작업 수행 중");

        callback.onResult("작업 완료");
    }
}
