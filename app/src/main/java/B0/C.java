package B0;

import A.C0043t;
import E0.AbstractC0461u;
import java.util.List;
import q0.C5251c;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0461u f1588a;

    /* renamed from: b  reason: collision with root package name */
    public int f1589b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ D f1590c;

    public C(D d10) {
        this.f1590c = d10;
    }

    public final void a(C0194k c0194k) {
        List list = c0194k.f1652a;
        int size = list.size();
        int i10 = 0;
        while (true) {
            D d10 = this.f1590c;
            if (i10 < size) {
                if (((u) list.get(i10)).b()) {
                    if (this.f1589b == 2) {
                        AbstractC0461u abstractC0461u = this.f1588a;
                        if (abstractC0461u != null) {
                            M3.H.z0(c0194k, abstractC0461u.M(C5251c.f43619b), new B(d10, 0), true);
                        } else {
                            throw new IllegalStateException("layoutCoordinates not set".toString());
                        }
                    }
                    this.f1589b = 3;
                    return;
                }
                i10++;
            } else {
                AbstractC0461u abstractC0461u2 = this.f1588a;
                if (abstractC0461u2 != null) {
                    M3.H.z0(c0194k, abstractC0461u2.M(C5251c.f43619b), new C0043t(this, 18, d10), false);
                    if (this.f1589b == 2) {
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((u) list.get(i11)).a();
                        }
                        C0189f c0189f = c0194k.f1653b;
                        if (c0189f != null) {
                            c0189f.f1635c = !d10.f1593d;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("layoutCoordinates not set".toString());
            }
        }
    }
}
