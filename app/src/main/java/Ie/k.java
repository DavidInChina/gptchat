package Ie;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.F;
import java.util.List;
import jf.C3960j;
import jf.C3961k;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import q1.AbstractC5260f;
import wf.o;

/* loaded from: classes.dex */
public final class k extends e {

    /* renamed from: Z  reason: collision with root package name */
    public final List f8585Z;

    /* renamed from: i0  reason: collision with root package name */
    public Object f8587i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC4825e[] f8588j0;

    /* renamed from: l0  reason: collision with root package name */
    public int f8590l0;

    /* renamed from: h0  reason: collision with root package name */
    public final j f8586h0 = new j(this);

    /* renamed from: k0  reason: collision with root package name */
    public int f8589k0 = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Object obj, Object obj2, List list) {
        super(obj2);
        AbstractC3557B.c0("initial", obj);
        AbstractC3557B.c0("context", obj2);
        this.f8585Z = list;
        this.f8587i0 = obj;
        this.f8588j0 = new AbstractC4825e[list.size()];
    }

    @Override // Ie.e
    public final Object a(Object obj, AbstractC4825e abstractC4825e) {
        this.f8590l0 = 0;
        if (this.f8585Z.size() == 0) {
            return obj;
        }
        AbstractC3557B.c0("<set-?>", obj);
        this.f8587i0 = obj;
        if (this.f8589k0 < 0) {
            return c(abstractC4825e);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // Ie.e
    public final Object b() {
        return this.f8587i0;
    }

    @Override // Ie.e
    public final Object c(AbstractC4825e abstractC4825e) {
        Object obj;
        if (this.f8590l0 == this.f8585Z.size()) {
            obj = this.f8587i0;
        } else {
            AbstractC4825e z10 = AbstractC5260f.z(abstractC4825e);
            int i10 = this.f8589k0 + 1;
            this.f8589k0 = i10;
            AbstractC4825e[] abstractC4825eArr = this.f8588j0;
            abstractC4825eArr[i10] = z10;
            if (e(true)) {
                int i11 = this.f8589k0;
                if (i11 >= 0) {
                    this.f8589k0 = i11 - 1;
                    abstractC4825eArr[i11] = null;
                    obj = this.f8587i0;
                } else {
                    throw new IllegalStateException("No more continuations to resume");
                }
            } else {
                obj = EnumC5000a.f41328Y;
            }
        }
        if (obj == EnumC5000a.f41328Y) {
            N.k0(abstractC4825e);
        }
        return obj;
    }

    @Override // Ie.e
    public final Object d(Object obj, AbstractC4825e abstractC4825e) {
        AbstractC3557B.c0("<set-?>", obj);
        this.f8587i0 = obj;
        return c(abstractC4825e);
    }

    public final boolean e(boolean z10) {
        int i10;
        List list;
        do {
            i10 = this.f8590l0;
            list = this.f8585Z;
            if (i10 == list.size()) {
                if (!z10) {
                    f(this.f8587i0);
                    return false;
                }
                return true;
            }
            this.f8590l0 = i10 + 1;
            try {
            } catch (Throwable th2) {
                f(N.w(th2));
                return false;
            }
        } while (((o) list.get(i10)).invoke(this, this.f8587i0, this.f8586h0) != EnumC5000a.f41328Y);
        return false;
    }

    public final void f(Object obj) {
        Throwable b10;
        int i10 = this.f8589k0;
        if (i10 >= 0) {
            AbstractC4825e[] abstractC4825eArr = this.f8588j0;
            AbstractC4825e abstractC4825e = abstractC4825eArr[i10];
            AbstractC3557B.Z(abstractC4825e);
            int i11 = this.f8589k0;
            this.f8589k0 = i11 - 1;
            abstractC4825eArr[i11] = null;
            if (!(obj instanceof C3960j)) {
                abstractC4825e.resumeWith(obj);
                return;
            }
            Throwable a5 = C3961k.a(obj);
            AbstractC3557B.Z(a5);
            try {
                Throwable cause = a5.getCause();
                if (cause != null && !AbstractC3557B.K(a5.getCause(), cause) && (b10 = F.b(a5, cause)) != null) {
                    b10.setStackTrace(a5.getStackTrace());
                    a5 = b10;
                }
            } catch (Throwable unused) {
            }
            abstractC4825e.resumeWith(N.w(a5));
            return;
        }
        throw new IllegalStateException("No more continuations to resume".toString());
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f8586h0.getContext();
    }
}
