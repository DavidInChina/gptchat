package A;

import Ga.C0623f;
import I9.j1;
import ab.C1965s;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import f2.C2934a;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import l8.AbstractC4344b;
import xe.AbstractC6435x;
import xe.C6405J;
import xe.C6433v;
import za.C6807x;

/* renamed from: A.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0039q0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f283Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f284Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0039q0(String str, int i10) {
        super(1);
        this.f283Y = i10;
        this.f284Z = str;
    }

    public final C1965s a(C1965s c1965s) {
        int i10 = this.f283Y;
        String str = this.f284Z;
        switch (i10) {
            case 27:
                AbstractC3557B.c0("$this$setState", c1965s);
                return C1965s.e(c1965s, kf.t.x2(str, c1965s.f24125b), null, null, 13);
            case 28:
                AbstractC3557B.c0("$this$setState", c1965s);
                return C1965s.e(c1965s, kf.t.t2(c1965s.f24125b, str), null, null, 13);
            default:
                AbstractC3557B.c0("$this$setState", c1965s);
                return C1965s.e(c1965s, kf.t.t2(c1965s.f24125b, str), null, null, 13);
        }
    }

    public final C6807x c(C6807x c6807x) {
        int i10 = this.f283Y;
        String str = this.f284Z;
        switch (i10) {
            case 11:
                AbstractC3557B.c0("$this$update", c6807x);
                int length = str.length();
                return C6807x.a(c6807x, new T0.z(str, U3.f.e(length, length), 4), null, null, false, null, 30);
            default:
                AbstractC3557B.c0("$this$update", c6807x);
                T0.z zVar = c6807x.f51804a;
                if (!Lg.n.I2(zVar.f16830a.f12512Y, str, false)) {
                    zVar = new T0.z(str, U3.f.e(str.length(), str.length()), 4);
                }
                return C6807x.a(c6807x, zVar, null, null, false, null, 30);
        }
    }

    public final void e(L0.v vVar) {
        int i10 = this.f283Y;
        String str = this.f284Z;
        switch (i10) {
            case 0:
                L0.t.d(vVar, str);
                L0.t.e(vVar, 5);
                return;
            case 1:
                L0.t.d(vVar, str);
                return;
            default:
                L0.t.d(vVar, str);
                L0.t.e(vVar, 5);
                return;
        }
    }

    public final void f(C6405J c6405j) {
        int i10 = this.f283Y;
        String str = this.f284Z;
        switch (i10) {
            case 13:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{"gen_title", str});
                return;
            case 14:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str});
                return;
            case 15:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str, "experimental", "generate_suggestions"});
                return;
            case 16:
            default:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str});
                P4.a.n(c6405j, new String[]{"sidebar"});
                return;
            case 17:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str});
                return;
            case 18:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str});
                return;
            case 19:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str});
                return;
            case 20:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str});
                return;
            case 21:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str, "interpreter/download"});
                return;
            case 22:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str});
                return;
            case 23:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str});
                P4.a.n(c6405j, new String[]{"about"});
                return;
            case 24:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str});
                return;
            case 25:
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{str});
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Spanned spanned;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f283Y;
        String str = this.f284Z;
        switch (i10) {
            case 0:
                e((L0.v) obj);
                return yVar;
            case 1:
                e((L0.v) obj);
                return yVar;
            case 2:
                ((C2934a) ((f2.d) obj)).f29523a.put(f2.c.f29525a, AbstractC4344b.F0(str));
                return yVar;
            case 3:
                return Boolean.valueOf(AbstractC3557B.K((String) obj, str));
            case 4:
                B3.b bVar = (B3.b) obj;
                AbstractC3557B.c0("db", bVar);
                bVar.t(str);
                return null;
            case 5:
                e((L0.v) obj);
                return yVar;
            case 6:
                Map map = (Map) obj;
                AbstractC3557B.c0("it", map);
                map.remove("context@" + str);
                return yVar;
            case 7:
                TextView textView = (TextView) obj;
                AbstractC3557B.c0("it", textView);
                if (Build.VERSION.SDK_INT >= 24) {
                    spanned = Html.fromHtml(str, 0);
                } else {
                    spanned = Html.fromHtml(str);
                }
                textView.setText(spanned);
                return yVar;
            case 8:
                nd.h hVar = (nd.h) obj;
                return new nd.h(str, true);
            case 9:
                H9.o oVar = (H9.o) obj;
                AbstractC3557B.c0("$this$setState", oVar);
                return H9.o.e(oVar, false, null, this.f284Z, false, 23);
            case 10:
                j1 j1Var = (j1) obj;
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, this.f284Z, false, null, null, null, null, false, 130559);
            case 11:
                return c((C6807x) obj);
            case 12:
                return c((C6807x) obj);
            case 13:
                f((C6405J) obj);
                return yVar;
            case 14:
                f((C6405J) obj);
                return yVar;
            case 15:
                f((C6405J) obj);
                return yVar;
            case 16:
                C6433v c6433v = (C6433v) obj;
                AbstractC3557B.c0("$this$headers", c6433v);
                List list = AbstractC6435x.f49956a;
                c6433v.f("Cache-Control", "no-cache");
                c6433v.f("Connection", "keep-alive");
                if (str != null) {
                    c6433v.f("X-Sentinel-Payload", md.b.f39132a.d(C0623f.Companion.serializer(), new C0623f(str)));
                }
                return yVar;
            case 17:
                f((C6405J) obj);
                return yVar;
            case 18:
                f((C6405J) obj);
                return yVar;
            case 19:
                f((C6405J) obj);
                return yVar;
            case 20:
                f((C6405J) obj);
                return yVar;
            case 21:
                f((C6405J) obj);
                return yVar;
            case 22:
                f((C6405J) obj);
                return yVar;
            case 23:
                f((C6405J) obj);
                return yVar;
            case 24:
                f((C6405J) obj);
                return yVar;
            case 25:
                f((C6405J) obj);
                return yVar;
            case 26:
                f((C6405J) obj);
                return yVar;
            case 27:
                return a((C1965s) obj);
            case 28:
                return a((C1965s) obj);
            default:
                return a((C1965s) obj);
        }
    }
}
