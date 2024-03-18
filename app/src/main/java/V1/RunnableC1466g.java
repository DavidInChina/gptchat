package V1;

import id.AbstractC3557B;
import java.io.File;
import w.C6059f;

/* renamed from: V1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1466g implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18196Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f18197Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f18198h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f18199i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f18200j0;

    public /* synthetic */ RunnableC1466g(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f18196Y = i10;
        this.f18198h0 = obj;
        this.f18199i0 = obj2;
        this.f18197Z = z10;
        this.f18200j0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File v10;
        Object obj;
        switch (this.f18196Y) {
            case 0:
                AbstractC3557B.c0("$lastInViews", (C6059f) this.f18200j0);
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((e0) this.f18198h0).f18185c;
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = ((e0) this.f18199i0).f18185c;
                X x10 = S.f18113a;
                AbstractC3557B.c0("inFragment", abstractComponentCallbacksC1480v);
                AbstractC3557B.c0("outFragment", abstractComponentCallbacksC1480v2);
                return;
            default:
                F5.f fVar = (F5.f) this.f18198h0;
                G5.d dVar = (G5.d) this.f18199i0;
                boolean z10 = this.f18197Z;
                wf.k kVar = (wf.k) this.f18200j0;
                AbstractC3557B.c0("this$0", fVar);
                AbstractC3557B.c0("$callback", kVar);
                synchronized (fVar.f5050p0) {
                    File file = null;
                    if (dVar != null) {
                        try {
                            v10 = dVar.v(z10);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        v10 = null;
                    }
                    if (v10 != null) {
                        file = dVar.s(v10);
                    }
                    File file2 = file;
                    if (dVar != null && v10 != null) {
                        obj = new F5.i(v10, file2, fVar.f5043i0, fVar.f5044j0, fVar.f5047m0, fVar.f5046l0);
                        kVar.invoke(obj);
                    }
                    obj = new Object();
                    kVar.invoke(obj);
                }
                return;
        }
    }
}
