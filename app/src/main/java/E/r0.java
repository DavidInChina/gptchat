package E;

import E0.AbstractC0445d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class r0 implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f3944a = new Object();

    @Override // E.q0
    public final AbstractC4326r a() {
        return new WithAlignmentLineElement(AbstractC0445d.f4051a);
    }

    @Override // E.q0
    public final AbstractC4326r b(AbstractC4326r abstractC4326r, boolean z10) {
        if (1.0f > 0.0d) {
            return abstractC4326r.g(new LayoutWeightElement(com.google.android.gms.internal.play_billing.N.l(1.0f, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
