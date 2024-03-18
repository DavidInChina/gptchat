package g4;

import Z.G0;
import android.graphics.drawable.Drawable;
import id.AbstractC3557B;
import mh.C4660E;
import nh.C4858h;
import s4.AbstractC5575a;
import u0.AbstractC5824b;

/* renamed from: g4.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3185m implements AbstractC5575a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31230a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ G0 f31231b;

    public /* synthetic */ C3185m(G0 g02, int i10) {
        this.f31230a = i10;
        this.f31231b = g02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.AbstractC5575a
    public final void a(Drawable drawable) {
        int i10 = this.f31230a;
        AbstractC5824b abstractC5824b = null;
        G0 g02 = this.f31231b;
        switch (i10) {
            case 0:
                C3188p c3188p = (C3188p) g02;
                if (drawable != null) {
                    abstractC5824b = c3188p.j(drawable);
                }
                c3188p.k(new C3179g(abstractC5824b));
                return;
            default:
                C4858h c4858h = (C4858h) g02;
                C4660E c4660e = (C4660E) c4858h.f40387j0.getValue();
                if (drawable != null) {
                    Drawable mutate = drawable.mutate();
                    AbstractC3557B.b0("mutate(...)", mutate);
                    abstractC5824b = new Z6.a(mutate);
                }
                c4858h.f40387j0.setValue(P4.a.z(c4660e, null, 0L, abstractC5824b, 3));
                return;
        }
    }
}
