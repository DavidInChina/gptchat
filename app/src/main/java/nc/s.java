package nc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import ja.C3931c;
import java.util.List;
import k6.AbstractC4194d;
import wd.K0;

/* loaded from: classes.dex */
public final class s implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f40249a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40250b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f40251c;

    /* renamed from: d  reason: collision with root package name */
    public final List f40252d;

    /* renamed from: e  reason: collision with root package name */
    public final K0 f40253e;

    /* renamed from: f  reason: collision with root package name */
    public final Yg.p f40254f;

    /* renamed from: g  reason: collision with root package name */
    public final C3931c f40255g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f40256h;

    /* renamed from: i  reason: collision with root package name */
    public final String f40257i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f40258j;

    public s(String str, String str2, boolean z10, List list, K0 k02, Yg.p pVar, C3931c c3931c, boolean z11, String str3, boolean z12) {
        AbstractC3557B.c0("conversationItems", list);
        this.f40249a = str;
        this.f40250b = str2;
        this.f40251c = z10;
        this.f40252d = list;
        this.f40253e = k02;
        this.f40254f = pVar;
        this.f40255g = c3931c;
        this.f40256h = z11;
        this.f40257i = str3;
        this.f40258j = z12;
    }

    public static s e(s sVar, String str, String str2, boolean z10, List list, K0 k02, Yg.p pVar, C3931c c3931c, boolean z11, String str3, boolean z12, int i10) {
        String str4;
        String str5;
        boolean z13;
        List list2;
        K0 k03;
        Yg.p pVar2;
        C3931c c3931c2;
        boolean z14;
        String str6;
        boolean z15;
        if ((i10 & 1) != 0) {
            str4 = sVar.f40249a;
        } else {
            str4 = str;
        }
        if ((i10 & 2) != 0) {
            str5 = sVar.f40250b;
        } else {
            str5 = str2;
        }
        if ((i10 & 4) != 0) {
            z13 = sVar.f40251c;
        } else {
            z13 = z10;
        }
        if ((i10 & 8) != 0) {
            list2 = sVar.f40252d;
        } else {
            list2 = list;
        }
        if ((i10 & 16) != 0) {
            k03 = sVar.f40253e;
        } else {
            k03 = k02;
        }
        if ((i10 & 32) != 0) {
            pVar2 = sVar.f40254f;
        } else {
            pVar2 = pVar;
        }
        if ((i10 & 64) != 0) {
            c3931c2 = sVar.f40255g;
        } else {
            c3931c2 = c3931c;
        }
        if ((i10 & 128) != 0) {
            z14 = sVar.f40256h;
        } else {
            z14 = z11;
        }
        if ((i10 & 256) != 0) {
            str6 = sVar.f40257i;
        } else {
            str6 = str3;
        }
        if ((i10 & 512) != 0) {
            z15 = sVar.f40258j;
        } else {
            z15 = z12;
        }
        sVar.getClass();
        AbstractC3557B.c0("conversationItems", list2);
        return new s(str4, str5, z13, list2, k03, pVar2, c3931c2, z14, str6, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3557B.K(this.f40249a, sVar.f40249a) && AbstractC3557B.K(this.f40250b, sVar.f40250b) && this.f40251c == sVar.f40251c && AbstractC3557B.K(this.f40252d, sVar.f40252d) && AbstractC3557B.K(this.f40253e, sVar.f40253e) && AbstractC3557B.K(this.f40254f, sVar.f40254f) && AbstractC3557B.K(this.f40255g, sVar.f40255g) && this.f40256h == sVar.f40256h && AbstractC3557B.K(this.f40257i, sVar.f40257i) && this.f40258j == sVar.f40258j) {
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
        int i17 = 0;
        String str = this.f40249a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i18 = i10 * 31;
        String str2 = this.f40250b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i19 = (i18 + i11) * 31;
        int i20 = 1237;
        if (this.f40251c) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int s10 = AbstractC4194d.s(this.f40252d, (i19 + i12) * 31, 31);
        K0 k02 = this.f40253e;
        if (k02 == null) {
            i13 = 0;
        } else {
            i13 = k02.hashCode();
        }
        int i21 = (s10 + i13) * 31;
        Yg.p pVar = this.f40254f;
        if (pVar == null) {
            i14 = 0;
        } else {
            i14 = pVar.f22419Y.hashCode();
        }
        int i22 = (i21 + i14) * 31;
        C3931c c3931c = this.f40255g;
        if (c3931c == null) {
            i15 = 0;
        } else {
            i15 = c3931c.hashCode();
        }
        int i23 = (i22 + i15) * 31;
        if (this.f40256h) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        int i24 = (i23 + i16) * 31;
        String str3 = this.f40257i;
        if (str3 != null) {
            i17 = str3.hashCode();
        }
        int i25 = (i24 + i17) * 31;
        if (this.f40258j) {
            i20 = 1231;
        }
        return i25 + i20;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SharedConversationState(url=");
        sb2.append(this.f40249a);
        sb2.append(", title=");
        sb2.append(this.f40250b);
        sb2.append(", containsPluginContent=");
        sb2.append(this.f40251c);
        sb2.append(", conversationItems=");
        sb2.append(this.f40252d);
        sb2.append(", user=");
        sb2.append(this.f40253e);
        sb2.append(", conversationTimestamp=");
        sb2.append(this.f40254f);
        sb2.append(", authorDisplayName=");
        sb2.append(this.f40255g);
        sb2.append(", alreadyShared=");
        sb2.append(this.f40256h);
        sb2.append(", shareId=");
        sb2.append(this.f40257i);
        sb2.append(", shareUpdateInProgress=");
        return AbstractC4194d.w(sb2, this.f40258j, Separators.RPAREN);
    }
}
