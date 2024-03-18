package nc;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;
import ja.C3931c;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import wd.y0;

/* loaded from: classes.dex */
public final class z implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f40263a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40264b;

    /* renamed from: c  reason: collision with root package name */
    public final Yg.p f40265c;

    /* renamed from: d  reason: collision with root package name */
    public final C3931c f40266d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f40267e;

    /* renamed from: f  reason: collision with root package name */
    public final C3931c f40268f;

    /* renamed from: g  reason: collision with root package name */
    public final List f40269g;

    /* renamed from: h  reason: collision with root package name */
    public final C2334C f40270h;

    /* renamed from: i  reason: collision with root package name */
    public final String f40271i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f40272j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f40273k;

    public z(boolean z10, String str, Yg.p pVar, C3931c c3931c, boolean z11, C3931c c3931c2, List list, C2334C c2334c, String str2, boolean z12) {
        AbstractC3557B.c0("conversationItems", list);
        this.f40263a = z10;
        this.f40264b = str;
        this.f40265c = pVar;
        this.f40266d = c3931c;
        this.f40267e = z11;
        this.f40268f = c3931c2;
        this.f40269g = list;
        this.f40270h = c2334c;
        this.f40271i = str2;
        this.f40272j = z12;
        boolean z13 = true;
        if (!z12 && (c2334c == null || !c2334c.f26447j)) {
            z13 = false;
        }
        this.f40273k = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    public static z e(z zVar, String str, Yg.p pVar, C3931c c3931c, boolean z10, C3931c c3931c2, ArrayList arrayList, C2334C c2334c, String str2, int i10) {
        boolean z11;
        String str3;
        Yg.p pVar2;
        C3931c c3931c3;
        boolean z12;
        C3931c c3931c4;
        ArrayList arrayList2;
        C2334C c2334c2;
        String str4;
        if ((i10 & 1) != 0) {
            z11 = zVar.f40263a;
        } else {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i10 & 2) != 0) {
            str3 = zVar.f40264b;
        } else {
            str3 = str;
        }
        if ((i10 & 4) != 0) {
            pVar2 = zVar.f40265c;
        } else {
            pVar2 = pVar;
        }
        if ((i10 & 8) != 0) {
            c3931c3 = zVar.f40266d;
        } else {
            c3931c3 = c3931c;
        }
        if ((i10 & 16) != 0) {
            z12 = zVar.f40267e;
        } else {
            z12 = z10;
        }
        if ((i10 & 32) != 0) {
            c3931c4 = zVar.f40268f;
        } else {
            c3931c4 = c3931c2;
        }
        if ((i10 & 64) != 0) {
            arrayList2 = zVar.f40269g;
        } else {
            arrayList2 = arrayList;
        }
        if ((i10 & 128) != 0) {
            c2334c2 = zVar.f40270h;
        } else {
            c2334c2 = c2334c;
        }
        if ((i10 & 256) != 0) {
            str4 = zVar.f40271i;
        } else {
            str4 = str2;
        }
        boolean z14 = zVar.f40272j;
        zVar.getClass();
        AbstractC3557B.c0("conversationItems", arrayList2);
        return new z(z13, str3, pVar2, c3931c3, z12, c3931c4, arrayList2, c2334c2, str4, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f40263a != zVar.f40263a || !AbstractC3557B.K(this.f40264b, zVar.f40264b) || !AbstractC3557B.K(this.f40265c, zVar.f40265c) || !AbstractC3557B.K(this.f40266d, zVar.f40266d) || this.f40267e != zVar.f40267e || !AbstractC3557B.K(this.f40268f, zVar.f40268f) || !AbstractC3557B.K(this.f40269g, zVar.f40269g) || !AbstractC3557B.K(this.f40270h, zVar.f40270h)) {
            return false;
        }
        String str = this.f40271i;
        String str2 = zVar.f40271i;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (this.f40272j == zVar.f40272j) {
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
        int i17 = 1237;
        if (this.f40263a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i18 = i10 * 31;
        int i19 = 0;
        String str = this.f40264b;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i20 = (i18 + i11) * 31;
        Yg.p pVar = this.f40265c;
        if (pVar == null) {
            i12 = 0;
        } else {
            i12 = pVar.f22419Y.hashCode();
        }
        int i21 = (i20 + i12) * 31;
        C3931c c3931c = this.f40266d;
        if (c3931c == null) {
            i13 = 0;
        } else {
            i13 = c3931c.hashCode();
        }
        int i22 = (i21 + i13) * 31;
        if (this.f40267e) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i23 = (i22 + i14) * 31;
        C3931c c3931c2 = this.f40268f;
        if (c3931c2 == null) {
            i15 = 0;
        } else {
            i15 = c3931c2.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f40269g, (i23 + i15) * 31, 31);
        C2334C c2334c = this.f40270h;
        if (c2334c == null) {
            i16 = 0;
        } else {
            i16 = c2334c.hashCode();
        }
        int i24 = (s10 + i16) * 31;
        String str2 = this.f40271i;
        if (str2 != null) {
            i19 = str2.hashCode();
        }
        int i25 = (i24 + i19) * 31;
        if (this.f40272j) {
            i17 = 1231;
        }
        return i25 + i17;
    }

    public final String toString() {
        String str;
        String str2 = this.f40271i;
        if (str2 == null) {
            str = "null";
        } else {
            str = y0.a(str2);
        }
        return "ViewSharedConversationState(loading=" + this.f40263a + ", title=" + this.f40264b + ", conversationTimestamp=" + this.f40265c + ", originalContributor=" + this.f40266d + ", usesCustomInstructions=" + this.f40267e + ", assistantContributor=" + this.f40268f + ", conversationItems=" + this.f40269g + ", gizmo=" + this.f40270h + ", sharedConversationId=" + str + ", conversationsAreReportable=" + this.f40272j + Separators.RPAREN;
    }
}
