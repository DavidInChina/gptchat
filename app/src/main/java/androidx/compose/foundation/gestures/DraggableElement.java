package androidx.compose.foundation.gestures;

import B.C0;
import B.C0169v;
import B.D0;
import B.J0;
import B.K0;
import B.W0;
import D.m;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.AbstractC6216a;
import wf.o;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "LG0/X;", "LB/J0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DraggableElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final K0 f24676b;

    /* renamed from: c  reason: collision with root package name */
    public final W0 f24677c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f24678d;

    /* renamed from: e  reason: collision with root package name */
    public final m f24679e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC6216a f24680f;

    /* renamed from: g  reason: collision with root package name */
    public final o f24681g;

    /* renamed from: h  reason: collision with root package name */
    public final o f24682h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f24683i;

    public DraggableElement(K0 k02, W0 w02, boolean z10, m mVar, C0 c02, o oVar, D0 d02, boolean z11) {
        this.f24676b = k02;
        this.f24677c = w02;
        this.f24678d = z10;
        this.f24679e = mVar;
        this.f24680f = c02;
        this.f24681g = oVar;
        this.f24682h = d02;
        this.f24683i = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        if (!AbstractC3557B.K(this.f24676b, draggableElement.f24676b)) {
            return false;
        }
        C0169v c0169v = C0169v.f1531k0;
        if (AbstractC3557B.K(c0169v, c0169v) && this.f24677c == draggableElement.f24677c && this.f24678d == draggableElement.f24678d && AbstractC3557B.K(this.f24679e, draggableElement.f24679e) && AbstractC3557B.K(this.f24680f, draggableElement.f24680f) && AbstractC3557B.K(this.f24681g, draggableElement.f24681g) && AbstractC3557B.K(this.f24682h, draggableElement.f24682h) && this.f24683i == draggableElement.f24683i) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.f24677c.hashCode() + ((C0169v.f1531k0.hashCode() + (this.f24676b.hashCode() * 31)) * 31)) * 31;
        int i12 = 1237;
        if (this.f24678d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i13 = (hashCode + i10) * 31;
        m mVar = this.f24679e;
        if (mVar != null) {
            i11 = mVar.hashCode();
        } else {
            i11 = 0;
        }
        int hashCode2 = this.f24680f.hashCode();
        int hashCode3 = (this.f24682h.hashCode() + ((this.f24681g.hashCode() + ((hashCode2 + ((i13 + i11) * 31)) * 31)) * 31)) * 31;
        if (this.f24683i) {
            i12 = 1231;
        }
        return hashCode3 + i12;
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new J0(this.f24676b, C0169v.f1531k0, this.f24677c, this.f24678d, this.f24679e, this.f24680f, this.f24681g, this.f24682h, this.f24683i);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        ((J0) abstractC4325q).F0(this.f24676b, C0169v.f1531k0, this.f24677c, this.f24678d, this.f24679e, this.f24680f, this.f24681g, this.f24682h, this.f24683i);
    }
}
