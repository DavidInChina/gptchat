package zc;

import Cd.C0334t;
import Cd.C0335u;
import Cd.X;
import id.AbstractC3557B;

/* renamed from: zc.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6815B extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51818Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Cd.y f51819Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6815B(Cd.y yVar, int i10) {
        super(1);
        this.f51818Y = i10;
        this.f51819Z = yVar;
    }

    public final X a(X x10) {
        int i10 = this.f51818Y;
        Cd.y yVar = this.f51819Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", x10);
                return X.e(x10, null, null, false, false, ((C0335u) yVar).f3072a, false, null, null, null, 7935);
            default:
                AbstractC3557B.c0("$this$setState", x10);
                return X.e(x10, null, null, false, false, false, ((C0334t) yVar).f3071a, null, null, null, 7679);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f51818Y) {
            case 0:
                return a((X) obj);
            default:
                return a((X) obj);
        }
    }
}
