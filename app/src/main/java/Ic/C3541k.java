package ic;

import id.AbstractC3557B;
import java.util.Set;
import nd.AbstractC4815d;
import nd.AbstractC4816e;
import nd.EnumC4814c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rb.C5426p;
import wd.C6189g;
import wd.C6205s;
import wd.EnumC6181c;

/* renamed from: ic.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3541k implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final xd.h f33055a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4816e f33056b;

    public C3541k(xd.h hVar, AbstractC4816e abstractC4816e) {
        this.f33055a = hVar;
        this.f33056b = abstractC4816e;
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    @Override // nd.AbstractC4815d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C3540j c3540j;
        int i10;
        C3541k c3541k;
        C6189g c6189g;
        Boolean bool;
        Set set;
        if (abstractC4825e instanceof C3540j) {
            c3540j = (C3540j) abstractC4825e;
            int i11 = c3540j.f33054i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3540j.f33054i0 = i11 - Integer.MIN_VALUE;
                Object obj = c3540j.f33052Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3540j.f33054i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3541k = c3540j.f33051Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C5426p c5426p = ((xc.e) this.f33056b).f49801b;
                    c3540j.f33051Y = this;
                    c3540j.f33054i0 = 1;
                    obj = L4.a.m0(c5426p, c3540j);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c3541k = this;
                }
                c6189g = ((C6205s) obj).f48457a;
                if (c6189g == null && (set = c6189g.f48415f) != null) {
                    bool = Boolean.valueOf(set.contains(EnumC6181c.f48389l0));
                } else {
                    bool = null;
                }
                if (AbstractC3557B.K(bool, Boolean.FALSE)) {
                    xd.h hVar = c3541k.f33055a;
                    C3537g c3537g = C3537g.f33031h0;
                    c3540j.f33051Y = null;
                    c3540j.f33054i0 = 2;
                    if (((rc.Q) hVar).a(c3537g, c3540j) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return yVar;
            }
        }
        c3540j = new C3540j(this, abstractC4825e);
        Object obj2 = c3540j.f33052Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3540j.f33054i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        c6189g = ((C6205s) obj2).f48457a;
        if (c6189g == null) {
        }
        bool = null;
        if (AbstractC3557B.K(bool, Boolean.FALSE)) {
        }
        return yVar2;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Ng.Q.f12904a;
    }
}
