package Sf;

import bg.AbstractC2193a;
import bg.AbstractC2196d;
import id.AbstractC3557B;
import java.util.Collection;
import kg.C4291c;

/* loaded from: classes.dex */
public final class A extends u implements AbstractC2196d {

    /* renamed from: a  reason: collision with root package name */
    public final C4291c f16588a;

    public A(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        this.f16588a = c4291c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            if (AbstractC3557B.K(this.f16588a, ((A) obj).f16588a)) {
                return true;
            }
        }
        return false;
    }

    @Override // bg.AbstractC2196d
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return kf.v.f37483Y;
    }

    public final int hashCode() {
        return this.f16588a.hashCode();
    }

    @Override // bg.AbstractC2196d
    public final AbstractC2193a l(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        return null;
    }

    public final String toString() {
        return A.class.getName() + ": " + this.f16588a;
    }
}
