package n9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import wd.C6168C;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f39679a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39680b;

    /* renamed from: c  reason: collision with root package name */
    public final Qa.h f39681c;

    public i(String str, String str2, Qa.h hVar) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("conversationId", str2);
        AbstractC3557B.c0("messageNode", hVar);
        this.f39679a = str;
        this.f39680b = str2;
        this.f39681c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3557B.K(this.f39679a, iVar.f39679a) && AbstractC3557B.K(this.f39680b, iVar.f39680b) && AbstractC3557B.K(this.f39681c, iVar.f39681c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39681c.hashCode() + E9.f.v(this.f39680b, this.f39679a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder t10 = android.gov.nist.core.a.t("DBMessage(id=", C6182c0.a(this.f39679a), ", conversationId=", C6168C.a(this.f39680b), ", messageNode=");
        t10.append(this.f39681c);
        t10.append(Separators.RPAREN);
        return t10.toString();
    }
}
