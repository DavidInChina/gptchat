package W;

import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import wf.AbstractC6216a;

/* renamed from: W.w3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1634w3 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20581Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f20582Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1634w3(int i10, Object obj) {
        super(2);
        this.f20581Y = i10;
        this.f20582Z = obj;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f20581Y;
        Object obj = this.f20582Z;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(((C1585m3) obj).f20227a.a(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-2057496502);
                C1585m3 c1585m3 = (C1585m3) obj;
                boolean g10 = rVar3.g(c1585m3);
                Object K10 = rVar3.K();
                if (g10 || K10 == C1723m.f22654Y) {
                    K10 = new C1560h3(2, c1585m3);
                    rVar3.h0(K10);
                }
                rVar3.t(false);
                R4.b.o((AbstractC6216a) K10, null, false, null, null, Y0.f19846a, rVar3, 196608, 30);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // wf.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        float f6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        jf.y yVar = jf.y.f36177a;
        switch (this.f20581Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                Z0.j jVar = (Z0.j) obj;
                Z0.j jVar2 = (Z0.j) obj2;
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) this.f20582Z;
                float f10 = L1.f19330a;
                float f11 = 1.0f;
                if (jVar2.f22800a < jVar.f22802c) {
                    if (jVar2.f22802c <= jVar.f22800a) {
                        f6 = 1.0f;
                    } else if (jVar2.b() != 0) {
                        int i16 = jVar2.f22800a;
                        f6 = (((Math.min(jVar.f22802c, i14) + Math.max(i15, i16)) / 2) - i16) / jVar2.b();
                    }
                    if (jVar2.f22801b < jVar.f22803d) {
                        if (jVar2.f22803d > jVar.f22801b) {
                            if (jVar2.a() != 0) {
                                f11 = (((Math.min(i11, i12) + Math.max(i13, i10)) / 2) - i10) / jVar2.a();
                            }
                        }
                        abstractC1710f0.setValue(new r0.P(androidx.compose.ui.graphics.a.h(f6, f11)));
                        return yVar;
                    }
                    f11 = 0.0f;
                    abstractC1710f0.setValue(new r0.P(androidx.compose.ui.graphics.a.h(f6, f11)));
                    return yVar;
                }
                f6 = 0.0f;
                if (jVar2.f22801b < jVar.f22803d) {
                }
                f11 = 0.0f;
                abstractC1710f0.setValue(new r0.P(androidx.compose.ui.graphics.a.h(f6, f11)));
                return yVar;
        }
    }
}
