package Kd;

import Dd.O;
import Qg.F0;
import Qg.s0;
import Z8.AbstractC1809m0;
import Z8.a1;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import x8.W;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final String f9713a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9714b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9715c;

    /* renamed from: d  reason: collision with root package name */
    public final Ed.n f9716d;

    /* renamed from: e  reason: collision with root package name */
    public final Pc.g f9717e = Bi.c.i1(Pc.b.f13932j0);

    /* renamed from: f  reason: collision with root package name */
    public final Yg.p f9718f = new Yg.p(AbstractC6463a.n("instant(...)"));

    /* renamed from: g  reason: collision with root package name */
    public Yg.p f9719g;

    /* renamed from: h  reason: collision with root package name */
    public Yg.p f9720h;

    /* renamed from: i  reason: collision with root package name */
    public Yg.p f9721i;

    /* renamed from: j  reason: collision with root package name */
    public final F0 f9722j;

    /* renamed from: k  reason: collision with root package name */
    public final F0 f9723k;

    public K(String str, String str2, String str3, Ed.n nVar) {
        AbstractC3557B.c0("sessionId", str);
        AbstractC3557B.c0("modelSlug", str2);
        AbstractC3557B.c0("surface", nVar);
        this.f9713a = str;
        this.f9714b = str2;
        this.f9715c = str3;
        this.f9716d = nVar;
        Yg.p.Companion.getClass();
        F0 c10 = s0.c(kf.w.f37484Y);
        this.f9722j = c10;
        this.f9723k = c10;
    }

    public final void a(a1 a1Var, Map map) {
        AbstractC3557B.c0(DiagnosticsEntry.Event.PROPERTIES_KEY, map);
        C3959i[] c3959iArr = new C3959i[5];
        c3959iArr[0] = new C3959i("voice_session_id", this.f9713a);
        c3959iArr[1] = new C3959i("voice_model_slug", this.f9714b);
        String str = this.f9715c;
        if (str == null) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        c3959iArr[2] = new C3959i("voice_gizmo_id", str);
        c3959iArr[3] = new C3959i("voice_get_token_with_params", Boolean.TRUE);
        c3959iArr[4] = new C3959i("surface", this.f9716d.f4693Y);
        LinkedHashMap e12 = AbstractC4268D.e1(map, AbstractC4268D.a1(c3959iArr));
        AbstractC1809m0.a().b(a1Var, e12);
        if (O.f3530a.contains(a1Var)) {
            W.W(this.f9717e, a1Var.toString(), null, e12, 2);
        }
    }
}
