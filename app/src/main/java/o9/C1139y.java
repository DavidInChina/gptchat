package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: O9.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139y {
    public static final C1137x Companion = new Object();

    /* renamed from: s  reason: collision with root package name */
    public static final KSerializer[] f13628s = {null, null, null, null, null, null, new C2695d(I0.f13467a, 0), null, null, null, null, null, new C2695d(F0.f13458a, 0), null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final C1116m f13629a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13630b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f13631c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f13632d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f13633e;

    /* renamed from: f  reason: collision with root package name */
    public final H f13634f;

    /* renamed from: g  reason: collision with root package name */
    public final List f13635g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13636h;

    /* renamed from: i  reason: collision with root package name */
    public final kotlinx.serialization.json.a f13637i;

    /* renamed from: j  reason: collision with root package name */
    public final String f13638j;

    /* renamed from: k  reason: collision with root package name */
    public final W0 f13639k;

    /* renamed from: l  reason: collision with root package name */
    public final String f13640l;

    /* renamed from: m  reason: collision with root package name */
    public final List f13641m;

    /* renamed from: n  reason: collision with root package name */
    public final y1 f13642n;

    /* renamed from: o  reason: collision with root package name */
    public final B0 f13643o;

    /* renamed from: p  reason: collision with root package name */
    public final C1140y0 f13644p;

    /* renamed from: q  reason: collision with root package name */
    public final Q f13645q;

    /* renamed from: r  reason: collision with root package name */
    public final String f13646r;

    public C1139y(int i10, C1116m c1116m, String str, Boolean bool, Boolean bool2, Boolean bool3, H h10, List list, String str2, kotlinx.serialization.json.a aVar, String str3, W0 w02, String str4, List list2, y1 y1Var, B0 b02, C1140y0 c1140y0, Q q10, String str5) {
        C1116m c1116m2;
        if ((i10 & 1) == 0) {
            C1112k c1112k = EnumC1114l.Companion;
            c1116m2 = new C1116m();
        } else {
            c1116m2 = c1116m;
        }
        this.f13629a = c1116m2;
        if ((i10 & 2) == 0) {
            this.f13630b = null;
        } else {
            this.f13630b = str;
        }
        if ((i10 & 4) == 0) {
            this.f13631c = null;
        } else {
            this.f13631c = bool;
        }
        if ((i10 & 8) == 0) {
            this.f13632d = null;
        } else {
            this.f13632d = bool2;
        }
        if ((i10 & 16) == 0) {
            this.f13633e = null;
        } else {
            this.f13633e = bool3;
        }
        if ((i10 & 32) == 0) {
            this.f13634f = null;
        } else {
            this.f13634f = h10;
        }
        this.f13635g = (i10 & 64) == 0 ? kf.v.f37483Y : list;
        if ((i10 & 128) == 0) {
            this.f13636h = null;
        } else {
            this.f13636h = str2;
        }
        if ((i10 & 256) == 0) {
            this.f13637i = null;
        } else {
            this.f13637i = aVar;
        }
        if ((i10 & 512) == 0) {
            this.f13638j = null;
        } else {
            this.f13638j = str3;
        }
        if ((i10 & 1024) == 0) {
            this.f13639k = null;
        } else {
            this.f13639k = w02;
        }
        if ((i10 & 2048) == 0) {
            this.f13640l = null;
        } else {
            this.f13640l = str4;
        }
        if ((i10 & 4096) == 0) {
            this.f13641m = null;
        } else {
            this.f13641m = list2;
        }
        if ((i10 & 8192) == 0) {
            this.f13642n = null;
        } else {
            this.f13642n = y1Var;
        }
        if ((i10 & 16384) == 0) {
            this.f13643o = null;
        } else {
            this.f13643o = b02;
        }
        if ((32768 & i10) == 0) {
            this.f13644p = null;
        } else {
            this.f13644p = c1140y0;
        }
        if ((65536 & i10) == 0) {
            this.f13645q = null;
        } else {
            this.f13645q = q10;
        }
        if ((i10 & 131072) == 0) {
            this.f13646r = null;
        } else {
            this.f13646r = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1139y)) {
            return false;
        }
        C1139y c1139y = (C1139y) obj;
        if (!AbstractC3557B.K(this.f13629a, c1139y.f13629a) || !AbstractC3557B.K(this.f13630b, c1139y.f13630b) || !AbstractC3557B.K(this.f13631c, c1139y.f13631c) || !AbstractC3557B.K(this.f13632d, c1139y.f13632d) || !AbstractC3557B.K(this.f13633e, c1139y.f13633e) || !AbstractC3557B.K(this.f13634f, c1139y.f13634f) || !AbstractC3557B.K(this.f13635g, c1139y.f13635g) || !AbstractC3557B.K(this.f13636h, c1139y.f13636h) || !AbstractC3557B.K(this.f13637i, c1139y.f13637i) || !AbstractC3557B.K(this.f13638j, c1139y.f13638j) || !AbstractC3557B.K(this.f13639k, c1139y.f13639k)) {
            return false;
        }
        String str = this.f13640l;
        String str2 = c1139y.f13640l;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (!AbstractC3557B.K(this.f13641m, c1139y.f13641m) || !AbstractC3557B.K(this.f13642n, c1139y.f13642n) || !AbstractC3557B.K(this.f13643o, c1139y.f13643o) || !AbstractC3557B.K(this.f13644p, c1139y.f13644p) || !AbstractC3557B.K(this.f13645q, c1139y.f13645q)) {
            return false;
        }
        String str3 = this.f13646r;
        String str4 = c1139y.f13646r;
        if (str3 != null ? str4 != null && AbstractC3557B.K(str3, str4) : str4 == null) {
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
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = 0;
        C1116m c1116m = this.f13629a;
        if (c1116m == null) {
            i10 = 0;
        } else {
            i10 = c1116m.f13559a.hashCode();
        }
        int i28 = i10 * 31;
        String str = this.f13630b;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i29 = (i28 + i11) * 31;
        Boolean bool = this.f13631c;
        if (bool == null) {
            i12 = 0;
        } else {
            i12 = bool.hashCode();
        }
        int i30 = (i29 + i12) * 31;
        Boolean bool2 = this.f13632d;
        if (bool2 == null) {
            i13 = 0;
        } else {
            i13 = bool2.hashCode();
        }
        int i31 = (i30 + i13) * 31;
        Boolean bool3 = this.f13633e;
        if (bool3 == null) {
            i14 = 0;
        } else {
            i14 = bool3.hashCode();
        }
        int i32 = (i31 + i14) * 31;
        H h10 = this.f13634f;
        if (h10 == null) {
            i15 = 0;
        } else {
            i15 = h10.hashCode();
        }
        int i33 = (i32 + i15) * 31;
        List list = this.f13635g;
        if (list == null) {
            i16 = 0;
        } else {
            i16 = list.hashCode();
        }
        int i34 = (i33 + i16) * 31;
        String str2 = this.f13636h;
        if (str2 == null) {
            i17 = 0;
        } else {
            i17 = str2.hashCode();
        }
        int i35 = (i34 + i17) * 31;
        kotlinx.serialization.json.a aVar = this.f13637i;
        if (aVar == null) {
            i18 = 0;
        } else {
            i18 = aVar.f37661Y.hashCode();
        }
        int i36 = (i35 + i18) * 31;
        String str3 = this.f13638j;
        if (str3 == null) {
            i19 = 0;
        } else {
            i19 = str3.hashCode();
        }
        int i37 = (i36 + i19) * 31;
        W0 w02 = this.f13639k;
        if (w02 == null) {
            i20 = 0;
        } else {
            i20 = w02.f13507a.hashCode();
        }
        int i38 = (i37 + i20) * 31;
        String str4 = this.f13640l;
        if (str4 == null) {
            i21 = 0;
        } else {
            i21 = str4.hashCode();
        }
        int i39 = (i38 + i21) * 31;
        List list2 = this.f13641m;
        if (list2 == null) {
            i22 = 0;
        } else {
            i22 = list2.hashCode();
        }
        int i40 = (i39 + i22) * 31;
        y1 y1Var = this.f13642n;
        if (y1Var == null) {
            i23 = 0;
        } else {
            i23 = y1Var.hashCode();
        }
        int i41 = (i40 + i23) * 31;
        B0 b02 = this.f13643o;
        if (b02 == null) {
            i24 = 0;
        } else {
            i24 = b02.hashCode();
        }
        int i42 = (i41 + i24) * 31;
        C1140y0 c1140y0 = this.f13644p;
        if (c1140y0 == null) {
            i25 = 0;
        } else {
            i25 = c1140y0.hashCode();
        }
        int i43 = (i42 + i25) * 31;
        Q q10 = this.f13645q;
        if (q10 == null) {
            i26 = 0;
        } else {
            i26 = q10.hashCode();
        }
        int i44 = (i43 + i26) * 31;
        String str5 = this.f13646r;
        if (str5 != null) {
            i27 = str5.hashCode();
        }
        return i44 + i27;
    }

    public final String toString() {
        String str;
        String str2 = "null";
        String str3 = this.f13640l;
        if (str3 == null) {
            str = str2;
        } else {
            str = wd.y0.a(str3);
        }
        String str4 = this.f13646r;
        if (str4 != null) {
            str2 = wd.O.a(str4);
        }
        return "ApiConversationMessageMetadata(finishDetails=" + this.f13629a + ", modelSlug=" + this.f13630b + ", isUserSystemMessage=" + this.f13631c + ", isVisuallyHiddenFromConversation=" + this.f13632d + ", excludeAfterNextUserMessage=" + this.f13633e + ", userContextMessageData=" + this.f13634f + ", citations=" + this.f13635g + ", command=" + this.f13636h + ", args=" + this.f13637i + ", status=" + this.f13638j + ", tetherCitations=" + this.f13639k + ", sharedConversationId=" + str + ", attachments=" + this.f13641m + ", dalleAttachment=" + this.f13642n + ", aggregateResult=" + this.f13643o + ", jitPluginData=" + this.f13644p + ", invokedPlugin=" + this.f13645q + ", gizmoId=" + str2 + Separators.RPAREN;
    }

    public C1139y(ArrayList arrayList, y1 y1Var, C1140y0 c1140y0, String str, int i10) {
        C1112k c1112k = EnumC1114l.Companion;
        C1116m c1116m = new C1116m();
        kf.v vVar = kf.v.f37483Y;
        arrayList = (i10 & 4096) != 0 ? null : arrayList;
        y1Var = (i10 & 8192) != 0 ? null : y1Var;
        c1140y0 = (32768 & i10) != 0 ? null : c1140y0;
        str = (i10 & 131072) != 0 ? null : str;
        this.f13629a = c1116m;
        this.f13630b = null;
        this.f13631c = null;
        this.f13632d = null;
        this.f13633e = null;
        this.f13634f = null;
        this.f13635g = vVar;
        this.f13636h = null;
        this.f13637i = null;
        this.f13638j = null;
        this.f13639k = null;
        this.f13640l = null;
        this.f13641m = arrayList;
        this.f13642n = y1Var;
        this.f13643o = null;
        this.f13644p = c1140y0;
        this.f13645q = null;
        this.f13646r = str;
    }
}
