package O8;

import com.auth0.android.request.internal.i;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f13435a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f13436b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f13437c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f13438d;

    /* renamed from: e  reason: collision with root package name */
    public static final i f13439e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f13440f;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f13435a = z10;
        if (z10) {
            f13436b = new d(Date.class, 0);
            f13437c = new d(Timestamp.class, 1);
            f13438d = a.f13428b;
            f13439e = b.f13430b;
            f13440f = c.f13432b;
            return;
        }
        f13436b = null;
        f13437c = null;
        f13438d = null;
        f13439e = null;
        f13440f = null;
    }
}
