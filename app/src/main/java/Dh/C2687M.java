package dh;

import Df.AbstractC0405d;
import Df.AbstractC0406e;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: dh.M  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2687M implements Df.w {

    /* renamed from: Y  reason: collision with root package name */
    public final Df.w f28408Y;

    public C2687M(Df.w wVar) {
        AbstractC3557B.c0("origin", wVar);
        this.f28408Y = wVar;
    }

    @Override // Df.w
    public final boolean a() {
        return this.f28408Y.a();
    }

    @Override // Df.w
    public final List c() {
        return this.f28408Y.c();
    }

    @Override // Df.w
    public final AbstractC0406e e() {
        return this.f28408Y.e();
    }

    public final boolean equals(Object obj) {
        C2687M c2687m;
        Df.w wVar;
        Df.w wVar2;
        if (obj == null) {
            return false;
        }
        AbstractC0406e abstractC0406e = null;
        if (obj instanceof C2687M) {
            c2687m = (C2687M) obj;
        } else {
            c2687m = null;
        }
        if (c2687m != null) {
            wVar = c2687m.f28408Y;
        } else {
            wVar = null;
        }
        Df.w wVar3 = this.f28408Y;
        if (!AbstractC3557B.K(wVar3, wVar)) {
            return false;
        }
        AbstractC0406e e10 = wVar3.e();
        if (e10 instanceof AbstractC0405d) {
            if (obj instanceof Df.w) {
                wVar2 = (Df.w) obj;
            } else {
                wVar2 = null;
            }
            if (wVar2 != null) {
                abstractC0406e = wVar2.e();
            }
            if (abstractC0406e != null && (abstractC0406e instanceof AbstractC0405d)) {
                return AbstractC3557B.K(R4.b.k1((AbstractC0405d) e10), R4.b.k1((AbstractC0405d) abstractC0406e));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f28408Y.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f28408Y;
    }
}
