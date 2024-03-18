package wh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.security.AccessController;

/* renamed from: wh.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6232H extends AbstractC6227C {

    /* renamed from: Z  reason: collision with root package name */
    public static final boolean f48524Z;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    static {
        Object obj;
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f48524Z = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f48524Z = z10;
            Th.y a5 = Th.y.a(AbstractC6231G.class);
            if (f48524Z) {
            }
            AbstractC2469q0.p(obj);
        } catch (SecurityException unused2) {
            z10 = true;
            f48524Z = z10;
            Th.y a52 = Th.y.a(AbstractC6231G.class);
            if (f48524Z) {
            }
            AbstractC2469q0.p(obj);
        }
        Th.y a522 = Th.y.a(AbstractC6231G.class);
        if (f48524Z) {
            obj = AccessController.doPrivileged(a522);
        } else {
            obj = a522.run();
        }
        AbstractC2469q0.p(obj);
    }
}
