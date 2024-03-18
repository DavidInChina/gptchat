package Dd;

import O9.C1120o;
import O9.C1122p;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;

@AbstractC1998i
/* loaded from: classes.dex */
public final class E {
    public static final D Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f3507a;

    /* renamed from: b  reason: collision with root package name */
    public final C1122p f3508b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3509c;

    /* JADX WARN: Type inference failed for: r0v0, types: [Dd.D, java.lang.Object] */
    static {
        C1120o c1120o = C1122p.Companion;
    }

    public E(int i10, String str, C1122p c1122p, String str2) {
        if (7 == (i10 & 7)) {
            this.f3507a = str;
            this.f3508b = c1122p;
            this.f3509c = str2;
            return;
        }
        R4.b.e2(i10, 7, C.f3506b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        String str = e10.f3507a;
        String str2 = this.f3507a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f3508b, e10.f3508b) && AbstractC3557B.K(this.f3509c, e10.f3509c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f3507a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        C1122p c1122p = this.f3508b;
        if (c1122p == null) {
            i11 = 0;
        } else {
            i11 = c1122p.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str2 = this.f3509c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        String str;
        String str2 = this.f3507a;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6168C.a(str2);
        }
        StringBuilder s10 = android.gov.nist.core.a.s("VoiceConversationStreamMessageResponse(conversationId=", str, ", message=");
        s10.append(this.f3508b);
        s10.append(", error=");
        return R.a.t(s10, this.f3509c, Separators.RPAREN);
    }
}
