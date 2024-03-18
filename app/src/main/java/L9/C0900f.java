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
/* renamed from: L9.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0900f {
    public static final C0899e Companion = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer[] f10923i = {null, null, null, null, new C2682H(C6178a0.f48382a, C0901g.f10932a, 1), new C2695d(P9.d.f13881a, 0), new C2695d(C3518a.f32899a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f10924a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10925b;

    /* renamed from: c  reason: collision with root package name */
    public final Yg.p f10926c;

    /* renamed from: d  reason: collision with root package name */
    public final Yg.p f10927d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f10928e;

    /* renamed from: f  reason: collision with root package name */
    public final List f10929f;

    /* renamed from: g  reason: collision with root package name */
    public final List f10930g;

    /* renamed from: h  reason: collision with root package name */
    public final String f10931h;

    public C0900f(int i10, String str, String str2, Yg.p pVar, Yg.p pVar2, Map map, List list, List list2, String str3) {
        if (31 == (i10 & 31)) {
            this.f10924a = str;
            this.f10925b = str2;
            this.f10926c = pVar;
            this.f10927d = pVar2;
            this.f10928e = map;
            if ((i10 & 32) == 0) {
                this.f10929f = kf.v.f37483Y;
            } else {
                this.f10929f = list;
            }
            if ((i10 & 64) == 0) {
                this.f10930g = null;
            } else {
                this.f10930g = list2;
            }
            if ((i10 & 128) == 0) {
                this.f10931h = null;
                return;
            } else {
                this.f10931h = str3;
                return;
            }
        }
        R4.b.e2(i10, 31, C0898d.f10919b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0900f)) {
            return false;
        }
        C0900f c0900f = (C0900f) obj;
        if (!AbstractC3557B.K(this.f10924a, c0900f.f10924a) || !AbstractC3557B.K(this.f10925b, c0900f.f10925b) || !AbstractC3557B.K(this.f10926c, c0900f.f10926c) || !AbstractC3557B.K(this.f10927d, c0900f.f10927d) || !AbstractC3557B.K(this.f10928e, c0900f.f10928e) || !AbstractC3557B.K(this.f10929f, c0900f.f10929f) || !AbstractC3557B.K(this.f10930g, c0900f.f10930g)) {
            return false;
        }
        String str = this.f10931h;
        String str2 = c0900f.f10931h;
        if (str != null ? str2 != null && AbstractC3557B.K(str, str2) : str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f10924a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f10925b, i10 * 31, 31);
        int s10 = AbstractC4194d.s(this.f10929f, AbstractC6463a.f(this.f10928e, (this.f10927d.f22419Y.hashCode() + ((this.f10926c.f22419Y.hashCode() + v10) * 31)) * 31, 31), 31);
        List list = this.f10930g;
        if (list == null) {
            i11 = 0;
        } else {
            i11 = list.hashCode();
        }
        int i13 = (s10 + i11) * 31;
        String str2 = this.f10931h;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        String str;
        String a5 = C6182c0.a(this.f10925b);
        String str2 = this.f10931h;
        if (str2 == null) {
            str = "null";
        } else {
            str = wd.O.a(str2);
        }
        StringBuilder sb2 = new StringBuilder("ConversationResponse(title=");
        android.gov.nist.core.a.y(sb2, this.f10924a, ", currentNode=", a5, ", createTime=");
        sb2.append(this.f10926c);
        sb2.append(", updateTime=");
        sb2.append(this.f10927d);
        sb2.append(", mapping=");
        sb2.append(this.f10928e);
        sb2.append(", moderationResults=");
        sb2.append(this.f10929f);
        sb2.append(", pluginIds=");
        sb2.append(this.f10930g);
        sb2.append(", conversationTemplateId=");
        sb2.append(str);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
