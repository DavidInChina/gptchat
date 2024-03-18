package Cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Cb.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293c {
    public static final C0292b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f2931a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2932b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2933c;

    /* renamed from: d  reason: collision with root package name */
    public final Fb.f f2934d;

    public C0293c(int i10, String str, String str2, String str3, Fb.f fVar) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, C0291a.f2927b);
            throw null;
        }
        this.f2931a = str;
        this.f2932b = str2;
        this.f2933c = str3;
        this.f2934d = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0293c)) {
            return false;
        }
        C0293c c0293c = (C0293c) obj;
        if (AbstractC3557B.K(this.f2931a, c0293c.f2931a) && AbstractC3557B.K(this.f2932b, c0293c.f2932b) && AbstractC3557B.K(this.f2933c, c0293c.f2933c) && AbstractC3557B.K(this.f2934d, c0293c.f2934d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f2932b, this.f2931a.hashCode() * 31, 31);
        String str = this.f2933c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f2934d.hashCode() + ((v10 + i10) * 31);
    }

    public final String toString() {
        return "AccountInfo(firstName=" + this.f2931a + ", lastName=" + this.f2932b + ", phoneNumber=" + this.f2933c + ", country=" + this.f2934d + Separators.RPAREN;
    }

    public C0293c(String str, String str2, String str3, Fb.f fVar) {
        this.f2931a = str;
        this.f2932b = str2;
        this.f2933c = str3;
        this.f2934d = fVar;
    }
}
