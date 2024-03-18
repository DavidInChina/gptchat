package ta;

import A.AbstractC0044t0;
import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;
import za.C6783B;
import za.C6800q;
import za.C6807x;

/* renamed from: ta.P  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5700P extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45841Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6800q f45842Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5700P(C6800q c6800q, int i10) {
        super(1);
        this.f45841Y = i10;
        this.f45842Z = c6800q;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        CharSequence charSequence;
        int i12 = this.f45841Y;
        C6800q c6800q = this.f45842Z;
        switch (i12) {
            case 0:
                C6783B c6783b = (C6783B) obj;
                AbstractC3557B.c0("$this$setState", c6783b);
                return C6783B.e(c6783b, null, null, null, null, null, null, c6800q.f51798a, null, null, null, null, 130943);
            default:
                C6807x c6807x = (C6807x) obj;
                AbstractC3557B.c0("$this$update", c6807x);
                C2334C c2334c = c6800q.f51798a;
                T0.z zVar = c6807x.f51804a;
                AbstractC3557B.c0("<this>", zVar);
                String str = zVar.f16830a.f12512Y;
                int e10 = N0.D.e(zVar.f16831b);
                if (e10 != 0 && str.length() != 0 && c2334c != null) {
                    String substring = str.substring(0, e10);
                    AbstractC3557B.b0("substring(...)", substring);
                    int o22 = Lg.n.o2(substring, ' ', 0, 6);
                    Integer valueOf = Integer.valueOf(o22);
                    Integer num = null;
                    if (o22 == -1) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        i10 = valueOf.intValue() + 1;
                    } else {
                        i10 = 0;
                    }
                    int k22 = Lg.n.k2(str, ' ', e10, false, 4);
                    Integer valueOf2 = Integer.valueOf(k22);
                    if (k22 != -1) {
                        num = valueOf2;
                    }
                    if (num != null) {
                        i11 = num.intValue();
                    } else {
                        i11 = str.length();
                    }
                    String substring2 = substring.substring(i10);
                    AbstractC3557B.b0("substring(...)", substring2);
                    if (Lg.n.I2(substring2, Separators.AT, false)) {
                        if (i11 >= i10) {
                            if (i11 == i10) {
                                charSequence = str.subSequence(0, str.length());
                            } else {
                                StringBuilder sb2 = new StringBuilder(str.length() - (i11 - i10));
                                sb2.append((CharSequence) str, 0, i10);
                                sb2.append((CharSequence) str, i11, str.length());
                                charSequence = sb2;
                            }
                            zVar = new T0.z(charSequence.toString(), U3.f.e(i10, i10), 4);
                        } else {
                            throw new IndexOutOfBoundsException(AbstractC0044t0.y("End index (", i11, ") is less than start index (", i10, ")."));
                        }
                    }
                }
                return C6807x.a(c6807x, zVar, null, c6800q.f51798a, false, null, 26);
        }
    }
}
