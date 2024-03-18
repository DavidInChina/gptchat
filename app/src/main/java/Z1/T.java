package Z1;

import M1.AbstractC0928i;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import jf.C3963m;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: f  reason: collision with root package name */
    public static AbstractC0928i f22901f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22903a;

    /* renamed from: b  reason: collision with root package name */
    public final AppWidgetManager f22904b;

    /* renamed from: c  reason: collision with root package name */
    public final C3963m f22905c = R4.b.D1(new X0.b(4, this));

    /* renamed from: d  reason: collision with root package name */
    public static final P f22899d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final O1.b f22900e = new O1.b(O1.a.f13334Y, Ad.l.g(Ng.Q.f12906c.plus(Bi.c.z())));

    /* renamed from: g  reason: collision with root package name */
    public static final P1.f f22902g = new P1.f("list::Providers");

    public T(Context context) {
        this.f22903a = context;
        this.f22904b = AppWidgetManager.getInstance(context);
    }

    public final Object a(AbstractC1751a0 abstractC1751a0, Hc.c cVar, AbstractC4825e abstractC4825e) {
        String canonicalName = abstractC1751a0.getClass().getCanonicalName();
        if (canonicalName != null) {
            String canonicalName2 = cVar.getClass().getCanonicalName();
            if (canonicalName2 != null) {
                Object b10 = ((AbstractC0928i) this.f22905c.getValue()).b(new S(canonicalName, canonicalName2, null), abstractC4825e);
                if (b10 == EnumC5000a.f41328Y) {
                    return b10;
                }
                return jf.y.f36177a;
            }
            throw new IllegalArgumentException("no provider name".toString());
        }
        throw new IllegalArgumentException("no receiver name".toString());
    }
}
