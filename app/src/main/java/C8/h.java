package C8;

import S4.o;
import u7.C5848d;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final h f2746b = new h(new C5848d(13));

    /* renamed from: a  reason: collision with root package name */
    public final g f2747a;

    static {
        new h(new f8.e(11));
        new h(new f8.e(13));
        new h(new f8.e(14));
        new h(new C5848d(11));
        new h(new C5848d(12));
        new h(new f8.e(12));
    }

    public h(i iVar) {
        if (B8.a.f1987a.get()) {
            this.f2747a = new f(iVar, 1, 0);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f2747a = new f(iVar, 0, 0);
        } else {
            this.f2747a = new o(iVar);
        }
    }
}
