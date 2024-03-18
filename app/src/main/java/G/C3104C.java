package g;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2082q;
import androidx.lifecycle.S;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kf.C4288m;

/* renamed from: g.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3104C {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f30928a;

    /* renamed from: b  reason: collision with root package name */
    public final C4288m f30929b = new C4288m();

    /* renamed from: c  reason: collision with root package name */
    public AbstractC3126s f30930c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f30931d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f30932e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30933f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30934g;

    public C3104C(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f30928a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                onBackInvokedCallback = C3132y.f31009a.a(new C3127t(this, 0), new C3127t(this, 1), new C3128u(this, 0), new C3128u(this, 1));
            } else {
                onBackInvokedCallback = C3130w.f31004a.a(new C3128u(this, 2));
            }
            this.f30931d = onBackInvokedCallback;
        }
    }

    public final void a(AbstractC2086v abstractC2086v, AbstractC3126s abstractC3126s) {
        AbstractC3557B.c0("owner", abstractC2086v);
        AbstractC3557B.c0("onBackPressedCallback", abstractC3126s);
        S h10 = abstractC2086v.h();
        if (h10.f() == EnumC2082q.f25375Y) {
            return;
        }
        abstractC3126s.f30996b.add(new C3133z(this, h10, abstractC3126s));
        e();
        abstractC3126s.f30997c = new C3103B(0, this);
    }

    public final C3102A b(AbstractC3126s abstractC3126s) {
        AbstractC3557B.c0("onBackPressedCallback", abstractC3126s);
        this.f30929b.addLast(abstractC3126s);
        C3102A c3102a = new C3102A(this, abstractC3126s);
        abstractC3126s.f30996b.add(c3102a);
        e();
        abstractC3126s.f30997c = new C3103B(1, this);
        return c3102a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        ?? r22;
        AbstractC3126s abstractC3126s = this.f30930c;
        if (abstractC3126s == null) {
            C4288m c4288m = this.f30929b;
            ListIterator listIterator = c4288m.listIterator(c4288m.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    r22 = listIterator.previous();
                    if (((AbstractC3126s) r22).f30995a) {
                        break;
                    }
                } else {
                    r22 = 0;
                    break;
                }
            }
            abstractC3126s = r22;
        }
        this.f30930c = null;
        if (abstractC3126s != null) {
            abstractC3126s.a();
            return;
        }
        Runnable runnable = this.f30928a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f30932e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f30931d) != null) {
            C3130w c3130w = C3130w.f31004a;
            if (z10 && !this.f30933f) {
                c3130w.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f30933f = true;
            } else if (!z10 && this.f30933f) {
                c3130w.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f30933f = false;
            }
        }
    }

    public final void e() {
        boolean z10 = this.f30934g;
        C4288m c4288m = this.f30929b;
        boolean z11 = false;
        if (!(c4288m instanceof Collection) || !c4288m.isEmpty()) {
            Iterator<E> it = c4288m.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AbstractC3126s) it.next()).f30995a) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f30934g = z11;
        if (z11 != z10 && Build.VERSION.SDK_INT >= 33) {
            d(z11);
        }
    }
}
