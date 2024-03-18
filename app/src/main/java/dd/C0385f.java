package Dd;

import O9.C1120o;
import O9.C1122p;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: Dd.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385f extends AbstractC0392m {
    public static final C0384e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f3556a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3557b;

    /* renamed from: c  reason: collision with root package name */
    public final E f3558c;

    /* JADX WARN: Type inference failed for: r0v0, types: [Dd.e, java.lang.Object] */
    static {
        C1120o c1120o = C1122p.Companion;
    }

    public C0385f(int i10, String str, String str2, E e10) {
        if (7 == (i10 & 7)) {
            this.f3556a = str;
            this.f3557b = str2;
            this.f3558c = e10;
            return;
        }
        R4.b.e2(i10, 7, C0383d.f3555b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0385f)) {
            return false;
        }
        C0385f c0385f = (C0385f) obj;
        if (AbstractC3557B.K(this.f3556a, c0385f.f3556a) && AbstractC3557B.K(this.f3557b, c0385f.f3557b) && AbstractC3557B.K(this.f3558c, c0385f.f3558c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3558c.hashCode() + E9.f.v(this.f3557b, this.f3556a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder t10 = android.gov.nist.core.a.t("ConversationUpdate(conversationId=", C6168C.a(this.f3556a), ", parentMessageId=", C6182c0.a(this.f3557b), ", response=");
        t10.append(this.f3558c);
        t10.append(Separators.RPAREN);
        return t10.toString();
    }
}
