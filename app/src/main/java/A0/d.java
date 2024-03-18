package A0;

import Ng.F;
import Z0.p;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wf.AbstractC6216a;
import z.C6672L;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public F0.f f358a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC6216a f359b = new C6672L(17, this);

    /* renamed from: c  reason: collision with root package name */
    public F f360c;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j6, long j10, AbstractC4825e abstractC4825e) {
        b bVar;
        int i10;
        long j11;
        if (abstractC4825e instanceof b) {
            bVar = (b) abstractC4825e;
            int i11 = bVar.f354h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f354h0 = i11 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.f352Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = bVar2.f354h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    g d10 = d();
                    if (d10 != null) {
                        bVar2.f354h0 = 1;
                        obj = d10.l(j6, j10, bVar2);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        j11 = p.f22813b;
                        return new p(j11);
                    }
                }
                j11 = ((p) obj).f22815a;
                return new p(j11);
            }
        }
        bVar = new b(this, abstractC4825e);
        b bVar22 = bVar;
        Object obj2 = bVar22.f352Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = bVar22.f354h0;
        if (i10 == 0) {
        }
        j11 = ((p) obj2).f22815a;
        return new p(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j6, AbstractC4825e abstractC4825e) {
        c cVar;
        int i10;
        long j10;
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i11 = cVar.f357h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f357h0 = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f355Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar.f357h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    g d10 = d();
                    if (d10 != null) {
                        cVar.f357h0 = 1;
                        obj = d10.T(j6, cVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        j10 = p.f22813b;
                        return new p(j10);
                    }
                }
                j10 = ((p) obj).f22815a;
                return new p(j10);
            }
        }
        cVar = new c(this, abstractC4825e);
        Object obj2 = cVar.f355Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f357h0;
        if (i10 == 0) {
        }
        j10 = ((p) obj2).f22815a;
        return new p(j10);
    }

    public final F c() {
        F f6 = (F) this.f359b.mo122invoke();
        if (f6 != null) {
            return f6;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final g d() {
        F0.f fVar = this.f358a;
        if (fVar != null) {
            return (g) fVar.a(i.f376a);
        }
        return null;
    }
}
