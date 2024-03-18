package Ie;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.C3960j;
import jf.C3961k;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import pf.AbstractC5157d;

/* loaded from: classes.dex */
public final class j implements AbstractC4825e, AbstractC5157d {

    /* renamed from: Y  reason: collision with root package name */
    public int f8583Y = Integer.MIN_VALUE;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f8584Z;

    public j(k kVar) {
        this.f8584Z = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [nf.e[]] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // pf.AbstractC5157d
    public final AbstractC5157d getCallerFrame() {
        i iVar = i.f8582Y;
        int i10 = this.f8583Y;
        k kVar = this.f8584Z;
        if (i10 == Integer.MIN_VALUE) {
            this.f8583Y = kVar.f8589k0;
        }
        int i11 = this.f8583Y;
        if (i11 < 0) {
            this.f8583Y = Integer.MIN_VALUE;
            iVar = null;
        } else {
            try {
                ?? r22 = kVar.f8588j0[i11];
                if (r22 != 0) {
                    this.f8583Y = i11 - 1;
                    iVar = r22;
                }
            } catch (Throwable unused) {
            }
        }
        if (!(iVar instanceof AbstractC5157d)) {
            return null;
        }
        return iVar;
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        AbstractC4831k context;
        k kVar = this.f8584Z;
        AbstractC4825e abstractC4825e = kVar.f8588j0[kVar.f8589k0];
        if (abstractC4825e != null && (context = abstractC4825e.getContext()) != null) {
            return context;
        }
        throw new IllegalStateException("Not started".toString());
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof C3960j;
        k kVar = this.f8584Z;
        if (z10) {
            Throwable a5 = C3961k.a(obj);
            AbstractC3557B.Z(a5);
            kVar.f(N.w(a5));
            return;
        }
        kVar.e(false);
    }
}
