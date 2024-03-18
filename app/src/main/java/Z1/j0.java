package Z1;

import a1.C1915c;
import android.content.Context;
import h2.C3309f;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: g  reason: collision with root package name */
    public static final C1915c f22987g = new C1915c(13, 0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f22988a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f22989b;

    /* renamed from: c  reason: collision with root package name */
    public int f22990c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22991d;

    /* renamed from: e  reason: collision with root package name */
    public final Set f22992e;

    /* renamed from: f  reason: collision with root package name */
    public final Set f22993f;

    public j0(Context context, LinkedHashMap linkedHashMap, int i10, int i11, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f22988a = context;
        this.f22989b = linkedHashMap;
        this.f22990c = i10;
        this.f22991d = i11;
        this.f22992e = linkedHashSet;
        this.f22993f = set;
    }

    public final Object a(C1764h c1764h) {
        C3309f c3309f = C3309f.f31773a;
        p0 p0Var = p0.f23050a;
        Object d10 = c3309f.d(this.f22988a, p0Var, "appWidgetLayout-" + this.f22991d, new C1767i0(this, null), c1764h);
        if (d10 == EnumC5000a.f41328Y) {
            return d10;
        }
        return jf.y.f36177a;
    }
}
