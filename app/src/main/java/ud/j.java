package ud;

import N0.C1044c;
import N0.y;
import S0.D;
import java.util.List;
import r0.r;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final long f46696a = androidx.compose.ui.graphics.a.c(4291941851L);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f46697b = 0;

    public static final void a(C1044c c1044c, g gVar) {
        long j6;
        D d10;
        r rVar = gVar.f46687b;
        List<g> list = gVar.f46689d;
        if (rVar != null) {
            j6 = rVar.f44265a;
        } else {
            j6 = r.f44263k;
        }
        long j10 = j6;
        Integer num = gVar.f46688c;
        if (num != null) {
            d10 = new D(num.intValue());
        } else {
            d10 = null;
        }
        int h10 = c1044c.h(new y(j10, 0L, d10, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
        try {
            boolean isEmpty = list.isEmpty();
            if (isEmpty) {
                c1044c.c(gVar.f46686a);
            } else if (!isEmpty) {
                for (g gVar2 : list) {
                    a(c1044c, gVar2);
                }
            }
            c1044c.e(h10);
        } catch (Throwable th2) {
            c1044c.e(h10);
            throw th2;
        }
    }
}
