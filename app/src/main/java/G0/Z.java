package G0;

import b0.C2104h;
import l0.AbstractC4324p;
import l0.AbstractC4325q;

/* loaded from: classes2.dex */
public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC4325q f5692a;

    /* renamed from: b  reason: collision with root package name */
    public int f5693b;

    /* renamed from: c  reason: collision with root package name */
    public C2104h f5694c;

    /* renamed from: d  reason: collision with root package name */
    public C2104h f5695d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5696e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0572a0 f5697f;

    public Z(C0572a0 c0572a0, AbstractC4325q abstractC4325q, int i10, C2104h c2104h, C2104h c2104h2, boolean z10) {
        this.f5697f = c0572a0;
        this.f5692a = abstractC4325q;
        this.f5693b = i10;
        this.f5694c = c2104h;
        this.f5695d = c2104h2;
        this.f5696e = z10;
    }

    public final boolean a(int i10, int i11) {
        C2104h c2104h = this.f5694c;
        int i12 = this.f5693b;
        if (androidx.compose.ui.node.b.a((AbstractC4324p) c2104h.f25567Y[i10 + i12], (AbstractC4324p) this.f5695d.f25567Y[i12 + i11]) != 0) {
            return true;
        }
        return false;
    }
}
