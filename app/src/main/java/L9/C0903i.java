package L9;

import O9.C1122p;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;
import wd.C6178a0;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: L9.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0903i {
    public static final C0902h Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f10935e = {null, null, new C2695d(C6178a0.f48382a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f10936a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10937b;

    /* renamed from: c  reason: collision with root package name */
    public final List f10938c;

    /* renamed from: d  reason: collision with root package name */
    public final C1122p f10939d;

    public C0903i(int i10, String str, String str2, List list, C1122p c1122p) {
        if (5 == (i10 & 5)) {
            this.f10936a = str;
            if ((i10 & 2) == 0) {
                this.f10937b = null;
            } else {
                this.f10937b = str2;
            }
            this.f10938c = list;
            if ((i10 & 8) == 0) {
                this.f10939d = null;
                return;
            } else {
                this.f10939d = c1122p;
                return;
            }
        }
        R4.b.e2(i10, 5, C0901g.f10933b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0903i)) {
            return false;
        }
        C0903i c0903i = (C0903i) obj;
        if (!AbstractC3557B.K(this.f10936a, c0903i.f10936a)) {
            return false;
        }
        String str = this.f10937b;
        String str2 = c0903i.f10937b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f10938c, c0903i.f10938c) && AbstractC3557B.K(this.f10939d, c0903i.f10939d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f10936a.hashCode() * 31;
        int i11 = 0;
        String str = this.f10937b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f10938c, (hashCode + i10) * 31, 31);
        C1122p c1122p = this.f10939d;
        if (c1122p != null) {
            i11 = c1122p.hashCode();
        }
        return s10 + i11;
    }

    public final String toString() {
        String str;
        String a5 = C6182c0.a(this.f10936a);
        String str2 = this.f10937b;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6182c0.a(str2);
        }
        StringBuilder t10 = android.gov.nist.core.a.t("ConversationResponseNode(id=", a5, ", parent=", str, ", children=");
        t10.append(this.f10938c);
        t10.append(", message=");
        t10.append(this.f10939d);
        t10.append(Separators.RPAREN);
        return t10.toString();
    }
}
