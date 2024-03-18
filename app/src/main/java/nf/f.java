package Nf;

import Jf.p;
import id.AbstractC3557B;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.v;
import kg.C4290b;
import kg.C4294f;
import pg.C5164a;
import pg.C5165b;
import pg.C5172i;
import pg.C5186w;
import zc.C6821H;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final C4294f f12817a = C4294f.e("message");

    /* renamed from: b  reason: collision with root package name */
    public static final C4294f f12818b = C4294f.e("replaceWith");

    /* renamed from: c  reason: collision with root package name */
    public static final C4294f f12819c = C4294f.e("level");

    /* renamed from: d  reason: collision with root package name */
    public static final C4294f f12820d = C4294f.e("expression");

    /* renamed from: e  reason: collision with root package name */
    public static final C4294f f12821e = C4294f.e("imports");

    public static k a(Jf.l lVar, String str, String str2, int i10) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        AbstractC3557B.c0("<this>", lVar);
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("replaceWith", str2);
        return new k(lVar, p.f9180m, AbstractC4268D.a1(new C3959i(f12817a, new C5186w(str)), new C3959i(f12818b, new C5164a(new k(lVar, p.f9182o, AbstractC4268D.a1(new C3959i(f12820d, new C5186w(str2)), new C3959i(f12821e, new C5165b(new C6821H(25, lVar), v.f37483Y)))))), new C3959i(f12819c, new C5172i(C4290b.j(p.f9181n), C4294f.e("WARNING")))));
    }
}
