package wh;

import java.util.Collections;
import java.util.List;
import sh.AbstractC5630b;
import yh.Y0;
import yh.l1;

/* renamed from: wh.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6261z implements AbstractC5630b {

    /* renamed from: a  reason: collision with root package name */
    public final l1.a f48584a;

    /* renamed from: b  reason: collision with root package name */
    public final List f48585b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48586c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f48587d;

    /* renamed from: e  reason: collision with root package name */
    public transient /* synthetic */ int f48588e;

    public C6261z(l1.a aVar) {
        this(aVar, Collections.emptyList(), null, null);
    }

    @Override // sh.AbstractC5630b
    public final AbstractC5630b a(Y0 y02) {
        return new C6261z((l1.a) this.f48584a.k(y02), this.f48585b, this.f48586c, this.f48587d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6261z)) {
            return false;
        }
        C6261z c6261z = (C6261z) obj;
        if (this.f48584a.equals(c6261z.f48584a) && this.f48585b.equals(c6261z.f48585b)) {
            String str = c6261z.f48586c;
            String str2 = this.f48586c;
            if (str2 == null ? str == null : str2.equals(str)) {
                Integer num = c6261z.f48587d;
                Integer num2 = this.f48587d;
                if (num2 != null) {
                    if (num2.equals(num)) {
                        return true;
                    }
                } else if (num == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        if (this.f48588e == 0) {
            int hashCode = (this.f48585b.hashCode() + (this.f48584a.hashCode() * 31)) * 31;
            String str = this.f48586c;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (hashCode + i10) * 31;
            Integer num = this.f48587d;
            if (num != null) {
                i11 = num.hashCode();
            }
            i11 += i12;
        }
        if (i11 == 0) {
            return this.f48588e;
        }
        this.f48588e = i11;
        return i11;
    }

    public final String toString() {
        return "ParameterDescription.Token{type=" + this.f48584a + ", annotations=" + this.f48585b + ", name='" + this.f48586c + "', modifiers=" + this.f48587d + '}';
    }

    public C6261z(l1.a aVar, List list, String str, Integer num) {
        this.f48584a = aVar;
        this.f48585b = list;
        this.f48586c = str;
        this.f48587d = num;
    }
}
