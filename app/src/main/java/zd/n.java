package zd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class n {
    public static final m Companion = new Object();

    /* renamed from: m  reason: collision with root package name */
    public static final KSerializer[] f51981m = {null, null, P4.a.E("com.openai.user.model.NightMode", d.values()), null, null, null, null, null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f51982a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51983b;

    /* renamed from: c  reason: collision with root package name */
    public final d f51984c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f51985d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f51986e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f51987f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f51988g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f51989h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f51990i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f51991j;

    /* renamed from: k  reason: collision with root package name */
    public final String f51992k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f51993l;

    public n(boolean z10, String str, d dVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str2, boolean z18) {
        AbstractC3557B.c0("nightMode", dVar);
        this.f51982a = z10;
        this.f51983b = str;
        this.f51984c = dVar;
        this.f51985d = z11;
        this.f51986e = z12;
        this.f51987f = z13;
        this.f51988g = z14;
        this.f51989h = z15;
        this.f51990i = z16;
        this.f51991j = z17;
        this.f51992k = str2;
        this.f51993l = z18;
    }

    public static n a(n nVar, boolean z10, d dVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str, boolean z17, int i10) {
        boolean z18 = (i10 & 1) != 0 ? nVar.f51982a : z10;
        String str2 = nVar.f51983b;
        d dVar2 = (i10 & 4) != 0 ? nVar.f51984c : dVar;
        boolean z19 = (i10 & 8) != 0 ? nVar.f51985d : z11;
        boolean z20 = (i10 & 16) != 0 ? nVar.f51986e : z12;
        boolean z21 = (i10 & 32) != 0 ? nVar.f51987f : z13;
        boolean z22 = (i10 & 64) != 0 ? nVar.f51988g : z14;
        boolean z23 = nVar.f51989h;
        boolean z24 = (i10 & 256) != 0 ? nVar.f51990i : z15;
        boolean z25 = (i10 & 512) != 0 ? nVar.f51991j : z16;
        String str3 = (i10 & 1024) != 0 ? nVar.f51992k : str;
        boolean z26 = (i10 & 2048) != 0 ? nVar.f51993l : z17;
        nVar.getClass();
        AbstractC3557B.c0("nightMode", dVar2);
        return new n(z18, str2, dVar2, z19, z20, z21, z22, z23, z24, z25, str3, z26);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f51982a == nVar.f51982a && AbstractC3557B.K(this.f51983b, nVar.f51983b) && this.f51984c == nVar.f51984c && this.f51985d == nVar.f51985d && this.f51986e == nVar.f51986e && this.f51987f == nVar.f51987f && this.f51988g == nVar.f51988g && this.f51989h == nVar.f51989h && this.f51990i == nVar.f51990i && this.f51991j == nVar.f51991j && AbstractC3557B.K(this.f51992k, nVar.f51992k) && this.f51993l == nVar.f51993l) {
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
        int i19 = 1237;
        if (this.f51982a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i20 = i10 * 31;
        int i21 = 0;
        String str = this.f51983b;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int hashCode = (this.f51984c.hashCode() + ((i20 + i11) * 31)) * 31;
        if (this.f51985d) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i22 = (hashCode + i12) * 31;
        if (this.f51986e) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i23 = (i22 + i13) * 31;
        if (this.f51987f) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i24 = (i23 + i14) * 31;
        if (this.f51988g) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i25 = (i24 + i15) * 31;
        if (this.f51989h) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        int i26 = (i25 + i16) * 31;
        if (this.f51990i) {
            i17 = 1231;
        } else {
            i17 = 1237;
        }
        int i27 = (i26 + i17) * 31;
        if (this.f51991j) {
            i18 = 1231;
        } else {
            i18 = 1237;
        }
        int i28 = (i27 + i18) * 31;
        String str2 = this.f51992k;
        if (str2 != null) {
            i21 = str2.hashCode();
        }
        int i29 = (i28 + i21) * 31;
        if (this.f51993l) {
            i19 = 1231;
        }
        return i29 + i19;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserSettings(historyDisabled=");
        sb2.append(this.f51982a);
        sb2.append(", languageCode=");
        sb2.append(this.f51983b);
        sb2.append(", nightMode=");
        sb2.append(this.f51984c);
        sb2.append(", seenDisclosures=");
        sb2.append(this.f51985d);
        sb2.append(", seenCustomInstructionsIntroduction=");
        sb2.append(this.f51986e);
        sb2.append(", seenVisionDisclosure=");
        sb2.append(this.f51987f);
        sb2.append(", seenMemoryDisclosure=");
        sb2.append(this.f51988g);
        sb2.append(", hasSeenVoiceDisclosure=");
        sb2.append(this.f51989h);
        sb2.append(", hasSeenVoiceIntro=");
        sb2.append(this.f51990i);
        sb2.append(", hasSeenVoiceSelection=");
        sb2.append(this.f51991j);
        sb2.append(", lastShownTooltipText=");
        sb2.append(this.f51992k);
        sb2.append(", hapticEnabled=");
        return AbstractC4194d.w(sb2, this.f51993l, Separators.RPAREN);
    }

    public n(int i10, boolean z10, String str, d dVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str2, boolean z18) {
        if ((i10 & 1) == 0) {
            this.f51982a = false;
        } else {
            this.f51982a = z10;
        }
        if ((i10 & 2) == 0) {
            this.f51983b = null;
        } else {
            this.f51983b = str;
        }
        if ((i10 & 4) == 0) {
            this.f51984c = d.f51960Y;
        } else {
            this.f51984c = dVar;
        }
        if ((i10 & 8) == 0) {
            this.f51985d = false;
        } else {
            this.f51985d = z11;
        }
        if ((i10 & 16) == 0) {
            this.f51986e = false;
        } else {
            this.f51986e = z12;
        }
        if ((i10 & 32) == 0) {
            this.f51987f = false;
        } else {
            this.f51987f = z13;
        }
        if ((i10 & 64) == 0) {
            this.f51988g = false;
        } else {
            this.f51988g = z14;
        }
        if ((i10 & 128) == 0) {
            this.f51989h = false;
        } else {
            this.f51989h = z15;
        }
        if ((i10 & 256) == 0) {
            this.f51990i = false;
        } else {
            this.f51990i = z16;
        }
        if ((i10 & 512) == 0) {
            this.f51991j = false;
        } else {
            this.f51991j = z17;
        }
        if ((i10 & 1024) == 0) {
            this.f51992k = null;
        } else {
            this.f51992k = str2;
        }
        if ((i10 & 2048) == 0) {
            this.f51993l = true;
        } else {
            this.f51993l = z18;
        }
    }
}
