package Cf;

import xf.AbstractC6438a;

/* loaded from: classes.dex */
public class e implements Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final int f3106Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f3107Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f3108h0;

    public e(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f3106Y = i10;
                this.f3107Z = r.f.J(i10, i11, i12);
                this.f3108h0 = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f3106Y != eVar.f3106Y || this.f3107Z != eVar.f3107Z || this.f3108h0 != eVar.f3108h0) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3106Y * 31) + this.f3107Z) * 31) + this.f3108h0;
    }

    public boolean isEmpty() {
        int i10 = this.f3108h0;
        int i11 = this.f3107Z;
        int i12 = this.f3106Y;
        if (i10 > 0) {
            if (i12 <= i11) {
                return false;
            }
        } else if (i12 >= i11) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final f iterator() {
        return new f(this.f3106Y, this.f3107Z, this.f3108h0);
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f3107Z;
        int i11 = this.f3106Y;
        int i12 = this.f3108h0;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }
}
