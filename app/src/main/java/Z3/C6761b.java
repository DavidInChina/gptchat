package z3;

import E9.f;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;

/* renamed from: z3.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6761b {

    /* renamed from: a  reason: collision with root package name */
    public final String f51568a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51569b;

    /* renamed from: c  reason: collision with root package name */
    public final String f51570c;

    /* renamed from: d  reason: collision with root package name */
    public final List f51571d;

    /* renamed from: e  reason: collision with root package name */
    public final List f51572e;

    public C6761b(String str, String str2, String str3, List list, List list2) {
        AbstractC3557B.c0("columnNames", list);
        AbstractC3557B.c0("referenceColumnNames", list2);
        this.f51568a = str;
        this.f51569b = str2;
        this.f51570c = str3;
        this.f51571d = list;
        this.f51572e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6761b)) {
            return false;
        }
        C6761b c6761b = (C6761b) obj;
        if (!AbstractC3557B.K(this.f51568a, c6761b.f51568a) || !AbstractC3557B.K(this.f51569b, c6761b.f51569b) || !AbstractC3557B.K(this.f51570c, c6761b.f51570c) || !AbstractC3557B.K(this.f51571d, c6761b.f51571d)) {
            return false;
        }
        return AbstractC3557B.K(this.f51572e, c6761b.f51572e);
    }

    public final int hashCode() {
        return this.f51572e.hashCode() + AbstractC4194d.s(this.f51571d, f.v(this.f51570c, f.v(this.f51569b, this.f51568a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f51568a + "', onDelete='" + this.f51569b + " +', onUpdate='" + this.f51570c + "', columnNames=" + this.f51571d + ", referenceColumnNames=" + this.f51572e + '}';
    }
}
