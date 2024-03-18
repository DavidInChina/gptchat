package n9;

import b4.AbstractC2125f;
import com.google.android.gms.internal.play_billing.N;
import d4.C2595d;
import e4.C2801i;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import s3.r;

/* renamed from: n9.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4726e extends AbstractC2125f {

    /* renamed from: b  reason: collision with root package name */
    public final C4727f f39671b;

    public C4726e(C2801i c2801i, C4727f c4727f) {
        super(c2801i);
        this.f39671b = c4727f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, AbstractC4825e abstractC4825e) {
        C4722a c4722a;
        int i10;
        C4726e c4726e;
        if (abstractC4825e instanceof C4722a) {
            c4722a = (C4722a) abstractC4825e;
            int i11 = c4722a.f39656i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4722a.f39656i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4722a.f39654Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4722a.f39656i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c4726e = c4722a.f39653Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C2595d a5 = ((C2801i) this.f25632a).a(new Integer(-127674581), "DELETE\nFROM DBConversation\nWHERE id = ?", new r(this, 11, str));
                    c4722a.f39653Y = this;
                    c4722a.f39656i0 = 1;
                    if (a5.f27991b == enumC5000a) {
                        return enumC5000a;
                    }
                    c4726e = this;
                }
                c4726e.a(-127674581, C4723b.f39657Z);
                return y.f36177a;
            }
        }
        c4722a = new C4722a(this, abstractC4825e);
        Object obj2 = c4722a.f39654Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4722a.f39656i0;
        if (i10 == 0) {
        }
        c4726e.a(-127674581, C4723b.f39657Z);
        return y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(AbstractC4825e abstractC4825e) {
        C4724c c4724c;
        int i10;
        C4726e c4726e;
        C2595d a5;
        if (abstractC4825e instanceof C4724c) {
            c4724c = (C4724c) abstractC4825e;
            int i11 = c4724c.f39666i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4724c.f39666i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4724c.f39664Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4724c.f39666i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c4726e = c4724c.f39663Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    a5 = ((C2801i) this.f25632a).a(new Integer(1787647606), "DELETE\nFROM DBConversation", null);
                    c4724c.f39663Y = this;
                    c4724c.f39666i0 = 1;
                    if (a5.f27991b == enumC5000a) {
                        return enumC5000a;
                    }
                    c4726e = this;
                }
                c4726e.a(1787647606, C4723b.f39658h0);
                return y.f36177a;
            }
        }
        c4724c = new C4724c(this, abstractC4825e);
        Object obj2 = c4724c.f39664Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4724c.f39666i0;
        if (i10 == 0) {
        }
        c4726e.a(1787647606, C4723b.f39658h0);
        return y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(g gVar, AbstractC4825e abstractC4825e) {
        C4725d c4725d;
        int i10;
        C4726e c4726e;
        if (abstractC4825e instanceof C4725d) {
            c4725d = (C4725d) abstractC4825e;
            int i11 = c4725d.f39670i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4725d.f39670i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4725d.f39668Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4725d.f39670i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c4726e = c4725d.f39667Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C2595d a5 = ((C2801i) this.f25632a).a(new Integer(1113158397), "INSERT OR REPLACE\nINTO DBConversation (id, conversation)\nVALUES (?, ?)", new r(this, 12, gVar));
                    c4725d.f39667Y = this;
                    c4725d.f39670i0 = 1;
                    if (a5.f27991b == enumC5000a) {
                        return enumC5000a;
                    }
                    c4726e = this;
                }
                c4726e.a(1113158397, C4723b.f39659i0);
                return y.f36177a;
            }
        }
        c4725d = new C4725d(this, abstractC4825e);
        Object obj2 = c4725d.f39668Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4725d.f39670i0;
        if (i10 == 0) {
        }
        c4726e.a(1113158397, C4723b.f39659i0);
        return y.f36177a;
    }
}
