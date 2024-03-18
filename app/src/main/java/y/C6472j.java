package y;

import ec.C2873y;
import id.AbstractC3557B;

/* renamed from: y.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6472j extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50224Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f50225Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6472j(int i10, Object obj) {
        super(1);
        this.f50224Y = i10;
        this.f50225Z = obj;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f50224Y;
        Object obj2 = this.f50225Z;
        switch (i10) {
            case 0:
                return Boolean.valueOf(AbstractC3557B.K(obj, obj2));
            case 1:
                ((Number) obj).intValue();
                return obj2;
            case 2:
                ((Number) obj).intValue();
                return obj2;
            case 3:
                C2873y c2873y = (C2873y) obj;
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, null, null, null, new wd.n0(obj2), null, null, null, null, 1015);
            default:
                Cd.X x10 = (Cd.X) obj;
                AbstractC3557B.c0("$this$setState", x10);
                Hd.b bVar = x10.f3038m;
                return Cd.X.e(x10, null, null, false, false, false, false, null, null, Hd.b.e(bVar, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, kf.t.x2(obj2, bVar.f7630u), null, null, 7340031), 4095);
        }
    }
}
