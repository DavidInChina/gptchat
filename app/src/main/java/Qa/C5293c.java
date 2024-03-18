package qa;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import p9.AbstractC5101c;
import v0.C5953f;

/* renamed from: qa.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5293c {

    /* renamed from: a  reason: collision with root package name */
    public final String f44017a;

    /* renamed from: b  reason: collision with root package name */
    public final String f44018b;

    /* renamed from: c  reason: collision with root package name */
    public final C5953f f44019c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f44020d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC5101c f44021e;

    public C5293c(String str, String str2, C5953f c5953f, Integer num, AbstractC5101c abstractC5101c, int i10) {
        c5953f = (i10 & 4) != 0 ? null : c5953f;
        num = (i10 & 8) != 0 ? null : num;
        this.f44017a = str;
        this.f44018b = str2;
        this.f44019c = c5953f;
        this.f44020d = num;
        this.f44021e = abstractC5101c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5293c)) {
            return false;
        }
        C5293c c5293c = (C5293c) obj;
        if (AbstractC3557B.K(this.f44017a, c5293c.f44017a) && AbstractC3557B.K(this.f44018b, c5293c.f44018b) && AbstractC3557B.K(this.f44019c, c5293c.f44019c) && AbstractC3557B.K(this.f44020d, c5293c.f44020d) && AbstractC3557B.K(this.f44021e, c5293c.f44021e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f44018b, this.f44017a.hashCode() * 31, 31);
        int i11 = 0;
        C5953f c5953f = this.f44019c;
        if (c5953f == null) {
            i10 = 0;
        } else {
            i10 = c5953f.hashCode();
        }
        int i12 = (v10 + i10) * 31;
        Integer num = this.f44020d;
        if (num != null) {
            i11 = num.hashCode();
        }
        return this.f44021e.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        return "Item(title=" + this.f44017a + ", subtitle=" + this.f44018b + ", icon=" + this.f44019c + ", iconRes=" + this.f44020d + ", iconTint=" + this.f44021e + Separators.RPAREN;
    }
}
