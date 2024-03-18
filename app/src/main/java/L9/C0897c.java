package L9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2682H;
import dh.C2695d;
import ia.C3518a;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;
import wd.C6178a0;
import wd.C6182c0;
import y.AbstractC6463a;

@AbstractC1998i
/* renamed from: L9.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0897c {
    public static final C0896b Companion = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer[] f10907k = {null, null, null, null, null, null, new C2682H(C6178a0.f48382a, C0901g.f10932a, 1), new C2695d(P9.d.f13881a, 0), new C2695d(C3518a.f32899a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f10908a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f10909b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10910c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10911d;

    /* renamed from: e  reason: collision with root package name */
    public final Yg.p f10912e;

    /* renamed from: f  reason: collision with root package name */
    public final Yg.p f10913f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f10914g;

    /* renamed from: h  reason: collision with root package name */
    public final List f10915h;

    /* renamed from: i  reason: collision with root package name */
    public final List f10916i;

    /* renamed from: j  reason: collision with root package name */
    public final String f10917j;

    public C0897c(int i10, String str, Boolean bool, String str2, String str3, Yg.p pVar, Yg.p pVar2, Map map, List list, List list2, String str4) {
        if (127 == (i10 & 127)) {
            this.f10908a = str;
            this.f10909b = bool;
            this.f10910c = str2;
            this.f10911d = str3;
            this.f10912e = pVar;
            this.f10913f = pVar2;
            this.f10914g = map;
            if ((i10 & 128) == 0) {
                this.f10915h = kf.v.f37483Y;
            } else {
                this.f10915h = list;
            }
            if ((i10 & 256) == 0) {
                this.f10916i = null;
            } else {
                this.f10916i = list2;
            }
            if ((i10 & 512) == 0) {
                this.f10917j = null;
                return;
            } else {
                this.f10917j = str4;
                return;
            }
        }
        R4.b.e2(i10, 127, C0895a.f10902b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0897c)) {
            return false;
        }
        C0897c c0897c = (C0897c) obj;
        if (!AbstractC3557B.K(this.f10908a, c0897c.f10908a) || !AbstractC3557B.K(this.f10909b, c0897c.f10909b) || !AbstractC3557B.K(this.f10910c, c0897c.f10910c) || !AbstractC3557B.K(this.f10911d, c0897c.f10911d) || !AbstractC3557B.K(this.f10912e, c0897c.f10912e) || !AbstractC3557B.K(this.f10913f, c0897c.f10913f) || !AbstractC3557B.K(this.f10914g, c0897c.f10914g) || !AbstractC3557B.K(this.f10915h, c0897c.f10915h) || !AbstractC3557B.K(this.f10916i, c0897c.f10916i)) {
            return false;
        }
        String str = this.f10917j;
        String str2 = c0897c.f10917j;
        if (str != null ? str2 != null && AbstractC3557B.K(str, str2) : str2 == null) {
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
        String str = this.f10908a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = i10 * 31;
        Boolean bool = this.f10909b;
        if (bool == null) {
            i11 = 0;
        } else {
            i11 = bool.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        String str2 = this.f10910c;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int v10 = E9.f.v(this.f10911d, (i16 + i12) * 31, 31);
        int s10 = AbstractC4194d.s(this.f10915h, AbstractC6463a.f(this.f10914g, (this.f10913f.f22419Y.hashCode() + ((this.f10912e.f22419Y.hashCode() + v10) * 31)) * 31, 31), 31);
        List list = this.f10916i;
        if (list == null) {
            i13 = 0;
        } else {
            i13 = list.hashCode();
        }
        int i17 = (s10 + i13) * 31;
        String str3 = this.f10917j;
        if (str3 != null) {
            i14 = str3.hashCode();
        }
        return i17 + i14;
    }

    public final String toString() {
        String str;
        String a5 = C6182c0.a(this.f10911d);
        String str2 = this.f10917j;
        if (str2 == null) {
            str = "null";
        } else {
            str = wd.O.a(str2);
        }
        StringBuilder sb2 = new StringBuilder("ApiSharedConversationResponse(authorName=");
        sb2.append(this.f10908a);
        sb2.append(", hasUserEditableContext=");
        sb2.append(this.f10909b);
        sb2.append(", title=");
        android.gov.nist.core.a.y(sb2, this.f10910c, ", currentNode=", a5, ", createTime=");
        sb2.append(this.f10912e);
        sb2.append(", updateTime=");
        sb2.append(this.f10913f);
        sb2.append(", mapping=");
        sb2.append(this.f10914g);
        sb2.append(", moderationResults=");
        sb2.append(this.f10915h);
        sb2.append(", pluginIds=");
        sb2.append(this.f10916i);
        sb2.append(", conversationTemplateId=");
        sb2.append(str);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
