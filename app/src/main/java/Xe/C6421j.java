package xe;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import jf.C3959i;
import q1.AbstractC5260f;

/* renamed from: xe.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6421j extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49930Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final C6421j f49910Z = new C6421j(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6421j f49911h0 = new C6421j(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C6421j f49912i0 = new C6421j(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C6421j f49913j0 = new C6421j(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C6421j f49914k0 = new C6421j(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C6421j f49915l0 = new C6421j(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C6421j f49916m0 = new C6421j(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C6421j f49917n0 = new C6421j(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final C6421j f49918o0 = new C6421j(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final C6421j f49919p0 = new C6421j(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final C6421j f49920q0 = new C6421j(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final C6421j f49921r0 = new C6421j(11);

    /* renamed from: s0  reason: collision with root package name */
    public static final C6421j f49922s0 = new C6421j(12);

    /* renamed from: t0  reason: collision with root package name */
    public static final C6421j f49923t0 = new C6421j(13);

    /* renamed from: u0  reason: collision with root package name */
    public static final C6421j f49924u0 = new C6421j(14);

    /* renamed from: v0  reason: collision with root package name */
    public static final C6421j f49925v0 = new C6421j(15);

    /* renamed from: w0  reason: collision with root package name */
    public static final C6421j f49926w0 = new C6421j(16);

    /* renamed from: x0  reason: collision with root package name */
    public static final C6421j f49927x0 = new C6421j(17);

    /* renamed from: y0  reason: collision with root package name */
    public static final C6421j f49928y0 = new C6421j(18);

    /* renamed from: z0  reason: collision with root package name */
    public static final C6421j f49929z0 = new C6421j(19);

    /* renamed from: A0  reason: collision with root package name */
    public static final C6421j f49905A0 = new C6421j(20);

    /* renamed from: B0  reason: collision with root package name */
    public static final C6421j f49906B0 = new C6421j(21);

    /* renamed from: C0  reason: collision with root package name */
    public static final C6421j f49907C0 = new C6421j(22);

    /* renamed from: D0  reason: collision with root package name */
    public static final C6421j f49908D0 = new C6421j(23);

    /* renamed from: E0  reason: collision with root package name */
    public static final C6421j f49909E0 = new C6421j(24);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6421j(int i10) {
        super(1);
        this.f49930Y = i10;
    }

    public final Boolean a(char c10) {
        boolean z10 = false;
        switch (this.f49930Y) {
            case 0:
                return Boolean.valueOf(AbstractC5260f.A(c10));
            case 1:
                return Boolean.valueOf(AbstractC5260f.C(c10));
            case 2:
                return Boolean.valueOf(AbstractC5260f.A(c10));
            case 3:
                return Boolean.valueOf(AbstractC5260f.C(c10));
            case 4:
            case 5:
            default:
                return Boolean.valueOf(AbstractC5260f.B(c10));
            case 6:
                return Boolean.valueOf(AbstractC5260f.D(c10));
            case 7:
                if (c10 >= 0 && c10 < '\u0100') {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 8:
                return Boolean.valueOf(AbstractC5260f.B(c10));
            case 9:
                return Boolean.valueOf(AbstractC5260f.B(c10));
            case 10:
                if (c10 == ':') {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 11:
                if (c10 == ':') {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 12:
                return Boolean.valueOf(AbstractC5260f.D(c10));
            case 13:
                if (c10 >= 0 && c10 < '\u0100') {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 14:
                return Boolean.valueOf(AbstractC5260f.B(c10));
            case 15:
                return Boolean.valueOf(AbstractC5260f.B(c10));
            case 16:
                return Boolean.valueOf(AbstractC5260f.B(c10));
            case 17:
                return Boolean.valueOf(AbstractC5260f.B(c10));
            case 18:
                return Boolean.valueOf(AbstractC5260f.B(c10));
            case 19:
                return Boolean.valueOf(AbstractC5260f.B(c10));
            case 20:
                return Boolean.valueOf(AbstractC5260f.D(c10));
            case 21:
                if (c10 >= 0 && c10 < '\u0100') {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 22:
                return Boolean.valueOf(AbstractC5260f.B(c10));
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        String str;
        String str2;
        switch (this.f49930Y) {
            case 0:
                return a(((Character) obj).charValue());
            case 1:
                return a(((Character) obj).charValue());
            case 2:
                return a(((Character) obj).charValue());
            case 3:
                return a(((Character) obj).charValue());
            case 4:
                Lg.e eVar = (Lg.e) obj;
                AbstractC3557B.c0("it", eVar);
                Lg.f fVar = ((Lg.g) eVar).f11150c;
                Lg.d s10 = fVar.s(2);
                String str3 = "";
                if (s10 == null || (str = s10.f11145a) == null) {
                    str = str3;
                }
                Lg.d s11 = fVar.s(4);
                if (s11 != null && (str2 = s11.f11145a) != null) {
                    str3 = str2;
                }
                return new C3959i(str, str3);
            case 5:
                C3959i c3959i = (C3959i) obj;
                AbstractC3557B.c0(ParameterNames.COOKIE, c3959i);
                String str4 = (String) c3959i.f36156Z;
                if (Lg.n.I2(str4, Separators.DOUBLE_QUOTE, false) && Lg.n.c2(str4, Separators.DOUBLE_QUOTE, false)) {
                    return new C3959i(c3959i.f36155Y, Lg.n.x2(str4));
                }
                return c3959i;
            case 6:
                return a(((Character) obj).charValue());
            case 7:
                return a(((Character) obj).charValue());
            case 8:
                return a(((Character) obj).charValue());
            case 9:
                return a(((Character) obj).charValue());
            case 10:
                return a(((Character) obj).charValue());
            case 11:
                return a(((Character) obj).charValue());
            case 12:
                return a(((Character) obj).charValue());
            case 13:
                return a(((Character) obj).charValue());
            case 14:
                return a(((Character) obj).charValue());
            case 15:
                return a(((Character) obj).charValue());
            case 16:
                return a(((Character) obj).charValue());
            case 17:
                return a(((Character) obj).charValue());
            case 18:
                return a(((Character) obj).charValue());
            case 19:
                return a(((Character) obj).charValue());
            case 20:
                return a(((Character) obj).charValue());
            case 21:
                return a(((Character) obj).charValue());
            case 22:
                return a(((Character) obj).charValue());
            case 23:
                return a(((Character) obj).charValue());
            default:
                C3959i c3959i2 = (C3959i) obj;
                AbstractC3557B.c0("it", c3959i2);
                String str5 = (String) c3959i2.f36155Y;
                Object obj2 = c3959i2.f36156Z;
                if (obj2 != null) {
                    String valueOf = String.valueOf(obj2);
                    return str5 + '=' + valueOf;
                }
                return str5;
        }
    }
}
