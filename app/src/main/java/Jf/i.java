package Jf;

import Bg.D;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Pf.A;
import Pf.AbstractC1144b;
import Pf.C1143a;
import Pf.G;
import id.AbstractC3557B;
import jf.y;
import kg.C4291c;
import kg.C4294f;
import ug.C5928j;

/* loaded from: classes.dex */
public final class i implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9109Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f9110Z;

    public /* synthetic */ i(int i10, Object obj) {
        this.f9109Y = i10;
        this.f9110Z = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (Mf.r.c(Mf.r.f12113m, r5, r2) == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean a(AbstractC0994c abstractC0994c) {
        int i10 = this.f9109Y;
        boolean z10 = true;
        Object obj = this.f9110Z;
        switch (i10) {
            case 3:
                if (abstractC0994c.mo20k() != ((AbstractC1003l) obj)) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                if (!Mf.r.e(abstractC0994c.getVisibility())) {
                    AbstractC0997f abstractC0997f = (AbstractC0997f) obj;
                    if (abstractC0997f == null) {
                        Mf.r.a(3);
                        throw null;
                    }
                    break;
                }
                z10 = false;
                return Boolean.valueOf(z10);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f9109Y;
        Object obj2 = this.f9110Z;
        switch (i10) {
            case 0:
                C4294f c4294f = (C4294f) obj;
                G k10 = ((l) obj2).k();
                C4291c c4291c = q.f9204k;
                C5928j c5928j = ((A) k10.r(c4291c)).f13979l0;
                if (c5928j != null) {
                    AbstractC1000i e10 = c5928j.e(c4294f, Tf.d.f17211Y);
                    if (e10 != null) {
                        if (e10 instanceof AbstractC0997f) {
                            return (AbstractC0997f) e10;
                        }
                        throw new AssertionError("Must be a class descriptor " + c4294f + ", but was " + e10);
                    }
                    throw new AssertionError("Built-in class " + c4291c.c(c4294f) + " is not found");
                }
                l.a(11);
                throw null;
            case 1:
                C1143a c1143a = (C1143a) obj2;
                AbstractC1144b abstractC1144b = c1143a.f14075Z;
                ((Cg.h) ((Cg.i) obj)).getClass();
                AbstractC3557B.c0("descriptor", abstractC1144b);
                return (D) c1143a.f14075Z.f14078Z.mo122invoke();
            case 2:
                AbstractC0994c abstractC0994c = (AbstractC0994c) obj;
                if (abstractC0994c != null) {
                    ((Vf.a) obj2).f18935n0.c(abstractC0994c);
                    return y.f36177a;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
            case 3:
                return a((AbstractC0994c) obj);
            default:
                return a((AbstractC0994c) obj);
        }
    }
}
