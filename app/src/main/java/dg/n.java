package Dg;

import Mf.AbstractC1000i;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Set;
import kg.C4294f;
import ug.C5925g;

/* loaded from: classes.dex */
public final class n extends h {
    @Override // Dg.h, ug.n
    public final /* bridge */ /* synthetic */ Collection a(C4294f c4294f, Tf.d dVar) {
        h(c4294f, dVar);
        throw null;
    }

    @Override // Dg.h, ug.n
    public final Set b() {
        throw new IllegalStateException();
    }

    @Override // Dg.h, ug.n
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override // Dg.h, ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        throw new IllegalStateException(this.f3659b);
    }

    @Override // Dg.h, ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        throw new IllegalStateException(this.f3659b + ", required name: " + c4294f);
    }

    @Override // Dg.h, ug.n
    public final /* bridge */ /* synthetic */ Collection f(C4294f c4294f, Tf.d dVar) {
        i(c4294f, dVar);
        throw null;
    }

    @Override // Dg.h, ug.n
    public final Set g() {
        throw new IllegalStateException();
    }

    @Override // Dg.h
    public final Set h(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        throw new IllegalStateException(this.f3659b + ", required name: " + c4294f);
    }

    @Override // Dg.h
    public final Set i(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        throw new IllegalStateException(this.f3659b + ", required name: " + c4294f);
    }

    @Override // Dg.h
    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("ThrowingScope{"), this.f3659b, '}');
    }
}
