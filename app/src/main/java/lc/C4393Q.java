package lc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6205s;

/* renamed from: lc.Q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4393Q implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final C6205s f38112a;

    /* renamed from: b  reason: collision with root package name */
    public final xd.e f38113b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f38114c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f38115d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f38116e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f38117f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f38118g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f38119h;

    /* renamed from: i  reason: collision with root package name */
    public final Ed.i f38120i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f38121j;

    /* renamed from: k  reason: collision with root package name */
    public final Ec.o f38122k;

    /* renamed from: l  reason: collision with root package name */
    public final zd.n f38123l;

    public C4393Q(C6205s c6205s, xd.e eVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Ed.i iVar, boolean z16, Ec.o oVar, zd.n nVar) {
        AbstractC3557B.c0("whisperLanguage", oVar);
        this.f38112a = c6205s;
        this.f38113b = eVar;
        this.f38114c = z10;
        this.f38115d = z11;
        this.f38116e = z12;
        this.f38117f = z13;
        this.f38118g = z14;
        this.f38119h = z15;
        this.f38120i = iVar;
        this.f38121j = z16;
        this.f38122k = oVar;
        this.f38123l = nVar;
    }

    public static C4393Q e(C4393Q c4393q, C6205s c6205s, xd.e eVar, boolean z10, boolean z11, boolean z12, Ed.i iVar, boolean z13, Ec.o oVar, zd.n nVar, int i10) {
        C6205s c6205s2;
        xd.e eVar2;
        boolean z14;
        boolean z15;
        boolean z16;
        Ed.i iVar2;
        boolean z17;
        Ec.o oVar2;
        zd.n nVar2;
        if ((i10 & 1) != 0) {
            c6205s2 = c4393q.f38112a;
        } else {
            c6205s2 = c6205s;
        }
        if ((i10 & 2) != 0) {
            eVar2 = c4393q.f38113b;
        } else {
            eVar2 = eVar;
        }
        boolean z18 = c4393q.f38114c;
        if ((i10 & 8) != 0) {
            z14 = c4393q.f38115d;
        } else {
            z14 = z10;
        }
        boolean z19 = c4393q.f38116e;
        if ((i10 & 32) != 0) {
            z15 = c4393q.f38117f;
        } else {
            z15 = z11;
        }
        if ((i10 & 64) != 0) {
            z16 = c4393q.f38118g;
        } else {
            z16 = z12;
        }
        boolean z20 = c4393q.f38119h;
        if ((i10 & 256) != 0) {
            iVar2 = c4393q.f38120i;
        } else {
            iVar2 = iVar;
        }
        if ((i10 & 512) != 0) {
            z17 = c4393q.f38121j;
        } else {
            z17 = z13;
        }
        if ((i10 & 1024) != 0) {
            oVar2 = c4393q.f38122k;
        } else {
            oVar2 = oVar;
        }
        if ((i10 & 2048) != 0) {
            nVar2 = c4393q.f38123l;
        } else {
            nVar2 = nVar;
        }
        c4393q.getClass();
        AbstractC3557B.c0("whisperLanguage", oVar2);
        return new C4393Q(c6205s2, eVar2, z18, z14, z19, z15, z16, z20, iVar2, z17, oVar2, nVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4393Q)) {
            return false;
        }
        C4393Q c4393q = (C4393Q) obj;
        if (AbstractC3557B.K(this.f38112a, c4393q.f38112a) && AbstractC3557B.K(this.f38113b, c4393q.f38113b) && this.f38114c == c4393q.f38114c && this.f38115d == c4393q.f38115d && this.f38116e == c4393q.f38116e && this.f38117f == c4393q.f38117f && this.f38118g == c4393q.f38118g && this.f38119h == c4393q.f38119h && this.f38120i == c4393q.f38120i && this.f38121j == c4393q.f38121j && this.f38122k == c4393q.f38122k && AbstractC3557B.K(this.f38123l, c4393q.f38123l)) {
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
        int i18;
        int i19 = 0;
        C6205s c6205s = this.f38112a;
        if (c6205s == null) {
            i10 = 0;
        } else {
            i10 = c6205s.hashCode();
        }
        int i20 = i10 * 31;
        xd.e eVar = this.f38113b;
        if (eVar == null) {
            i11 = 0;
        } else {
            i11 = eVar.hashCode();
        }
        int i21 = (i20 + i11) * 31;
        int i22 = 1237;
        if (this.f38114c) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i23 = (i21 + i12) * 31;
        if (this.f38115d) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i24 = (i23 + i13) * 31;
        if (this.f38116e) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i25 = (i24 + i14) * 31;
        if (this.f38117f) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i26 = (i25 + i15) * 31;
        if (this.f38118g) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        int i27 = (i26 + i16) * 31;
        if (this.f38119h) {
            i17 = 1231;
        } else {
            i17 = 1237;
        }
        int i28 = (i27 + i17) * 31;
        Ed.i iVar = this.f38120i;
        if (iVar == null) {
            i18 = 0;
        } else {
            i18 = iVar.hashCode();
        }
        int i29 = (i28 + i18) * 31;
        if (this.f38121j) {
            i22 = 1231;
        }
        int hashCode = (this.f38122k.hashCode() + ((i29 + i22) * 31)) * 31;
        zd.n nVar = this.f38123l;
        if (nVar != null) {
            i19 = nVar.hashCode();
        }
        return hashCode + i19;
    }

    public final String toString() {
        return "SettingsState(accountUser=" + this.f38112a + ", accountUserState=" + this.f38113b + ", hapticsAvailable=" + this.f38114c + ", customInstructionsAvailable=" + this.f38115d + ", easterEggDisabled=" + this.f38116e + ", betaFeaturesAvailable=" + this.f38117f + ", badgeBetaFeatures=" + this.f38118g + ", voiceAvailable=" + this.f38119h + ", selectedVoice=" + this.f38120i + ", memoryAvailable=" + this.f38121j + ", whisperLanguage=" + this.f38122k + ", userSettings=" + this.f38123l + Separators.RPAREN;
    }
}
