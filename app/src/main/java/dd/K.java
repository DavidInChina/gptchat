package Dd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class K {
    public static final J Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f3520c = {EnumC0401w.Companion.serializer(), null};

    /* renamed from: a  reason: collision with root package name */
    public final EnumC0401w f3521a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0392m f3522b;

    public K(int i10, EnumC0401w enumC0401w, AbstractC0392m abstractC0392m) {
        if (2 != (i10 & 2)) {
            R4.b.e2(i10, 2, I.f3519b);
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f3521a = EnumC0401w.f3579i0;
        } else {
            this.f3521a = enumC0401w;
        }
        this.f3522b = abstractC0392m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        if (this.f3521a == k10.f3521a && AbstractC3557B.K(this.f3522b, k10.f3522b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3522b.hashCode() + (this.f3521a.hashCode() * 31);
    }

    public final String toString() {
        return "VoiceModeMessageWrapper(type=" + this.f3521a + ", payload=" + this.f3522b + Separators.RPAREN;
    }

    public K(EnumC0401w enumC0401w, AbstractC0392m abstractC0392m) {
        this.f3521a = enumC0401w;
        this.f3522b = abstractC0392m;
    }
}
