package t7;

import android.content.Context;
import io.sentry.android.core.AbstractC3612c;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final m f45792a = new m(2, n.l("0\u0082\u0004C0\u0082\u0003+\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"));

    /* renamed from: b  reason: collision with root package name */
    public static final m f45793b = new m(3, n.l("0\u0082\u0004\u00a80\u0082\u0003\u0090\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085\u00b8l}\u00d3N\u00f50"));

    /* renamed from: c  reason: collision with root package name */
    public static Context f45794c;

    static {
        new m(0, n.l("0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bs\u00f9/\u008eQ\u00ed"));
        new m(1, n.l("0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0003\u00a3\u00b2\u00ad\u00d7\u00e1r\u00cak\u00ec"));
    }

    public static synchronized void a(Context context) {
        synchronized (r.class) {
            if (f45794c == null) {
                if (context != null) {
                    f45794c = context.getApplicationContext();
                    return;
                }
                return;
            }
            AbstractC3612c.r("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }
}
