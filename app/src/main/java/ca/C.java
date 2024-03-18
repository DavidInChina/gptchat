package Ca;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class C {
    public static final v Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f2809d = {null, y.Companion.serializer(), B.Companion.serializer()};

    /* renamed from: a  reason: collision with root package name */
    public final String f2810a;

    /* renamed from: b  reason: collision with root package name */
    public final y f2811b;

    /* renamed from: c  reason: collision with root package name */
    public final B f2812c;

    public C(int i10, String str, y yVar, B b10) {
        if (1 == (i10 & 1)) {
            this.f2810a = str;
            if ((i10 & 2) == 0) {
                this.f2811b = null;
            } else {
                this.f2811b = yVar;
            }
            if ((i10 & 4) == 0) {
                this.f2812c = null;
                return;
            } else {
                this.f2812c = b10;
                return;
            }
        }
        R4.b.e2(i10, 1, u.f2853b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (AbstractC3557B.K(this.f2810a, c10.f2810a) && this.f2811b == c10.f2811b && this.f2812c == c10.f2812c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2810a.hashCode() * 31;
        int i11 = 0;
        y yVar = this.f2811b;
        if (yVar == null) {
            i10 = 0;
        } else {
            i10 = yVar.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        B b10 = this.f2812c;
        if (b10 != null) {
            i11 = b10.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "CustomInstructionsUpdateErrorDetail(description=" + this.f2810a + ", field=" + this.f2811b + ", reason=" + this.f2812c + Separators.RPAREN;
    }
}
