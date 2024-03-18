package N0;

import G0.C0588q;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* renamed from: N0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046e implements CharSequence {

    /* renamed from: Y  reason: collision with root package name */
    public final String f12512Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f12513Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f12514h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f12515i0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kf.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1046e(String str, ArrayList arrayList, int i10) {
        this(str, arrayList.isEmpty() ? null : arrayList, null, null);
        arrayList = (i10 & 2) != 0 ? kf.v.f37483Y : arrayList;
    }

    public final List a(int i10, int i11, String str) {
        List list = this.f12515i0;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                C1045d c1045d = (C1045d) obj;
                if ((c1045d.f12508a instanceof String) && AbstractC3557B.K(str, c1045d.f12511d) && AbstractC1047f.c(i10, i11, c1045d.f12509b, c1045d.f12510c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return kf.v.f37483Y;
    }

    /* renamed from: b */
    public final C1046e subSequence(int i10, int i11) {
        if (i10 <= i11) {
            String str = this.f12512Y;
            if (i10 == 0 && i11 == str.length()) {
                return this;
            }
            String substring = str.substring(i10, i11);
            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
            return new C1046e(substring, AbstractC1047f.a(this.f12513Z, i10, i11), AbstractC1047f.a(this.f12514h0, i10, i11), AbstractC1047f.a(this.f12515i0, i10, i11));
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f12512Y.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1046e)) {
            return false;
        }
        C1046e c1046e = (C1046e) obj;
        if (AbstractC3557B.K(this.f12512Y, c1046e.f12512Y) && AbstractC3557B.K(this.f12513Z, c1046e.f12513Z) && AbstractC3557B.K(this.f12514h0, c1046e.f12514h0) && AbstractC3557B.K(this.f12515i0, c1046e.f12515i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f12512Y.hashCode() * 31;
        int i12 = 0;
        List list = this.f12513Z;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        List list2 = this.f12514h0;
        if (list2 != null) {
            i11 = list2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        List list3 = this.f12515i0;
        if (list3 != null) {
            i12 = list3.hashCode();
        }
        return i14 + i12;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12512Y.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f12512Y;
    }

    public C1046e(String str, List list, List list2, List list3) {
        this.f12512Y = str;
        this.f12513Z = list;
        this.f12514h0 = list2;
        this.f12515i0 = list3;
        if (list2 != null) {
            List F22 = kf.t.F2(list2, new C0588q(1));
            int size = F22.size();
            int i10 = -1;
            int i11 = 0;
            while (i11 < size) {
                C1045d c1045d = (C1045d) F22.get(i11);
                if (c1045d.f12509b >= i10) {
                    int length = this.f12512Y.length();
                    int i12 = c1045d.f12510c;
                    if (i12 > length) {
                        throw new IllegalArgumentException(("ParagraphStyle range [" + c1045d.f12509b + ", " + i12 + ") is out of boundary").toString());
                    }
                    i11++;
                    i10 = i12;
                } else {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
            }
        }
    }
}
