package kotlin.jvm.internal;

import id.AbstractC3557B;
import java.io.Serializable;
import jf.C3959i;

/* renamed from: kotlin.jvm.internal.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4302a implements i, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f37627Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Class f37628Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f37629h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f37630i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f37631j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f37632k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f37633l0;

    public C4302a() {
        this(3, AbstractC4305d.NO_RECEIVER, C3959i.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4302a)) {
            return false;
        }
        C4302a c4302a = (C4302a) obj;
        if (this.f37631j0 == c4302a.f37631j0 && this.f37632k0 == c4302a.f37632k0 && this.f37633l0 == c4302a.f37633l0 && AbstractC3557B.K(this.f37627Y, c4302a.f37627Y) && AbstractC3557B.K(this.f37628Z, c4302a.f37628Z) && this.f37629h0.equals(c4302a.f37629h0) && this.f37630i0.equals(c4302a.f37630i0)) {
            return true;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.i
    public final int getArity() {
        return this.f37632k0;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Object obj = this.f37627Y;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Class cls = this.f37628Z;
        if (cls != null) {
            i12 = cls.hashCode();
        }
        int v10 = E9.f.v(this.f37630i0, E9.f.v(this.f37629h0, (i13 + i12) * 31, 31), 31);
        if (this.f37631j0) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return ((((v10 + i11) * 31) + this.f37632k0) * 31) + this.f37633l0;
    }

    public final String toString() {
        return C.f37623a.i(this);
    }

    public C4302a(int i10, Object obj, Class cls, String str, String str2) {
        this.f37627Y = obj;
        this.f37628Z = cls;
        this.f37629h0 = str;
        this.f37630i0 = str2;
        this.f37631j0 = false;
        this.f37632k0 = i10;
        this.f37633l0 = 2;
    }
}
