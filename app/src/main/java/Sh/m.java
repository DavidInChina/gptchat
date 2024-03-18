package Sh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.security.AccessController;

/* loaded from: classes2.dex */
public abstract class m implements AbstractC1396b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f16729a;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    static {
        Object obj;
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f16729a = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f16729a = z10;
            Th.y a5 = Th.y.a(l.class);
            if (f16729a) {
            }
            AbstractC2469q0.p(obj);
        } catch (SecurityException unused2) {
            z10 = true;
            f16729a = z10;
            Th.y a52 = Th.y.a(l.class);
            if (f16729a) {
            }
            AbstractC2469q0.p(obj);
        }
        Th.y a522 = Th.y.a(l.class);
        if (f16729a) {
            obj = AccessController.doPrivileged(a522);
        } else {
            obj = a522.run();
        }
        AbstractC2469q0.p(obj);
    }
}
