package ab;

import id.AbstractC3557B;

/* renamed from: ab.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1952f extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1952f f24088Z = new C1952f(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1952f f24089h0 = new C1952f(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C1952f f24090i0 = new C1952f(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24091Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1952f(int i10) {
        super(1);
        this.f24091Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f24091Y) {
            case 0:
                return null;
            case 1:
                L0.v vVar = (L0.v) obj;
                AbstractC3557B.c0("$this$semantics", vVar);
                Df.v[] vVarArr = L0.t.f10472a;
                L0.u uVar = L0.r.f10453i;
                jf.y yVar = jf.y.f36177a;
                ((L0.j) vVar).y(uVar, yVar);
                return yVar;
            default:
                C1965s c1965s = (C1965s) obj;
                AbstractC3557B.c0("$this$setState", c1965s);
                return C1965s.e(c1965s, null, null, null, 14);
        }
    }
}
