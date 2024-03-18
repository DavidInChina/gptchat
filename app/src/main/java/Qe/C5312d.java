package qe;

import Ng.C1079o0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: qe.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5312d {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44081f = AtomicIntegerFieldUpdater.newUpdater(C5312d.class, "requestLogged");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44082g = AtomicIntegerFieldUpdater.newUpdater(C5312d.class, "responseLogged");

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5314f f44083a;

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f44084b = new StringBuilder();

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f44085c = new StringBuilder();

    /* renamed from: d  reason: collision with root package name */
    public final C1079o0 f44086d = Ad.l.n();

    /* renamed from: e  reason: collision with root package name */
    public final C1079o0 f44087e = Ad.l.n();
    private volatile /* synthetic */ int requestLogged = 0;
    private volatile /* synthetic */ int responseLogged = 0;

    public C5312d(AbstractC5314f abstractC5314f) {
        AbstractC3557B.c0("logger", abstractC5314f);
        this.f44083a = abstractC5314f;
    }

    public final void a() {
        C1079o0 c1079o0 = this.f44086d;
        if (!f44081f.compareAndSet(this, 0, 1)) {
            return;
        }
        try {
            String obj = Lg.n.U2(this.f44084b).toString();
            if (obj.length() > 0) {
                this.f44083a.c(obj);
            }
        } finally {
            c1079o0.q0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C5309a c5309a;
        int i10;
        C5312d c5312d;
        String obj;
        if (abstractC4825e instanceof C5309a) {
            c5309a = (C5309a) abstractC4825e;
            int i11 = c5309a.f44070i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5309a.f44070i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c5309a.f44068Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5309a.f44070i0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c5312d = c5309a.f44067Y;
                        N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    if (!f44082g.compareAndSet(this, 0, 1)) {
                        return yVar;
                    }
                    C1079o0 c1079o0 = this.f44086d;
                    c5309a.f44067Y = this;
                    c5309a.f44070i0 = 1;
                    if (c1079o0.F(c5309a) == enumC5000a) {
                        return enumC5000a;
                    }
                    c5312d = this;
                }
                obj = Lg.n.U2(c5312d.f44085c).toString();
                if (obj.length() > 0) {
                    c5312d.f44083a.c(obj);
                }
                return yVar;
            }
        }
        c5309a = new C5309a(this, abstractC4825e);
        Object obj22 = c5309a.f44068Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5309a.f44070i0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        obj = Lg.n.U2(c5312d.f44085c).toString();
        if (obj.length() > 0) {
        }
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, AbstractC4825e abstractC4825e) {
        C5310b c5310b;
        int i10;
        C5312d c5312d;
        if (abstractC4825e instanceof C5310b) {
            c5310b = (C5310b) abstractC4825e;
            int i11 = c5310b.f44075j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5310b.f44075j0 = i11 - Integer.MIN_VALUE;
                Object obj = c5310b.f44073h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5310b.f44075j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str = c5310b.f44072Z;
                        c5312d = c5310b.f44071Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C1079o0 c1079o0 = this.f44087e;
                    c5310b.f44071Y = this;
                    c5310b.f44072Z = str;
                    c5310b.f44075j0 = 1;
                    if (c1079o0.F(c5310b) == enumC5000a) {
                        return enumC5000a;
                    }
                    c5312d = this;
                }
                c5312d.f44085c.append(str);
                return y.f36177a;
            }
        }
        c5310b = new C5310b(this, abstractC4825e);
        Object obj2 = c5310b.f44073h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5310b.f44075j0;
        if (i10 == 0) {
        }
        c5312d.f44085c.append(str);
        return y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, AbstractC4825e abstractC4825e) {
        C5311c c5311c;
        int i10;
        C5312d c5312d;
        if (abstractC4825e instanceof C5311c) {
            c5311c = (C5311c) abstractC4825e;
            int i11 = c5311c.f44080j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5311c.f44080j0 = i11 - Integer.MIN_VALUE;
                Object obj = c5311c.f44078h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5311c.f44080j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str = c5311c.f44077Z;
                        c5312d = c5311c.f44076Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C1079o0 c1079o0 = this.f44086d;
                    c5311c.f44076Y = this;
                    c5311c.f44077Z = str;
                    c5311c.f44080j0 = 1;
                    if (c1079o0.F(c5311c) == enumC5000a) {
                        return enumC5000a;
                    }
                    c5312d = this;
                }
                c5312d.f44083a.c(Lg.n.U2(str).toString());
                return y.f36177a;
            }
        }
        c5311c = new C5311c(this, abstractC4825e);
        Object obj2 = c5311c.f44078h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5311c.f44080j0;
        if (i10 == 0) {
        }
        c5312d.f44083a.c(Lg.n.U2(str).toString());
        return y.f36177a;
    }

    public final void e(String str) {
        String obj = Lg.n.U2(str).toString();
        StringBuilder sb2 = this.f44085c;
        sb2.append(obj);
        sb2.append('\n');
        this.f44087e.q0();
    }
}
