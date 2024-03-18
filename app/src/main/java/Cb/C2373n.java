package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: cb.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2373n {
    public static final C2372m Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f26528f = {null, null, null, EnumC2376q.Companion.serializer(), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f26529a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26530b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26531c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC2376q f26532d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26533e;

    public C2373n(int i10, String str, String str2, String str3, EnumC2376q enumC2376q, boolean z10) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, C2371l.f26527b);
            throw null;
        }
        this.f26529a = str;
        this.f26530b = str2;
        this.f26531c = str3;
        this.f26532d = enumC2376q;
        if ((i10 & 16) == 0) {
            this.f26533e = false;
        } else {
            this.f26533e = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2373n)) {
            return false;
        }
        C2373n c2373n = (C2373n) obj;
        if (AbstractC3557B.K(this.f26529a, c2373n.f26529a) && AbstractC3557B.K(this.f26530b, c2373n.f26530b) && AbstractC3557B.K(this.f26531c, c2373n.f26531c) && this.f26532d == c2373n.f26532d && this.f26533e == c2373n.f26533e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f26532d.hashCode() + E9.f.v(this.f26531c, E9.f.v(this.f26530b, this.f26529a.hashCode() * 31, 31), 31)) * 31;
        if (this.f26533e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SocialDisplay(userName=");
        sb2.append(this.f26529a);
        sb2.append(", siteName=");
        sb2.append(this.f26530b);
        sb2.append(", linkTo=");
        sb2.append(this.f26531c);
        sb2.append(", siteType=");
        sb2.append(this.f26532d);
        sb2.append(", verified=");
        return AbstractC4194d.w(sb2, this.f26533e, Separators.RPAREN);
    }

    public C2373n(String str, String str2, String str3, EnumC2376q enumC2376q, boolean z10) {
        AbstractC3557B.c0("userName", str);
        AbstractC3557B.c0("siteName", str2);
        AbstractC3557B.c0("linkTo", str3);
        this.f26529a = str;
        this.f26530b = str2;
        this.f26531c = str3;
        this.f26532d = enumC2376q;
        this.f26533e = z10;
    }
}
