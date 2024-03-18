package Bh;

import java.util.Set;
import sh.AbstractC5634f;
import wh.AbstractC6242g;
import wh.AbstractC6250o;

/* renamed from: Bh.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0278x implements A {

    /* renamed from: a  reason: collision with root package name */
    public final C0272u f2397a;

    public C0278x(C0272u c0272u) {
        this.f2397a = c0272u;
    }

    @Override // Bh.A
    public final A a(AbstractC6250o abstractC6250o, AbstractC0270t abstractC0270t) {
        return new C0282z(this.f2397a.d((AbstractC6242g) abstractC6250o.y(), abstractC0270t), abstractC6250o, ((AbstractC5634f) abstractC6250o).g1(), false);
    }

    @Override // Bh.A
    public final A b(A a5) {
        throw new IllegalStateException("Cannot inject into initial entry without a registered method: " + this);
    }

    @Override // Bh.A
    public final M c(F f6) {
        throw new IllegalStateException("Cannot transform initial entry without a registered method: " + this);
    }

    @Override // Bh.A
    public final Set d() {
        throw new IllegalStateException("Cannot extract method from initial entry:" + this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0278x.class == obj.getClass()) {
            return this.f2397a.equals(((C0278x) obj).f2397a);
        }
        return false;
    }

    @Override // Bh.A
    public final C0272u getKey() {
        throw new IllegalStateException("Cannot extract key from initial entry:" + this);
    }

    @Override // Bh.A
    public final xh.e getVisibility() {
        throw new IllegalStateException("Cannot extract visibility from initial entry:" + this);
    }

    public final int hashCode() {
        return this.f2397a.hashCode();
    }
}
