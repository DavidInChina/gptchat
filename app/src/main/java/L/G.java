package L;

import E0.AbstractC0461u;
import H0.C0705t0;
import H0.T0;
import N0.C1046e;
import Z.AbstractC1743w0;
import Z.C1741v0;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9938Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ P0 f9939Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(P0 p02, int i10) {
        super(1);
        this.f9938Y = i10;
        this.f9939Z = p02;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        wf.k kVar;
        jf.y yVar;
        T0 t02;
        String str;
        jf.y yVar2 = jf.y.f36177a;
        int i10 = this.f9938Y;
        boolean z10 = false;
        P0 p02 = this.f9939Z;
        switch (i10) {
            case 0:
                AbstractC0461u abstractC0461u = (AbstractC0461u) obj;
                Q0 d10 = p02.d();
                if (d10 != null) {
                    d10.f10056c = abstractC0461u;
                }
                return yVar2;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                p02.f10045q.setValue(bool);
                return yVar2;
            case 2:
                List list = (List) obj;
                if (p02.d() != null) {
                    Q0 d11 = p02.d();
                    AbstractC3557B.Z(d11);
                    list.add(d11.f10054a);
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 3:
                int i11 = ((T0.n) obj).f16801a;
                C0859l0 c0859l0 = p02.f10046r;
                c0859l0.getClass();
                if (T0.n.a(i11, 7)) {
                    kVar = c0859l0.a().f10237a;
                } else if (T0.n.a(i11, 2)) {
                    kVar = c0859l0.a().f10238b;
                } else if (T0.n.a(i11, 6)) {
                    kVar = c0859l0.a().f10239c;
                } else if (T0.n.a(i11, 5)) {
                    kVar = c0859l0.a().f10240d;
                } else if (T0.n.a(i11, 3)) {
                    kVar = c0859l0.a().f10241e;
                } else if (T0.n.a(i11, 4)) {
                    kVar = c0859l0.a().f10242f;
                } else if (T0.n.a(i11, 1) || T0.n.a(i11, 0)) {
                    kVar = null;
                } else {
                    throw new IllegalStateException("invalid ImeAction".toString());
                }
                if (kVar != null) {
                    kVar.invoke(c0859l0);
                    yVar = yVar2;
                } else {
                    yVar = null;
                }
                if (yVar == null) {
                    if (T0.n.a(i11, 6)) {
                        p0.f fVar = c0859l0.f10231c;
                        if (fVar != null) {
                            ((p0.g) fVar).b(1);
                        } else {
                            AbstractC3557B.C2("focusManager");
                            throw null;
                        }
                    } else if (T0.n.a(i11, 5)) {
                        p0.f fVar2 = c0859l0.f10231c;
                        if (fVar2 != null) {
                            ((p0.g) fVar2).b(2);
                        } else {
                            AbstractC3557B.C2("focusManager");
                            throw null;
                        }
                    } else if (T0.n.a(i11, 7) && (t02 = c0859l0.f10229a) != null) {
                        ((T0.D) ((C0705t0) t02).f7042a.f16730a).a(T0.B.f16735i0);
                    }
                }
                return yVar2;
            default:
                T0.z zVar = (T0.z) obj;
                String str2 = zVar.f16830a.f12512Y;
                C1046e c1046e = p02.f10038j;
                if (c1046e != null) {
                    str = c1046e.f12512Y;
                } else {
                    str = null;
                }
                if (!AbstractC3557B.K(str2, str)) {
                    p02.f10039k.setValue(Z.f10085Y);
                }
                p02.f10047s.invoke(zVar);
                C1741v0 c1741v0 = (C1741v0) p02.f10030b;
                AbstractC1743w0 abstractC1743w0 = c1741v0.f22737b;
                if (abstractC1743w0 != null) {
                    abstractC1743w0.c(c1741v0, null);
                }
                return yVar2;
        }
    }
}
