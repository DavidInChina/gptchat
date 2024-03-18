package T0;

import A.C0043t;
import N0.C1046e;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public z f16789a;

    /* renamed from: b  reason: collision with root package name */
    public k f16790b;

    public final z a(List list) {
        AbstractC1414i abstractC1414i;
        Exception e10;
        long j6;
        AbstractC1414i abstractC1414i2;
        N0.D d10 = null;
        try {
            int size = list.size();
            int i10 = 0;
            abstractC1414i = null;
            while (i10 < size) {
                try {
                    abstractC1414i2 = (AbstractC1414i) list.get(i10);
                } catch (Exception e11) {
                    e10 = e11;
                }
                try {
                    abstractC1414i2.a(this.f16790b);
                    i10++;
                    abstractC1414i = abstractC1414i2;
                } catch (Exception e12) {
                    e10 = e12;
                    abstractC1414i = abstractC1414i2;
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb3.append(this.f16790b.f16791a.a());
                    sb3.append(", composition=");
                    sb3.append(this.f16790b.c());
                    sb3.append(", selection=");
                    k kVar = this.f16790b;
                    sb3.append((Object) N0.D.g(U3.f.e(kVar.f16792b, kVar.f16793c)));
                    sb3.append("):");
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    kf.t.l2(list, sb2, Separators.RETURN, null, null, new C0043t(abstractC1414i, 26, this), 60);
                    String sb4 = sb2.toString();
                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                    throw new RuntimeException(sb4, e10);
                }
            }
            C1046e c1046e = new C1046e(this.f16790b.f16791a.toString(), null, 6);
            k kVar2 = this.f16790b;
            long e13 = U3.f.e(kVar2.f16792b, kVar2.f16793c);
            N0.D d11 = new N0.D(e13);
            if (!N0.D.f(this.f16789a.f16831b)) {
                d10 = d11;
            }
            if (d10 != null) {
                j6 = d10.f12485a;
            } else {
                j6 = U3.f.e(N0.D.d(e13), N0.D.e(e13));
            }
            z zVar = new z(c1046e, j6, this.f16790b.c());
            this.f16789a = zVar;
            return zVar;
        } catch (Exception e14) {
            abstractC1414i = null;
            e10 = e14;
        }
    }
}
