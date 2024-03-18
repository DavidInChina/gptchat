package yh;

import java.util.List;
import sh.AbstractC5630b;
import yh.l1;

/* renamed from: yh.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6609g implements AbstractC5630b {

    /* renamed from: a  reason: collision with root package name */
    public final String f51008a;

    /* renamed from: b  reason: collision with root package name */
    public final l1.a f51009b;

    /* renamed from: c  reason: collision with root package name */
    public final List f51010c;

    /* renamed from: d  reason: collision with root package name */
    public transient /* synthetic */ int f51011d;

    public C6609g(String str, l1.a aVar, List list) {
        this.f51008a = str;
        this.f51009b = aVar;
        this.f51010c = list;
    }

    @Override // sh.AbstractC5630b
    public final AbstractC5630b a(Y0 y02) {
        List list = this.f51010c;
        return new C6609g(this.f51008a, (l1.a) this.f51009b.k(y02), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6609g.class != obj.getClass()) {
            return false;
        }
        C6609g c6609g = (C6609g) obj;
        if (this.f51008a.equals(c6609g.f51008a) && this.f51009b.equals(c6609g.f51009b) && this.f51010c.equals(c6609g.f51010c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f51011d != 0) {
            i10 = 0;
        } else {
            int hashCode = this.f51009b.hashCode();
            i10 = this.f51010c.hashCode() + ((hashCode + (this.f51008a.hashCode() * 31)) * 31);
        }
        if (i10 == 0) {
            return this.f51011d;
        }
        this.f51011d = i10;
        return i10;
    }
}
