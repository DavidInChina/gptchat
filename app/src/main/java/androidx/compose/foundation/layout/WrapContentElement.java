package androidx.compose.foundation.layout;

import E.F0;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.n;
import y.C6473k;
import z.AbstractC6708l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "LG0/X;", "LE/F0;", "E/G", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrapContentElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final int f24727b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24728c;

    /* renamed from: d  reason: collision with root package name */
    public final n f24729d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f24730e;

    public WrapContentElement(int i10, boolean z10, C6473k c6473k, Object obj) {
        this.f24727b = i10;
        this.f24728c = z10;
        this.f24729d = c6473k;
        this.f24730e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        if (this.f24727b == wrapContentElement.f24727b && this.f24728c == wrapContentElement.f24728c && AbstractC3557B.K(this.f24730e, wrapContentElement.f24730e)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int f6 = AbstractC6708l.f(this.f24727b) * 31;
        if (this.f24728c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f24730e.hashCode() + ((f6 + i10) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E.F0, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f3770s0 = this.f24727b;
        abstractC4325q.f3771t0 = this.f24728c;
        abstractC4325q.f3772u0 = this.f24729d;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        F0 f02 = (F0) abstractC4325q;
        f02.f3770s0 = this.f24727b;
        f02.f3771t0 = this.f24728c;
        f02.f3772u0 = this.f24729d;
    }
}
