package wh;

import java.util.List;
import k6.AbstractC4194d;
import yh.l1;

/* renamed from: wh.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6246k {

    /* renamed from: a  reason: collision with root package name */
    public final String f48546a;

    /* renamed from: b  reason: collision with root package name */
    public final l1 f48547b;

    /* renamed from: c  reason: collision with root package name */
    public final List f48548c;

    /* renamed from: d  reason: collision with root package name */
    public transient /* synthetic */ int f48549d;

    public C6246k(String str, l1 l1Var, List list) {
        this.f48546a = str;
        this.f48547b = l1Var;
        this.f48548c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6246k)) {
            return false;
        }
        C6246k c6246k = (C6246k) obj;
        if (this.f48546a.equals(c6246k.f48546a) && this.f48547b.equals(c6246k.f48547b) && this.f48548c.equals(c6246k.f48548c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f48549d != 0) {
            i10 = 0;
        } else {
            i10 = AbstractC4194d.t(this.f48547b, this.f48546a.hashCode() * 31, 31) + this.f48548c.hashCode();
        }
        if (i10 == 0) {
            return this.f48549d;
        }
        this.f48549d = i10;
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f48547b);
        sb2.append(' ');
        sb2.append(this.f48546a);
        sb2.append('(');
        boolean z10 = true;
        for (l1 l1Var : this.f48548c) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(',');
            }
            sb2.append(l1Var);
        }
        sb2.append(')');
        return sb2.toString();
    }
}
