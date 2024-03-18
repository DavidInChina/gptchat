package i0;

import G.U;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import h.C3281g;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.y;

/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: d  reason: collision with root package name */
    public static final f8.e f32419d = new f8.e(27, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final r f32420e;

    /* renamed from: a  reason: collision with root package name */
    public final Map f32421a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f32422b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public m f32423c;

    static {
        f fVar = f.f32409Z;
        g gVar = g.f32412Z;
        r rVar = s.f32436a;
        f32420e = new r(fVar, gVar);
    }

    public j(Map map) {
        this.f32421a = map;
    }

    @Override // i0.e
    public final void e(Object obj) {
        i iVar = (i) this.f32422b.get(obj);
        if (iVar != null) {
            iVar.f32417b = false;
        } else {
            this.f32421a.remove(obj);
        }
    }

    @Override // i0.e
    public final void f(Object obj, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1198538093);
        rVar.W(444418301);
        rVar.Y(obj);
        rVar.W(-492369756);
        Object K10 = rVar.K();
        if (K10 == C1723m.f22654Y) {
            m mVar = this.f32423c;
            if (mVar != null && !mVar.a(obj)) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            K10 = new i(this, obj);
            rVar.h0(K10);
        }
        rVar.t(false);
        i iVar = (i) K10;
        A7.b.k(p.f32433a.b(iVar.f32418c), nVar, rVar, i10 & 112);
        AbstractC1734s.b(y.f36177a, new C3281g(this, obj, iVar, 19), rVar);
        rVar.w();
        rVar.t(false);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new U(this, obj, nVar, i10, 5);
        }
    }
}
