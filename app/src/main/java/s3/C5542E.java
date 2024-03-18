package s3;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import w.C6050B;
import w.C6053E;
import xf.AbstractC6438a;

/* renamed from: s3.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5542E extends AbstractC5540C implements Iterable, AbstractC6438a {

    /* renamed from: s0  reason: collision with root package name */
    public static final /* synthetic */ int f45226s0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public final C6050B f45227o0 = new C6050B();

    /* renamed from: p0  reason: collision with root package name */
    public int f45228p0;

    /* renamed from: q0  reason: collision with root package name */
    public String f45229q0;

    /* renamed from: r0  reason: collision with root package name */
    public String f45230r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5542E(W w10) {
        super(w10);
        AbstractC3557B.c0("navGraphNavigator", w10);
    }

    @Override // s3.AbstractC5540C
    public final C5539B I(U3.u uVar) {
        C5539B I10 = super.I(uVar);
        ArrayList arrayList = new ArrayList();
        C5541D c5541d = new C5541D(this);
        while (c5541d.hasNext()) {
            C5539B I11 = ((AbstractC5540C) c5541d.next()).I(uVar);
            if (I11 != null) {
                arrayList.add(I11);
            }
        }
        return (C5539B) kf.t.q2(kf.q.h3(new C5539B[]{I10, (C5539B) kf.t.q2(arrayList)}));
    }

    public final AbstractC5540C U(int i10, boolean z10) {
        C5542E c5542e;
        AbstractC5540C abstractC5540C = (AbstractC5540C) this.f45227o0.c(i10);
        if (abstractC5540C == null) {
            if (z10 && (c5542e = this.f45216Z) != null) {
                return c5542e.U(i10, true);
            }
            return null;
        }
        return abstractC5540C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final AbstractC5540C V(String str, boolean z10) {
        C5542E c5542e;
        ?? r12;
        AbstractC3557B.c0("route", str);
        int hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        C6050B c6050b = this.f45227o0;
        AbstractC5540C abstractC5540C = (AbstractC5540C) c6050b.c(hashCode);
        if (abstractC5540C == null) {
            Iterator it = Kg.p.Z0(new C6053E(0, c6050b)).iterator();
            while (true) {
                if (it.hasNext()) {
                    r12 = it.next();
                    if (((AbstractC5540C) r12).M(str) != null) {
                        break;
                    }
                } else {
                    r12 = 0;
                    break;
                }
            }
            abstractC5540C = r12;
        }
        if (abstractC5540C == null) {
            if (!z10 || (c5542e = this.f45216Z) == null || Lg.n.n2(str)) {
                return null;
            }
            return c5542e.V(str, true);
        }
        return abstractC5540C;
    }

    @Override // s3.AbstractC5540C
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5542E)) {
            return false;
        }
        if (super.equals(obj)) {
            C6050B c6050b = this.f45227o0;
            int f6 = c6050b.f();
            C5542E c5542e = (C5542E) obj;
            C6050B c6050b2 = c5542e.f45227o0;
            if (f6 == c6050b2.f() && this.f45228p0 == c5542e.f45228p0) {
                for (AbstractC5540C abstractC5540C : Kg.p.Z0(new C6053E(0, c6050b))) {
                    if (!AbstractC3557B.K(abstractC5540C, c6050b2.c(abstractC5540C.f45221l0))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // s3.AbstractC5540C
    public final int hashCode() {
        int i10 = this.f45228p0;
        C6050B c6050b = this.f45227o0;
        int f6 = c6050b.f();
        for (int i11 = 0; i11 < f6; i11++) {
            i10 = (((i10 * 31) + c6050b.d(i11)) * 31) + ((AbstractC5540C) c6050b.g(i11)).hashCode();
        }
        return i10;
    }

    public final C5539B i0(U3.u uVar) {
        return super.I(uVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5541D(this);
    }

    @Override // s3.AbstractC5540C
    public final String toString() {
        AbstractC5540C abstractC5540C;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        String str = this.f45230r0;
        if (str != null && !Lg.n.n2(str)) {
            abstractC5540C = V(str, true);
        } else {
            abstractC5540C = null;
        }
        if (abstractC5540C == null) {
            abstractC5540C = U(this.f45228p0, true);
        }
        sb2.append(" startDestination=");
        if (abstractC5540C == null) {
            String str2 = this.f45230r0;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = this.f45229q0;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f45228p0));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(abstractC5540C.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("sb.toString()", sb3);
        return sb3;
    }
}
