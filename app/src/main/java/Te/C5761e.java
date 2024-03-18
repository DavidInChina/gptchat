package te;

import Fe.l;
import Ng.AbstractC1073l0;
import id.AbstractC3557B;
import java.util.Map;
import java.util.Set;
import kf.x;
import me.O;
import me.P;
import xe.AbstractC6432u;
import xe.C6396A;
import xe.C6410O;
import xe.C6434w;
import ze.AbstractC6848g;

/* renamed from: te.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5761e {

    /* renamed from: a  reason: collision with root package name */
    public final C6410O f46131a;

    /* renamed from: b  reason: collision with root package name */
    public final C6396A f46132b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6432u f46133c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC6848g f46134d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1073l0 f46135e;

    /* renamed from: f  reason: collision with root package name */
    public final Fe.b f46136f;

    /* renamed from: g  reason: collision with root package name */
    public final Set f46137g;

    public C5761e(C6410O c6410o, C6396A c6396a, C6434w c6434w, AbstractC6848g abstractC6848g, AbstractC1073l0 abstractC1073l0, l lVar) {
        Set set;
        AbstractC3557B.c0("method", c6396a);
        AbstractC3557B.c0("executionContext", abstractC1073l0);
        AbstractC3557B.c0("attributes", lVar);
        this.f46131a = c6410o;
        this.f46132b = c6396a;
        this.f46133c = c6434w;
        this.f46134d = abstractC6848g;
        this.f46135e = abstractC1073l0;
        this.f46136f = lVar;
        Map map = (Map) lVar.d(je.f.f36131a);
        this.f46137g = (map == null || (set = map.keySet()) == null) ? x.f37485Y : set;
    }

    public final Object a() {
        O o10 = P.f39182d;
        Map map = (Map) this.f46136f.d(je.f.f36131a);
        if (map != null) {
            return map.get(o10);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f46131a + ", method=" + this.f46132b + ')';
    }
}
