package sg;

import Mf.AbstractC0997f;
import Pf.O;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kf.s;
import kf.v;
import kg.C4294f;
import lf.C4436a;
import s3.z;

/* renamed from: sg.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5624a implements AbstractC5628e {

    /* renamed from: b  reason: collision with root package name */
    public final List f45576b = v.f37483Y;

    public final void a(z zVar, AbstractC0997f abstractC0997f, ArrayList arrayList) {
        AbstractC3557B.c0("$context_receiver_0", zVar);
        AbstractC3557B.c0("thisDescriptor", abstractC0997f);
        for (AbstractC5628e abstractC5628e : this.f45576b) {
            ((C5624a) abstractC5628e).a(zVar, abstractC0997f, arrayList);
        }
    }

    public final void b(z zVar, AbstractC0997f abstractC0997f, C4294f c4294f, ArrayList arrayList) {
        AbstractC3557B.c0("$context_receiver_0", zVar);
        AbstractC3557B.c0("thisDescriptor", abstractC0997f);
        AbstractC3557B.c0("name", c4294f);
        for (AbstractC5628e abstractC5628e : this.f45576b) {
            ((C5624a) abstractC5628e).b(zVar, abstractC0997f, c4294f, arrayList);
        }
    }

    public final void c(z zVar, AbstractC0997f abstractC0997f, C4294f c4294f, C4436a c4436a) {
        AbstractC3557B.c0("$context_receiver_0", zVar);
        AbstractC3557B.c0("thisDescriptor", abstractC0997f);
        AbstractC3557B.c0("name", c4294f);
        for (AbstractC5628e abstractC5628e : this.f45576b) {
            ((C5624a) abstractC5628e).c(zVar, abstractC0997f, c4294f, c4436a);
        }
    }

    public final void d(z zVar, Wf.c cVar, C4294f c4294f, ArrayList arrayList) {
        AbstractC3557B.c0("$context_receiver_0", zVar);
        AbstractC3557B.c0("thisDescriptor", cVar);
        AbstractC3557B.c0("name", c4294f);
        for (AbstractC5628e abstractC5628e : this.f45576b) {
            ((C5624a) abstractC5628e).d(zVar, cVar, c4294f, arrayList);
        }
    }

    public final ArrayList e(z zVar, AbstractC0997f abstractC0997f) {
        AbstractC3557B.c0("$context_receiver_0", zVar);
        AbstractC3557B.c0("thisDescriptor", abstractC0997f);
        ArrayList arrayList = new ArrayList();
        for (AbstractC5628e abstractC5628e : this.f45576b) {
            s.N1(((C5624a) abstractC5628e).e(zVar, abstractC0997f), arrayList);
        }
        return arrayList;
    }

    public final ArrayList f(z zVar, AbstractC0997f abstractC0997f) {
        AbstractC3557B.c0("$context_receiver_0", zVar);
        AbstractC3557B.c0("thisDescriptor", abstractC0997f);
        ArrayList arrayList = new ArrayList();
        for (AbstractC5628e abstractC5628e : this.f45576b) {
            s.N1(((C5624a) abstractC5628e).f(zVar, abstractC0997f), arrayList);
        }
        return arrayList;
    }

    public final ArrayList g(z zVar, Wf.c cVar) {
        AbstractC3557B.c0("$context_receiver_0", zVar);
        AbstractC3557B.c0("thisDescriptor", cVar);
        ArrayList arrayList = new ArrayList();
        for (AbstractC5628e abstractC5628e : this.f45576b) {
            s.N1(((C5624a) abstractC5628e).g(zVar, cVar), arrayList);
        }
        return arrayList;
    }

    public final O h(z zVar, AbstractC0997f abstractC0997f, O o10) {
        AbstractC3557B.c0("$context_receiver_0", zVar);
        AbstractC3557B.c0("propertyDescriptor", o10);
        for (AbstractC5628e abstractC5628e : this.f45576b) {
            o10 = ((C5624a) abstractC5628e).h(zVar, abstractC0997f, o10);
        }
        return o10;
    }
}
