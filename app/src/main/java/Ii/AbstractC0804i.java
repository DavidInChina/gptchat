package Ii;

import H0.RunnableC0712x;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import id.AbstractC3557B;
import jf.C3963m;
import wf.AbstractC6216a;

/* renamed from: Ii.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0804i {

    /* renamed from: a  reason: collision with root package name */
    public static final C3963m f8654a = R4.b.D1(C0800e.f8643h0);

    public static final void a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(AbstractC3557B.v2("Should be called from the main thread, not ", Thread.currentThread()).toString());
    }

    public static final void b(Handler handler, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("<this>", handler);
        Message obtain = Message.obtain(handler, new RunnableC0712x(abstractC6216a, 7));
        y1.o.b(obtain, true);
        handler.sendMessageAtFrontOfQueue(obtain);
    }
}
