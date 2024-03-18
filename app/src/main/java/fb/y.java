package Fb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class y {
    public static final u Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f5180d = {null, x.Companion.serializer(), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f5181a;

    /* renamed from: b  reason: collision with root package name */
    public final x f5182b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f5183c;

    public y(int i10, String str, x xVar, Boolean bool) {
        if (1 == (i10 & 1)) {
            this.f5181a = str;
            if ((i10 & 2) == 0) {
                this.f5182b = x.f5178Z;
            } else {
                this.f5182b = xVar;
            }
            if ((i10 & 4) == 0) {
                this.f5183c = Boolean.FALSE;
                return;
            } else {
                this.f5183c = bool;
                return;
            }
        }
        R4.b.e2(i10, 1, t.f5175b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (AbstractC3557B.K(this.f5181a, yVar.f5181a) && this.f5182b == yVar.f5182b && AbstractC3557B.K(this.f5183c, yVar.f5183c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f5182b.hashCode() + (this.f5181a.hashCode() * 31)) * 31;
        Boolean bool = this.f5183c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "PhoneSendVerifyResponse(id=" + this.f5181a + ", status=" + this.f5182b + ", hasAccount=" + this.f5183c + Separators.RPAREN;
    }
}
