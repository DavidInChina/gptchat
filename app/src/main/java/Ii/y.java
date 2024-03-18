package Ii;

import android.app.Activity;
import android.os.Looper;
import android.os.MessageQueue;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8707Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ A f8708Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Activity f8709h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(A a5, Activity activity, int i10) {
        super(0);
        this.f8707Y = i10;
        this.f8708Z = a5;
        this.f8709h0 = activity;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f8707Y;
        Activity activity = this.f8709h0;
        A a5 = this.f8708Z;
        switch (i10) {
            case 0:
                if (a5.f8615k0) {
                    return;
                }
                a5.f8615k0 = true;
                a5.d(activity.getClass().getName(), x.f8699Z);
                return;
            case 1:
                if (a5.f8616l0) {
                    return;
                }
                a5.f8616l0 = true;
                a5.d(activity.getClass().getName(), x.f8700h0);
                return;
            default:
                if (a5.f8617m0) {
                    return;
                }
                a5.f8617m0 = true;
                String name = activity.getClass().getName();
                a5.d(name, x.f8701i0);
                final z zVar = new z(a5, name, 0);
                AbstractC0804i.a();
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: Ii.n
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        AbstractC6216a abstractC6216a = zVar;
                        AbstractC3557B.c0("$callback", abstractC6216a);
                        abstractC6216a.mo122invoke();
                        return false;
                    }
                });
                AbstractC0804i.b(a5.f8619o0, new z(a5, name, 1));
                return;
        }
    }
}
