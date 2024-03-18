package j2;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: j2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3907i implements AbstractC3899a {

    /* renamed from: a  reason: collision with root package name */
    public final int f36009a;

    public C3907i(int i10) {
        this.f36009a = i10;
    }

    @Override // j2.AbstractC3899a
    public final long a(Context context) {
        return androidx.compose.ui.graphics.a.b(C3900b.f36003a.a(context, this.f36009a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3907i) && this.f36009a == ((C3907i) obj).f36009a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36009a;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("ResourceColorProvider(resId="), this.f36009a, ')');
    }
}
