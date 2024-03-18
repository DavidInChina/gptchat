package P8;

import E9.f;
import I8.w;
import L8.g;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f13849a;

    public static void a(b bVar) {
        if (bVar instanceof g) {
            g gVar = (g) bVar;
            gVar.Z0(5);
            Map.Entry entry = (Map.Entry) ((Iterator) gVar.d1()).next();
            gVar.f1(entry.getValue());
            gVar.f1(new w((String) entry.getKey()));
            return;
        }
        int i10 = bVar.f13857m0;
        if (i10 == 0) {
            i10 = bVar.j();
        }
        if (i10 == 13) {
            bVar.f13857m0 = 9;
        } else if (i10 == 12) {
            bVar.f13857m0 = 8;
        } else if (i10 == 14) {
            bVar.f13857m0 = 10;
        } else {
            throw new IllegalStateException("Expected a name but was " + f.L(bVar.R0()) + bVar.V());
        }
    }
}
