package Dg;

import Mf.A;
import Mf.AbstractC1000i;
import Mf.V;
import Mf.r;
import Pf.T;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kf.v;
import kf.x;
import kg.C4294f;
import ug.C5925g;

/* loaded from: classes.dex */
public class h implements ug.n {

    /* renamed from: b  reason: collision with root package name */
    public final String f3659b;

    public h(i iVar, String... strArr) {
        AbstractC3557B.c0("formatParams", strArr);
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.f3659b = String.format(iVar.f3666Y, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // ug.n
    public Set b() {
        return x.f37485Y;
    }

    @Override // ug.n
    public Set c() {
        return x.f37485Y;
    }

    @Override // ug.p
    public Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        return v.f37483Y;
    }

    @Override // ug.p
    public AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        b[] bVarArr = b.f3651Y;
        return new a(C4294f.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{c4294f}, 1))));
    }

    @Override // ug.n
    public Set g() {
        return x.f37485Y;
    }

    /* renamed from: h */
    public Set a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        a aVar = m.f3711c;
        AbstractC3557B.c0("containingDeclaration", aVar);
        Nf.g gVar = Nf.h.f12822a;
        b[] bVarArr = b.f3651Y;
        T t10 = new T(aVar, null, gVar, C4294f.g("<Error function>"), 1, V.f12075a);
        v vVar = v.f37483Y;
        t10.B0(null, null, vVar, vVar, vVar, m.c(l.f3690j0, new String[0]), A.f12053i0, r.f12105e);
        return R4.b.W1(t10);
    }

    /* renamed from: i */
    public Set f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return m.f3714f;
    }

    public String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("ErrorScope{"), this.f3659b, '}');
    }
}
