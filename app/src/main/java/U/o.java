package U;

import Ng.F;
import Z.C1718j0;
import kotlin.jvm.internal.y;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ n f17374Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f17375Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ y f17376h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ y f17377i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, boolean z10, y yVar, y yVar2) {
        super(0);
        this.f17374Y = nVar;
        this.f17375Z = z10;
        this.f17376h0 = yVar;
        this.f17377i0 = yVar2;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        n nVar = this.f17374Y;
        boolean c10 = nVar.c();
        F f6 = nVar.f17365a;
        C1718j0 c1718j0 = nVar.f17372h;
        boolean z10 = this.f17375Z;
        if (c10 != z10) {
            nVar.f17368d.setValue(Boolean.valueOf(z10));
            float f10 = 0.0f;
            nVar.f17370f.i(0.0f);
            if (z10) {
                f10 = c1718j0.h();
            }
            Ad.l.O0(f6, null, null, new m(nVar, f10, null), 3);
        }
        nVar.f17371g.i(this.f17376h0.f37646Y);
        float f11 = this.f17377i0.f37646Y;
        if (c1718j0.h() != f11) {
            c1718j0.i(f11);
            if (nVar.c()) {
                Ad.l.O0(f6, null, null, new m(nVar, f11, null), 3);
            }
        }
        return jf.y.f36177a;
    }
}
