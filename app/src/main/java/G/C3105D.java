package g;

import V1.K;
import d1.C2566a;
import s3.AbstractC5568s;

/* renamed from: g.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3105D extends AbstractC3126s {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f30935d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f30936e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3105D(K k10) {
        super(false);
        this.f30936e = k10;
    }

    @Override // g.AbstractC3126s
    public final void a() {
        int i10 = this.f30935d;
        Object obj = this.f30936e;
        switch (i10) {
            case 0:
                ((wf.k) obj).invoke(this);
                return;
            case 1:
                K k10 = (K) obj;
                k10.y(true);
                if (k10.f18051h.f30995a) {
                    k10.O();
                    return;
                } else {
                    k10.f18050g.c();
                    return;
                }
            default:
                ((AbstractC5568s) obj).p();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3105D(C2566a c2566a, boolean z10) {
        super(z10);
        this.f30936e = c2566a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3105D(AbstractC5568s abstractC5568s) {
        super(false);
        this.f30936e = abstractC5568s;
    }
}
