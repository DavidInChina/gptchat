package T9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import wd.C6168C;
import wd.C6182c0;
import wd.O;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f16966a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16967b;

    /* renamed from: c  reason: collision with root package name */
    public final k f16968c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16969d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16970e;

    /* renamed from: f  reason: collision with root package name */
    public final List f16971f;

    /* renamed from: g  reason: collision with root package name */
    public final String f16972g;

    public c(String str, String str2, k kVar, boolean z10, String str3, List list, String str4) {
        AbstractC3557B.c0("state", kVar);
        this.f16966a = str;
        this.f16967b = str2;
        this.f16968c = kVar;
        this.f16969d = z10;
        this.f16970e = str3;
        this.f16971f = list;
        this.f16972g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str = cVar.f16966a;
        String str2 = this.f16966a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        String str3 = this.f16967b;
        String str4 = cVar.f16967b;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        if (!AbstractC3557B.K(this.f16968c, cVar.f16968c) || this.f16969d != cVar.f16969d || !AbstractC3557B.K(this.f16970e, cVar.f16970e) || !AbstractC3557B.K(this.f16971f, cVar.f16971f)) {
            return false;
        }
        String str5 = this.f16972g;
        String str6 = cVar.f16972g;
        if (str5 != null ? str6 != null && AbstractC3557B.K(str5, str6) : str6 == null) {
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
        String str = this.f16966a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = i10 * 31;
        String str2 = this.f16967b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int hashCode = (this.f16968c.hashCode() + ((i15 + i11) * 31)) * 31;
        if (this.f16969d) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i16 = (hashCode + i12) * 31;
        String str3 = this.f16970e;
        if (str3 == null) {
            i13 = 0;
        } else {
            i13 = str3.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f16971f, (i16 + i13) * 31, 31);
        String str4 = this.f16972g;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return s10 + i14;
    }

    public final String toString() {
        String str;
        String str2;
        String str3 = "null";
        String str4 = this.f16966a;
        if (str4 == null) {
            str = str3;
        } else {
            str = C6168C.a(str4);
        }
        String str5 = this.f16967b;
        if (str5 == null) {
            str2 = str3;
        } else {
            str2 = C6182c0.a(str5);
        }
        String str6 = this.f16972g;
        if (str6 != null) {
            str3 = O.a(str6);
        }
        StringBuilder t10 = android.gov.nist.core.a.t("ConversationCoordinatorState(remoteId=", str, ", parentMessageId=", str2, ", state=");
        t10.append(this.f16968c);
        t10.append(", temporaryConversation=");
        t10.append(this.f16969d);
        t10.append(", title=");
        t10.append(this.f16970e);
        t10.append(", conversationItems=");
        t10.append(this.f16971f);
        t10.append(", primaryGizmoId=");
        t10.append(str3);
        t10.append(Separators.RPAREN);
        return t10.toString();
    }
}
