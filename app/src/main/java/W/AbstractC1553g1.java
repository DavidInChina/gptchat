package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import z.AbstractC6657D;
import z.C6694e;
import z.C6732x;
import z.C6735y0;

/* renamed from: W.g1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1553g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C6735y0 f20072a = new C6735y0(120, AbstractC6657D.f51125a, 2);

    /* renamed from: b  reason: collision with root package name */
    public static final C6735y0 f20073b;

    /* renamed from: c  reason: collision with root package name */
    public static final C6735y0 f20074c;

    static {
        C6732x c6732x = new C6732x(0.4f, 0.6f, 1.0f);
        f20073b = new C6735y0(150, c6732x, 2);
        f20074c = new C6735y0(120, c6732x, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if ((r10 instanceof D.d) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
        if ((r9 instanceof D.d) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C6694e c6694e, float f6, D.k kVar, D.k kVar2, AbstractC4825e abstractC4825e) {
        C6735y0 c6735y0;
        C6735y0 c6735y02 = null;
        if (kVar2 != null) {
            boolean z10 = kVar2 instanceof D.p;
            c6735y0 = f20072a;
            if (!z10) {
                if (!(kVar2 instanceof D.b)) {
                    if (!(kVar2 instanceof D.h)) {
                    }
                }
            }
            c6735y02 = c6735y0;
        } else if (kVar != null) {
            boolean z11 = kVar instanceof D.p;
            c6735y0 = f20073b;
            if (!z11 && !(kVar instanceof D.b)) {
                if (kVar instanceof D.h) {
                    c6735y02 = f20074c;
                }
            }
            c6735y02 = c6735y0;
        }
        C6735y0 c6735y03 = c6735y02;
        jf.y yVar = jf.y.f36177a;
        if (c6735y03 != null) {
            Object c10 = C6694e.c(c6694e, new Z0.e(f6), c6735y03, null, abstractC4825e, 12);
            if (c10 == EnumC5000a.f41328Y) {
                return c10;
            }
            return yVar;
        }
        Object f10 = c6694e.f(new Z0.e(f6), abstractC4825e);
        if (f10 == EnumC5000a.f41328Y) {
            return f10;
        }
        return yVar;
    }
}
