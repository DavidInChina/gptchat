package hg;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kf.C4279d;
import kf.n;
import kf.q;
import kf.t;
import kf.v;

/* renamed from: hg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3423b {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f32290a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32291b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32292c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32293d;

    /* renamed from: e  reason: collision with root package name */
    public final List f32294e;

    public AbstractC3423b(int... iArr) {
        int i10;
        int i11;
        List list;
        AbstractC3557B.c0("numbers", iArr);
        this.f32290a = iArr;
        Integer m32 = q.m3(iArr, 0);
        int i12 = -1;
        if (m32 != null) {
            i10 = m32.intValue();
        } else {
            i10 = -1;
        }
        this.f32291b = i10;
        Integer m33 = q.m3(iArr, 1);
        if (m33 != null) {
            i11 = m33.intValue();
        } else {
            i11 = -1;
        }
        this.f32292c = i11;
        Integer m34 = q.m3(iArr, 2);
        this.f32293d = m34 != null ? m34.intValue() : i12;
        if (iArr.length > 3) {
            if (iArr.length <= 1024) {
                list = t.K2(new C4279d(new n(iArr), 3, iArr.length));
            } else {
                throw new IllegalArgumentException(AbstractC2469q0.j(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
        } else {
            list = v.f37483Y;
        }
        this.f32294e = list;
    }

    public final boolean a(int i10, int i11, int i12) {
        int i13 = this.f32291b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f32292c;
        if (i14 > i11) {
            return true;
        }
        if (i14 >= i11 && this.f32293d >= i12) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && AbstractC3557B.K(getClass(), obj.getClass())) {
            AbstractC3423b abstractC3423b = (AbstractC3423b) obj;
            if (this.f32291b == abstractC3423b.f32291b && this.f32292c == abstractC3423b.f32292c && this.f32293d == abstractC3423b.f32293d && AbstractC3557B.K(this.f32294e, abstractC3423b.f32294e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f32291b;
        int i11 = (i10 * 31) + this.f32292c + i10;
        int i12 = (i11 * 31) + this.f32293d + i11;
        return this.f32294e.hashCode() + (i12 * 31) + i12;
    }

    public final String toString() {
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f32290a) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return t.m2(arrayList, Separators.DOT, null, null, null, 62);
    }
}
