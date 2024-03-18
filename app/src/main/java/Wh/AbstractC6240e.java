package wh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.reflect.AnnotatedElement;
import java.security.AccessController;
import sh.AbstractC5631c;
import yh.l1;

/* renamed from: wh.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6240e extends AbstractC6241f {

    /* renamed from: h0  reason: collision with root package name */
    public static final boolean f48533h0;

    /* renamed from: Z  reason: collision with root package name */
    public final AnnotatedElement f48534Z;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    static {
        Object obj;
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f48533h0 = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f48533h0 = z10;
            Th.y a5 = Th.y.a(AbstractC6239d.class);
            if (f48533h0) {
            }
            AbstractC2469q0.p(obj);
        } catch (SecurityException unused2) {
            z10 = true;
            f48533h0 = z10;
            Th.y a52 = Th.y.a(AbstractC6239d.class);
            if (f48533h0) {
            }
            AbstractC2469q0.p(obj);
        }
        Th.y a522 = Th.y.a(AbstractC6239d.class);
        if (f48533h0) {
            obj = AccessController.doPrivileged(a522);
        } else {
            obj = a522.run();
        }
        AbstractC2469q0.p(obj);
    }

    public AbstractC6240e(AnnotatedElement annotatedElement) {
        this.f48534Z = annotatedElement;
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o
    public final l1.a T() {
        throw null;
    }

    @Override // wh.AbstractC6241f, sh.AbstractC5631c
    public final AbstractC5631c y() {
        return this;
    }
}
