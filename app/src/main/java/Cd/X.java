package Cd;

import Kd.C0834j;
import aa.C1939b;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import wd.C6168C;

/* loaded from: classes.dex */
public final class X implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f3026a;

    /* renamed from: b  reason: collision with root package name */
    public final U3.f f3027b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3028c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3029d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3030e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3031f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3032g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3033h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3034i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3035j;

    /* renamed from: k  reason: collision with root package name */
    public final List f3036k;

    /* renamed from: l  reason: collision with root package name */
    public final C1939b f3037l;

    /* renamed from: m  reason: collision with root package name */
    public final Hd.b f3038m;

    /* renamed from: n  reason: collision with root package name */
    public final EnumC0322g f3039n;

    public /* synthetic */ X(String str, U3.f fVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this(str, (i10 & 2) != 0 ? U.f3023g : fVar, false, (i10 & 8) != 0 ? false : z10, false, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? false : z12, (i10 & 128) != 0 ? false : z13, false, false, kf.v.f37483Y, null, new Hd.b("", "", "", "", "", "", "", C0834j.f9747a, Dd.N.f3525Z, 0L, 0L, 0, 0, "", "", "", "", "", "", false, new ArrayList(), new ArrayList(), null));
    }

    public static X e(X x10, String str, U3.f fVar, boolean z10, boolean z11, boolean z12, boolean z13, List list, C1939b c1939b, Hd.b bVar, int i10) {
        String str2;
        U3.f fVar2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        List list2;
        C1939b c1939b2;
        Hd.b bVar2;
        if ((i10 & 1) != 0) {
            str2 = x10.f3026a;
        } else {
            str2 = str;
        }
        if ((i10 & 2) != 0) {
            fVar2 = x10.f3027b;
        } else {
            fVar2 = fVar;
        }
        boolean z18 = x10.f3028c;
        if ((i10 & 8) != 0) {
            z14 = x10.f3029d;
        } else {
            z14 = z10;
        }
        if ((i10 & 16) != 0) {
            z15 = x10.f3030e;
        } else {
            z15 = z11;
        }
        boolean z19 = x10.f3031f;
        boolean z20 = x10.f3032g;
        boolean z21 = x10.f3033h;
        if ((i10 & 256) != 0) {
            z16 = x10.f3034i;
        } else {
            z16 = z12;
        }
        if ((i10 & 512) != 0) {
            z17 = x10.f3035j;
        } else {
            z17 = z13;
        }
        if ((i10 & 1024) != 0) {
            list2 = x10.f3036k;
        } else {
            list2 = list;
        }
        if ((i10 & 2048) != 0) {
            c1939b2 = x10.f3037l;
        } else {
            c1939b2 = c1939b;
        }
        if ((i10 & 4096) != 0) {
            bVar2 = x10.f3038m;
        } else {
            bVar2 = bVar;
        }
        x10.getClass();
        AbstractC3557B.c0("conversationId", str2);
        AbstractC3557B.c0("state", fVar2);
        AbstractC3557B.c0("contentItems", list2);
        AbstractC3557B.c0("debugVoiceViewState", bVar2);
        return new X(str2, fVar2, z18, z14, z15, z19, z20, z21, z16, z17, list2, c1939b2, bVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        if (AbstractC3557B.K(this.f3026a, x10.f3026a) && AbstractC3557B.K(this.f3027b, x10.f3027b) && this.f3028c == x10.f3028c && this.f3029d == x10.f3029d && this.f3030e == x10.f3030e && this.f3031f == x10.f3031f && this.f3032g == x10.f3032g && this.f3033h == x10.f3033h && this.f3034i == x10.f3034i && this.f3035j == x10.f3035j && AbstractC3557B.K(this.f3036k, x10.f3036k) && AbstractC3557B.K(this.f3037l, x10.f3037l) && AbstractC3557B.K(this.f3038m, x10.f3038m)) {
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
        int hashCode = (this.f3027b.hashCode() + (this.f3026a.hashCode() * 31)) * 31;
        int i18 = 1237;
        if (this.f3028c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i19 = (hashCode + i10) * 31;
        if (this.f3029d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i20 = (i19 + i11) * 31;
        if (this.f3030e) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i21 = (i20 + i12) * 31;
        if (this.f3031f) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i22 = (i21 + i13) * 31;
        if (this.f3032g) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i23 = (i22 + i14) * 31;
        if (this.f3033h) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i24 = (i23 + i15) * 31;
        if (this.f3034i) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        int i25 = (i24 + i16) * 31;
        if (this.f3035j) {
            i18 = 1231;
        }
        int s10 = AbstractC4194d.s(this.f3036k, (i25 + i18) * 31, 31);
        C1939b c1939b = this.f3037l;
        if (c1939b == null) {
            i17 = 0;
        } else {
            i17 = c1939b.hashCode();
        }
        return this.f3038m.hashCode() + ((s10 + i17) * 31);
    }

    public final String toString() {
        String a5 = C6168C.a(this.f3026a);
        return "VoiceViewState(conversationId=" + a5 + ", state=" + this.f3027b + ", muted=" + this.f3028c + ", poorConnectionQuality=" + this.f3029d + ", pressed=" + this.f3030e + ", voiceActionCommandEnabled=" + this.f3031f + ", voiceAttachmentEnabled=" + this.f3032g + ", voiceActionsEnabled=" + this.f3033h + ", showAttachmentsBottomSheet=" + this.f3034i + ", showActionBottomSheet=" + this.f3035j + ", contentItems=" + this.f3036k + ", customAction=" + this.f3037l + ", debugVoiceViewState=" + this.f3038m + Separators.RPAREN;
    }

    public X(String str, U3.f fVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, List list, C1939b c1939b, Hd.b bVar) {
        EnumC0322g enumC0322g;
        AbstractC3557B.c0("conversationId", str);
        AbstractC3557B.c0("state", fVar);
        AbstractC3557B.c0("contentItems", list);
        AbstractC3557B.c0("debugVoiceViewState", bVar);
        this.f3026a = str;
        this.f3027b = fVar;
        this.f3028c = z10;
        this.f3029d = z11;
        this.f3030e = z12;
        this.f3031f = z13;
        this.f3032g = z14;
        this.f3033h = z15;
        this.f3034i = z16;
        this.f3035j = z17;
        this.f3036k = list;
        this.f3037l = c1939b;
        this.f3038m = bVar;
        if (AbstractC3557B.K(fVar, O.f3019g)) {
            enumC0322g = EnumC0322g.f3054h0;
        } else if ((fVar instanceof T) || AbstractC3557B.K(fVar, W.f3025g) || AbstractC3557B.K(fVar, V.f3024g)) {
            enumC0322g = EnumC0322g.f3053Z;
        } else {
            enumC0322g = EnumC0322g.f3052Y;
        }
        this.f3039n = enumC0322g;
    }
}
