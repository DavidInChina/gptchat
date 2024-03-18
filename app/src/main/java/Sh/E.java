package Sh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.security.AccessController;
import sh.AbstractC5638j;
import th.AbstractC5808p;

/* loaded from: classes2.dex */
public abstract class E implements AbstractC5638j, AbstractC5808p {

    /* renamed from: Y  reason: collision with root package name */
    public static final boolean f16692Y;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    static {
        boolean z10;
        Object obj;
        Object obj2;
        boolean z11 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f16692Y = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f16692Y = z11;
            Th.y a5 = Th.y.a(D.class);
            z10 = f16692Y;
            if (z10) {
            }
            AbstractC2469q0.p(obj);
            Th.y a10 = Th.y.a(C.class);
            if (z10) {
            }
            AbstractC2469q0.p(obj2);
        } catch (SecurityException unused2) {
            z11 = true;
            f16692Y = z11;
            Th.y a52 = Th.y.a(D.class);
            z10 = f16692Y;
            if (z10) {
            }
            AbstractC2469q0.p(obj);
            Th.y a102 = Th.y.a(C.class);
            if (z10) {
            }
            AbstractC2469q0.p(obj2);
        }
        Th.y a522 = Th.y.a(D.class);
        z10 = f16692Y;
        if (z10) {
            obj = AccessController.doPrivileged(a522);
        } else {
            obj = a522.run();
        }
        AbstractC2469q0.p(obj);
        Th.y a1022 = Th.y.a(C.class);
        if (z10) {
            obj2 = AccessController.doPrivileged(a1022);
        } else {
            obj2 = a1022.run();
        }
        AbstractC2469q0.p(obj2);
    }

    public static boolean b() {
        return ph.f.i(ph.f.f43189k0).d(ph.f.f43193o0);
    }
}
