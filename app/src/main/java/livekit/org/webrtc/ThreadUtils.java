package livekit.org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ThreadUtils {

    /* renamed from: livekit.org.webrtc.ThreadUtils$1CaughtException  reason: invalid class name */
    /* loaded from: classes.dex */
    public class C1CaughtException {

        /* renamed from: e  reason: collision with root package name */
        Exception f38544e;
    }

    /* renamed from: livekit.org.webrtc.ThreadUtils$1Result  reason: invalid class name */
    /* loaded from: classes.dex */
    public class C1Result {
        public V value;
    }

    /* loaded from: classes2.dex */
    public interface BlockingOperation {
        void run();
    }

    /* loaded from: classes2.dex */
    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() == this.thread) {
                return;
            }
            throw new IllegalStateException("Wrong thread");
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: livekit.org.webrtc.ThreadUtils.2
            @Override // livekit.org.webrtc.ThreadUtils.BlockingOperation
            public void run() {
                countDownLatch.await();
            }
        });
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        throw new IllegalStateException("Not on main thread!");
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z10 = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: livekit.org.webrtc.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C1Result.this.value = callable.call();
                } catch (Exception e11) {
                    c1CaughtException.f38544e = e11;
                }
                countDownLatch.countDown();
            }
        });
        awaitUninterruptibly(countDownLatch);
        if (c1CaughtException.f38544e == null) {
            return c1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(c1CaughtException.f38544e);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.f38544e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static boolean joinUninterruptibly(Thread thread, long j6) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = false;
        long j10 = j6;
        while (j10 > 0) {
            try {
                thread.join(j10);
                break;
            } catch (InterruptedException unused) {
                j10 = j6 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j6) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = false;
        long j10 = j6;
        boolean z11 = false;
        while (true) {
            try {
                z10 = countDownLatch.await(j10, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                j10 = j6 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j10 <= 0) {
                    z11 = true;
                    break;
                }
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return z10;
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: livekit.org.webrtc.ThreadUtils.1
            @Override // livekit.org.webrtc.ThreadUtils.BlockingOperation
            public void run() {
                thread.join();
            }
        });
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: livekit.org.webrtc.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }
}
