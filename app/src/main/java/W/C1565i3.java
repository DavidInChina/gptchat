package W;

import id.AbstractC3557B;

/* renamed from: W.i3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1565i3 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20139Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1585m3 f20140Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1565i3(C1585m3 c1585m3, int i10) {
        super(1);
        this.f20139Y = i10;
        this.f20140Z = c1585m3;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f20139Y;
        C1585m3 c1585m3 = this.f20140Z;
        switch (i10) {
            case 0:
                L0.v vVar = (L0.v) obj;
                Df.v[] vVarArr = L0.t.f10472a;
                L0.u uVar = L0.r.f10455k;
                Df.v vVar2 = L0.t.f10472a[3];
                uVar.a(vVar, new L0.e());
                L0.j jVar = (L0.j) vVar;
                jVar.y(L0.i.f10402s, new L0.a(null, new C1560h3(0, c1585m3)));
                return jf.y.f36177a;
            default:
                return Boolean.valueOf(AbstractC3557B.K(((C1573k1) obj).f20187a, c1585m3));
        }
    }
}
