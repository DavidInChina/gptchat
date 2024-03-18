package vc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: vc.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6019i {
    public static final C6018h Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f47450a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f47451b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f47452c;

    /* renamed from: d  reason: collision with root package name */
    public final String f47453d;

    /* renamed from: e  reason: collision with root package name */
    public final String f47454e;

    public C6019i(int i10, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f47450a = null;
        } else {
            this.f47450a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f47451b = null;
        } else {
            this.f47451b = bool2;
        }
        if ((i10 & 4) == 0) {
            this.f47452c = null;
        } else {
            this.f47452c = bool3;
        }
        if ((i10 & 8) == 0) {
            this.f47453d = null;
        } else {
            this.f47453d = str;
        }
        if ((i10 & 16) == 0) {
            this.f47454e = null;
        } else {
            this.f47454e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6019i)) {
            return false;
        }
        C6019i c6019i = (C6019i) obj;
        if (AbstractC3557B.K(this.f47450a, c6019i.f47450a) && AbstractC3557B.K(this.f47451b, c6019i.f47451b) && AbstractC3557B.K(this.f47452c, c6019i.f47452c) && AbstractC3557B.K(this.f47453d, c6019i.f47453d) && AbstractC3557B.K(this.f47454e, c6019i.f47454e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        Boolean bool = this.f47450a;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int i15 = i10 * 31;
        Boolean bool2 = this.f47451b;
        if (bool2 == null) {
            i11 = 0;
        } else {
            i11 = bool2.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        Boolean bool3 = this.f47452c;
        if (bool3 == null) {
            i12 = 0;
        } else {
            i12 = bool3.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        String str = this.f47453d;
        if (str == null) {
            i13 = 0;
        } else {
            i13 = str.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        String str2 = this.f47454e;
        if (str2 != null) {
            i14 = str2.hashCode();
        }
        return i18 + i14;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiUserSettingsSettings(memory=");
        sb2.append(this.f47450a);
        sb2.append(", trainingAllowed=");
        sb2.append(this.f47451b);
        sb2.append(", voiceTrainingAllowed=");
        sb2.append(this.f47452c);
        sb2.append(", voiceName=");
        sb2.append(this.f47453d);
        sb2.append(", voiceMainLanguage=");
        return R.a.t(sb2, this.f47454e, Separators.RPAREN);
    }
}
