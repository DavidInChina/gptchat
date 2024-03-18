package L;

import H0.AbstractC0701r0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.l1;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: L.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0839b0 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10099Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f10100Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ N0.E f10101h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0839b0(int i10, int i11, N0.E e10) {
        super(3);
        this.f10099Y = i10;
        this.f10100Z = i11;
        this.f10101h0 = e10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z10;
        S0.Q q10;
        Integer valueOf;
        float f6;
        int i10;
        int i11;
        AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
        ((Number) obj3).intValue();
        Z.r rVar = (Z.r) ((AbstractC1725n) obj2);
        rVar.W(408240218);
        int i12 = this.f10099Y;
        int i13 = this.f10100Z;
        Df.H.C0(i12, i13);
        C4323o c4323o = C4323o.f37719b;
        if (i12 == 1 && i13 == Integer.MAX_VALUE) {
            rVar.t(false);
            return c4323o;
        }
        Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
        S0.r rVar2 = (S0.r) rVar.m(AbstractC0701r0.f7005h);
        Z0.l lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
        rVar.W(511388516);
        N0.E e10 = this.f10101h0;
        boolean g10 = rVar.g(e10) | rVar.g(lVar);
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        N0.E e11 = K10;
        if (g10 || K10 == iVar) {
            N0.E U12 = R4.b.U1(e10, lVar);
            rVar.h0(U12);
            e11 = U12;
        }
        rVar.t(false);
        N0.E e12 = e11;
        rVar.W(511388516);
        boolean g11 = rVar.g(rVar2) | rVar.g(e12);
        Object K11 = rVar.K();
        if (!g11 && K11 != iVar) {
            z10 = false;
            q10 = K11;
        } else {
            N0.y yVar = e12.f12487a;
            S0.s sVar = yVar.f12633f;
            S0.D d10 = yVar.f12630c;
            if (d10 == null) {
                d10 = S0.D.f15971j0;
            }
            S0.z zVar = yVar.f12631d;
            if (zVar != null) {
                i10 = zVar.f16061a;
            } else {
                i10 = 0;
            }
            S0.A a5 = yVar.f12632e;
            if (a5 != null) {
                i11 = a5.f15966a;
            } else {
                i11 = 1;
            }
            S0.Q b10 = ((S0.t) rVar2).b(sVar, d10, i10, i11);
            rVar.h0(b10);
            z10 = false;
            q10 = b10;
        }
        rVar.t(z10);
        l1 l1Var = q10;
        Object value = l1Var.getValue();
        Object[] objArr = new Object[5];
        char c10 = z10 ? 1 : 0;
        char c11 = z10 ? 1 : 0;
        objArr[c10] = bVar;
        objArr[1] = rVar2;
        objArr[2] = e10;
        objArr[3] = lVar;
        objArr[4] = value;
        rVar.W(-568225417);
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 5; i14 < i15; i15 = 5) {
            z11 |= rVar.g(objArr[i14]);
            i14++;
        }
        Object K12 = rVar.K();
        Integer num = K12;
        if (z11 || K12 == iVar) {
            Integer valueOf2 = Integer.valueOf((int) (B0.a(e12, bVar, rVar2, B0.f9858a, 1) & 4294967295L));
            rVar.h0(valueOf2);
            num = valueOf2;
        }
        rVar.t(false);
        int intValue = ((Number) num).intValue();
        Object[] objArr2 = {bVar, rVar2, e10, lVar, l1Var.getValue()};
        rVar.W(-568225417);
        boolean z12 = false;
        for (int i16 = 0; i16 < 5; i16++) {
            z12 |= rVar.g(objArr2[i16]);
        }
        Object K13 = rVar.K();
        Integer num2 = K13;
        if (z12 || K13 == iVar) {
            StringBuilder sb2 = new StringBuilder();
            String str = B0.f9858a;
            sb2.append(str);
            sb2.append('\n');
            sb2.append(str);
            Integer valueOf3 = Integer.valueOf((int) (B0.a(e12, bVar, rVar2, sb2.toString(), 2) & 4294967295L));
            rVar.h0(valueOf3);
            num2 = valueOf3;
        }
        rVar.t(false);
        int intValue2 = ((Number) num2).intValue() - intValue;
        Integer num3 = null;
        if (i12 == 1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((i12 - 1) * intValue2) + intValue);
        }
        if (i13 != Integer.MAX_VALUE) {
            num3 = Integer.valueOf(((i13 - 1) * intValue2) + intValue);
        }
        float f10 = Float.NaN;
        if (valueOf != null) {
            f6 = bVar.J(valueOf.intValue());
        } else {
            f6 = Float.NaN;
        }
        if (num3 != null) {
            f10 = bVar.J(num3.intValue());
        }
        AbstractC4326r f11 = androidx.compose.foundation.layout.e.f(c4323o, f6, f10);
        rVar.t(false);
        return f11;
    }
}
