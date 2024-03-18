package ca;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import ja.C3931c;
import k6.AbstractC4194d;

/* renamed from: ca.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2321m {

    /* renamed from: a  reason: collision with root package name */
    public final C2311c f26402a;

    /* renamed from: b  reason: collision with root package name */
    public final C3931c f26403b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f26404c;

    public C2321m(C2311c c2311c, C3931c c3931c, boolean z10) {
        this.f26402a = c2311c;
        this.f26403b = c3931c;
        this.f26404c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2321m)) {
            return false;
        }
        C2321m c2321m = (C2321m) obj;
        if (AbstractC3557B.K(this.f26402a, c2321m.f26402a) && AbstractC3557B.K(this.f26403b, c2321m.f26403b) && this.f26404c == c2321m.f26404c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f26402a.hashCode() * 31;
        C3931c c3931c = this.f26403b;
        if (c3931c == null) {
            i10 = 0;
        } else {
            i10 = c3931c.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f26404c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SharedConversation(conversation=");
        sb2.append(this.f26402a);
        sb2.append(", originalContributor=");
        sb2.append(this.f26403b);
        sb2.append(", usesCustomInstructions=");
        return AbstractC4194d.w(sb2, this.f26404c, Separators.RPAREN);
    }
}
