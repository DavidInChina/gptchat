package ph;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import livekit.org.webrtc.WebrtcBuildVersion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class c extends Enum implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public static final c f43177Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ c[] f43178Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, ph.c] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f43177Y = r12;
        f43178Z = new c[]{r12};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f43178Z.clone();
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Method method;
        Class cls;
        try {
            try {
                try {
                    method = Class.forName(Runtime.class.getName().concat("$Version")).getMethod("feature", new Class[0]);
                } catch (Throwable th2) {
                    return new d(th2.getMessage());
                }
            } catch (NoSuchMethodException unused) {
                method = cls.getMethod("major", new Class[0]);
            }
            return new C5190b(f.g(((Integer) method.invoke(Runtime.class.getMethod(ParameterNames.VERSION, new Class[0]).invoke(null, new Object[0]), new Object[0])).intValue()));
        } catch (Throwable unused2) {
            String property = System.getProperty("java.version");
            if (property != null) {
                if (property.equals(WebrtcBuildVersion.maint_version)) {
                    return new C5190b(f.f43190l0);
                }
                if (property.endsWith("-ea")) {
                    property = property.substring(0, property.length() - 3);
                }
                int[] iArr = {-1, 0, 0};
                for (int i10 = 1; i10 < 3; i10++) {
                    int indexOf = property.indexOf(46, iArr[i10 - 1] + 1);
                    iArr[i10] = indexOf;
                    if (indexOf == -1) {
                        throw new IllegalStateException("This JVM's version string does not seem to be valid: " + property);
                    }
                }
                return new C5190b(f.g(Integer.parseInt(property.substring(iArr[1] + 1, iArr[2]))));
            }
            throw new IllegalStateException("Java version property is not set");
        }
    }
}
