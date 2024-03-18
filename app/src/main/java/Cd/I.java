package Cd;

import D1.P0;
import mh.C4686p;

/* loaded from: classes.dex */
public final class I implements Z.M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3012a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3013b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3014c;

    public /* synthetic */ I(Object obj, boolean z10, int i10) {
        this.f3012a = i10;
        this.f3014c = obj;
        this.f3013b = z10;
    }

    @Override // Z.M
    public final void dispose() {
        int i10 = this.f3012a;
        boolean z10 = this.f3013b;
        Object obj = this.f3014c;
        switch (i10) {
            case 0:
                P0 p02 = (P0) obj;
                boolean z11 = !z10;
                p02.f3241a.M(z11);
                p02.f3241a.L(z11);
                return;
            default:
                ((C4686p) ((mh.P) obj)).f39483c.setValue(Boolean.valueOf(z10));
                return;
        }
    }
}
