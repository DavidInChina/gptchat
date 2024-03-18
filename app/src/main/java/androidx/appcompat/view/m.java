package androidx.appcompat.view;

import D1.AbstractC0360k0;
import D1.C0358j0;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import nf.AbstractC4828h;
import u8.C5865o;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public long f24412a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24413b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f24414c;

    /* renamed from: d  reason: collision with root package name */
    public Object f24415d;

    /* renamed from: e  reason: collision with root package name */
    public Object f24416e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f24417f;

    public m(o8.m mVar, String str, long j6) {
        this.f24417f = mVar;
        this.f24414c = new C5865o("IntegrityDialogWrapper");
        this.f24416e = new Object();
        this.f24415d = str;
        this.f24412a = j6;
    }

    public final void a() {
        if (!this.f24413b) {
            return;
        }
        Iterator it = ((ArrayList) this.f24414c).iterator();
        while (it.hasNext()) {
            ((C0358j0) it.next()).b();
        }
        this.f24413b = false;
    }

    public final void b(C0358j0 c0358j0) {
        if (!this.f24413b) {
            ((ArrayList) this.f24414c).add(c0358j0);
        }
    }

    public final void c() {
        View view;
        if (this.f24413b) {
            return;
        }
        Iterator it = ((ArrayList) this.f24414c).iterator();
        while (it.hasNext()) {
            C0358j0 c0358j0 = (C0358j0) it.next();
            long j6 = this.f24412a;
            if (j6 >= 0) {
                c0358j0.c(j6);
            }
            Interpolator interpolator = (Interpolator) this.f24415d;
            if (interpolator != null && (view = (View) c0358j0.f3273a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((AbstractC0360k0) this.f24416e) != null) {
                c0358j0.d((AbstractC4828h) this.f24417f);
            }
            View view2 = (View) c0358j0.f3273a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f24413b = true;
    }

    public m() {
        this.f24412a = -1L;
        this.f24417f = new l(this);
        this.f24414c = new ArrayList();
    }
}
