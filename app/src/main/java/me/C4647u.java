package me;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Iterator;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import te.AbstractC5759c;
import ve.AbstractC6034c;

/* renamed from: me.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4647u {

    /* renamed from: d  reason: collision with root package name */
    public static final C4628a f39259d = new C4628a(2, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final Fe.a f39260e = new Fe.a("HttpResponseValidator");

    /* renamed from: a  reason: collision with root package name */
    public final List f39261a;

    /* renamed from: b  reason: collision with root package name */
    public final List f39262b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f39263c;

    public C4647u(List list, List list2, boolean z10) {
        this.f39261a = list;
        this.f39262b = list2;
        this.f39263c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[LOOP:0: B:18:0x005f->B:20:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C4647u c4647u, Throwable th2, AbstractC5759c abstractC5759c, AbstractC4825e abstractC4825e) {
        C4645s c4645s;
        int i10;
        Iterator it;
        c4647u.getClass();
        if (abstractC4825e instanceof C4645s) {
            c4645s = (C4645s) abstractC4825e;
            int i11 = c4645s.f39237h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4645s.f39237h0 = i11 - Integer.MIN_VALUE;
                Object obj = c4645s.f39235Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4645s.f39237h0;
                if (i10 == 0) {
                    it = null;
                    if (i10 == 1 || i10 == 2) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Ei.a aVar = w.f39269a;
                    aVar.c("Processing exception " + th2 + " for request " + abstractC5759c.O());
                    it = c4647u.f39262b.iterator();
                }
                while (it.hasNext()) {
                    AbstractC2469q0.p(it.next());
                }
            }
        }
        c4645s = new C4645s(c4647u, abstractC4825e);
        Object obj2 = c4645s.f39235Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4645s.f39237h0;
        if (i10 == 0) {
        }
        while (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C4647u c4647u, AbstractC6034c abstractC6034c, AbstractC4825e abstractC4825e) {
        C4646t c4646t;
        int i10;
        Iterator it;
        c4647u.getClass();
        if (abstractC4825e instanceof C4646t) {
            c4646t = (C4646t) abstractC4825e;
            int i11 = c4646t.f39258j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4646t.f39258j0 = i11 - Integer.MIN_VALUE;
                Object obj = c4646t.f39256h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4646t.f39258j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        it = c4646t.f39255Z;
                        abstractC6034c = c4646t.f39254Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Ei.a aVar = w.f39269a;
                    aVar.c("Validating response for request " + abstractC6034c.b().c().O());
                    it = c4647u.f39261a.iterator();
                }
                while (it.hasNext()) {
                    c4646t.f39254Y = abstractC6034c;
                    c4646t.f39255Z = it;
                    c4646t.f39258j0 = 1;
                    if (((wf.n) it.next()).invoke(abstractC6034c, c4646t) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return jf.y.f36177a;
            }
        }
        c4646t = new C4646t(c4647u, abstractC4825e);
        Object obj2 = c4646t.f39256h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4646t.f39258j0;
        if (i10 == 0) {
        }
        while (it.hasNext()) {
        }
        return jf.y.f36177a;
    }
}
