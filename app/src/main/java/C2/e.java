package C2;

import Z.C1745x0;
import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import m.HandlerC4525e;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayDeque f2516g = new ArrayDeque();

    /* renamed from: h  reason: collision with root package name */
    public static final Object f2517h = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f2518a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f2519b;

    /* renamed from: c  reason: collision with root package name */
    public HandlerC4525e f2520c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f2521d = new AtomicReference();

    /* renamed from: e  reason: collision with root package name */
    public final C1745x0 f2522e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2523f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C1745x0 c1745x0 = new C1745x0(2);
        this.f2518a = mediaCodec;
        this.f2519b = handlerThread;
        this.f2522e = c1745x0;
    }

    public static d b() {
        ArrayDeque arrayDeque = f2516g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(d dVar) {
        ArrayDeque arrayDeque = f2516g;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    public final void a() {
        if (this.f2523f) {
            try {
                HandlerC4525e handlerC4525e = this.f2520c;
                handlerC4525e.getClass();
                handlerC4525e.removeCallbacksAndMessages(null);
                C1745x0 c1745x0 = this.f2522e;
                c1745x0.c();
                HandlerC4525e handlerC4525e2 = this.f2520c;
                handlerC4525e2.getClass();
                handlerC4525e2.obtainMessage(2).sendToTarget();
                synchronized (c1745x0) {
                    while (!c1745x0.f22767a) {
                        c1745x0.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }
}
