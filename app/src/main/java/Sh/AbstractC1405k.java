package Sh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.security.AccessController;

/* renamed from: Sh.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1405k implements AbstractC1396b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f16728a;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    static {
        boolean z10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z11 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f16728a = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f16728a = z11;
            Th.y a5 = Th.y.a(AbstractC1401g.class);
            z10 = f16728a;
            if (z10) {
            }
            AbstractC2469q0.p(obj);
            Th.y a10 = Th.y.a(AbstractC1404j.class);
            if (z10) {
            }
            AbstractC2469q0.p(obj2);
            Th.y a11 = Th.y.a(AbstractC1403i.class);
            if (z10) {
            }
            AbstractC2469q0.p(obj3);
            Th.y a12 = Th.y.a(AbstractC1402h.class);
            if (z10) {
            }
            AbstractC2469q0.p(obj4);
        } catch (SecurityException unused2) {
            z11 = true;
            f16728a = z11;
            Th.y a52 = Th.y.a(AbstractC1401g.class);
            z10 = f16728a;
            if (z10) {
            }
            AbstractC2469q0.p(obj);
            Th.y a102 = Th.y.a(AbstractC1404j.class);
            if (z10) {
            }
            AbstractC2469q0.p(obj2);
            Th.y a112 = Th.y.a(AbstractC1403i.class);
            if (z10) {
            }
            AbstractC2469q0.p(obj3);
            Th.y a122 = Th.y.a(AbstractC1402h.class);
            if (z10) {
            }
            AbstractC2469q0.p(obj4);
        }
        Th.y a522 = Th.y.a(AbstractC1401g.class);
        z10 = f16728a;
        if (z10) {
            obj = AccessController.doPrivileged(a522);
        } else {
            obj = a522.run();
        }
        AbstractC2469q0.p(obj);
        Th.y a1022 = Th.y.a(AbstractC1404j.class);
        if (z10) {
            obj2 = AccessController.doPrivileged(a1022);
        } else {
            obj2 = a1022.run();
        }
        AbstractC2469q0.p(obj2);
        Th.y a1122 = Th.y.a(AbstractC1403i.class);
        if (z10) {
            obj3 = AccessController.doPrivileged(a1122);
        } else {
            obj3 = a1122.run();
        }
        AbstractC2469q0.p(obj3);
        Th.y a1222 = Th.y.a(AbstractC1402h.class);
        if (z10) {
            obj4 = AccessController.doPrivileged(a1222);
        } else {
            obj4 = a1222.run();
        }
        AbstractC2469q0.p(obj4);
    }
}
