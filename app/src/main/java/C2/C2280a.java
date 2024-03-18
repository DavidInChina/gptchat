package androidx.compose.foundation;

import A.U;
import D.m;
import G0.X;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import l0.AbstractC4325q;
import l0.AbstractC4326r;
import l0.C4323o;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final FocusableKt$FocusableInNonTouchModeElement$1 f24675a = new X() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
        public final boolean equals(Object obj) {
            return this == obj;
        }

        @Override // G0.X
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // G0.X
        public final AbstractC4325q j() {
            return new AbstractC4325q();
        }

        @Override // G0.X
        public final /* bridge */ /* synthetic */ void m(AbstractC4325q abstractC4325q) {
            U u10 = (U) abstractC4325q;
        }
    };

    public static final AbstractC4326r a(m mVar, AbstractC4326r abstractC4326r, boolean z10) {
        AbstractC4326r abstractC4326r2;
        if (z10) {
            abstractC4326r2 = new FocusableElement(mVar).g(FocusTargetNode$FocusTargetElement.f24793b);
        } else {
            abstractC4326r2 = C4323o.f37719b;
        }
        return abstractC4326r.g(abstractC4326r2);
    }
}
