package Uf;

import id.AbstractC3557B;
import jf.C3956f;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: d  reason: collision with root package name */
    public static final w f17842d = new w(I.f17767i0, 6);

    /* renamed from: a  reason: collision with root package name */
    public final I f17843a;

    /* renamed from: b  reason: collision with root package name */
    public final C3956f f17844b;

    /* renamed from: c  reason: collision with root package name */
    public final I f17845c;

    public w(I i10, int i11) {
        this(i10, (i11 & 2) != 0 ? new C3956f(1, 0, 0) : null, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f17843a == wVar.f17843a && AbstractC3557B.K(this.f17844b, wVar.f17844b) && this.f17845c == wVar.f17845c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f17843a.hashCode() * 31;
        C3956f c3956f = this.f17844b;
        if (c3956f == null) {
            i10 = 0;
        } else {
            i10 = c3956f.f36151i0;
        }
        return this.f17845c.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f17843a + ", sinceVersion=" + this.f17844b + ", reportLevelAfter=" + this.f17845c + ')';
    }

    public w(I i10, C3956f c3956f, I i11) {
        AbstractC3557B.c0("reportLevelAfter", i11);
        this.f17843a = i10;
        this.f17844b = c3956f;
        this.f17845c = i11;
    }
}
