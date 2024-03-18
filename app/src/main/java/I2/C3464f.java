package i2;

import Z0.n;
import id.AbstractC3557B;
import j2.AbstractC3899a;
import j2.C3906h;

/* renamed from: i2.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3464f {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC3899a f32610a;

    /* renamed from: b  reason: collision with root package name */
    public final n f32611b;

    public C3464f(C3906h c3906h, n nVar, int i10) {
        nVar = (i10 & 2) != 0 ? null : nVar;
        this.f32610a = c3906h;
        this.f32611b = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3464f)) {
            return false;
        }
        C3464f c3464f = (C3464f) obj;
        if (!AbstractC3557B.K(this.f32610a, c3464f.f32610a) || !AbstractC3557B.K(this.f32611b, c3464f.f32611b)) {
            return false;
        }
        c3464f.getClass();
        if (!AbstractC3557B.K(null, null)) {
            return false;
        }
        c3464f.getClass();
        if (!AbstractC3557B.K(null, null)) {
            return false;
        }
        c3464f.getClass();
        if (!AbstractC3557B.K(null, null)) {
            return false;
        }
        c3464f.getClass();
        if (!AbstractC3557B.K(null, null)) {
            return false;
        }
        c3464f.getClass();
        if (AbstractC3557B.K(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f32610a.hashCode() * 31;
        n nVar = this.f32611b;
        if (nVar != null) {
            i10 = nVar.hashCode();
        } else {
            i10 = 0;
        }
        return (hashCode + i10) * 28629151;
    }

    public final String toString() {
        return "TextStyle(color=" + this.f32610a + ", fontSize=" + this.f32611b + ", fontWeight=null, fontStyle=null, textDecoration=null, textAlign=null, fontFamily=null)";
    }
}
