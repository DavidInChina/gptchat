package ji;

import fi.C3100a;
import id.AbstractC3557B;
import java.io.FileNotFoundException;
import java.util.List;

/* renamed from: ji.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4141p {

    /* renamed from: a  reason: collision with root package name */
    public static final x f36737a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        x xVar;
        try {
            Class.forName("java.nio.file.Files");
            xVar = new Object();
        } catch (ClassNotFoundException unused) {
            xVar = new Object();
        }
        f36737a = xVar;
        String str = C4113B.f36660Z;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC3557B.b0("getProperty(...)", property);
        C3100a.f(property, false);
        ClassLoader classLoader = ki.e.class.getClassLoader();
        AbstractC3557B.b0("getClassLoader(...)", classLoader);
        new ki.e(classLoader);
    }

    public abstract AbstractC4120I a(C4113B c4113b);

    public abstract void b(C4113B c4113b, C4113B c4113b2);

    public abstract void c(C4113B c4113b);

    public abstract void d(C4113B c4113b);

    public final void e(C4113B c4113b) {
        AbstractC3557B.c0("path", c4113b);
        d(c4113b);
    }

    public final boolean f(C4113B c4113b) {
        AbstractC3557B.c0("path", c4113b);
        if (i(c4113b) != null) {
            return true;
        }
        return false;
    }

    public abstract List g(C4113B c4113b);

    public final C4140o h(C4113B c4113b) {
        AbstractC3557B.c0("path", c4113b);
        C4140o i10 = i(c4113b);
        if (i10 != null) {
            return i10;
        }
        throw new FileNotFoundException("no such file: " + c4113b);
    }

    public abstract C4140o i(C4113B c4113b);

    public abstract w j(C4113B c4113b);

    public abstract AbstractC4120I k(C4113B c4113b);

    public abstract AbstractC4122K l(C4113B c4113b);
}
