package i4;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ji.AbstractC4120I;
import ji.AbstractC4122K;
import ji.AbstractC4141p;
import ji.C4113B;
import ji.C4140o;
import ji.w;
import ji.x;
import kf.C4288m;
import kf.r;
import kotlin.jvm.internal.C;

/* renamed from: i4.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3474g extends AbstractC4141p {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4141p f32679b;

    public C3474g(x xVar) {
        AbstractC3557B.c0("delegate", xVar);
        this.f32679b = xVar;
    }

    public static void m(C4113B c4113b, String str, String str2) {
        AbstractC3557B.c0("path", c4113b);
    }

    @Override // ji.AbstractC4141p
    public final AbstractC4120I a(C4113B c4113b) {
        m(c4113b, "appendingSink", "file");
        return this.f32679b.a(c4113b);
    }

    @Override // ji.AbstractC4141p
    public final void b(C4113B c4113b, C4113B c4113b2) {
        AbstractC3557B.c0("source", c4113b);
        AbstractC3557B.c0("target", c4113b2);
        m(c4113b, "atomicMove", "source");
        m(c4113b2, "atomicMove", "target");
        this.f32679b.b(c4113b, c4113b2);
    }

    @Override // ji.AbstractC4141p
    public final void c(C4113B c4113b) {
        m(c4113b, "createDirectory", "dir");
        this.f32679b.c(c4113b);
    }

    @Override // ji.AbstractC4141p
    public final void d(C4113B c4113b) {
        AbstractC3557B.c0("path", c4113b);
        m(c4113b, "delete", "path");
        this.f32679b.d(c4113b);
    }

    @Override // ji.AbstractC4141p
    public final List g(C4113B c4113b) {
        AbstractC3557B.c0("dir", c4113b);
        m(c4113b, "list", "dir");
        List<C4113B> g10 = this.f32679b.g(c4113b);
        ArrayList arrayList = new ArrayList();
        for (C4113B c4113b2 : g10) {
            AbstractC3557B.c0("path", c4113b2);
            arrayList.add(c4113b2);
        }
        r.J1(arrayList);
        return arrayList;
    }

    @Override // ji.AbstractC4141p
    public final C4140o i(C4113B c4113b) {
        AbstractC3557B.c0("path", c4113b);
        m(c4113b, "metadataOrNull", "path");
        C4140o i10 = this.f32679b.i(c4113b);
        if (i10 == null) {
            return null;
        }
        C4113B c4113b2 = i10.f36731c;
        if (c4113b2 != null) {
            Map map = i10.f36736h;
            AbstractC3557B.c0("extras", map);
            return new C4140o(i10.f36729a, i10.f36730b, c4113b2, i10.f36732d, i10.f36733e, i10.f36734f, i10.f36735g, map);
        }
        return i10;
    }

    @Override // ji.AbstractC4141p
    public final w j(C4113B c4113b) {
        AbstractC3557B.c0("file", c4113b);
        m(c4113b, "openReadOnly", "file");
        return this.f32679b.j(c4113b);
    }

    @Override // ji.AbstractC4141p
    public final AbstractC4120I k(C4113B c4113b) {
        C4113B b10 = c4113b.b();
        if (b10 != null) {
            C4288m c4288m = new C4288m();
            while (b10 != null && !f(b10)) {
                c4288m.addFirst(b10);
                b10 = b10.b();
            }
            Iterator<E> it = c4288m.iterator();
            while (it.hasNext()) {
                C4113B c4113b2 = (C4113B) it.next();
                AbstractC3557B.c0("dir", c4113b2);
                c(c4113b2);
            }
        }
        m(c4113b, "sink", "file");
        return this.f32679b.k(c4113b);
    }

    @Override // ji.AbstractC4141p
    public final AbstractC4122K l(C4113B c4113b) {
        AbstractC3557B.c0("file", c4113b);
        m(c4113b, "source", "file");
        return this.f32679b.l(c4113b);
    }

    /* renamed from: n */
    public final String toString() {
        return C.f37623a.b(C3474g.class).o() + '(' + this.f32679b + ')';
    }
}
