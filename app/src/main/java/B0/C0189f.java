package B0;

import java.util.List;
import w.C6066m;

/* renamed from: B0.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0189f {

    /* renamed from: a  reason: collision with root package name */
    public final C6066m f1633a;

    /* renamed from: b  reason: collision with root package name */
    public final w f1634b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1635c;

    public C0189f(C6066m c6066m, w wVar) {
        this.f1633a = c6066m;
        this.f1634b = wVar;
    }

    public final boolean a(long j6) {
        Object obj;
        List list = this.f1634b.f1686a;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = list.get(i10);
                if (t.a(((x) obj).f1688a, j6)) {
                    break;
                }
                i10++;
            } else {
                obj = null;
                break;
            }
        }
        x xVar = (x) obj;
        if (xVar == null) {
            return false;
        }
        return xVar.f1695h;
    }
}
