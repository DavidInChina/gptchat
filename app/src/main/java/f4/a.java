package F4;

import A2.RunnableC0066j;
import A2.V;
import B0.C0189f;
import B0.G;
import B0.u;
import B0.v;
import B0.w;
import B0.x;
import B2.C0207h;
import D1.AbstractC0351g;
import D1.C0378y;
import G1.f;
import H0.C0714y;
import S1.h;
import U3.l;
import V1.C1482x;
import V1.K;
import W4.b;
import W4.e;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.glance.appwidget.protobuf.A;
import androidx.glance.appwidget.protobuf.AbstractC2042b;
import androidx.glance.appwidget.protobuf.AbstractC2049i;
import androidx.glance.appwidget.protobuf.AbstractC2055o;
import androidx.glance.appwidget.protobuf.b0;
import androidx.work.impl.WorkDatabase;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import id.AbstractC3557B;
import j.AbstractC3873c;
import j.C3872b;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C4146b;
import p.m;
import p.o;
import q.AbstractC5228p;
import r0.C5339c;
import r1.AbstractC5355b;
import r1.g;
import r5.d;
import s1.p;
import w.AbstractC6067n;
import w.C6066m;
import x.AbstractC6262a;
import z2.AbstractC6756a;

/* loaded from: classes.dex */
public class a implements m, AbstractC5228p, p, AbstractC0351g, AbstractC3873c {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5032Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f5033Z;

    public a(int i10) {
        this.f5032Y = i10;
        if (i10 == 2) {
            this.f5033Z = new ArrayDeque();
        } else if (i10 == 22) {
            this.f5033Z = new CopyOnWriteArrayList();
        } else if (i10 == 27) {
            this.f5033Z = new e();
        } else if (i10 == 29) {
            this.f5033Z = null;
        } else if (i10 == 7) {
            this.f5033Z = new C5339c();
        } else if (i10 != 8) {
            this.f5033Z = C4146b.f36761a;
        } else {
            this.f5033Z = new C6066m((Object) null);
        }
    }

    public static void a(a aVar, String str) {
        ((e) ((b) aVar.f5033Z)).a(str, new W4.a(1, null));
    }

    public static void b(a aVar, String str) {
        ((e) ((b) aVar.f5033Z)).a(str, new W4.a(6, null));
    }

    public final void A(int i10, long j6) {
        ((AbstractC2055o) this.f5033Z).G2(i10, j6);
    }

    public final void B(int i10, b0 b0Var, Object obj) {
        ((AbstractC2055o) this.f5033Z).B2(i10, (AbstractC2042b) obj, b0Var);
    }

    public final void C(int i10, int i11) {
        ((AbstractC2055o) this.f5033Z).v2(i10, i11);
    }

    public final void D(int i10, long j6) {
        ((AbstractC2055o) this.f5033Z).x2(i10, j6);
    }

    public final void E(int i10, int i11) {
        ((AbstractC2055o) this.f5033Z).E2(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void F(int i10, long j6) {
        ((AbstractC2055o) this.f5033Z).G2(i10, (j6 >> 63) ^ (j6 << 1));
    }

    public final void G(int i10, int i11) {
        ((AbstractC2055o) this.f5033Z).E2(i10, i11);
    }

    public final void H(int i10, long j6) {
        ((AbstractC2055o) this.f5033Z).G2(i10, j6);
    }

    public final C5339c c() {
        return (C5339c) this.f5033Z;
    }

    @Override // j.AbstractC3873c
    public final void d(Object obj) {
        Bundle bundle;
        ProxyBillingActivity proxyBillingActivity = (ProxyBillingActivity) this.f5033Z;
        C3872b c3872b = (C3872b) obj;
        proxyBillingActivity.getClass();
        Intent intent = c3872b.f35797Z;
        int i10 = AbstractC2468q.b(intent, "ProxyBillingActivity").f9439a;
        ResultReceiver resultReceiver = proxyBillingActivity.f26698D0;
        if (resultReceiver != null) {
            if (intent == null) {
                bundle = null;
            } else {
                bundle = intent.getExtras();
            }
            resultReceiver.send(i10, bundle);
        }
        int i11 = c3872b.f35796Y;
        if (i11 != -1 || i10 != 0) {
            AbstractC2468q.e("ProxyBillingActivity", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivity.finish();
    }

    public final K e() {
        return ((C1482x) this.f5033Z).f18311i0;
    }

    public final void f() {
        ((C1482x) this.f5033Z).f18311i0.N();
    }

    @Override // D1.AbstractC0351g
    public final int g() {
        return A1.b.C((ContentInfo) this.f5033Z);
    }

    @Override // D1.AbstractC0351g
    public final ClipData h() {
        return A1.b.d((ContentInfo) this.f5033Z);
    }

    @Override // p.m
    public final boolean i(o oVar, MenuItem menuItem) {
        AbstractC5228p abstractC5228p = ((ActionMenuView) this.f5033Z).f24512H0;
        if (abstractC5228p != null) {
            a aVar = (a) abstractC5228p;
            if (((Toolbar) aVar.f5033Z).f24587N0.J()) {
                return true;
            }
            ((Toolbar) aVar.f5033Z).getClass();
        }
        return false;
    }

    public final void j(Exception exc) {
        s2.p.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        l lVar = ((V) this.f5033Z).f498M1;
        Handler handler = (Handler) lVar.f17423Z;
        if (handler != null) {
            handler.post(new RunnableC0066j(lVar, exc, 1));
        }
    }

    public final C0189f k(w wVar, G g10) {
        boolean z10;
        long j6;
        long j10;
        List list;
        int i10;
        List list2 = wVar.f1686a;
        C6066m c6066m = new C6066m(list2.size());
        int size = list2.size();
        int i11 = 0;
        while (i11 < size) {
            x xVar = (x) list2.get(i11);
            v vVar = (v) ((C6066m) this.f5033Z).d(xVar.f1688a);
            if (vVar == null) {
                j10 = xVar.f1689b;
                j6 = xVar.f1691d;
                z10 = false;
            } else {
                long x10 = ((C0714y) g10).x(vVar.f1684b);
                long j11 = vVar.f1683a;
                z10 = vVar.f1685c;
                j6 = x10;
                j10 = j11;
            }
            long j12 = xVar.f1697j;
            long j13 = xVar.f1698k;
            long j14 = xVar.f1688a;
            c6066m.h(j14, new u(j14, xVar.f1689b, xVar.f1691d, xVar.f1692e, xVar.f1693f, j10, j6, z10, xVar.f1694g, xVar.f1696i, j12, j13));
            long j15 = xVar.f1688a;
            boolean z11 = xVar.f1692e;
            if (z11) {
                i10 = i11;
                list = list2;
                ((C6066m) this.f5033Z).h(j15, new v(xVar.f1689b, xVar.f1690c, z11));
            } else {
                list = list2;
                i10 = i11;
                C6066m c6066m2 = (C6066m) this.f5033Z;
                int b10 = AbstractC6262a.b(c6066m2.f47598Z, c6066m2.f47600i0, j15);
                if (b10 >= 0) {
                    Object[] objArr = c6066m2.f47599h0;
                    Object obj = objArr[b10];
                    Object obj2 = AbstractC6067n.f47601a;
                    if (obj != obj2) {
                        objArr[b10] = obj2;
                        c6066m2.f47597Y = true;
                    }
                }
            }
            i11 = i10 + 1;
            list2 = list;
        }
        return new C0189f(c6066m, wVar);
    }

    @Override // D1.AbstractC0351g
    public final int l() {
        return A1.b.c((ContentInfo) this.f5033Z);
    }

    @Override // D1.AbstractC0351g
    public final ContentInfo m() {
        return (ContentInfo) this.f5033Z;
    }

    public final void n(AbstractC6756a abstractC6756a) {
        Iterator it = ((CopyOnWriteArrayList) this.f5033Z).iterator();
        while (it.hasNext()) {
            I2.b bVar = (I2.b) it.next();
            if (bVar.f7960b == abstractC6756a) {
                bVar.f7961c = true;
                ((CopyOnWriteArrayList) this.f5033Z).remove(bVar);
            }
        }
    }

    public final void o(int i10, boolean z10) {
        ((AbstractC2055o) this.f5033Z).t2(i10, z10);
    }

    public final void p(int i10, AbstractC2049i abstractC2049i) {
        ((AbstractC2055o) this.f5033Z).u2(i10, abstractC2049i);
    }

    public final void q(int i10, double d10) {
        AbstractC2055o abstractC2055o = (AbstractC2055o) this.f5033Z;
        abstractC2055o.getClass();
        abstractC2055o.x2(i10, Double.doubleToRawLongBits(d10));
    }

    public final void r(int i10, int i11) {
        ((AbstractC2055o) this.f5033Z).z2(i10, i11);
    }

    @Override // s1.p
    public final int s(Object obj) {
        return ((g) obj).f44286b;
    }

    @Override // s1.p
    public final boolean t(Object obj) {
        return ((g) obj).f44287c;
    }

    public final String toString() {
        switch (this.f5032Y) {
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.f5033Z) + "}";
            default:
                return super.toString();
        }
    }

    public final void u(int i10, int i11) {
        ((AbstractC2055o) this.f5033Z).v2(i10, i11);
    }

    public final void v(int i10, long j6) {
        ((AbstractC2055o) this.f5033Z).x2(i10, j6);
    }

    @Override // p.m
    public final void w(o oVar) {
        m mVar = ((ActionMenuView) this.f5033Z).f24507C0;
        if (mVar != null) {
            mVar.w(oVar);
        }
    }

    public final void x(int i10, float f6) {
        AbstractC2055o abstractC2055o = (AbstractC2055o) this.f5033Z;
        abstractC2055o.getClass();
        abstractC2055o.v2(i10, Float.floatToRawIntBits(f6));
    }

    public final void y(int i10, b0 b0Var, Object obj) {
        AbstractC2055o abstractC2055o = (AbstractC2055o) this.f5033Z;
        abstractC2055o.D2(i10, 3);
        b0Var.h((AbstractC2042b) obj, abstractC2055o.f25262h);
        abstractC2055o.D2(i10, 4);
    }

    public final void z(int i10, int i11) {
        ((AbstractC2055o) this.f5033Z).z2(i10, i11);
    }

    public /* synthetic */ a(int i10, Object obj) {
        this.f5032Y = i10;
        this.f5033Z = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(V v10) {
        this(20, v10);
        this.f5032Y = 20;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(C0207h c0207h) {
        this(21, c0207h);
        this.f5032Y = 21;
    }

    public a(d dVar) {
        this.f5032Y = 28;
        AbstractC3557B.c0("sdkCore", dVar);
        this.f5033Z = dVar;
    }

    public a() {
        this.f5032Y = 6;
        this.f5033Z = new LinkedHashMap(0, 0.75f, true);
    }

    public a(WorkDatabase workDatabase) {
        this.f5032Y = 24;
        AbstractC3557B.c0("workDatabase", workDatabase);
        this.f5033Z = workDatabase;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [D1.y, java.lang.Object, D1.B] */
    public a(View view) {
        this.f5032Y = 12;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? c0378y = new C0378y(view);
            c0378y.f3206h0 = view;
            this.f5033Z = c0378y;
            return;
        }
        this.f5033Z = new C0378y(view);
    }

    public a(AbstractC2055o abstractC2055o) {
        this.f5032Y = 19;
        A.a("output", abstractC2055o);
        this.f5033Z = abstractC2055o;
        abstractC2055o.f25262h = this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [D1.y, java.lang.Object, D1.B] */
    public a(WindowInsetsController windowInsetsController) {
        this.f5032Y = 12;
        ?? c0378y = new C0378y(null);
        c0378y.f3207i0 = windowInsetsController;
        this.f5033Z = c0378y;
    }

    public a(TextView textView) {
        this.f5032Y = 17;
        R4.b.U(textView, "textView cannot be null");
        this.f5033Z = new h(textView);
    }

    public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f5032Y = 14;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f5033Z = new f(uri, clipDescription, uri2);
        } else {
            this.f5033Z = new U3.u(uri, clipDescription, uri2, 7);
        }
    }

    public a(AbstractC5355b abstractC5355b) {
        this.f5032Y = 9;
        this.f5033Z = abstractC5355b;
    }

    public a(ContentInfo contentInfo) {
        this.f5032Y = 11;
        contentInfo.getClass();
        this.f5033Z = A1.b.D(contentInfo);
    }
}
