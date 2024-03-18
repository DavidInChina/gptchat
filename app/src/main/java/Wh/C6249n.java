package wh;

import android.gov.nist.core.Separators;
import java.util.List;
import yh.l1;

/* renamed from: wh.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6249n {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f48563a;

    /* renamed from: b  reason: collision with root package name */
    public final List f48564b;

    /* renamed from: c  reason: collision with root package name */
    public transient /* synthetic */ int f48565c;

    public C6249n(l1 l1Var, List list) {
        this.f48563a = l1Var;
        this.f48564b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6249n)) {
            return false;
        }
        C6249n c6249n = (C6249n) obj;
        if (this.f48563a.equals(c6249n.f48563a) && this.f48564b.equals(c6249n.f48564b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f48565c != 0) {
            i10 = 0;
        } else {
            i10 = (this.f48563a.hashCode() * 31) + this.f48564b.hashCode();
        }
        if (i10 == 0) {
            return this.f48565c;
        }
        this.f48565c = i10;
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        for (l1 l1Var : this.f48564b) {
            sb2.append(l1Var.getDescriptor());
        }
        sb2.append(')');
        sb2.append(this.f48563a.getDescriptor());
        return sb2.toString();
    }
}
