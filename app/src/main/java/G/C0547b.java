package G;

import k6.AbstractC4194d;
import l0.AbstractC4326r;
import nf.AbstractC4825e;
import nf.C4833m;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* renamed from: G.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0547b implements E0.W {

    /* renamed from: b  reason: collision with root package name */
    public boolean f5484b;

    /* renamed from: c  reason: collision with root package name */
    public C4833m f5485c;

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(AbstractC4825e abstractC4825e) {
        C0546a c0546a;
        int i10;
        AbstractC4825e abstractC4825e2;
        if (abstractC4825e instanceof C0546a) {
            c0546a = (C0546a) abstractC4825e;
            int i11 = c0546a.f5481i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0546a.f5481i0 = i11 - Integer.MIN_VALUE;
                Object obj = c0546a.f5479Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0546a.f5481i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        abstractC4825e2 = c0546a.f5478Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!this.f5484b) {
                        C4833m c4833m = this.f5485c;
                        c0546a.getClass();
                        c0546a.f5478Y = c4833m;
                        c0546a.f5481i0 = 1;
                        C4833m c4833m2 = new C4833m(AbstractC5260f.z(c0546a));
                        this.f5485c = c4833m2;
                        Object b10 = c4833m2.b();
                        if (b10 == enumC5000a) {
                            com.google.android.gms.internal.play_billing.N.k0(c0546a);
                        }
                        if (b10 == enumC5000a) {
                            return enumC5000a;
                        }
                        abstractC4825e2 = c4833m;
                    }
                    return yVar;
                }
                if (abstractC4825e2 != null) {
                    abstractC4825e2.resumeWith(yVar);
                }
                return yVar;
            }
        }
        c0546a = new C0546a(this, abstractC4825e);
        Object obj2 = c0546a.f5479Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0546a.f5481i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        if (abstractC4825e2 != null) {
        }
        return yVar2;
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
