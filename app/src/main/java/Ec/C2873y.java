package ec;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6189g;
import wd.o0;

/* renamed from: ec.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2873y implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final zd.n f29266a;

    /* renamed from: b  reason: collision with root package name */
    public final o0 f29267b;

    /* renamed from: c  reason: collision with root package name */
    public final o0 f29268c;

    /* renamed from: d  reason: collision with root package name */
    public final o0 f29269d;

    /* renamed from: e  reason: collision with root package name */
    public final o0 f29270e;

    /* renamed from: f  reason: collision with root package name */
    public final C6189g f29271f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f29272g;

    /* renamed from: h  reason: collision with root package name */
    public final Boolean f29273h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f29274i;

    /* renamed from: j  reason: collision with root package name */
    public final Boolean f29275j;

    public C2873y(zd.n nVar, o0 o0Var, o0 o0Var2, o0 o0Var3, o0 o0Var4, C6189g c6189g, boolean z10, Boolean bool, boolean z11, Boolean bool2) {
        this.f29266a = nVar;
        this.f29267b = o0Var;
        this.f29268c = o0Var2;
        this.f29269d = o0Var3;
        this.f29270e = o0Var4;
        this.f29271f = c6189g;
        this.f29272g = z10;
        this.f29273h = bool;
        this.f29274i = z11;
        this.f29275j = bool2;
    }

    public static C2873y e(C2873y c2873y, zd.n nVar, o0 o0Var, o0 o0Var2, o0 o0Var3, o0 o0Var4, C6189g c6189g, Boolean bool, Boolean bool2, int i10) {
        zd.n nVar2;
        o0 o0Var5;
        o0 o0Var6;
        o0 o0Var7;
        o0 o0Var8;
        C6189g c6189g2;
        Boolean bool3;
        Boolean bool4;
        if ((i10 & 1) != 0) {
            nVar2 = c2873y.f29266a;
        } else {
            nVar2 = nVar;
        }
        if ((i10 & 2) != 0) {
            o0Var5 = c2873y.f29267b;
        } else {
            o0Var5 = o0Var;
        }
        if ((i10 & 4) != 0) {
            o0Var6 = c2873y.f29268c;
        } else {
            o0Var6 = o0Var2;
        }
        if ((i10 & 8) != 0) {
            o0Var7 = c2873y.f29269d;
        } else {
            o0Var7 = o0Var3;
        }
        if ((i10 & 16) != 0) {
            o0Var8 = c2873y.f29270e;
        } else {
            o0Var8 = o0Var4;
        }
        if ((i10 & 32) != 0) {
            c6189g2 = c2873y.f29271f;
        } else {
            c6189g2 = c6189g;
        }
        boolean z10 = c2873y.f29272g;
        if ((i10 & 128) != 0) {
            bool3 = c2873y.f29273h;
        } else {
            bool3 = bool;
        }
        boolean z11 = c2873y.f29274i;
        if ((i10 & 512) != 0) {
            bool4 = c2873y.f29275j;
        } else {
            bool4 = bool2;
        }
        c2873y.getClass();
        return new C2873y(nVar2, o0Var5, o0Var6, o0Var7, o0Var8, c6189g2, z10, bool3, z11, bool4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2873y)) {
            return false;
        }
        C2873y c2873y = (C2873y) obj;
        if (AbstractC3557B.K(this.f29266a, c2873y.f29266a) && AbstractC3557B.K(this.f29267b, c2873y.f29267b) && AbstractC3557B.K(this.f29268c, c2873y.f29268c) && AbstractC3557B.K(this.f29269d, c2873y.f29269d) && AbstractC3557B.K(this.f29270e, c2873y.f29270e) && AbstractC3557B.K(this.f29271f, c2873y.f29271f) && this.f29272g == c2873y.f29272g && AbstractC3557B.K(this.f29273h, c2873y.f29273h) && this.f29274i == c2873y.f29274i && AbstractC3557B.K(this.f29275j, c2873y.f29275j)) {
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
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        zd.n nVar = this.f29266a;
        if (nVar == null) {
            i10 = 0;
        } else {
            i10 = nVar.hashCode();
        }
        int i19 = i10 * 31;
        o0 o0Var = this.f29267b;
        if (o0Var == null) {
            i11 = 0;
        } else {
            i11 = o0Var.hashCode();
        }
        int i20 = (i19 + i11) * 31;
        o0 o0Var2 = this.f29268c;
        if (o0Var2 == null) {
            i12 = 0;
        } else {
            i12 = o0Var2.hashCode();
        }
        int i21 = (i20 + i12) * 31;
        o0 o0Var3 = this.f29269d;
        if (o0Var3 == null) {
            i13 = 0;
        } else {
            i13 = o0Var3.hashCode();
        }
        int i22 = (i21 + i13) * 31;
        o0 o0Var4 = this.f29270e;
        if (o0Var4 == null) {
            i14 = 0;
        } else {
            i14 = o0Var4.hashCode();
        }
        int i23 = (i22 + i14) * 31;
        C6189g c6189g = this.f29271f;
        if (c6189g == null) {
            i15 = 0;
        } else {
            i15 = c6189g.hashCode();
        }
        int i24 = (i23 + i15) * 31;
        int i25 = 1237;
        if (this.f29272g) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        int i26 = (i24 + i16) * 31;
        Boolean bool = this.f29273h;
        if (bool == null) {
            i17 = 0;
        } else {
            i17 = bool.hashCode();
        }
        int i27 = (i26 + i17) * 31;
        if (this.f29274i) {
            i25 = 1231;
        }
        int i28 = (i27 + i25) * 31;
        Boolean bool2 = this.f29275j;
        if (bool2 != null) {
            i18 = bool2.hashCode();
        }
        return i28 + i18;
    }

    public final String toString() {
        return "DataControlsState(userSettings=" + this.f29266a + ", clearHistoryProgress=" + this.f29267b + ", archiveHistoryProgress=" + this.f29268c + ", exportDataProgress=" + this.f29269d + ", deleteAccountProgress=" + this.f29270e + ", account=" + this.f29271f + ", memoryExperienceEnabled=" + this.f29272g + ", trainingAllowed=" + this.f29273h + ", voiceTrainingSettingEnabled=" + this.f29274i + ", voiceTrainingAllowed=" + this.f29275j + Separators.RPAREN;
    }
}
