package d1;

import E0.AbstractC0461u;
import H0.RunnableC0712x;
import android.os.Handler;
import android.os.Looper;
import id.AbstractC3557B;
import jf.y;
import wf.AbstractC6216a;

/* renamed from: d1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2574i extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27872Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2584s f27873Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2574i(C2584s c2584s, int i10) {
        super(1);
        this.f27872Y = i10;
        this.f27873Z = c2584s;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Looper looper;
        y yVar = y.f36177a;
        int i10 = this.f27872Y;
        C2584s c2584s = this.f27873Z;
        switch (i10) {
            case 0:
                AbstractC0461u x10 = ((AbstractC0461u) obj).x();
                AbstractC3557B.Z(x10);
                c2584s.l(x10);
                return yVar;
            case 1:
                c2584s.m72setPopupContentSizefhxjrPA(new Z0.k(((Z0.k) obj).f22804a));
                c2584s.m();
                return yVar;
            default:
                AbstractC6216a abstractC6216a = (AbstractC6216a) obj;
                Handler handler = c2584s.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    abstractC6216a.mo122invoke();
                } else {
                    Handler handler2 = c2584s.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0712x(abstractC6216a, 3));
                    }
                }
                return yVar;
        }
    }
}
