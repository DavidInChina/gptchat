package yh;

import java.util.List;
import sh.AbstractC5630b;

/* loaded from: classes2.dex */
public final class I1 implements AbstractC5630b {

    /* renamed from: a  reason: collision with root package name */
    public final String f50947a;

    /* renamed from: b  reason: collision with root package name */
    public final List f50948b;

    /* renamed from: c  reason: collision with root package name */
    public final List f50949c;

    /* renamed from: d  reason: collision with root package name */
    public transient /* synthetic */ int f50950d;

    public I1(String str, G1 g1, List list) {
        this.f50947a = str;
        this.f50948b = g1;
        this.f50949c = list;
    }

    @Override // sh.AbstractC5630b
    public final AbstractC5630b a(Y0 y02) {
        return new I1(this.f50947a, new t1(this.f50948b).k(y02), this.f50949c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I1)) {
            return false;
        }
        I1 i12 = (I1) obj;
        if (this.f50947a.equals(i12.f50947a) && this.f50948b.equals(i12.f50948b) && this.f50949c.equals(i12.f50949c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f50950d != 0) {
            i10 = 0;
        } else {
            int hashCode = this.f50948b.hashCode();
            i10 = this.f50949c.hashCode() + ((hashCode + (this.f50947a.hashCode() * 31)) * 31);
        }
        if (i10 == 0) {
            return this.f50950d;
        }
        this.f50950d = i10;
        return i10;
    }

    public final String toString() {
        return this.f50947a;
    }
}
