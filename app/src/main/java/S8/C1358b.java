package S8;

import A.C0046u0;
import android.gov.nist.core.Separators;
import h0.C3288a;
import id.AbstractC3557B;

/* renamed from: S8.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1358b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1358b f16299Z = new C1358b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1358b f16300h0 = new C1358b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C1358b f16301i0 = new C1358b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C1358b f16302j0 = new C1358b(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C1358b f16303k0 = new C1358b(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C1358b f16304l0 = new C1358b(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C1358b f16305m0 = new C1358b(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C1358b f16306n0 = new C1358b(7);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16307Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1358b(int i10) {
        super(1);
        this.f16307Y = i10;
    }

    public final String a(int i10) {
        switch (this.f16307Y) {
            case 1:
                return (i10 + 1) + Separators.DOT;
            case 2:
                char charValue = ((Character) kf.t.f2(kf.t.Z1(new Cf.a('a', 'z'), i10 % 26))).charValue();
                return charValue + Separators.DOT;
            case 3:
                return (i10 + 1) + Separators.RPAREN;
            default:
                char charValue2 = ((Character) kf.t.f2(kf.t.Z1(new Cf.a('a', 'z'), i10 % 26))).charValue();
                return charValue2 + Separators.RPAREN;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f16307Y) {
            case 0:
                return new r0.r(r0.r.b(((r0.r) obj).f44265a, 0.25f));
            case 1:
                return a(((Number) obj).intValue());
            case 2:
                return a(((Number) obj).intValue());
            case 3:
                return a(((Number) obj).intValue());
            case 4:
                return a(((Number) obj).intValue());
            case 5:
                M m10 = (M) obj;
                AbstractC3557B.c0("$this$null", m10);
                wf.k[] kVarArr = {f16300h0, f16301i0, f16302j0, f16303k0};
                C1358b c1358b = AbstractC1377v.f16385d;
                return new D(new C3288a(new t3.s(m10, 1, kVarArr), true, -373393724));
            case 6:
                M m11 = (M) obj;
                AbstractC3557B.c0("$this$null", m11);
                C1358b c1358b2 = AbstractC1377v.f16385d;
                return new d0(new C3288a(new C0046u0(m11, 6, new String[]{"\u2022", "\u25e6", "\u25b8", "\u25b9"}), true, 15273025));
            default:
                E0.M m12 = (E0.M) obj;
                AbstractC3557B.c0("marker", m12);
                return m12.o(A7.b.n(0, 0, 0, 0, 15));
        }
    }
}
