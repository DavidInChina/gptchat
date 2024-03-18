package De;

import id.AbstractC3557B;
import java.util.List;
import java.util.ServiceLoader;
import kf.t;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final List f3584a;

    static {
        ServiceLoader load = ServiceLoader.load(Ee.c.class, Ee.c.class.getClassLoader());
        AbstractC3557B.b0("load(it, it.classLoader)", load);
        f3584a = t.K2(load);
    }
}
