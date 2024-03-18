package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.Set;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: wd.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6189g {
    public static final C6179b Companion = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final KSerializer[] f48403j = {null, null, null, null, EnumC6187f.Companion.serializer(), new C2695d(P4.a.E("com.openai.types.Account.Feature", EnumC6181c.values()), 2), EnumC6198k0.Companion.serializer(), null, null};

    /* renamed from: k  reason: collision with root package name */
    public static final C6189g f48404k = new C6189g("fake_plus_account", B0.f48313g, null, null, EnumC6198k0.f48431i0, false, 442);

    /* renamed from: l  reason: collision with root package name */
    public static final C6189g f48405l = new C6189g("fake_free_account", null, null, null, EnumC6198k0.f48430h0, false, 442);

    /* renamed from: m  reason: collision with root package name */
    public static final C6189g f48406m;

    /* renamed from: n  reason: collision with root package name */
    public static final C6189g f48407n;

    /* renamed from: o  reason: collision with root package name */
    public static final C6189g f48408o;

    /* renamed from: p  reason: collision with root package name */
    public static final C6189g f48409p;

    /* renamed from: a  reason: collision with root package name */
    public final String f48410a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48411b;

    /* renamed from: c  reason: collision with root package name */
    public final B0 f48412c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48413d;

    /* renamed from: e  reason: collision with root package name */
    public final EnumC6187f f48414e;

    /* renamed from: f  reason: collision with root package name */
    public final Set f48415f;

    /* renamed from: g  reason: collision with root package name */
    public final EnumC6198k0 f48416g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f48417h;

    /* renamed from: i  reason: collision with root package name */
    public final String f48418i;

    /* JADX WARN: Type inference failed for: r2v0, types: [wd.b, java.lang.Object] */
    static {
        B0.Companion.getClass();
        B0 b02 = B0.f48315i;
        EnumC6187f enumC6187f = EnumC6187f.f48400h0;
        f48406m = new C6189g("fake_enterprise_account", b02, "Acme Co", enumC6187f, EnumC6198k0.f48433k0, false, 418);
        B0 b03 = B0.f48314h;
        EnumC6198k0 enumC6198k0 = EnumC6198k0.f48432j0;
        f48407n = new C6189g("fake_team_account_1", b03, "Terran", enumC6187f, enumC6198k0, false, 418);
        f48408o = new C6189g("fake_team_account_2", b03, "Zerg", enumC6187f, enumC6198k0, true, 290);
        f48409p = new C6189g("fake_team_account_3", b03, "Protoss", enumC6187f, enumC6198k0, false, 418);
    }

    public C6189g(int i10, String str, String str2, B0 b02, String str3, EnumC6187f enumC6187f, Set set, EnumC6198k0 enumC6198k0, boolean z10, String str4) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, C6177a.f48381b);
            throw null;
        }
        this.f48410a = str;
        if ((i10 & 2) == 0) {
            this.f48411b = null;
        } else {
            this.f48411b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f48412c = null;
        } else {
            this.f48412c = b02;
        }
        if ((i10 & 8) == 0) {
            this.f48413d = null;
        } else {
            this.f48413d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f48414e = EnumC6187f.f48399Z;
        } else {
            this.f48414e = enumC6187f;
        }
        if ((i10 & 32) == 0) {
            this.f48415f = kf.x.f37485Y;
        } else {
            this.f48415f = set;
        }
        if ((i10 & 64) == 0) {
            this.f48416g = null;
        } else {
            this.f48416g = enumC6198k0;
        }
        if ((i10 & 128) == 0) {
            this.f48417h = false;
        } else {
            this.f48417h = z10;
        }
        if ((i10 & 256) == 0) {
            this.f48418i = null;
        } else {
            this.f48418i = str4;
        }
    }

    public final boolean a() {
        EnumC6198k0 enumC6198k0;
        B0 b02;
        if (!b() && ((enumC6198k0 = this.f48416g) == null || enumC6198k0 == EnumC6198k0.f48430h0)) {
            E0 e02 = null;
            B0 b03 = this.f48412c;
            if (b03 != null && b03.f48320e) {
                b02 = b03;
            } else {
                b02 = null;
            }
            if (b02 != null) {
                if (b03 == null || !b03.f48320e) {
                    b03 = null;
                }
                if (b03 != null) {
                    e02 = b03.f48316a;
                }
                if (e02 != E0.f48327h0) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this.f48414e == EnumC6187f.f48400h0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6189g)) {
            return false;
        }
        C6189g c6189g = (C6189g) obj;
        if (!AbstractC3557B.K(this.f48410a, c6189g.f48410a)) {
            return false;
        }
        String str = this.f48411b;
        String str2 = c6189g.f48411b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f48412c, c6189g.f48412c) && AbstractC3557B.K(this.f48413d, c6189g.f48413d) && this.f48414e == c6189g.f48414e && AbstractC3557B.K(this.f48415f, c6189g.f48415f) && this.f48416g == c6189g.f48416g && this.f48417h == c6189g.f48417h && AbstractC3557B.K(this.f48418i, c6189g.f48418i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int hashCode = this.f48410a.hashCode() * 31;
        int i15 = 0;
        String str = this.f48411b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i16 = (hashCode + i10) * 31;
        B0 b02 = this.f48412c;
        if (b02 == null) {
            i11 = 0;
        } else {
            i11 = b02.hashCode();
        }
        int i17 = (i16 + i11) * 31;
        String str2 = this.f48413d;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int hashCode2 = (this.f48415f.hashCode() + ((this.f48414e.hashCode() + ((i17 + i12) * 31)) * 31)) * 31;
        EnumC6198k0 enumC6198k0 = this.f48416g;
        if (enumC6198k0 == null) {
            i13 = 0;
        } else {
            i13 = enumC6198k0.hashCode();
        }
        int i18 = (hashCode2 + i13) * 31;
        if (this.f48417h) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i19 = (i18 + i14) * 31;
        String str3 = this.f48418i;
        if (str3 != null) {
            i15 = str3.hashCode();
        }
        return i19 + i15;
    }

    public final String toString() {
        String str;
        String a5 = C6195j.a(this.f48410a);
        String str2 = this.f48411b;
        if (str2 == null) {
            str = "null";
        } else {
            str = android.gov.nist.core.a.A("Id(value=", str2, Separators.RPAREN);
        }
        StringBuilder t10 = android.gov.nist.core.a.t("Account(accountId=", a5, ", accountUserId=", str, ", subscription=");
        t10.append(this.f48412c);
        t10.append(", name=");
        t10.append(this.f48413d);
        t10.append(", structure=");
        t10.append(this.f48414e);
        t10.append(", features=");
        t10.append(this.f48415f);
        t10.append(", planType=");
        t10.append(this.f48416g);
        t10.append(", isDeactivated=");
        t10.append(this.f48417h);
        t10.append(", profilePictureUrl=");
        return R.a.t(t10, this.f48418i, Separators.RPAREN);
    }

    public C6189g(String str, String str2, B0 b02, String str3, EnumC6187f enumC6187f, Set set, EnumC6198k0 enumC6198k0, boolean z10, String str4) {
        AbstractC3557B.c0("accountId", str);
        AbstractC3557B.c0("structure", enumC6187f);
        AbstractC3557B.c0("features", set);
        this.f48410a = str;
        this.f48411b = str2;
        this.f48412c = b02;
        this.f48413d = str3;
        this.f48414e = enumC6187f;
        this.f48415f = set;
        this.f48416g = enumC6198k0;
        this.f48417h = z10;
        this.f48418i = str4;
    }

    public /* synthetic */ C6189g(String str, B0 b02, String str2, EnumC6187f enumC6187f, EnumC6198k0 enumC6198k0, boolean z10, int i10) {
        this(str, null, b02, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? EnumC6187f.f48399Z : enumC6187f, kf.x.f37485Y, enumC6198k0, (i10 & 128) != 0 ? false : z10, null);
    }
}
