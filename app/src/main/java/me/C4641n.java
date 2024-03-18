package me;

import Ng.AbstractC1085t;
import Ng.C1079o0;
import Ng.v0;

/* renamed from: me.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4641n extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39222Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1085t f39223Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4641n(C1079o0 c1079o0, int i10) {
        super(1);
        this.f39222Y = i10;
        this.f39223Z = c1079o0;
    }

    public final void a(Throwable th2) {
        int i10 = this.f39222Y;
        AbstractC1085t abstractC1085t = this.f39223Z;
        switch (i10) {
            case 0:
                ((C1079o0) abstractC1085t).q0();
                return;
            case 1:
                if (th2 != null) {
                    Ei.a aVar = AbstractC4625H.f39160a;
                    aVar.c("Cancelling request because engine Job failed with error: " + th2);
                    ((v0) abstractC1085t).k(A7.b.g("Engine failed", th2));
                    return;
                }
                AbstractC4625H.f39160a.c("Cancelling request because engine Job completed");
                ((C1079o0) abstractC1085t).q0();
                return;
            default:
                ((v0) abstractC1085t).k(null);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f39222Y) {
            case 0:
                a((Throwable) obj);
                return yVar;
            case 1:
                a((Throwable) obj);
                return yVar;
            default:
                a((Throwable) obj);
                return yVar;
        }
    }
}
