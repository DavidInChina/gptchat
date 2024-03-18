package nh;

import Qg.AbstractC1206i;
import com.google.android.gms.internal.play_billing.N;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q0.C5254f;
import q1.AbstractC5260f;
import r4.C5364a;
import r4.C5365b;

/* renamed from: nh.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4852b implements r4.i {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C4853c f40370b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f40371c;

    public C4852b(C4853c c4853c, AbstractC1206i abstractC1206i) {
        this.f40370b = c4853c;
        this.f40371c = abstractC1206i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // r4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(AbstractC4825e abstractC4825e) {
        C4851a c4851a;
        int i10;
        C4853c c4853c;
        long j6;
        boolean isInfinite;
        AbstractC5260f abstractC5260f;
        AbstractC5260f abstractC5260f2;
        float b10;
        if (abstractC4825e instanceof C4851a) {
            c4851a = (C4851a) abstractC4825e;
            int i11 = c4851a.f40369i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4851a.f40369i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4851a.f40367Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4851a.f40369i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c4853c = c4851a.f40366Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C4853c c4853c2 = this.f40370b;
                    c4851a.f40366Y = c4853c2;
                    c4851a.f40369i0 = 1;
                    Object m02 = L4.a.m0(this.f40371c, c4851a);
                    if (m02 == enumC5000a) {
                        return enumC5000a;
                    }
                    c4853c = c4853c2;
                    obj = m02;
                }
                j6 = ((C5254f) obj).f43640a;
                c4853c.getClass();
                float d10 = C5254f.d(j6);
                isInfinite = Float.isInfinite(d10);
                abstractC5260f = C5365b.f44430h;
                if (isInfinite && !Float.isNaN(d10)) {
                    abstractC5260f2 = new C5364a(AbstractC4344b.Y0(C5254f.d(j6)));
                } else {
                    abstractC5260f2 = abstractC5260f;
                }
                b10 = C5254f.b(j6);
                if (!Float.isInfinite(b10) && !Float.isNaN(b10)) {
                    abstractC5260f = new C5364a(AbstractC4344b.Y0(C5254f.b(j6)));
                }
                return new r4.h(abstractC5260f2, abstractC5260f);
            }
        }
        c4851a = new C4851a(this, abstractC4825e);
        Object obj2 = c4851a.f40367Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4851a.f40369i0;
        if (i10 == 0) {
        }
        j6 = ((C5254f) obj2).f43640a;
        c4853c.getClass();
        float d102 = C5254f.d(j6);
        isInfinite = Float.isInfinite(d102);
        abstractC5260f = C5365b.f44430h;
        if (isInfinite) {
        }
        abstractC5260f2 = abstractC5260f;
        b10 = C5254f.b(j6);
        if (!Float.isInfinite(b10)) {
            abstractC5260f = new C5364a(AbstractC4344b.Y0(C5254f.b(j6)));
        }
        return new r4.h(abstractC5260f2, abstractC5260f);
    }
}
