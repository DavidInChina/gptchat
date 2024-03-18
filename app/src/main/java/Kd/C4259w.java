package kd;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import wd.C6168C;

@AbstractC1998i
/* renamed from: kd.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4259w {
    public static final C4258v Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f37362a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f37363b;

    /* renamed from: c  reason: collision with root package name */
    public final String f37364c;

    /* renamed from: d  reason: collision with root package name */
    public final String f37365d;

    public C4259w(int i10, String str, boolean z10, String str2, String str3) {
        if (15 == (i10 & 15)) {
            this.f37362a = str;
            this.f37363b = z10;
            this.f37364c = str2;
            this.f37365d = str3;
            return;
        }
        R4.b.e2(i10, 15, C4257u.f37361b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4259w)) {
            return false;
        }
        C4259w c4259w = (C4259w) obj;
        if (AbstractC3557B.K(this.f37362a, c4259w.f37362a) && this.f37363b == c4259w.f37363b && AbstractC3557B.K(this.f37364c, c4259w.f37364c) && AbstractC3557B.K(this.f37365d, c4259w.f37365d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f37362a.hashCode() * 31;
        if (this.f37363b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f37365d.hashCode() + E9.f.v(this.f37364c, (hashCode + i10) * 31, 31);
    }

    public final String toString() {
        String str = "WebSocketMessage(moreBody=" + this.f37363b + ", responseId='" + this.f37364c + "', conversationId=" + new C6168C(this.f37365d) + ", body='" + this.f37362a + "')";
        AbstractC3557B.b0("toString(...)", str);
        return str;
    }
}
