package Aa;

import android.gov.nist.core.Separators;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f735a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f736b;

    /* renamed from: c  reason: collision with root package name */
    public final String f737c;

    /* renamed from: d  reason: collision with root package name */
    public final String f738d;

    /* renamed from: e  reason: collision with root package name */
    public final List f739e;

    public e(String str, String str2, String str3, List list) {
        Integer valueOf = Integer.valueOf((int) R.drawable.ic_spreadsheet);
        this.f735a = str;
        this.f736b = valueOf;
        this.f737c = str2;
        this.f738d = str3;
        this.f739e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f735a, eVar.f735a) && AbstractC3557B.K(this.f736b, eVar.f736b) && AbstractC3557B.K(this.f737c, eVar.f737c) && AbstractC3557B.K(this.f738d, eVar.f738d) && AbstractC3557B.K(this.f739e, eVar.f739e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f735a.hashCode() * 31;
        Integer num = this.f736b;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        return this.f739e.hashCode() + E9.f.v(this.f738d, E9.f.v(this.f737c, (hashCode + i10) * 31, 31), 31);
    }

    public final String toString() {
        String t10 = R.a.t(new StringBuilder("InputDecorationId(value="), this.f735a, Separators.RPAREN);
        String F22 = AbstractC3557B.F2(this.f738d);
        StringBuilder s10 = android.gov.nist.core.a.s("Chip(id=", t10, ", leadingIconRes=");
        s10.append(this.f736b);
        s10.append(", text=");
        android.gov.nist.core.a.y(s10, this.f737c, ", route=", F22, ", actions=");
        return android.gov.nist.core.a.o(s10, this.f739e, Separators.RPAREN);
    }
}
