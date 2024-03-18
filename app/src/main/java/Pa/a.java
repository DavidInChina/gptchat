package Pa;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import wd.C6168C;
import wd.C6182c0;
import wd.C6190g0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f13886a;

    /* renamed from: b  reason: collision with root package name */
    public final T9.k f13887b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13888c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13889d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13890e;

    public a(String str, T9.k kVar, String str2, String str3, boolean z10) {
        AbstractC3557B.c0("state", kVar);
        this.f13886a = str;
        this.f13887b = kVar;
        this.f13888c = str2;
        this.f13889d = str3;
        this.f13890e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f13886a;
        String str2 = this.f13886a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        if (!AbstractC3557B.K(this.f13887b, aVar.f13887b)) {
            return false;
        }
        String str3 = this.f13888c;
        String str4 = aVar.f13888c;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        String str5 = this.f13889d;
        String str6 = aVar.f13889d;
        if (str5 != null ? !(str6 != null && AbstractC3557B.K(str5, str6)) : str6 != null) {
            return false;
        }
        if (this.f13890e == aVar.f13890e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f13886a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = (this.f13887b.hashCode() + (i10 * 31)) * 31;
        String str2 = this.f13888c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (hashCode + i11) * 31;
        String str3 = this.f13889d;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        int i15 = (i14 + i13) * 31;
        if (this.f13890e) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        return i15 + i12;
    }

    public final String toString() {
        String str;
        String str2;
        String str3 = "null";
        String str4 = this.f13886a;
        if (str4 == null) {
            str = str3;
        } else {
            str = C6168C.a(str4);
        }
        String str5 = this.f13888c;
        if (str5 == null) {
            str2 = str3;
        } else {
            str2 = C6182c0.a(str5);
        }
        String str6 = this.f13889d;
        if (str6 != null) {
            str3 = C6190g0.b(str6);
        }
        StringBuilder s10 = android.gov.nist.core.a.s("ConversationSuggestionsState(conversationId=", str, ", state=");
        s10.append(this.f13887b);
        s10.append(", messageId=");
        s10.append(str2);
        s10.append(", modelSlug=");
        s10.append(str3);
        s10.append(", conversationIsNotEmpty=");
        return AbstractC4194d.w(s10, this.f13890e, Separators.RPAREN);
    }
}
