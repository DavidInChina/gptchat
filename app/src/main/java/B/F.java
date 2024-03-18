package B;

import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes.dex */
public final class F implements K0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1068a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final E f1069b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1070c;

    public F(H h10) {
        this.f1070c = h10;
        this.f1069b = new E(0, h10);
    }

    @Override // B.K0
    public final Object a(I0 i02, AbstractC4825e abstractC4825e) {
        A.B0 b02 = A.B0.f15Z;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f1068a;
        Object obj = this.f1070c;
        switch (i10) {
            case 0:
                Object a5 = ((H) obj).a(b02, new D(this, i02, null, 0), abstractC4825e);
                if (a5 == EnumC5000a.f41328Y) {
                    return a5;
                }
                return yVar;
            default:
                Object a10 = ((W.C) obj).a(b02, new D(this, i02, null, 1), abstractC4825e);
                if (a10 == EnumC5000a.f41328Y) {
                    return a10;
                }
                return yVar;
        }
    }

    public F(W.C c10) {
        this.f1070c = c10;
        this.f1069b = new E(2, c10);
    }
}
