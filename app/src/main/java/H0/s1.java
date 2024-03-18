package H0;

import Sg.C1394f;
import Z.C1728o0;
import android.view.View;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2081p;
import java.util.List;
import nf.AbstractC4825e;

/* loaded from: classes2.dex */
public final class s1 implements AbstractC2084t {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Ng.F f7034Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1728o0 f7035Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Z.E0 f7036h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f7037i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ View f7038j0;

    public s1(C1394f c1394f, C1728o0 c1728o0, Z.E0 e02, kotlin.jvm.internal.B b10, View view) {
        this.f7034Y = c1394f;
        this.f7035Z = c1728o0;
        this.f7036h0 = e02;
        this.f7037i0 = b10;
        this.f7038j0 = view;
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        int i10 = o1.f6985a[enumC2081p.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        this.f7036h0.w();
                        return;
                    }
                    return;
                }
                this.f7036h0.B();
                return;
            }
            C1728o0 c1728o0 = this.f7035Z;
            if (c1728o0 != null) {
                Z.X x10 = c1728o0.f22664Z;
                synchronized (x10.f22583a) {
                    try {
                        if (!x10.a()) {
                            List list = x10.f22584b;
                            x10.f22584b = x10.f22585c;
                            x10.f22585c = list;
                            x10.f22586d = true;
                            int size = list.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                ((AbstractC4825e) list.get(i11)).resumeWith(jf.y.f36177a);
                            }
                            list.clear();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f7036h0.H();
            return;
        }
        Ad.l.O0(this.f7034Y, null, Ng.G.f12870i0, new r1(this.f7037i0, this.f7036h0, abstractC2086v, this, this.f7038j0, null), 1);
    }
}
