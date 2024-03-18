package th;

import wh.AbstractC6242g;
import yh.AbstractC6632q;

/* renamed from: th.W  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5790W extends AbstractC5809q {

    /* renamed from: a  reason: collision with root package name */
    public final String f46198a;

    public C5790W(String str) {
        this.f46198a = str;
    }

    @Override // th.h0
    public final a0 a(ClassLoader classLoader) {
        String str = this.f46198a;
        return new C5786S(str, new ClassNotFoundException(str));
    }

    @Override // th.h0
    public final Object b() {
        throw new IllegalStateException("Type not found: " + this.f46198a);
    }

    @Override // th.h0
    public final int c() {
        return 14;
    }

    @Override // th.h0
    public final int getState() {
        return 2;
    }

    public final String toString() {
        return R.a.t(new StringBuilder(), this.f46198a, ".class /* Warning: type not present! */");
    }

    @Override // th.h0
    public final h0 d(AbstractC6242g abstractC6242g, AbstractC6632q abstractC6632q) {
        return this;
    }
}
