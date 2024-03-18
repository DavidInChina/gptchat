package d1;

import Bg.D;
import Bg.Y;
import Bg.c0;
import Ii.I;
import Mf.AbstractC1000i;
import Mf.b0;
import Rb.C1272s;
import Rb.C1275v;
import Rb.M;
import Z.AbstractC1710f0;
import android.app.Application;
import android.view.View;
import android.view.ViewTreeObserver;
import bg.AbstractC2201i;
import c4.C2288c;
import d4.AbstractC2592a;
import e4.C2801i;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import jf.y;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.x;
import ld.C4429b;
import n9.C4727f;
import pa.C5105a;
import pa.C5106b;
import pa.C5107c;
import pa.C5108d;
import wf.AbstractC6216a;
import x8.W;

/* renamed from: d1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2571f extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27863Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f27864Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f27865h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f27866i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f27867j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f27868k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2571f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(0);
        this.f27863Y = i10;
        this.f27864Z = obj;
        this.f27865h0 = obj2;
        this.f27866i0 = obj3;
        this.f27867j0 = obj4;
        this.f27868k0 = obj5;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        y yVar = y.f36177a;
        int i10 = this.f27863Y;
        Object obj = this.f27868k0;
        D d10 = null;
        Object obj2 = this.f27867j0;
        Object obj3 = this.f27866i0;
        Object obj4 = this.f27865h0;
        Object obj5 = this.f27864Z;
        switch (i10) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                Pc.c a5 = Pc.e.a();
                C5108d c5108d = (C5108d) obj5;
                W.M(a5, "Creating database " + ((String) c5108d.f42863b.getValue()), null, 6);
                kotlin.jvm.internal.D d11 = C.f37623a;
                d11.b(V9.a.class);
                Application application = (Application) obj4;
                String str = (String) c5108d.f42863b.getValue();
                d11.b(V9.a.class);
                C5107c c5107c = new C5107c((com.openai.experiment.t) obj, new C2288c(), new AbstractC2592a[0]);
                AbstractC3557B.c0("context", application);
                C2801i c2801i = new C2801i(new C3.f(application, str, c5107c, false, false), null, 20, null);
                ((C4429b) obj3).a(new C5105a(c5108d, c2801i, null));
                ((ld.q) obj2).a(new C5106b(c5108d, application, null));
                C4727f c4727f = Ka.a.f9586b;
                n9.h hVar = Ka.b.f9587a;
                AbstractC3557B.c0("DBConversationAdapter", c4727f);
                AbstractC3557B.c0("DBMessageAdapter", hVar);
                d11.b(V9.a.class);
                return new W9.e(c2801i, c4727f, hVar);
            case 2:
                mo122invoke();
                return yVar;
            case 3:
                c0 c0Var = (c0) ((U3.i) obj5).f17417i0;
                b0 b0Var = (b0) obj4;
                Zf.a aVar = (Zf.a) obj3;
                AbstractC1000i k10 = ((Y) obj2).k();
                if (k10 != null) {
                    d10 = k10.n();
                }
                aVar.getClass();
                return c0Var.b(b0Var, Zf.a.f(Zf.a.f(aVar, null, false, null, d10, 31), null, ((Sf.s) ((AbstractC2201i) obj)).c(), null, null, 59));
            default:
                mo122invoke();
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2571f(x xVar, WeakReference weakReference, AbstractC6216a abstractC6216a, I i10, B b10) {
        super(0);
        this.f27863Y = 4;
        this.f27864Z = xVar;
        this.f27866i0 = weakReference;
        this.f27865h0 = abstractC6216a;
        this.f27867j0 = i10;
        this.f27868k0 = b10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        int i10 = this.f27863Y;
        Object obj = this.f27865h0;
        Object obj2 = this.f27868k0;
        Object obj3 = this.f27867j0;
        Object obj4 = this.f27866i0;
        Object obj5 = this.f27864Z;
        switch (i10) {
            case 0:
                ((C2584s) obj5).j((AbstractC6216a) obj, (C2587v) obj4, (String) obj3, (Z0.l) obj2);
                return;
            case 1:
            default:
                x xVar = (x) obj5;
                if (xVar.f37645Y) {
                    return;
                }
                xVar.f37645Y = true;
                WeakReference weakReference = (WeakReference) obj4;
                View view = (View) weakReference.get();
                if (view != null) {
                    I i11 = (I) obj3;
                    B b10 = (B) obj2;
                    weakReference.clear();
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        Object obj6 = b10.f37622Y;
                        if (obj6 != null) {
                            switch (((Ii.q) i11).f8680Y) {
                                case 0:
                                    viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) obj6);
                                    break;
                                default:
                                    viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) obj6);
                                    break;
                            }
                        } else {
                            AbstractC3557B.C2("listener");
                            throw null;
                        }
                    }
                }
                ((AbstractC6216a) obj).mo122invoke();
                return;
            case 2:
                ((wf.k) obj5).invoke(new C1275v((C1272s) obj, ((Rb.C) obj4).f15249a, (String) ((AbstractC1710f0) obj3).getValue(), ((M) obj2).f15280e));
                return;
        }
    }
}
