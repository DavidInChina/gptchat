package Yf;

import id.AbstractC3557B;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kg.C4294f;
import ug.C5921c;
import ug.C5925g;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22399Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B f22400Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(B b10, int i10) {
        super(0);
        this.f22399Y = i10;
        this.f22400Z = b10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f22399Y;
        B b10 = this.f22400Z;
        switch (i10) {
            case 0:
                C5925g c5925g = C5925g.f46781l;
                ug.n.f46798a.getClass();
                ug.k kVar = ug.k.f46795Y;
                b10.getClass();
                AbstractC3557B.c0("kindFilter", c5925g);
                Tf.d dVar = Tf.d.f17214i0;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (c5925g.a(C5925g.f46780k)) {
                    for (C4294f c4294f : b10.h(c5925g, kVar)) {
                        kVar.invoke(c4294f);
                        Ig.i.b(b10.e(c4294f, dVar), linkedHashSet);
                    }
                }
                boolean a5 = c5925g.a(C5925g.f46777h);
                List list = c5925g.f46788a;
                if (a5 && !list.contains(C5921c.f46767a)) {
                    for (C4294f c4294f2 : b10.i(c5925g, kVar)) {
                        kVar.invoke(c4294f2);
                        linkedHashSet.addAll(b10.a(c4294f2, dVar));
                    }
                }
                if (c5925g.a(C5925g.f46778i) && !list.contains(C5921c.f46767a)) {
                    for (C4294f c4294f3 : b10.o(c5925g)) {
                        kVar.invoke(c4294f3);
                        linkedHashSet.addAll(b10.f(c4294f3, dVar));
                    }
                }
                return kf.t.K2(linkedHashSet);
            case 1:
                return mo122invoke();
            case 2:
                return b10.k();
            case 3:
                return mo122invoke();
            default:
                return mo122invoke();
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final Set mo122invoke() {
        int i10 = this.f22399Y;
        B b10 = this.f22400Z;
        switch (i10) {
            case 1:
                return b10.h(C5925g.f46783n, null);
            case 2:
            default:
                return b10.o(C5925g.f46785p);
            case 3:
                return b10.i(C5925g.f46784o, null);
        }
    }
}
