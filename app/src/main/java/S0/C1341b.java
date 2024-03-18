package S0;

import Ng.C1072l;
import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import id.AbstractC3557B;
import jf.C3960j;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* renamed from: S0.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1341b implements G {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16001a;

    public C1341b(Context context) {
        this.f16001a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC1356q abstractC1356q, AbstractC4825e abstractC4825e) {
        C1340a c1340a;
        int i10;
        C1341b c1341b;
        if (abstractC4825e instanceof C1340a) {
            c1340a = (C1340a) abstractC4825e;
            int i11 = c1340a.f16000j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1340a.f16000j0 = i11 - Integer.MIN_VALUE;
                Object obj = c1340a.f15998h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1340a.f16000j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            abstractC1356q = c1340a.f15997Z;
                            c1341b = c1340a.f15996Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return obj;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (abstractC1356q instanceof I) {
                        I i12 = (I) abstractC1356q;
                        c1340a.f15996Y = this;
                        c1340a.f15997Z = abstractC1356q;
                        c1340a.f16000j0 = 2;
                        C1072l c1072l = new C1072l(1, AbstractC5260f.z(c1340a));
                        c1072l.u();
                        int i13 = i12.f15979a;
                        C1342c c1342c = new C1342c(c1072l, i12);
                        ThreadLocal threadLocal = r1.p.f44306a;
                        Context context = this.f16001a;
                        if (context.isRestricted()) {
                            c1342c.a(-4);
                        } else {
                            r1.p.c(context, i13, new TypedValue(), 0, c1342c, false, false);
                        }
                        obj = c1072l.t();
                        if (obj == enumC5000a) {
                            com.google.android.gms.internal.play_billing.N.k0(c1340a);
                        }
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        c1341b = this;
                    } else {
                        throw new IllegalArgumentException("Unknown font type: " + abstractC1356q);
                    }
                }
                return R4.b.V1((Typeface) obj, ((I) abstractC1356q).f15982d, c1341b.f16001a);
            }
        }
        c1340a = new C1340a(this, abstractC4825e);
        Object obj2 = c1340a.f15998h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1340a.f16000j0;
        if (i10 == 0) {
        }
        return R4.b.V1((Typeface) obj2, ((I) abstractC1356q).f15982d, c1341b.f16001a);
    }

    public final Typeface b(AbstractC1356q abstractC1356q) {
        Typeface typeface;
        Object obj;
        Object obj2 = null;
        if (!(abstractC1356q instanceof I)) {
            return null;
        }
        I i10 = (I) abstractC1356q;
        int i11 = i10.f15983e;
        boolean v10 = Gi.e.v(i11, 0);
        Context context = this.f16001a;
        if (v10) {
            typeface = r1.p.b(context, ((I) abstractC1356q).f15979a);
            AbstractC3557B.Z(typeface);
        } else if (Gi.e.v(i11, 1)) {
            try {
                Object b10 = r1.p.b(context, ((I) abstractC1356q).f15979a);
                AbstractC3557B.Z(b10);
                obj = b10;
            } catch (Throwable th2) {
                obj = com.google.android.gms.internal.play_billing.N.w(th2);
            }
            if (!(obj instanceof C3960j)) {
                obj2 = obj;
            }
            typeface = (Typeface) obj2;
        } else if (Gi.e.v(i11, 2)) {
            throw new UnsupportedOperationException("Unsupported Async font load path");
        } else {
            throw new IllegalArgumentException("Unknown loading type " + ((Object) Gi.e.U(i10.f15983e)));
        }
        return R4.b.V1(typeface, ((I) abstractC1356q).f15982d, context);
    }
}
