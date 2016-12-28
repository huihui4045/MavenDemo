import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by gavin on 2016/10/28.
 */
public class HelloRxJava {




    public void setPresenter(Presenter presenter){

    }

    public static void main(String[] args) {




        HelloRxJava helloRxJava=new HelloRxJava();

        helloRxJava.setPresenter(new Presenter() {
            @Override
            public void statr(int a, int b) {

            }

            @Override
            public void end() {

            }
        });





        int[] a = new int[10000];

        for (int i = 0; i < a.length; i++) {

            a[i] = i;
        }


        for (int i=0;i<a.length;i++){

            System.out.println("地址："+a.hashCode()+":"+a[i]);
        }



       /* Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
              //  log("Observable on Thread -> " + Thread.currentThread().getName());
                subscriber.onNext("MultiThreading");
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io())
                .observeOn()
                .subscribe(s -> {
                    //log("Subscriber on Thread -> " + Thread.currentThread().getName());
                });*/


        /*Observable<String> mObservable2 = Observable.just("AAAAAAAAAAA");



        Action1<String> action1=new Action1<String>() {
            @Override
            public void call(String s) {

                System.out.println("action1:" + s);
            }
        };


        Observable<String> mObservable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {

                subscriber.onNext("BBBBBBBBBBBB");

                System.out.println("mObservable"+Thread.currentThread().getName());

                subscriber.onCompleted();
            }
        });


        Subscriber<String> mSubscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {


            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {

                System.out.println("Subscriber"+Thread.currentThread().getName());
                System.out.println("Subscriber:" + s);
            }
        };


        Subscriber<String> mSubscriber2 = new Subscriber<String>() {
            @Override
            public void onCompleted() {


            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {


                System.out.println("Subscriber2:" + s);
            }
        };




        mObservable.subscribe(mSubscriber);
      //  mObservable2.subscribe(action1);*/
    }
}
