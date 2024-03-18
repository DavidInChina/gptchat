package Qd;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class H implements Li.b {
    public static final F Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public String f14582a;

    /* renamed from: b  reason: collision with root package name */
    public String f14583b;

    /* renamed from: c  reason: collision with root package name */
    public kotlinx.serialization.json.c f14584c;

    public H(String str, String str2, kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("anonymousId", str);
        this.f14582a = str;
        this.f14583b = str2;
        this.f14584c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        if (AbstractC3557B.K(this.f14582a, h10.f14582a) && AbstractC3557B.K(this.f14583b, h10.f14583b) && AbstractC3557B.K(this.f14584c, h10.f14584c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14582a.hashCode() * 31;
        String str = this.f14583b;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        kotlinx.serialization.json.c cVar = this.f14584c;
        if (cVar != null) {
            i11 = cVar.f37662Y.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "UserInfo(anonymousId=" + this.f14582a + ", userId=" + this.f14583b + ", traits=" + this.f14584c + ')';
    }
}
