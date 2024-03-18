package W;

import Z.AbstractC1725n;
import Z.AbstractC1748z;
import z.AbstractC6708l;

/* renamed from: W.b3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1530b3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Z.m1 f19940a = new AbstractC1748z(Q0.f19571m0);

    public static final r0.L a(int i10, AbstractC1725n abstractC1725n) {
        C1525a3 c1525a3 = (C1525a3) ((Z.r) abstractC1725n).m(f19940a);
        switch (AbstractC6708l.f(i10)) {
            case 0:
                return c1525a3.f19908e;
            case 1:
                return b(c1525a3.f19908e);
            case 2:
                return c1525a3.f19904a;
            case 3:
                return b(c1525a3.f19904a);
            case 4:
                return K.f.f9317a;
            case 5:
                return c1525a3.f19907d;
            case 6:
                K.a aVar = c1525a3.f19907d;
                float f6 = (float) 0.0d;
                return K.a.a(aVar, new K.c(f6), null, new K.c(f6), 6);
            case 7:
                return b(c1525a3.f19907d);
            case 8:
                return c1525a3.f19906c;
            case 9:
                return r0.G.f44171a;
            case 10:
                return c1525a3.f19905b;
            default:
                throw new RuntimeException();
        }
    }

    public static final K.e b(K.a aVar) {
        float f6 = (float) 0.0d;
        return K.a.a(aVar, null, new K.c(f6), new K.c(f6), 3);
    }
}
