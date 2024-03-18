package D1;

import android.os.Build;
import android.view.View;
import id.AbstractC3557B;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import lf.C4439d;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: Y  reason: collision with root package name */
    public int f3221Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f3222Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f3223h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Serializable f3224i0;

    public F(C4439d c4439d) {
        AbstractC3557B.c0("map", c4439d);
        this.f3224i0 = c4439d;
        this.f3222Z = -1;
        this.f3223h0 = c4439d.f38319m0;
        e();
    }

    public final void a() {
        if (((C4439d) this.f3224i0).f38319m0 == this.f3223h0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public final Object d(View view) {
        if (Build.VERSION.SDK_INT >= this.f3222Z) {
            return b(view);
        }
        Object tag = view.getTag(this.f3221Y);
        if (((Class) this.f3224i0).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void e() {
        while (true) {
            int i10 = this.f3221Y;
            Serializable serializable = this.f3224i0;
            if (i10 < ((C4439d) serializable).f38317k0 && ((C4439d) serializable).f38314h0[i10] < 0) {
                this.f3221Y = i10 + 1;
            } else {
                return;
            }
        }
    }

    public final void g(View view, Object obj) {
        C0343c c0343c;
        if (Build.VERSION.SDK_INT >= this.f3222Z) {
            c(view, obj);
        } else if (h(d(view), obj)) {
            View.AccessibilityDelegate c10 = Z.c(view);
            if (c10 == null) {
                c0343c = null;
            } else if (c10 instanceof C0339a) {
                c0343c = ((C0339a) c10).f3253a;
            } else {
                c0343c = new C0343c(c10);
            }
            if (c0343c == null) {
                c0343c = new C0343c();
            }
            Z.l(view, c0343c);
            view.setTag(this.f3221Y, obj);
            Z.g(view, this.f3223h0);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public final boolean hasNext() {
        if (this.f3221Y < ((C4439d) this.f3224i0).f38317k0) {
            return true;
        }
        return false;
    }

    public final void remove() {
        a();
        if (this.f3222Z != -1) {
            Serializable serializable = this.f3224i0;
            ((C4439d) serializable).b();
            ((C4439d) serializable).k(this.f3222Z);
            this.f3222Z = -1;
            this.f3223h0 = ((C4439d) serializable).f38319m0;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
    }

    public F(int i10, Class cls, int i11, int i12) {
        this.f3221Y = i10;
        this.f3224i0 = cls;
        this.f3223h0 = i11;
        this.f3222Z = i12;
    }
}
