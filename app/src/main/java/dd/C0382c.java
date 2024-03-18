package Dd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: Dd.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382c extends AbstractC0392m {
    public static final C0381b Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f3552b = {H.Companion.serializer()};

    /* renamed from: a  reason: collision with root package name */
    public final H f3553a;

    public C0382c(int i10, H h10) {
        if (1 == (i10 & 1)) {
            this.f3553a = h10;
        } else {
            R4.b.e2(i10, 1, C0380a.f3551b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0382c) && this.f3553a == ((C0382c) obj).f3553a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3553a.hashCode();
    }

    public final String toString() {
        return "ActionRequest(action=" + this.f3553a + Separators.RPAREN;
    }

    public C0382c(H h10) {
        this.f3553a = h10;
    }
}
