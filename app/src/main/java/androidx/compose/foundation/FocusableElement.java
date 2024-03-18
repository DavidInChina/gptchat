package androidx.compose.foundation;

import A.W;
import A.Z;
import D.d;
import D.e;
import D.m;
import G0.X;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "LG0/X;", "LA/Z;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FocusableElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final m f24660b;

    public FocusableElement(m mVar) {
        this.f24660b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusableElement)) {
            return false;
        }
        if (AbstractC3557B.K(this.f24660b, ((FocusableElement) obj).f24660b)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        m mVar = this.f24660b;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new Z(this.f24660b);
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        d dVar;
        W w10 = ((Z) abstractC4325q).f146w0;
        m mVar = w10.f128s0;
        m mVar2 = this.f24660b;
        if (!AbstractC3557B.K(mVar, mVar2)) {
            m mVar3 = w10.f128s0;
            if (mVar3 != null && (dVar = w10.f129t0) != null) {
                mVar3.c(new e(dVar));
            }
            w10.f129t0 = null;
            w10.f128s0 = mVar2;
        }
    }
}
