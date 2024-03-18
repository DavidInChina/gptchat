package Yf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Bg.A f22393a;

    /* renamed from: c  reason: collision with root package name */
    public final List f22395c;

    /* renamed from: d  reason: collision with root package name */
    public final List f22396d;

    /* renamed from: f  reason: collision with root package name */
    public final List f22398f;

    /* renamed from: b  reason: collision with root package name */
    public final Bg.A f22394b = null;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f22397e = false;

    public w(List list, ArrayList arrayList, List list2, Bg.A a5) {
        AbstractC3557B.c0("valueParameters", list);
        this.f22393a = a5;
        this.f22395c = list;
        this.f22396d = arrayList;
        this.f22398f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (AbstractC3557B.K(this.f22393a, wVar.f22393a) && AbstractC3557B.K(this.f22394b, wVar.f22394b) && AbstractC3557B.K(this.f22395c, wVar.f22395c) && AbstractC3557B.K(this.f22396d, wVar.f22396d) && this.f22397e == wVar.f22397e && AbstractC3557B.K(this.f22398f, wVar.f22398f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f22393a.hashCode() * 31;
        Bg.A a5 = this.f22394b;
        if (a5 == null) {
            i10 = 0;
        } else {
            i10 = a5.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f22396d, AbstractC4194d.s(this.f22395c, (hashCode + i10) * 31, 31), 31);
        if (this.f22397e) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return this.f22398f.hashCode() + ((s10 + i11) * 31);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f22393a + ", receiverType=" + this.f22394b + ", valueParameters=" + this.f22395c + ", typeParameters=" + this.f22396d + ", hasStableParameterNames=" + this.f22397e + ", errors=" + this.f22398f + ')';
    }
}
