package ug;

import Mf.AbstractC1000i;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Set;
import kg.C4294f;

/* renamed from: ug.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5919a implements n {
    @Override // ug.n
    public Collection a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return i().a(c4294f, dVar);
    }

    @Override // ug.n
    public final Set b() {
        return i().b();
    }

    @Override // ug.n
    public final Set c() {
        return i().c();
    }

    @Override // ug.p
    public Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        return i().d(c5925g, kVar);
    }

    @Override // ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return i().e(c4294f, dVar);
    }

    @Override // ug.n
    public Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return i().f(c4294f, dVar);
    }

    @Override // ug.n
    public final Set g() {
        return i().g();
    }

    public final n h() {
        if (i() instanceof AbstractC5919a) {
            n i10 = i();
            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter", i10);
            return ((AbstractC5919a) i10).h();
        }
        return i();
    }

    public abstract n i();
}
