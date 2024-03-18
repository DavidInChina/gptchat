package androidx.lifecycle;

import n2.C4711b;

/* loaded from: classes2.dex */
public final class B extends C implements AbstractC2084t {

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC2086v f25283j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ E f25284k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(E e10, AbstractC2086v abstractC2086v, C4711b c4711b) {
        super(e10, c4711b);
        this.f25284k0 = e10;
        this.f25283j0 = abstractC2086v;
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        AbstractC2086v abstractC2086v2 = this.f25283j0;
        EnumC2082q f6 = abstractC2086v2.h().f();
        if (f6 == EnumC2082q.f25375Y) {
            this.f25284k0.h(this.f25285Y);
            return;
        }
        EnumC2082q enumC2082q = null;
        while (enumC2082q != f6) {
            a(e());
            enumC2082q = f6;
            f6 = abstractC2086v2.h().f();
        }
    }

    @Override // androidx.lifecycle.C
    public final void c() {
        this.f25283j0.h().g(this);
    }

    @Override // androidx.lifecycle.C
    public final boolean d(AbstractC2086v abstractC2086v) {
        if (this.f25283j0 == abstractC2086v) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.C
    public final boolean e() {
        return this.f25283j0.h().f().a(EnumC2082q.f25378i0);
    }
}
