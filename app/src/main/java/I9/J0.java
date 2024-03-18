package I9;

import android.gov.nist.core.Separators;
import ca.C2311c;
import id.AbstractC3557B;
import wd.C6182c0;
import wd.EnumC6192h0;

/* loaded from: classes.dex */
public final class J0 implements AbstractC0775p {

    /* renamed from: a  reason: collision with root package name */
    public final C2311c f8187a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8188b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8189c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8190d;

    /* renamed from: e  reason: collision with root package name */
    public final EnumC6192h0 f8191e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8192f;

    public J0(C2311c c2311c, String str, String str2, boolean z10, EnumC6192h0 enumC6192h0) {
        AbstractC3557B.c0("conversation", c2311c);
        AbstractC3557B.c0("previewText", str);
        AbstractC3557B.c0("previewMessageId", str2);
        this.f8187a = c2311c;
        this.f8188b = str;
        this.f8189c = str2;
        this.f8190d = z10;
        this.f8191e = enumC6192h0;
        this.f8192f = c2311c.f26374a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        if (AbstractC3557B.K(this.f8187a, j02.f8187a) && AbstractC3557B.K(this.f8188b, j02.f8188b) && AbstractC3557B.K(this.f8189c, j02.f8189c) && this.f8190d == j02.f8190d && this.f8191e == j02.f8191e) {
            return true;
        }
        return false;
    }

    @Override // I9.AbstractC0775p
    public final String getId() {
        return this.f8192f;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f8189c, E9.f.v(this.f8188b, this.f8187a.hashCode() * 31, 31), 31);
        if (this.f8190d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f8191e.hashCode() + ((v10 + i10) * 31);
    }

    public final String toString() {
        String a5 = C6182c0.a(this.f8189c);
        return "HistoryItem(conversation=" + this.f8187a + ", previewText=" + this.f8188b + ", previewMessageId=" + a5 + ", isSelected=" + this.f8190d + ", modelType=" + this.f8191e + Separators.RPAREN;
    }
}
