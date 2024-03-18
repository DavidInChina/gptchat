package Ga;

import L9.C0901g;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2682H;
import id.AbstractC3557B;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import wd.C6168C;
import wd.C6178a0;
import wd.C6182c0;
import wd.O;

@AbstractC1998i
/* loaded from: classes.dex */
public final class o {
    public static final n Companion = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer[] f6224h = {null, null, null, null, null, null, new C2682H(C6178a0.f48382a, C0901g.f10932a, 1)};

    /* renamed from: a  reason: collision with root package name */
    public final String f6225a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6226b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6227c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6228d;

    /* renamed from: e  reason: collision with root package name */
    public final Yg.p f6229e;

    /* renamed from: f  reason: collision with root package name */
    public final Yg.p f6230f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f6231g;

    public o(int i10, String str, String str2, String str3, String str4, Yg.p pVar, Yg.p pVar2, Map map) {
        if (119 == (i10 & 119)) {
            this.f6225a = str;
            this.f6226b = str2;
            this.f6227c = str3;
            if ((i10 & 8) == 0) {
                this.f6228d = null;
            } else {
                this.f6228d = str4;
            }
            this.f6229e = pVar;
            this.f6230f = pVar2;
            this.f6231g = map;
            return;
        }
        R4.b.e2(i10, 119, m.f6223b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!AbstractC3557B.K(this.f6225a, oVar.f6225a) || !AbstractC3557B.K(this.f6226b, oVar.f6226b)) {
            return false;
        }
        String str = this.f6227c;
        String str2 = oVar.f6227c;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        String str3 = this.f6228d;
        String str4 = oVar.f6228d;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f6229e, oVar.f6229e) && AbstractC3557B.K(this.f6230f, oVar.f6230f) && AbstractC3557B.K(this.f6231g, oVar.f6231g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int v10 = E9.f.v(this.f6226b, this.f6225a.hashCode() * 31, 31);
        int i12 = 0;
        String str = this.f6227c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (v10 + i10) * 31;
        String str2 = this.f6228d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int hashCode = (this.f6230f.f22419Y.hashCode() + ((this.f6229e.f22419Y.hashCode() + ((i13 + i11) * 31)) * 31)) * 31;
        Map map = this.f6231g;
        if (map != null) {
            i12 = map.hashCode();
        }
        return hashCode + i12;
    }

    public final String toString() {
        String str;
        String a5 = C6168C.a(this.f6225a);
        String str2 = "null";
        String str3 = this.f6227c;
        if (str3 == null) {
            str = str2;
        } else {
            str = C6182c0.a(str3);
        }
        String str4 = this.f6228d;
        if (str4 != null) {
            str2 = O.a(str4);
        }
        StringBuilder s10 = android.gov.nist.core.a.s("ConversationListResponseItem(id=", a5, ", title=");
        android.gov.nist.core.a.y(s10, this.f6226b, ", currentNode=", str, ", conversationTemplateId=");
        s10.append(str2);
        s10.append(", createTime=");
        s10.append(this.f6229e);
        s10.append(", updateTime=");
        s10.append(this.f6230f);
        s10.append(", mapping=");
        s10.append(this.f6231g);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
